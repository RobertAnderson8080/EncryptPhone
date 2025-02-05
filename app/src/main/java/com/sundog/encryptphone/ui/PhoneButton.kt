package com.sundog.encryptphone.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sundog.encryptphone.ui.util.getCorrespondingDigitText
import com.sundog.encryptphone.viewmodel.PhoneButtonPadViewModel

class DigitProvider : PreviewParameterProvider<String>{
    override val values = listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#").asSequence()
}

val phoneButtonSize = 90f.dp

@Preview
@Composable
fun PhoneButton(@PreviewParameter(DigitProvider::class) digit : String, viewModel: PhoneButtonPadViewModel = viewModel()) {
    OutlinedButton(onClick = { viewModel.appendNumber(digit) }, Modifier.size(phoneButtonSize)) {
        Column {
            Text(text = digit, Modifier.align(Alignment.CenterHorizontally), fontSize = 32.sp)
            Text(getCorrespondingDigitText(digit), Modifier.align(Alignment.CenterHorizontally), fontSize = 12.sp)
        }
    }
}
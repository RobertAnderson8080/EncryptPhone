package com.sundog.encryptphone.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sundog.encryptphone.ui.util.formatPhoneNumberUS
import com.sundog.encryptphone.viewmodel.PhoneButtonPadViewModel

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(viewModel: PhoneButtonPadViewModel = viewModel()) {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),
        title = {
                val number = viewModel.getNumber().observeAsState().value
                Text(formatPhoneNumberUS(number ?: ""))
        }
    )
}
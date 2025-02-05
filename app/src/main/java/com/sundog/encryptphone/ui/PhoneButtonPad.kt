package com.sundog.encryptphone.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sundog.encryptphone.viewmodel.PhoneButtonPadViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

@Preview
@Composable
fun PhoneButtonPad(innerPadding: PaddingValues = PaddingValues.Absolute(0.dp,0.dp,0.dp,0.dp)) {
    Column (modifier = Modifier.fillMaxSize().padding(innerPadding).consumeWindowInsets(innerPadding)) {
        Row (horizontalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.padding(12.dp).align(Alignment.CenterHorizontally)) {
            PhoneButton("1")
            PhoneButton("2")
            PhoneButton("3")
        }
        Row (horizontalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.padding(12.dp).align(Alignment.CenterHorizontally)) {
            PhoneButton("4")
            PhoneButton("5")
            PhoneButton("6")
        }
        Row (horizontalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.padding(12.dp).align(Alignment.CenterHorizontally)) {
            PhoneButton("7")
            PhoneButton("8")
            PhoneButton("9")
        }
        Row (horizontalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.padding(12.dp).align(Alignment.CenterHorizontally)) {
            PhoneButton("*")
            PhoneButton("0")
            PhoneButton("#")
        }

        Row (horizontalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.padding(12.dp).align(Alignment.CenterHorizontally)) {
            OutlinedButton(onClick = {}, Modifier.width(phoneButtonSize).height(phoneButtonSize)) {
            }
        }
    }
}
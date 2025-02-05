package com.sundog.encryptphone.ui.util

import android.telephony.PhoneNumberUtils

fun formatPhoneNumberUS(number : String) : String {
    val formattedNumber = PhoneNumberUtils.formatNumber(number.toString(), "US")

    return formattedNumber ?: number
}

fun getCorrespondingDigitText(number : String) : String {
    val parsedNumber = number.toIntOrNull() ?: return ""

    when (parsedNumber) {
        2 -> {
            return "ABC"
        }
        3 -> {
            return "DEF"
        }
        4 -> {
            return "GHI"
        }
        5 -> {
            return "JKL"
        }
        6 -> {
            return "MNO"
        }
        7 -> {
            return "PQRS"
        }
        8 -> {
            return "TUV"
        }
        9 -> {
            return "WXYZ"
        }
        0 -> {
            return "+"
        }
        else -> return ""
    }
}
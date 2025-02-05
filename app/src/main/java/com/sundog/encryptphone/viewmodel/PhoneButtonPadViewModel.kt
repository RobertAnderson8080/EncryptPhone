package com.sundog.encryptphone.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PhoneButtonPadViewModel : ViewModel() {
    private var number : MutableLiveData<String> = MutableLiveData<String>("");

    fun getNumber() : LiveData<String> {
        return number
    }

    fun setNumber(newNumber : String) {
        number.postValue(newNumber)
    }

    fun appendNumber(numberToAppend : String) {

        try {
            val newNumber = number.value + numberToAppend.single();
            number.postValue(newNumber)
        } catch (e : Exception) {
            //do nothing. don't crash
        }
    }

    fun removeLastNumber() {
        val numberValue = number.value
        numberValue ?: return

        if (numberValue.none()) {
            return
        }

        if (numberValue.length == 1) {
            number.postValue("")
        }

        number.postValue(numberValue.substring(0, numberValue.length - 1))
    }
}
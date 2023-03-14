package com.example.lifecycleawareness.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private var logToAdd = ""
    private var outputLogHistory = ""


    fun addLifecycleChange(value: String){
        this.logToAdd = value
        outputLogHistory = (outputLogHistory + logToAdd)
    }

    fun outputLifecycleChangeInfo(): String {
        return outputLogHistory
    }

}
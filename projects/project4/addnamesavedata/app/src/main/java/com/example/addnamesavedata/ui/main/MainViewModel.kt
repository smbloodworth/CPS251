package com.example.addnamesavedata.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel : ViewModel() {
    var nameToAdd: MutableLiveData<String> = MutableLiveData()
    var listOfNames: MutableLiveData<String> = MutableLiveData()

    fun addName() {
        nameToAdd.let {
            if (!it.value.equals("")) {
                listOfNames.value = (it.value?.toString() + nameToAdd)
            } else {
                listOfNames.value = ""
            }
        }
    }

}
package com.example.addnamesavedata.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var nameToAdd = ""
    private var listOfNames = ""

    fun addNametoList(value: String){
        this.nameToAdd = value
        listOfNames = (listOfNames + nameToAdd + "\n")
    }

    fun getListOfNames(): String {
        return listOfNames
    }
}
package com.example.kointutorial

import androidx.lifecycle.ViewModel

class MyViewModel(private val repository: Repository): ViewModel() {

    fun doNetworkCall(){

        println("Something")
        //repository.callNetwork()
    }
}
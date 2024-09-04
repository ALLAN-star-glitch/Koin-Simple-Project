package com.example.kointutorial

class RepositoryImpl(
    private val api: MyApi
) : Repository {

    override fun callNetwork() {
       api.callApi()
    }

}
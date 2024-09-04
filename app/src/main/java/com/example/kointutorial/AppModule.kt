package com.example.kointutorial

import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create


//in the module block we tell koin how we want to create our dependencies
val appModule = module{

    single {

        Retrofit.Builder()
            .baseUrl("https://google.com")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(MyApi::class.java)

    }

    single<Repository> {
        RepositoryImpl(get())
    }

    viewModel {
        MyViewModel(get())
    }

}
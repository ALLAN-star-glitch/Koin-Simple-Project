package com.example.kointutorial

import org.koin.dsl.module

val activityModule = module {
    scope<MainActivity> {
        scoped { "Hello" }
    }
}
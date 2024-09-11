/*In this class, we initialize Koin*/

package com.example.kointutorial

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()//to use the logging feature of koin ... this is optional...
            androidContext(this@MyApplication)
            modules(appModule, activityModule)
        }
    }
}
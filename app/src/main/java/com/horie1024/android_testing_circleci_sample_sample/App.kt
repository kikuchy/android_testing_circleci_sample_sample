package com.horie1024.android_testing_circleci_sample_sample

import android.app.Application

class App : Application() {

    override fun onCreate() {
        super.onCreate()

//            Instabug.Builder(this, "e2c1b250918dec2e3a36ad2a298b1edd")
//                    .setInvocationEvents(InstabugInvocationEvent.SHAKE, InstabugInvocationEvent.SCREENSHOT)
//                    .build()
    }
}
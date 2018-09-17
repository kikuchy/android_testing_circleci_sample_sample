package com.horie1024.android_testing_circleci_sample_sample

import android.app.Application

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        InitInstabug.init(this)
    }
}
package com.horie1024.android_testing_circleci_sample_sample

import android.app.Application
import com.instabug.library.Instabug
import com.instabug.library.invocation.InstabugInvocationEvent

class InitInstabug {
    companion object {
        fun init(application: Application) {
            Instabug.Builder(application, "e2c1b250918dec2e3a36ad2a298b1edd")
                    .setInvocationEvents(InstabugInvocationEvent.SHAKE, InstabugInvocationEvent.SCREENSHOT)
                    .build()
        }
    }
}
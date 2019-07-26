package com.example.mykotlinbase.base


import android.app.Activity
import android.app.Application
import com.example.mykotlinbase.di.scopes.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector

import javax.inject.Inject

class App : Application(), HasActivityInjector {
    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()


        DaggerAppComponent
            .builder()
            .context(this)
            .build()
            .inject(this)


    }

    override fun activityInjector(): AndroidInjector<Activity>? {
        return dispatchingAndroidInjector
    }
}

package com.example.mykotlinbase.di.module

import com.example.mykotlinbase.ui.main.MainActivity
import com.example.mykotlinbase.ui.main.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
 interface ActivityModule {
    @ContributesAndroidInjector
    abstract fun contributesMainActivity() : MainActivity

}
package com.example.mykotlinbase.di.module

import com.example.mykotlinbase.ui.main.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface FragmentModule {
    @ContributesAndroidInjector(modules = [ViewModule::class])
    abstract fun mainFragment(): MainFragment
}
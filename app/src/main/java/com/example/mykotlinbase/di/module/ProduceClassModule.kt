package com.example.mykotlinbase.di.module

import android.content.Context
import com.example.mykotlinbase.pojoPlusRetrofit.pojo.ProduceClass
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ProduceClassModule {
    @Singleton
    @Provides
    public fun produceClass(): ProduceClass {
        return ProduceClass()
    }
}
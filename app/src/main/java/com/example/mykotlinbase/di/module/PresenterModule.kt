package com.example.mykotlinbase.di.module

import com.example.mykotlinbase.pojoPlusRetrofit.pojo.ProduceClass
import com.example.mykotlinbase.ui.main.MainContract
import com.example.mykotlinbase.ui.main.PresenterImpl
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class PresenterModule {

        @Singleton
        @Provides
        fun injectPresenter(mainContractView: MainContract.View, produceClass: ProduceClass) =
            PresenterImpl(mainContractView, produceClass)
    }


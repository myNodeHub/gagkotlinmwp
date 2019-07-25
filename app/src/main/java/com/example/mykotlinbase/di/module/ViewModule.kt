package com.example.mykotlinbase.di.module

import com.example.mykotlinbase.pojoPlusRetrofit.pojo.ProduceClass
import com.example.mykotlinbase.ui.main.MainActivity
import com.example.mykotlinbase.ui.main.MainContract
import com.example.mykotlinbase.ui.main.MainFragment
import com.example.mykotlinbase.ui.main.PresenterImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class ViewModule {
    @Binds
    abstract fun injectToFrag(fragment: MainFragment): MainContract.View

//    @Module
//    companion object Factory {
//        @JvmStatic
//        @Provides
//        @Singleton
//        fun injectPresenter(mainContractView: MainContract.View, produceClass: ProduceClass) =
//            PresenterImpl(mainContractView, produceClass)
//    }
}
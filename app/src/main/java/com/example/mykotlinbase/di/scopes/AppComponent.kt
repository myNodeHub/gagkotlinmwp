package com.example.mykotlinbase.di.scopes

import com.example.mykotlinbase.MyApplication
import com.example.mykotlinbase.di.module.ActivityModule
import com.example.mykotlinbase.di.module.FragmentModule
import com.example.mykotlinbase.di.module.PresenterModule
import com.example.mykotlinbase.di.module.ProduceClassModule
import com.example.mykotlinbase.pojoPlusRetrofit.pojo.ProduceClass
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, ActivityModule::class, FragmentModule::class, ProduceClassModule::class,
PresenterModule::class])
interface AppComponent : AndroidInjector<DaggerApplication>{

    override fun inject(instance : DaggerApplication )
    @Component.Builder
    interface Builder {
        @BindsInstance
         fun application(application : MyApplication ) : AppComponent.Builder
         fun build() : AppComponent
    }
}
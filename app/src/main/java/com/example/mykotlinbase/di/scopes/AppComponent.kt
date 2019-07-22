package com.example.mykotlinbase.di.scopes

import com.example.mykotlinbase.MyApplication
import com.example.mykotlinbase.di.module.ActivityModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, ActivityModule::class])
interface AppComponent : AndroidInjector<DaggerApplication>{
//    fun injectFunc(application: MyApplication)

    override fun inject(instance : DaggerApplication )
    @Component.Builder
    interface Builder {
        @BindsInstance
         fun application(application : MyApplication ) : AppComponent.Builder
         fun build() : AppComponent
    }
}
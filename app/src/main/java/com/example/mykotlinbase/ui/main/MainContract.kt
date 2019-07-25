package com.example.mykotlinbase.ui.main

import com.example.mykotlinbase.pojoPlusRetrofit.pojo.PojoNewsLatest
import com.example.mykotlinbase.pojoPlusRetrofit.pojo.ProduceClass


interface MainContract {

    interface View {

        fun getSimpleStringVar(simpleStringVar : String)

    }
    interface Presenter  {

        fun subscribe()
        fun unsubscribe()
    }

}
package com.example.mykotlinbase.ui.main

import com.example.mykotlinbase.pojoPlusRetrofit.pojo.PojoNewsLatest


interface MainContract {

    interface View {

        fun setList(pojoNewsLatest : List<PojoNewsLatest> )

    }
    interface Presenter  {

        fun subscribe()
        fun unsubscribe()
    }

}
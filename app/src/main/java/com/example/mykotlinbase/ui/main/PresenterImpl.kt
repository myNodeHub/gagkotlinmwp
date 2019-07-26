package com.example.mykotlinbase.ui.main

import android.content.Context
import android.widget.Toast
import com.example.mykotlinbase.pojoPlusRetrofit.pojo.ProduceClass
import javax.inject.Inject

public class PresenterImpl constructor(var view: MainContract.View, var produceClass: ProduceClass) : MainContract.Presenter {

//    @Inject
//    lateinit var view: MainContract.View

//    @Inject
//    lateinit var produceClass: ProduceClass


    override fun subscribe() {
        println("!!---!!")
        println(produceClass.name)
        view.getSimpleStringVar(produceClass.name)
    }

    override fun unsubscribe() {
        TODO("not implemented")
    }

}

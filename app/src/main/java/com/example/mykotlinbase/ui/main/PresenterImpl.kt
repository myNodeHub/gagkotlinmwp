package com.example.mykotlinbase.ui.main

import android.content.Context
import android.widget.Toast
import javax.inject.Inject

public class PresenterImpl @Inject constructor() : MainContract.Presenter{


    override fun subscribe() {
        println("!!---!!")
    }

    override fun unsubscribe() {
        TODO("not implemented")
    }

}

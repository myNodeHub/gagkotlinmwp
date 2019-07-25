package com.example.mykotlinbase.pojoPlusRetrofit.pojo

import dagger.Module

@Module
class PojoNewsLatest(_name: String) {
    val name: String

    init {
        name = _name
    }

}


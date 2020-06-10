package com.example.pg_dagger.dependency_injection.module

import com.example.pg_dagger.models.LoginModel
import dagger.Module
import dagger.Provides

// write all objects in Module
@Module
class UserModule {

    @Provides
    fun providesLoginModule(): LoginModel {
        return LoginModel("dfdfg", 132)
    }
}
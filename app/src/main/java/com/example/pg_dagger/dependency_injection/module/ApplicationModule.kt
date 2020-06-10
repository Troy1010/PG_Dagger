package com.example.pg_dagger.dependency_injection.module

import com.example.pg_dagger.dependency_injection.component.AppComponent
import com.example.pg_dagger.models.LoginModel
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Named

// write all objects in Module
@Module
class ApplicationModule {

    @Named("STRING_B")
    @Provides
    fun providesString(): String {
        return "bbb"
    }

    @Named("STRING_A")
    @Provides
    fun providesString2(): String {
        return "aaa"
    }


    @Provides
    fun providesLoginModule(
        @Named("STRING_B")
        email : String
    ): LoginModel {
        return LoginModel(email, 132)
    }
}
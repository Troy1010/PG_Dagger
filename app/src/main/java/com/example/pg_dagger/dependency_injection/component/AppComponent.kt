package com.example.pg_dagger.dependency_injection.component

import com.example.pg_dagger.MainActivity
import com.example.pg_dagger.dependency_injection.module.UserModule
import dagger.Component

@Component(modules = arrayOf(UserModule::class))
interface AppComponent {    // dependency graph
                            //
    fun inject(activity: MainActivity)
}
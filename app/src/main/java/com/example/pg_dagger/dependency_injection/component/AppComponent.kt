package com.example.pg_dagger.dependency_injection.component

import com.example.pg_dagger.MainActivity
import com.example.pg_dagger.dependency_injection.module.ApplicationModule
import dagger.Component

@Component(modules = arrayOf(ApplicationModule::class))
interface AppComponent {    // dependency graph
                            //
    fun inject(activity: MainActivity)
}
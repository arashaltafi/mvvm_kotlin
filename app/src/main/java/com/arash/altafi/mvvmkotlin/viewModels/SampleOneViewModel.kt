package com.arash.altafi.mvvmkotlin.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arash.altafi.mvvmkotlin.models.User

class SampleOneViewModel(user: User) : ViewModel() {

    var userLiveData = MutableLiveData<User>()

    init {
        userLiveData.value = user
    }

}
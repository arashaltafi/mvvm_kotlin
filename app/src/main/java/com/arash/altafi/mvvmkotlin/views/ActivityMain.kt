package com.arash.altafi.mvvmkotlin.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.mvvmkotlin.R
import com.arash.altafi.mvvmkotlin.models.User
import com.arash.altafi.mvvmkotlin.viewModels.SampleOneViewModel
import kotlinx.android.synthetic.main.activity_main.*

class ActivityMain : AppCompatActivity() {

    private var viewModel : SampleOneViewModel ?= null
    private lateinit var user : User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        user = User()
        user.firstName = "Arash"
        user.lastName = "Altafi"

        viewModel = SampleOneViewModel(user)

        txtFirstName.text = viewModel!!.userLiveData.value!!.firstName
        txtLastName.text = viewModel!!.userLiveData.value!!.lastName
    }

}
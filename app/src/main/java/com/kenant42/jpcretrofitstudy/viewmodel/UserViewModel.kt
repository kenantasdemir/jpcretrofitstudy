package com.kenant42.jpcretrofitstudy.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kenant42.jpcretrofitstudy.entities.User
import com.kenant42.jpcretrofitstudy.repository.UserRepository

class UserViewModel : ViewModel() {
    var users = MutableLiveData<List<User>>()
    var userRepository = UserRepository()

    init {
        // Bu satır gereksiz, çünkü alttaki satırda yeniden tanımlanıyor
        // users = MutableLiveData()
    }

    fun getAllUsers() {
        users = userRepository.getAllUsers()
       Log.e("AD BILGISI " , users.value!![1].name)
    }
}
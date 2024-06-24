package com.kenant42.jpcretrofitstudy.repository

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.kenant42.jpcretrofitstudy.ApiUtils
import com.kenant42.jpcretrofitstudy.entities.User
import retrofit2.Call
import retrofit2.Response

class UserRepository {
    var usersList = MutableLiveData<List<User>>()
    init {
        // Bu satır gereksiz, çünkü alttaki satırda yeniden tanımlanıyor
        // usersList = MutableLiveData()
    }

    @SuppressLint("SuspiciousIndentation")
    fun getAllUsers(): MutableLiveData<List<User>> {
        val usersDAOInterface = ApiUtils.getUsersDAOInterface()
        usersDAOInterface.getAllUsers().enqueue(object : retrofit2.Callback<List<User>> {
            override fun onResponse(call: Call<List<User>>?, response: Response<List<User>>?) {
                if (response!!.isSuccessful) {
                    usersList.value = response!!.body()
                    println(response.body()[1].address.city)
                }
            }

            override fun onFailure(call: Call<List<User>>?, t: Throwable?) {
                Log.e("UserRepository", "Error fetching users", t)
            }

        })
        return usersList
    }




}
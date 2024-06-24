package com.kenant42.jpcretrofitstudy

import com.kenant42.jpcretrofitstudy.entities.User
import retrofit2.Call

import retrofit2.http.GET

interface UsersDAOInterface {
    @GET("users/")
    fun getAllUsers(): Call<List<User>>
}
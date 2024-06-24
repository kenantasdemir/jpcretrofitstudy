package com.kenant42.jpcretrofitstudy

class ApiUtils {
    companion object{
        val BASE_URL = "https://jsonplaceholder.typicode.com/"

        fun getUsersDAOInterface():UsersDAOInterface{
            return RetrofitClient.getClient(BASE_URL).create(UsersDAOInterface::class.java)
        }
    }
}
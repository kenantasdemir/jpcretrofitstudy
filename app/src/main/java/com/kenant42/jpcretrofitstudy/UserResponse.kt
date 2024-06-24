package com.kenant42.jpcretrofitstudy

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.kenant42.jpcretrofitstudy.entities.User

data class UserResponse(
    @SerializedName("")
    @Expose
    var users:List<User>
) {
}
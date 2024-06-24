package com.kenant42.jpcretrofitstudy.entities

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id")
    @Expose
    var id:Int,
    @SerializedName("name")
    @Expose
    var name:String,
    @SerializedName("username")
    @Expose
    var username:String,
    @SerializedName("email")
    @Expose
    var email:String,
    @SerializedName("address")
    @Expose
    var address: Address,
    @SerializedName("phone")
    @Expose
    var phone:String,
    @SerializedName("website")
    @Expose
    var website:String,
    @SerializedName("company")
    @Expose
    var company: Company

) {
}
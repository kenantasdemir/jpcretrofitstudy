package com.kenant42.jpcretrofitstudy.entities

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Address(
    @SerializedName("street")
    @Expose
    var street:String,
    @SerializedName("suite")
    @Expose
    var suite:String,
    @SerializedName("city")
    @Expose
    var city:String,
    @SerializedName("zipcode")
    @Expose
    var zipcode:String
) {
}
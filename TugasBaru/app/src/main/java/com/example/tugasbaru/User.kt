package com.example.tugasbaru

import  android.os.Parcelable
import  kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val username:String
):Parcelable
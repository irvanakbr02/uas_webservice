package com.example.batik.api.response

import com.google.gson.annotations.SerializedName

data class Default (
    @SerializedName("nama")
    var nama:String?,
    @SerializedName("asal")
    var asal:String?,
    @SerializedName("ciri")
    var ciri:String?,
    @SerializedName("filosofi")
    var filosofi:String?,
    @SerializedName("Accuracy")
    var Accuracy:String?,
    @SerializedName("Message")
    var message:String?


)
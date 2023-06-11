package com.plcoding.cryptocurrencyappyt.domain.model

import com.google.gson.annotations.SerializedName
import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDto

data class Coin(
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)



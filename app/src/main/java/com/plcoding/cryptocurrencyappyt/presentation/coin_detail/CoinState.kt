package com.plcoding.cryptocurrencyappyt.presentation.coin_detail

import com.plcoding.cryptocurrencyappyt.domain.model.CoinDetail

data class CoinState(
    val isLoading: Boolean = false,
    val coin : CoinDetail? = null,
    val error : String = ""
)

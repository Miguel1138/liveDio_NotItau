package com.miguelsantos.livediobanco.model

import androidx.annotation.DrawableRes
import com.miguelsantos.livediobanco.R

data class MenuItem(
    val title: String,
    @DrawableRes val icon: Int = R.drawable.ic_baseline_credit_card_24
)
package com.example.cloneui

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Food(val Image: Int, val Title: String, val score: Double, val Detail: String, val Time: String, val Tip: String, val MinPrice: Int) : Parcelable
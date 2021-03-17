package edu.itesm.pokdex_a01338074

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Pokemon (val picture:Int,
                    val number: Int,
                    val region: String,
                    val name: String,
                    val weakness: String,
                    val typing:String): Parcelable
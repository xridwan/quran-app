package com.xridwan.alquran.data.source.local.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Surah(
    var index: Int? = 0,
    var arti: String? = "",
    var nama: String? = "",
    var asma: String? = "",
    var ayat: String? = "",
    var type: String? = "",
    var nomor: String? = "",
    var ar: String? = "",
    var id: String? = "",
    var last: String? = "",
) : Parcelable

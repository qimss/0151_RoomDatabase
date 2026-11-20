package com.example.mobileapp.view.route

import com.example.mobileapp.R


object DestinasiDetailSiswa : DestinasiNavigasi {
    override val route = "detail_siswa"
    override val titleRes = R.string.detail_siswa
    val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}
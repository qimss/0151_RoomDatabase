package com.example.mobileapp.view.route

import com.example.mobileapp.R

object DestinasiEditSiswa : DestinasiNavigasi{
    override val route = "item_edit"
    override val titleRes = R.string.edit_siswa
    val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}
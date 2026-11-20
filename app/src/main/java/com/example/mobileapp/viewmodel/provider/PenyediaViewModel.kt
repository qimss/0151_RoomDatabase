package com.example.mobileapp.viewmodel.provider

import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.mobileapp.viewmodel.DetailViewModel
import com.example.mobileapp.viewmodel.EditViewModel
import com.example.mobileapp.viewmodel.EntryViewModel
import com.example.mobileapp.viewmodel.HomeViewModel
import com.example.mobileapp.viewmodel.aplikasiSiswa

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(aplikasiSiswa().container.repositoriSiswa)
        }

        initializer {
            EntryViewModel(aplikasiSiswa().container.repositoriSiswa)
        }

        initializer {
            DetailViewModel(
                this.createSavedStateHandle(),
                aplikasiSiswa().container.repositoriSiswa
            )
        }

        initializer {
            EditViewModel(
                this.createSavedStateHandle(),
                aplikasiSiswa().container.repositoriSiswa
            )
        }
    }
}
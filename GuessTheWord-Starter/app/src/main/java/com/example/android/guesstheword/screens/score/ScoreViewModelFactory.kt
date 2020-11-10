package com.example.android.guesstheword.screens.score

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * Created by chon on 2020/11/10.
 * Hedge.
 */
class ScoreViewModelFactory(private val finalScore: Int): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass == ScoreViewModel::class.java) {
            return ScoreViewModel(finalScore) as T
        }

        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
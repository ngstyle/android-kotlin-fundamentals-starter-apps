package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel

/**
 * Created by chon on 2020/11/10.
 * Hedge.
 */
class ScoreViewModel(finalScore: Int): ViewModel() {

    var score = finalScore
    init {
        Log.i("ScoreViewModel", "Final score is $finalScore")
    }

}
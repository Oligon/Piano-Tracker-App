package com.johncole.pianotracker.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.johncole.pianotracker.data.PracticeActivityRepository
import com.johncole.pianotracker.data.SessionRepository
import com.johncole.pianotracker.utilities.convertDateToFormattedString
import kotlinx.coroutines.launch
import java.time.LocalDate

class StatsViewModel(
    private val sessionRepository: SessionRepository,
    private val practiceActivityRepository: PracticeActivityRepository
) : ViewModel() {

    // TODO: Get this to use the new timestamp column
    fun getAllSessionsBeforePresent() {
        val currentDate = convertDateToFormattedString(LocalDate.now())

        viewModelScope.launch {
            sessionRepository.getAllSessionsBeforePresent(currentDate)
        }
    }
}
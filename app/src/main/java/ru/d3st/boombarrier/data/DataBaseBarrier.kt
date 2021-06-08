package ru.d3st.boombarrier.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DataBaseBarrier (
    @PrimaryKey val id: Long,
    val telephone: Int,
    val description: String,
    val latitude: Long?,
    val longitude: Long?)
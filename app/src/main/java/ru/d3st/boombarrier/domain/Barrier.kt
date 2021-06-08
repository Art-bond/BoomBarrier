package ru.d3st.boombarrier.domain


data class Barrier (
    val id: Long,
    val telephone: Int,
    val description: String,
    val latitude: Long?,
    val longitude: Long?)

package ru.d3st.boombarrier.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface BarrierDao {
    @Query("SELECT * FROM databasebarrier")
    fun getAll(): LiveData<List<DataBaseBarrier>>

    @Query("SELECT * FROM databasebarrier WHERE id = :id")
    suspend fun get(id: Long): DataBaseBarrier

    @Insert
    suspend fun insert(barrier: DataBaseBarrier): Long

    @Delete
    suspend fun delete(barrier: DataBaseBarrier)

    @Update
    suspend fun update(barrier: DataBaseBarrier)

}
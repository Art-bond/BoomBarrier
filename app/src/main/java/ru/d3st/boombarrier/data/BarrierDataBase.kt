package ru.d3st.boombarrier.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [DataBaseBarrier::class], version = 1)
abstract class BarrierDataBase : RoomDatabase() {

    abstract fun barrierDao(): BarrierDao

    companion object {
        @Volatile private var INSTANCE: BarrierDataBase? = null

        fun getDatabase(context: Context): BarrierDataBase {
            val tempInstance =
                INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context,
                    BarrierDataBase::class.java,
                    "barrier_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
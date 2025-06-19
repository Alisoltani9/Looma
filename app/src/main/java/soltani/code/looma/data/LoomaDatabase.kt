package soltani.code.looma.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Spot::class], version = 1)
abstract class LoomaDatabase: RoomDatabase()
{
    abstract fun spotDao(): SpotDao
}
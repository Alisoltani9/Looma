package soltani.code.looma.data

import android.icu.text.MessagePattern.ArgType.SELECT
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


interface SpotDao {

    @Query("SELECT * FROM spot WHERE id = :id")
    suspend fun getSpotById(id: Int): Spot?

    @Query("SELECT * FROM spot ORDER BY createdAt DESC")
    suspend fun getSpots(): Flow<List<Spot>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSpot(spot: Spot)

    @Delete
    suspend fun deleteSpot(spot: Spot)
}
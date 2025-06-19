package soltani.code.looma.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Spot(
  @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val notes: String,
    val latitude : Double,
    val longitude : Double,
    val createdAt: Long

)
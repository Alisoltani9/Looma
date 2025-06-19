package soltani.code.looma.di

import android.app.Application
import androidx.room.ProvidedTypeConverter
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import soltani.code.looma.LoomApp
import soltani.code.looma.data.LoomaDatabase
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideAppDatabase(app: Application): LoomaDatabase {
        return Room.databaseBuilder(
            app,
            LoomaDatabase::class.java,
            "looma_db"
        ).build()
    }

    @Provides
    fun provideSpotDao(db: LoomaDatabase) = db.spotDao()


}
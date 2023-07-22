package com.kotlin_assignment.roomdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = [Contacts::class], version = 2)

@TypeConverters(Convertor::class)
abstract class ContactDatabase: RoomDatabase() {

    abstract fun contactDAO() : ContactsDAO

    companion object{

        private val migration_1_2 = object : Migration(1,2){
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE contacts ADD COLUMN status INTEGER NOT NULL DEFAULT(1)")
            }

        }

        @Volatile
        private var INSTANCE : ContactDatabase? = null

        fun getDatabase(context : Context):ContactDatabase{
            if (INSTANCE == null)
            {
                synchronized(this){
                INSTANCE = Room.databaseBuilder(context.applicationContext,
                            ContactDatabase::class.java,
                            "contactDB")
                            .addMigrations(migration_1_2)
                            .build()
                }
            }
            return INSTANCE!!
        }
    }
}
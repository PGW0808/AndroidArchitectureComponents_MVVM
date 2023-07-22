package com.kotlin_assignment.roomdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters

@Database(entities = [Contacts::class], version = 1)

@TypeConverters(Convertor::class)
abstract class ContactDatabase: RoomDatabase() {

    abstract fun contactDAO() : ContactsDAO

    companion object{
        @Volatile
        private var INSTANCE : ContactDatabase? = null

        fun getDatabase(context : Context):ContactDatabase{
            if (INSTANCE == null)
            {
                synchronized(this){
                INSTANCE = Room.databaseBuilder(context.applicationContext,
                            ContactDatabase::class.java,
                            "contactDB").build()
                }
            }
            return INSTANCE!!
        }
    }
}
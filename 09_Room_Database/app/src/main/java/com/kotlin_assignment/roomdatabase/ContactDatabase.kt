package com.kotlin_assignment.roomdatabase

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Contacts::class], version = 1)
abstract class ContactDatabase: RoomDatabase() {

    abstract fun contactDAO() : ContactsDAO
}
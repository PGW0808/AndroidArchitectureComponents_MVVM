package com.kotlin_assignment.roomdatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ContactsDAO {

    @Insert
    suspend fun insertContact(contacts : Contacts)

    @Update
    suspend fun updateContact(contacts : Contacts)

    @Delete
    suspend fun deleteContact(contacts : Contacts)

    @Query("SELECT * FROM contacts")
    fun getContact() : LiveData<List<Contacts>>
}
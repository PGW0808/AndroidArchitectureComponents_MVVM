package com.kotlin_assignment.roomdatabase

import androidx.room.TypeConverter
import java.util.Date

class Convertor {

    @TypeConverter
    fun fromDateToLong(value : Date):Long{
        return value.time
    }

    @TypeConverter
    fun fromLongToDate(value : Long):Date{
        return Date(value)
    }
}
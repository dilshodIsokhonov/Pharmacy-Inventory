package com.example.pharmacyinventory.database

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import java.text.SimpleDateFormat
import java.util.*

@ProvidedTypeConverter
class Converters {

    @TypeConverter fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter fun dateToTimestamp(date: Date?): Long? {
        return date?.let { date.time  }
    }
}
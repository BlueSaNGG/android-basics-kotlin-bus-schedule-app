package com.example.busschedule.database.schedule

import androidx.room.Dao
import androidx.room.Query

// DAO is data access object, used to define the function to read and manipulating data
@Dao
interface ScheduleDao {
    @Query("SELECT * FROM schedule ORDER BY arrival_time ASC")
    fun getAll(): List<Schedule>

    @Query("SELECT * FROM schedule WHERE :stopName ORDER BY arrival_time ASC")
    fun getByStopName(stopName: String): List<Schedule>
}
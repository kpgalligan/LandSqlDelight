package com.dardev.poclandsqldelight

import com.dardev.poclandsqldelight.database.Database

object TryDb {
    private val dbRef = Database(DatabaseDriverFactory().createDriver())

    fun runStuff(){
        println(dbRef.landQueries.selectAll().executeAsList().joinToString(separator = ", ") { it.full_name })
    }
}
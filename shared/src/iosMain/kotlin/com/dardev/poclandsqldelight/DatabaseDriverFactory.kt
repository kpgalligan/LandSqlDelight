package com.dardev.poclandsqldelight

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import com.dardev.poclandsqldelight.database.Database

actual class DatabaseDriverFactory{
    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(Database.Schema, "land.db")
    }
}
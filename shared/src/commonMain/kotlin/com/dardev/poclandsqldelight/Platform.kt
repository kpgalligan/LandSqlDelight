package com.dardev.poclandsqldelight

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
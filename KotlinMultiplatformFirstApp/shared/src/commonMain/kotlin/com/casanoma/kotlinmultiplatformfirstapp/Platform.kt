package com.casanoma.kotlinmultiplatformfirstapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
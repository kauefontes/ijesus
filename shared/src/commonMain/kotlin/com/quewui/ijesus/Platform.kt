package com.quewui.ijesus

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
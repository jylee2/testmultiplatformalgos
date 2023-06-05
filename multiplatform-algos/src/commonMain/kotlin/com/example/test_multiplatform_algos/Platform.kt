package com.example.test_multiplatform_algos

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
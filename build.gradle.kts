plugins {
    //trick: for the same plugin versions in all sub-modules
//    id("com.android.library").version("8.2.0-alpha04").apply(false)
//    kotlin("multiplatform").version("1.8.21").apply(false)
    id("com.android.library")
    kotlin("multiplatform")
}

tasks.register("test-multiplatform-algos-clean", Delete::class) {
    delete(rootProject.buildDir)
}

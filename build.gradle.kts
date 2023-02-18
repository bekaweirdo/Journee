buildscript {
    dependencies {
//        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0")

    }
}
@Suppress("DSL_SCOPE_VIOLATION")
//plugins {
//    id("com.android.application") version "8.1.0-alpha02"
//    id("com.android.library") version "8.1.0-alpha02"
//    id("org.jetbrains.kotlin.android") version "1.7.21"
//    id("org.jetbrains.kotlin.kapt") version "1.7.21"
//}

tasks.register("clean", Delete::class){
    delete(rootProject.buildDir)
}
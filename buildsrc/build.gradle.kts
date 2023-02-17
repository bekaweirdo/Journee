import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
    jcenter()
}

gradlePlugin {
    plugins {
        create("CommonPlugin") {
            id = "CommonPlugin"
            implementationClass = "CommonPlugin"
        }
    }
}

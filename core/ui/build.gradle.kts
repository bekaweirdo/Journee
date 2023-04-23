@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.veux.ui"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.veux.ui"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    //Compose
    api(platform(libs.compose.bom))
    api(libs.bundles.compose)
    debugApi(libs.bundles.compose.debug)

    api(libs.bundles.lyfecycle)
    api(libs.coil)

    androidTestApi(platform(libs.compose.bom))
    androidTestApi(libs.bundles.test.android)
}
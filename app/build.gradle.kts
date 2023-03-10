@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("CommonPlugin")
}

android {
    namespace 'com.veux.journee'
    compileSdk libs.versions.sdk.compile.get().toInteger()

    defaultConfig {
        applicationId "com.veux.journee"
        minSdk libs.versions.sdk.min.get().toInteger()
        targetSdk libs.versions.sdk.target.get().toInteger()
        versionCode libs.versions.app.version.code.get().toInteger()
        versionName libs.versions.app.version.name.get()

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary true
        }
    }

    buildTypes {
        getByName("debug"){
            minifyEnabled = false
        }
        getByName("release"){
            minifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = '1.8'
    }
    buildFeatures {
        compose true
    }
    composeOptions {
        kotlinCompilerExtensionVersion libs.versions.compose.compiler.get()
    }
    packagingOptions {
        resources {
            excludes += '/META-INF/{AL2.0,LGPL2.1}'
        }
    }
}

dependencies {
    implementation libs.androidx.core.ktx
    testApi(libs.bundles.test.common)

    implementation(project(":core:components"))
    implementation(project(":core:navigation"))
}
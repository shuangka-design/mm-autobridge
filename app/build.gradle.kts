plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.mmbridge"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mmbridge"
        minSdk = 26
        targetSdk = 34
        versionCode = 2
        versionName = "2.0-SafeMode"
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    // Google ML Kit Text Recognition (อ่านตัวเลขยอดเงินจากรูปสลิปแบบออฟไลน์)
    implementation("com.google.mlkit:text-recognition:16.0.0")
}

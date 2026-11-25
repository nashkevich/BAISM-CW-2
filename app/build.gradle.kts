plugins {
    id("com.android.application")
}

android {
    namespace = "com.baism.cw2"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.baism.cw2"
        minSdk = 29
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    testImplementation("junit:junit:4.13.2")
}

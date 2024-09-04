plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.kointutorial"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.kointutorial"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    val koin_version = "4.0.0-RC2"
    val retrofit_version = "2.11.0"
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)



    //koin library

    //koin-bom
    implementation(platform("io.insert-koin:koin-bom:$koin_version"))

    //koin-core
    implementation("io.insert-koin:koin-core")

    //koin-android
    implementation ("io.insert-koin:koin-android:$koin_version")

    //koin for working with testing library
    testImplementation("io.insert-koin:koin-test-junit4:$koin_version")

    //koin for android jetpack compose
    implementation ("io.insert-koin:koin-androidx-compose:$koin_version")

    // Koin for Navigation Graph
    implementation("io.insert-koin:koin-androidx-navigation:$koin_version")


    //Retrofit Library

    implementation ("com.squareup.retrofit2:retrofit:$retrofit_version")
    implementation ("com.squareup.retrofit2:converter-moshi:$retrofit_version")

    //okhttp library
    implementation("com.squareup.okhttp3:okhttps:3.4.1")

}
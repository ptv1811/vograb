plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-parcelize")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    id("com.google.gms.google-services")
}

apply("$rootDir/dependencies.gradle.kts")
val version = project.extra

android {
    namespace = "com.guava.vograb"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.guava.vograb"
        minSdk = 30
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        dataBinding = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // Architecture components
    implementation ("androidx.fragment:fragment-ktx:${version["fragmentVersion"]}")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:${version["lifecycleVersion"]}")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-savedstate:${version["lifecycleVersion"]}")
    implementation ("androidx.room:room-runtime:${version["roomVersion"]}")
    implementation ("androidx.room:room-ktx:${version["roomVersion"]}")
    implementation ("androidx.navigation:navigation-fragment-ktx:${version["navigationVersion"]}")
    implementation ("androidx.navigation:navigation-ui-ktx:${version["navigationVersion"]}")
    implementation ("androidx.appcompat:appcompat:${version["appCompat"]}")
    kapt ("androidx.room:room-compiler:${version["roomVersion"]}")
    testImplementation ("androidx.arch.core:core-testing:${version["archCompomentVersion"]}")

    // Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:${version["coroutinesVersion"]}")
    testImplementation( "org.jetbrains.kotlinx:kotlinx-coroutines-android:${version["coroutinesVersion"]}")
    testImplementation ("org.jetbrains.kotlinx:kotlinx-coroutines-test:${version["coroutinesVersion"]}")

    // Hilt
    implementation("com.google.dagger:hilt-android:${version["hiltCoreVersion"]}")
    kapt ("com.google.dagger:hilt-compiler:${version["hiltCoreVersion"]}")
    kapt ("androidx.hilt:hilt-compiler:${version["hiltCoreVersion"]}")
    androidTestImplementation("com.google.dagger:hilt-android-testing:${version["hiltCoreVersion"]}")
    kaptAndroidTest("com.google.dagger:hilt-compiler:${version["hiltCoreVersion"]}")

    // Retrofit
    implementation( "com.github.skydoves:sandwich:${version["sandwichVersion"]}")
    implementation ("com.squareup.retrofit2:retrofit:${version["retrofitVersion"]}")
    implementation ("com.squareup.retrofit2:converter-moshi:${version["retrofitVersion"]}")

    // Binding
    implementation("com.github.skydoves:bindables:${version["bindablesVersion"]}")

    // Firebase
    implementation(platform("com.google.firebase:firebase-bom:${version["firebaseBom"]}"))
    implementation("com.google.firebase:firebase-analytics-ktx")
}
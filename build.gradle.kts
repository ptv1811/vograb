// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    apply("$rootDir/dependencies.gradle.kts")
    repositories {
        google()
        mavenCentral()
        maven("https://oss.sonatype.org/content/repositories/snapshots/" )
    }
    dependencies {
        val version = project.extra
        classpath("com.android.tools.build:gradle:${version["gradleBuildTool"]}")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:${version["kotlin"]}")
        classpath ("com.google.dagger:hilt-android-gradle-plugin:${version["hiltCoreVersion"]}")
        classpath ("com.diffplug.spotless:spotless-plugin-gradle:${version["spotlessGradle"]}")
    }
}

plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("com.google.gms.google-services") version "4.4.0" apply false
}
buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:7.2.0")
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
}
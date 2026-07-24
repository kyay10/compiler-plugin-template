import org.jetbrains.kotlin.gradle.plugin.kotlinToolingVersion

plugins {
    id("com.gradleup.shadow") version "9.6.0"
    kotlin("compiler.plugin.devkit.compiler-plugin") version "0.0.1-SNAPSHOT"
}

pluginDevKit {
    developForWithFixtures(kotlinToolingVersion)
    developForWithFixtures("2.5.0-dev-498")
    testDataLibraries { common(project(":plugin-annotations")) }
}

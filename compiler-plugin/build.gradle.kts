import org.jetbrains.kotlin.gradle.plugin.kotlinToolingVersion

plugins {
    id("com.gradleup.shadow") version "9.6.0"
    pluginDevKit("compiler-plugin")
}

pluginDevKit {
    developForWithFixtures(kotlinToolingVersion)
    developForWithFixtures("2.5.0-dev-498")
    testDataLibraries { common(project(":plugin-annotations")) }
}

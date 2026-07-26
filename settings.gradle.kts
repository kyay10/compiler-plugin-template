pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven {
            name = "devKitSpace"
            url = uri("https://packages.jetbrains.team/maven/p/compiler-plugin-dev-kit/eap")
            credentials(PasswordCredentials::class)
        }
        mavenLocal()
    }
}

plugins {
    kotlin("compiler.plugin.devkit") version "0.0.1-SNAPSHOT"
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven {
            name = "devKitSpace"
            url = uri("https://packages.jetbrains.team/maven/p/compiler-plugin-dev-kit/eap")
            credentials(PasswordCredentials::class)
        }
        mavenLocal()
    }
}

rootProject.name = "compiler-plugin-template"

include("compiler-plugin")

include("gradle-plugin")

include("plugin-annotations")

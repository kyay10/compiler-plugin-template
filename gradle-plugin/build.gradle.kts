plugins {
    kotlin("compiler.plugin.devkit.gradle-plugin") version "0.0.1-SNAPSHOT"
}

pluginDevKit {
    compilerPlugin = project(":compiler-plugin")
    companionLibrary(project(":plugin-annotations"))
}

gradlePlugin {
    plugins {
        create("SimplePlugin") {
            id = group.toString()
            displayName = "SimplePlugin"
            description = "SimplePlugin"
            implementationClass =
                "org.jetbrains.kotlin.compiler.plugin.template.SimpleSupportPlugin"
        }
    }
}

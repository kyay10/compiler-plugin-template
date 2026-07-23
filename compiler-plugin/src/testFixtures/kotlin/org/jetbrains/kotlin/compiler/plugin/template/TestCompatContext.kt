package org.jetbrains.kotlin.compiler.plugin.template

import java.util.ServiceLoader

interface TestCompatContext {
    object Default : TestCompatContext

    companion object :
        TestCompatContext by ServiceLoader.load(TestCompatContext::class.java).firstOrNull()
            ?: Default
}

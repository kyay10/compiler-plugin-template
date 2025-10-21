// RUN_PIPELINE_TILL: FRONTEND

package foo.bar

import org.<!UNRESOLVED_IMPORT!>jetbrains<!>.kotlin.compiler.plugin.template.SomeAnnotation

@<!UNRESOLVED_REFERENCE!>SomeAnnotation<!>
fun test() {
  val s = MyClass().foo()
  s.<!UNRESOLVED_REFERENCE!>inc<!>() // should be an error
}

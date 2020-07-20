// new contracts syntax for simple functions
fun test9(s: MyClass?) contract [returns() implies (s != null), someContract(s), returns() implies (s is MySubClass)] {
    test_9()
}

fun test10 contract [returnsNotNull()] {
    test10()
}
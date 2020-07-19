fun someFunctionWithTypeConstraints<T, E>(arg: E?, block: () -> T): String
    where T : MyClass,
          E : MyOtherClass
    contract [
        returns() implies (arg != null),
        callsInPlace(block, EXACTLY_ONCE),
        someComplexContract(arg, block)
    ]
{
    block()
    arg ?: throw NullArgumentException()
    return "some string"
}

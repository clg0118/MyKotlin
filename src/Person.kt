class Person {
    var name: String = ""
        get() = field.toUpperCase()
        set(value) {
            field = "name: $value"
        }
}
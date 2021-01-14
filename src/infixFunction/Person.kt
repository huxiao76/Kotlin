package infixFunction

class Person(val name: String) {
    val likesPeople = mutableListOf<Person>();
    // The containing class becomes the first parameter.
    infix fun likes(other: Person) {
        likesPeople.add(other);
    }
}

package infixFunction

/**
 * Functions marked with the infix keyword can also be called using the infix notation (omitting the dot and the
 * parentheses for the call). Infix functions must satisfy the following requirements:
 * --They must be member functions or extension functions;
 * --They must have a single parameter;
 * --The parameter must not accept variable number of arguments and must have no default value.
 * note:
 * Infix function calls have lower precedence than the arithmetic operators, type casts, and the rangeTo operator.
 * On the other hand, infix function call's precedence is higher than that of the boolean operators && and ||, is-
 * and in-checks, and some other operators.
 */
fun main() {
    // defines an infix extension function on Int.
    infix fun Int.times(str: String) = str.repeat(this);
    // ByeBye
    println(2 times "Bye");

    // Creates a Pair by calling the infix function to from the standard library.
    var pair = "Ferrari" to "Katrina";
    // (Ferrari, Katrina)
    println(pair);

    // Here's your own implementation of to creatively called onto.
    infix fun String.onto(other: String) = Pair(this, other);
    // (McLaren, Lucas)
    var myPair = "McLaren" onto "Lucas";
    println(myPair);

    // Infix notation also works on members functions (methods).
    val sophia = Person("Sophia");
    val claudia = Person("Claudia");
    sophia likes claudia;
}

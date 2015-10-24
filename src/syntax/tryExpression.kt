package syntax.tryExpression

class SomeException: Exception()

@Suppress("UNUSED_VARIABLE")
fun tryExpression() {
    try {
        // some code
        throw SomeException()
    }
    catch (e: SomeException) {
        // handler
    }
    finally {
        // optional finally block
    }

    val result = try {
        1
    }
    catch (e: SomeException) {
        2
    }
}
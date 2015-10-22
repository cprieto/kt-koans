package i_introduction._4_String_Templates

import org.junit.Assert
import java.util.regex.Pattern
import org.junit.Test as test

class _04_String_Templates() {
    @test fun match() {
        Assert.assertTrue(Pattern.compile(task4()).matcher("Douglas Adams (11 MAR 1952)").find())
    }

    @test fun match1() {
        Assert.assertTrue(Pattern.compile(task4()).matcher("Stephen Fry (24 AUG 1957)").find())
    }

    @test fun doNotMatch() {
        Assert.assertFalse(Pattern.compile(task4()).matcher("Stephen Fry (24 RRR 1957)").find())
    }
}
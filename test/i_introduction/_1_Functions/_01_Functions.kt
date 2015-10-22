package i_introduction._1_Functions

import org.junit.Assert
import org.junit.Test as test

class _01_Functions() {
    @test fun collection() {
        Assert.assertEquals("{1, 2, 3, 42, 555}", task1(listOf(1, 2, 3, 42, 555)))
    }
}
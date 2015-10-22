package i_introduction._3_Lambdas

import org.junit.Assert
import org.junit.Test as test

class _03_Lambdas() {
    @test fun contains() {
        Assert.assertTrue(task3(listOf(1, 2, 3, 126, 555)))
    }

    @test fun notContains() {
        Assert.assertFalse(task3(listOf(44)))
    }
}
package ii_collections

import org.junit.Assert
import org.junit.Test
import ii_collections.data.*

class _19_Sum {
    @Test fun testGetTotalOrderPrice() {
        Assert.assertEquals(148.0, customers[nathan]!!.getTotalOrderPrice(), 1e-1)
    }
}

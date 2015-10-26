package ii_collections

import org.junit.Assert
import org.junit.Test
import ii_collections.data.*

class _18_Sort {
    @Test fun testGetCustomersSortedByNumberOfOrders() {
        Assert.assertEquals(sortedCustomers, shop.getCustomersSortedByNumberOfOrders())
    }
}

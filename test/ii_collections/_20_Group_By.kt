package ii_collections

import org.junit.Assert
import org.junit.Test
import ii_collections.data.*

class _20_Group_By {
    @Test fun testGroupCustomersByCity() {
        Assert.assertEquals(groupedByCities, shop.groupCustomersByCity())
    }
}

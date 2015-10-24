package ii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        val yc = year.compareTo(other.year)
        val mc = month.compareTo(other.month)
        val dc = dayOfMonth.compareTo(other.dayOfMonth)

        if (yc == -1) return -1
        if (yc == 1) return 1

        if (mc == -1) return -1
        if (mc == 1) return 1

        if (dc == -1) return -1
        if (dc == 1) return 1

        return 0
    }
}

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(public val start: MyDate, public val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> = object : Iterator<MyDate> {
        var current : MyDate = start
        override fun hasNext(): Boolean {
            return current <= end
        }

        override fun next(): MyDate {
            val prev = current
            current = current.nextDay()
            return prev
        }
    }
}

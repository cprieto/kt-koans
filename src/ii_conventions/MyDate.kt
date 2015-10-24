package ii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        if (year != other.year) return year - other.year
        if (month != other.month) return month - other.month
        return dayOfMonth - other.dayOfMonth
    }
}

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

operator fun MyDate.rangeTo(end: MyDate) : DateRange = DateRange(this, end)

class DateRange(public val start: MyDate, public val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> = object : Iterator<MyDate> {
        var current : MyDate = start
        override fun hasNext(): Boolean {
            return current <= end
        }

        override fun next(): MyDate {
            val result = current
            current = current.nextDay()
            return result
        }
    }
}

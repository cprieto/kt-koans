package iii_conventions

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

class DateRange(public override val start: MyDate, public override val end: MyDate) : kotlin.Range<MyDate>, Iterable<MyDate>  {
    override fun contains(item: MyDate) = item >= start && item <= end

    override fun iterator(): Iterator<MyDate> {
        var current: MyDate = start
        return object: Iterator<MyDate> {
            override fun hasNext(): Boolean = current <= end

            override fun next(): MyDate {
                val result = current
                current = current.nextDay()
                return result
            }
        }
    }
}

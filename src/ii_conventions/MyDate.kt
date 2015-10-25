package ii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        if (year != other.year) return year - other.year
        if (month != other.month) return month - other.month
        return dayOfMonth - other.dayOfMonth
    }

    operator fun plus(other: TimeInterval) : MyDate {
        return this.addTimeIntervals(other, 1)
    }

    operator fun plus(other: RepeatedTimeInterval) : MyDate {
        return this.addTimeIntervals(other.interval, other.number)
    }
}

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

operator fun TimeInterval.times(number: Int) : RepeatedTimeInterval = RepeatedTimeInterval(this, number)

data class RepeatedTimeInterval(val interval: TimeInterval, val number: Int)

operator fun MyDate.rangeTo(end: MyDate) : DateRange = DateRange(this, end)

class DateRange(public override val start: MyDate, public override val end: MyDate) : Iterable<MyDate>, Range<MyDate> {
    override fun contains(item: MyDate): Boolean {
        return start <= item && end >= item
    }

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

package iii_conventions

import util.*

fun todoTask27(): Nothing = TODO(
    """
        Task 27.
        Uncomment the commented code and make it compile.
        To make '..' work add a 'MyDate.rangeTo()' extension function returning DateRange.
        Add all changes to the file MyDate.kt.
    """,
    references = { date: MyDate -> date.nextDay() })


fun iterateOverDateRange2(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}

operator fun MyDate.rangeTo(upTo: MyDate) = DateRange(this, upTo)

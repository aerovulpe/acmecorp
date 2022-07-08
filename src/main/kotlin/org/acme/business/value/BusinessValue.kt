package org.acme.business.value

import org.acme.business.constraint.TimeConstraint
import java.time.Period
import java.time.temporal.ChronoUnit

data class BusinessValue(
  override val hours: Int
) : TimeConstraint {
  override val period: Period = Period.ofWeeks(1)

  override fun compareTo(other: TimeConstraint): Int {
    val hoursSaved = hours * period.get(ChronoUnit.WEEKS)

    val hoursSpent = other.hours * other.period.get(ChronoUnit.WEEKS)

    return when {
      hoursSaved < hoursSpent -> -1

      hoursSaved > hoursSpent -> 1

      else -> 0
    }
  }
}

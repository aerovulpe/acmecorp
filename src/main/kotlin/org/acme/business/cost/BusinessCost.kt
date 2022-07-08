package org.acme.business.cost

import org.acme.business.constraint.TimeConstraint
import java.time.Period
import java.time.temporal.ChronoUnit

data class BusinessCost(
  override val hours: Int
) : TimeConstraint {
  override val period: Period = Period.ofWeeks(1)

  override fun compareTo(other: TimeConstraint): Int {
    val hoursSpent = hours * period.get(ChronoUnit.WEEKS)

    val hoursSaved = other.hours * other.period.get(ChronoUnit.WEEKS)

    return when {
      hoursSpent < hoursSaved -> -1

      hoursSpent > hoursSaved -> 1

      else -> 0
    }
  }
}

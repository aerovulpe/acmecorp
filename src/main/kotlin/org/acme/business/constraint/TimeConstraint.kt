package org.acme.business.constraint

import java.time.Period

interface TimeConstraint : Comparable<TimeConstraint> {
  val hours: Int
  val period: Period
}

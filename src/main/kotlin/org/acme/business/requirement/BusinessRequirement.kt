package org.acme.business.requirement

data class BusinessRequirement(
  val description: String,
  val cost: Int,
  val value: Int,
  val dependencies: List<BusinessRequirement>
)

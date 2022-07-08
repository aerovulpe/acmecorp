package org.acme.product

import org.acme.business.requirement.BusinessRequirement

data class Product(
  val description: String,
  val requirements: List<BusinessRequirement>
)

package org.acme.product.project

import org.acme.business.market.BusinessMarket
import org.acme.business.requirement.BusinessRequirement

data class ProductProject(
  val market: BusinessMarket,
  val requirements: List<BusinessRequirement>
)

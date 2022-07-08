package org.acme.business.customer

import org.acme.business.market.BusinessMarket

data class Customer(
  val name: String,
  val markets: Set<BusinessMarket>
)

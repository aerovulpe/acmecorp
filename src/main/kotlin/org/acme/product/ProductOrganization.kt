package org.acme.product

import org.acme.business.constraint.TimeConstraint
import org.acme.business.customer.Customer
import org.acme.business.market.BusinessMarket
import org.acme.business.requirement.BusinessRequirement

/**
 * Describes the responsibilities of a product organization
 *
 * https://www.aha.io/roadmapping/guide/product-management/what-makes-up-the-product-team
 */
interface ProductOrganization {
  fun collectCustomerRequirements(customer: Customer, requirements: List<BusinessRequirement>)
  fun buildProduct()
  fun bringProductToMarket(market: BusinessMarket): Product
}

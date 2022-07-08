package org.acme.product

import org.acme.business.challenge.ProductLaunchDelayedBusinessChallenge
import org.acme.business.customer.Customer
import org.acme.business.market.BusinessMarket
import org.acme.business.requirement.BusinessRequirement
import org.acme.product.project.ProductProject
import org.acme.product.roadmap.ProductRoadMap

class AcmeProductOrganization : ProductOrganization {
  private val products: MutableMap<BusinessMarket, Product> = TODO()

  private val roadmap: ProductRoadMap = TODO()

  override fun collectCustomerRequirements(
    customer: Customer,
    requirements: List<BusinessRequirement>
  ) {
    val projects: List<ProductProject> = TODO("Implement product manager")

    roadmap.addAll(projects)
  }

  override fun buildProduct() {
    while (roadmap.isNotEmpty()) { // TODO: do something interesting
      val project = roadmap.poll()

      products[project.market] = Product("Does something really cool", project.requirements)
    }
  }

  override fun bringProductToMarket(market: BusinessMarket): Product =
    products[market] ?: throw ProductLaunchDelayedBusinessChallenge()
}

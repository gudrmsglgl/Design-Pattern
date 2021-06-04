package behavioral.visitor.shoping.element

import behavioral.visitor.shoping.visitor.CartTotalPriceVisitor
import behavioral.visitor.shoping.visitor.CartTotalWeightVisitor

data class Fruit(
    val pricePerKg: Int,
    val weight: Int,
    val name: String
) : ItemElement {
    override fun accept(totalPriceVisitor: CartTotalPriceVisitor): Int {
        return totalPriceVisitor.visit(this)
    }

    override fun accept(totalWeightVisitor: CartTotalWeightVisitor): Int {
        return totalWeightVisitor.visit(this)
    }

    override fun toString(): String = name
}
package behavioral.visitor.shoping.element

import behavioral.visitor.shoping.visitor.CartTotalPriceVisitor
import behavioral.visitor.shoping.visitor.CartTotalWeightVisitor

interface ItemElement {
    fun accept(totalPriceVisitor: CartTotalPriceVisitor): Int
    fun accept(totalWeightVisitor: CartTotalWeightVisitor): Int
}
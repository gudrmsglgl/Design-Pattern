package behavioral.visitor.shoping

import behavioral.visitor.shoping.element.Book
import behavioral.visitor.shoping.element.Fruit
import behavioral.visitor.shoping.element.ItemElement
import behavioral.visitor.shoping.visitor.CartTotalPriceVisitorImpl
import behavioral.visitor.shoping.visitor.CartTotalWeightVisitorImpl

fun main(){
    val cartItems = listOf<ItemElement>(
        Book(20, 2, "What is Justice?"), Book(100, 1, "DesignPattern"),
        Fruit(10, 2, "Banana"), Fruit(5, 5, "Apple")
    )
    println("카드 상품 목록: ${printCartItems(cartItems)}")
    println("총 구매 가격: ${calculatePriceCartItems(cartItems)}")
    println("총 무게: ${calculateWeightCartItems(cartItems)}kg")
}

fun printCartItems(items: List<ItemElement>) = items
    .joinToString(prefix = "[ ", postfix = " ]", separator = ", "){ it.toString() }

fun calculatePriceCartItems(items: List<ItemElement>) = items
    .map { it.accept(CartTotalPriceVisitorImpl()) }
    .reduce { sum, element -> sum + element }

fun calculateWeightCartItems(items: List<ItemElement>) = items
    .map { it.accept(CartTotalWeightVisitorImpl()) }
    .reduce { sum, element -> sum + element }

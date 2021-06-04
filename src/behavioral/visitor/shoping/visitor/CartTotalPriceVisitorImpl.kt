package behavioral.visitor.shoping.visitor

import behavioral.visitor.shoping.element.Book
import behavioral.visitor.shoping.element.Fruit

class CartTotalPriceVisitorImpl : CartTotalPriceVisitor {

    override fun visit(book: Book): Int {
        return bookCost(book)
    }

    override fun visit(fruit: Fruit): Int {
        return fruit.pricePerKg * fruit.weight
    }

    private fun bookCost(book: Book): Int {
        return if (book.price > 50) book.price - 5
        else book.price
    }

}
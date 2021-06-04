package behavioral.visitor.shoping.visitor

import behavioral.visitor.shoping.element.Book
import behavioral.visitor.shoping.element.Fruit

interface CartTotalWeightVisitor {
    fun visit(book: Book): Int
    fun visit(fruit: Fruit): Int
}
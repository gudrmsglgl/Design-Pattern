package behavioral.visitor.shoping.visitor

import behavioral.visitor.shoping.element.Book
import behavioral.visitor.shoping.element.Fruit

class CartTotalWeightVisitorImpl : CartTotalWeightVisitor {

    override fun visit(book: Book) = book.weight

    override fun visit(fruit: Fruit) = fruit.weight

}
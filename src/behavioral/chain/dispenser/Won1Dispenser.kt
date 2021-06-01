package behavioral.chain.dispenser

import behavioral.chain.Money

class Won1Dispenser() : Dispenser {
    override fun dispense(money: Money) {
        println("money: ${money.amount} => 1원: ${money.amount}개")
    }
}
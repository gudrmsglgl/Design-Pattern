package behavioral.chain.dispenser

import behavioral.chain.Money

class Won100Dispenser(private val nextDispenser: Dispenser) : Dispenser {

    override fun dispense(money: Money) {
        if (money.amount >= 100) {
            processDispense(money)
            return
        }
        nextDispenser.dispense(money)
    }

    private fun processDispense(money: Money){
        val num = money.amount / 100
        val remainder = money.amount % 100
        println("money: ${money.amount} => 100원: ${num}개")
        if (remainder > 0) {
            nextDispenser.dispense(money.copy(amount = remainder))
        }
    }
}
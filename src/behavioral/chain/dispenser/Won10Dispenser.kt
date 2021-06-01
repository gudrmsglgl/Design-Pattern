package behavioral.chain.dispenser

import behavioral.chain.Money

class Won10Dispenser(private val nextDispenser: Dispenser) : Dispenser {

    override fun dispense(money: Money) {
        if (money.amount >= 10) {
            processDispense(money)
            return
        }
        nextDispenser.dispense(money)
    }

    private fun processDispense(money: Money) {
        val num = money.amount / 10
        val remainder = money.amount % 10
        println("money: ${money.amount} => 10원: ${num}개")
        if (remainder > 0) {
            nextDispenser.dispense(money.copy(amount = remainder))
        }
    }
}
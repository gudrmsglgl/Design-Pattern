package behavioral.chain.dispenser

import behavioral.chain.Money

interface Dispenser {
    fun dispense(money: Money)
}
package behavioral.chain

import behavioral.chain.dispenser.Won100Dispenser
import behavioral.chain.dispenser.Won10Dispenser
import behavioral.chain.dispenser.Won1Dispenser

fun main(){
    val money = Money(825)

    val dispenser = Won100Dispenser(Won10Dispenser(Won1Dispenser()))
    dispenser.dispense(money)
}
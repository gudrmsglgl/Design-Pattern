package structural.adapter.problem

import structural.adapter.base.KTX
import structural.adapter.base.Tesla

fun main() {
    val client = Client(Tesla(), KTX())
    with (client) {
        moveViaCar()
        moveViaTrain()
    }
}
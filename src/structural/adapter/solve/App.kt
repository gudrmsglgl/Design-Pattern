package structural.adapter.solve

import structural.adapter.base.KTX

fun main() {
    val client = Client(CarAdapter(KTX()))
    client.move()
}
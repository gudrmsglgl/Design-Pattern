package behavioral.state.delivery.status

import behavioral.state.delivery.Delivery

interface DeliveryStatus {
    val name: String
    fun forward(delivery: Delivery): String
    fun backward(delivery: Delivery): String
}
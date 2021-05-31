package behavioral.state.delivery.status

import behavioral.state.delivery.Delivery

object Assign : DeliveryStatus {
    override val name: String = "배치완료"

    override fun forward(delivery: Delivery): String {
        delivery.status = Pickup
        return delivery.status.name
    }

    override fun backward(delivery: Delivery): String {
        delivery.status = Wait
        return delivery.status.name
    }
}
package behavioral.state.delivery.status

import behavioral.state.delivery.Delivery

object Pickup : DeliveryStatus {
    override val name: String = "픽업완료"

    override fun forward(delivery: Delivery): String {
        delivery.status = Complete
        return delivery.status.name
    }

    override fun backward(delivery: Delivery): String {
        delivery.status = Assign
        return delivery.status.name
    }
}
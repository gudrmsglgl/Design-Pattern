package behavioral.state.delivery.status

import behavioral.state.delivery.Delivery

object Complete : DeliveryStatus {
    override val name: String = "전달완료"

    override fun forward(delivery: Delivery): String = "진행불가"

    override fun backward(delivery: Delivery): String {
        delivery.status = Pickup
        return delivery.status.name
    }
}
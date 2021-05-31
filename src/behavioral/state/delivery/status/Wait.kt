package behavioral.state.delivery.status

import behavioral.state.delivery.Delivery

object Wait : DeliveryStatus {
    override val name: String = "배차대기"

    override fun forward(delivery: Delivery): String {
        delivery.status = Assign
        return delivery.status.name
    }

    override fun backward(delivery: Delivery): String = "뒤로 불가"
}
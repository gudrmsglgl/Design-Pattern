package behavioral.state.delivery

import behavioral.state.delivery.status.DeliveryStatus
import behavioral.state.delivery.status.Wait

class Delivery {
    var status: DeliveryStatus = Wait

    fun forwardStatus() = status.forward(this)

    fun backwardStatus() = status.backward(this)
}
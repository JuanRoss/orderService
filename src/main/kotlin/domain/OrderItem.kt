package domain

data class OrderItem(val productId: Long, val quantity: Int) {
    constructor() : this(0L, 0)
}

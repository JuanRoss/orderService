package domain

data class Order(val id: Uuid, val items: List<Long>, val clientId : Long, val status: OrderStatus) {
    constructor(items: List<Long>, clientId: Long) : this(Uuid(), items, clientId, OrderStatus.PENDING_PAYMENT)
}

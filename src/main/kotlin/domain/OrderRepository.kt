package domain

interface OrderRepository {

    fun save(order: Order)

}
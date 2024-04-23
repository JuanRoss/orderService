package infrastructure

import domain.Order
import domain.OrderRepository
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject

@ApplicationScoped
class OrderRepositoryMongo @Inject constructor(
    private val orderRepositoryMongoPanache: OrderRepositoryMongoPanache) : OrderRepository {

    override fun save(order: Order) {
        orderRepositoryMongoPanache.persist(order)
    }
}
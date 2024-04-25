package application

import domain.OrderRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class OrderFinder(private val orderRepository: OrderRepository) {
    fun findById(id: String) = orderRepository.findById(id)
    fun findAll() = orderRepository.findAll()
}
package infrastructure

import domain.Order
import io.quarkus.mongodb.panache.PanacheMongoRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class OrderRepositoryMongoPanache: PanacheMongoRepository<Order> {
}
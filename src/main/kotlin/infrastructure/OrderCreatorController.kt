package infrastructure

import application.OrderCreator
import domain.Order
import jakarta.inject.Inject
import jakarta.ws.rs.Consumes
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.Response

@Path("/order")
class OrderCreatorController @Inject constructor(private val orderCreator: OrderCreator) {

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    fun create(order: Order) : Response {
        try {
            orderCreator.create(order)
            return Response.ok().build()
        } catch (e: Exception) {
            return Response.serverError().entity(e.message).build()
        }
    }
}
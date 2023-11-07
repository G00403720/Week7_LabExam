
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.annotation.JsonProperty;

@RestController
public class OrderController {
    @PostMapping("orders")
    @ResponseStatus(HttpStatus.CREATED)
    public OrderService registerUserCredential(@RequestBody OrderService orderService){
        System.out.println("orderId: "+orderService.getOrderId());
        System.out.println("productId: "+orderService.getProductId());
        System.out.println("quantity: "+orderService.getQuantity());
        System.out.println("customerId: "+orderService.getCustomerId());
        return orderService;
    }
}

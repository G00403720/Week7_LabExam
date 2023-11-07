package ie.atu.labexam;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class CustomerController {
    @PostMapping("customers")
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerService registerUserCredential(@RequestBody CustomerService customerService){
        System.out.println("orderId: "+customerService.getCustomerId());
        System.out.println("productId: "+customerService.getName());
        System.out.println("quantity: "+customerService.getAge());
        System.out.println("customerId: "+customerService.getEmail());
        return customerService;
    }
}

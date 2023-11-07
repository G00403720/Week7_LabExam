package ie.atu.labexam;

import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "confirmation-service", url = "https://localhost:8082")
public interface ServiceClient {
    @PostMapping("/confirm")
    String
}

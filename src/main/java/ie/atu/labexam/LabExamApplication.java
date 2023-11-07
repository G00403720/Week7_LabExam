package ie.atu.labexam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableFeignClients
@SpringBootApplication
public class LabExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabExamApplication.class, args);
    }

}

package ie.atu.labexam;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private String customerId;
    private String name;
    private String age;
    private String email;

    public CustomerService (){
    }

    public CustomerService(String customerId, String name, String age, String email){
        this.customerId = customerId;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

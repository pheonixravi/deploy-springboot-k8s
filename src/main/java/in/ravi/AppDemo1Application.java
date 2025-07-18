package in.ravi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AppDemo1Application {
    @GetMapping("/message")
    public String displayMessage(){
        return "Congratulation you successfully deployed your application to kubernetes !!";
    }

    public static void main(String[] args) {
        SpringApplication.run(AppDemo1Application.class, args);
    }

}

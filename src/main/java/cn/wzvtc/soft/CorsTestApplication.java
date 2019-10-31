package cn.wzvtc.soft;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
//允许跨域访问
@SpringBootApplication
public class CorsTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(CorsTestApplication.class, args);
    }
}

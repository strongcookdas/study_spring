package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // 홍으로 들어오는 api
    @GetMapping("/")
    public String home(){
        // 동적 view가 우선순위가 더 높다.
        return "home";
    }
}

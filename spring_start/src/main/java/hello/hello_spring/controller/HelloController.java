package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","hello world");
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name,Model model){
        model.addAttribute("name",name);
        return "hello-mvc";
    }

    @GetMapping("hello-api1")
    @ResponseBody
    public String helloApi1(@RequestParam("name")String name){
        return "hello"+name;
    }

    @GetMapping("hello-api2")
    @ResponseBody // HTTP의 BODY 부분에 데이터를 직접 담겠다는 어노테이션
    public Hello helloApi2(@RequestParam("name")String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}

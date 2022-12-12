package hello.hello_spring.controller;

import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller// 스프링 컨테이너가 Controller 객체를 생성해서 보관한다.
public class MemberController {

    //private final MemberService memberService = new MemberService();
    //service는 여러개를 생성할 필요가 없다.

    private final MemberService memberService;

    @Autowired // 스프링 컨테이너에서 알아서 주입한다. (Dependency Injection)
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }
}

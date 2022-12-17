package hello.hello_spring.controller;

import hello.hello_spring.domain.Member;
import hello.hello_spring.domain.MemberForm;
import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller// 스프링 컨테이너가 Controller 객체를 생성해서 보관한다.
public class MemberController {

    //private final MemberService memberService = new MemberService();
    //service는 여러개를 생성할 필요가 없다.

    private final MemberService memberService;

    @Autowired // 스프링 컨테이너에서 알아서 주입한다. (Dependency Injection)
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String createForm(){
        return "members/createMembersForm";
    }

    @PostMapping("/members/new")
    public String create(MemberForm memberForm){
        Member member = new Member();
        member.setName(memberForm.getName());

        memberService.join(member);

        return "redirect:/";
    }

    @GetMapping("/members")
    public String list(Model modle){
        List<Member> members = memberService.findMembers();
        modle.addAttribute("members",members);
        return "members/memberList";

    }
}

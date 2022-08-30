package idiots.mini_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class AdminController {
    //로그인은 관리자만 할 수 있게끔

    @GetMapping({"", "/" })
    public String index() {
        // prefix: /WEB-INF/views/
        // suffix: .jsp
        return "index";
    }

    @GetMapping("/user/loginForm")
    public String loginForm() {
        return "user/loginForm";
    }

    @GetMapping("/user/firestationjoinForm")
    public String joinForm() {
        return "user/firestationjoinForm";
    }
}

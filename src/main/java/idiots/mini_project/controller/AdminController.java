package idiots.mini_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class AdminController {
    //로그인은 관리자만 할 수 있게끔
    @GetMapping("/admin/loginForm")
    public String loginForm() {
        return "admin/loginForm";
    }
}

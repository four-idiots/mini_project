package idiots.mini_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class AdminController {
    //로그인은 관리자만 할 수 있게끔
<<<<<<< HEAD
=======

    @GetMapping({"", "/" })
    public String index() {
        // prefix: /WEB-INF/views/
        // suffix: .jsp
        return "index";
    }

>>>>>>> 1baac522ebbb4d809a79c8f94caf645b5bb9748f
    @GetMapping("/user/loginForm")
    public String loginForm() {
        return "user/loginForm";
    }
<<<<<<< HEAD
=======

    @GetMapping("/user/firestationjoinForm")
    public String joinForm() {
        return "user/firestationjoinForm";
    }
>>>>>>> 1baac522ebbb4d809a79c8f94caf645b5bb9748f
}

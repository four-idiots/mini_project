package idiots.mini_project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user/joinForm")
    public String joinForm() {
<<<<<<< HEAD

=======
>>>>>>> 1baac522ebbb4d809a79c8f94caf645b5bb9748f
        return "user/joinForm";
    }
}

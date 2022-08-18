package idiots.mini_project.controller.api;

import idiots.mini_project.dto.ResponseDto;
import idiots.mini_project.model.Admin;
import idiots.mini_project.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class AdminApiController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/api/user/login")
    public ResponseDto<Integer> login(@RequestBody Admin admin, HttpSession session) {

        Admin principal = adminService.login(admin);
        if(principal != null) {
            session.setAttribute("principal", principal);
        }

        return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
    }
}

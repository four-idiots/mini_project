package idiots.mini_project.handler;

import idiots.mini_project.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;


@ControllerAdvice // Exception 호출
@RestController
public class GlobalExceptionHandler {
    public ResponseDto<String>  handleArgumentException(IllegalArgumentException e) {
        return  new ResponseDto<String>(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage());
    }
}

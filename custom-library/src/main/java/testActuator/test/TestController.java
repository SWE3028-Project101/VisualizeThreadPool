package testActuator.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {


    @GetMapping("/")
    public String mainPage(@RequestParam("test") long test){
        return "Hello World!";
    }
}

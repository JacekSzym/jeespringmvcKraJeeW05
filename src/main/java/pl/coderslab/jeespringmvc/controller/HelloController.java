package pl.coderslab.jeespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalTime;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/hellojsp")
    public String helloJsp() {
        return "index.jsp";
    }

    @GetMapping("/helloview")
    public String helloView() {
        return "hello";
    }

    @GetMapping("/home")
    public String home(Model m) {
        String background = "white";
        String textColor = "black";

        final int currentHour = LocalTime.now().getHour();

        if(currentHour > 19 || currentHour < 8){
            background = "black";
            textColor = "white";
        }

        m.addAttribute("backgroundColor", background);
        m.addAttribute("textColor", textColor);

        return "home";
    }
}

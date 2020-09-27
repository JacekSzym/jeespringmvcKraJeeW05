package pl.coderslab.jeespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class SessionController {
    @GetMapping("/session")
    @ResponseBody
    public String session(HttpSession ses) {
        LocalDateTime ldt = (LocalDateTime)ses.getAttribute("loginStart");

        if (ldt == null){
            ses.setAttribute("loginStart", LocalDateTime.now());
            return "Brak atrybutu w sesji. Ustawiono.";
        }

        return ldt.toString();
    }
}

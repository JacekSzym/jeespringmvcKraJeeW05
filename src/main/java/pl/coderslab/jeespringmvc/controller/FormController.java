package pl.coderslab.jeespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
public class FormController {
    @GetMapping("/form")
    public String getForm(){
        return "form.jsp";
    }

    @PostMapping("/form")
    @ResponseBody
    public String postForm(@RequestParam String dateStr){
        LocalDate ld = LocalDate.parse(dateStr);

        return ld.format(DateTimeFormatter.ofPattern("MM/dd/YY"));
    }
}

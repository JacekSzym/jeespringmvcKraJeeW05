package pl.coderslab.jeespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {
    @GetMapping("/random/{max}")
    @ResponseBody
    public String randomMaxPathVariable(@PathVariable int max) {
        Random rand = new Random();
        int randomVal = 1 + rand.nextInt(max);

        return "Użytkownik podał wartość "+max+". Wylosowano liczbę: "+randomVal;
    }

    @GetMapping("/random/{min}/{max}")
    @ResponseBody
    public String randomMinMaxPathVariable(@PathVariable int min, @PathVariable int max) {
        Random rand = new Random();
        int randomVal = min + rand.nextInt(max-min+1);

        return "Użytkownik podał wartości "+min+" i "+max+". Wylosowano liczbę: "+randomVal;
    }
}

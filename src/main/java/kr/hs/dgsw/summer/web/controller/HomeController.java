package kr.hs.dgsw.summer.web.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/hello")
    public String hello(Model model, @RequestParam(value = "name", defaultValue = "XXX") String name) {

        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/time")
    public String time(Model model) {
        Date date = new Date();
        LocalDateTime localDate = LocalDateTime.now();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 M월 d일 HH:mm:ss");
        String now = dateFormat.format(date);

        model.addAttribute("now", now);
        return "time";
    }

    @GetMapping("/square")
    public String square(Model model,
                         @RequestParam (value = "number") int number) {

        int result = number * number;
        model.addAttribute("result", result);
        model.addAttribute("number", number);
        return "square";
    }

}

package kr.hs.dgsw.summer.web.controller;

import kr.hs.dgsw.summer.web.service.FactorialService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class MathController {

    private final FactorialService factorialService;

    @GetMapping("/factorial")
    public String factorial(Model model,
                            @RequestParam("num") int num) {

        // 팩토리얼을 계산한다.
        int answer = factorialService.factorial(num);

        model.addAttribute("num", num);
        model.addAttribute("factorial", answer);

        return "factorial";
    }
}

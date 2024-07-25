package kr.hs.dgsw.summer.web.controller;

import kr.hs.dgsw.summer.web.service.FactorialService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MathApiController {

    private final FactorialService factorialService;

    @GetMapping("/api/factorial")
    public ResponseEntity<?> faxtorial (@RequestParam("num") int num) {
        int answer = factorialService.factorial(num);

        return ResponseEntity.ok(answer);

    }

}

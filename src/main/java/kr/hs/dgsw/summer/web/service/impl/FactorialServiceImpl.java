package kr.hs.dgsw.summer.web.service.impl;

import kr.hs.dgsw.summer.web.service.FactorialService;
import org.springframework.stereotype.Service;

@Service
public class FactorialServiceImpl implements FactorialService {
    @Override
    public int factorial(int num) {
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }

    /*
    @Override
    public int factorial(int num) {
        if (num == 1) {
            return 1;
        }

        return num * factorial(num - 1);
    } */
}


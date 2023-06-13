package at.technikum.slmabschlusstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbschlusstestController {
    @GetMapping("/digitsum")
    public static int calculateDigitSum(@RequestParam int number) {
        int digitSum = 0;
        while (number != 0) {
            int digit = number % 10;
            digitSum += digit;
            number /= 10;
        }
        return digitSum;
    }

}

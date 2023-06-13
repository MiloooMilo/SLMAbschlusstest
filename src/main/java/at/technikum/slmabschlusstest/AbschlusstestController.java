package at.technikum.slmabschlusstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AbschlusstestController {
    private static int count = 0;
    @GetMapping("/api/digitsum")
    public static int calculateDigitSum(@RequestParam int number) {
        int digitSum = 0;
        while (number != 0) {
            int digit = number % 10;
            digitSum += digit;
            number /= 10;
        }
        count++;
        return digitSum;
    }

    @GetMapping("/api/digitsum/usage")
    public static int usage(){

        return count;
    }

}

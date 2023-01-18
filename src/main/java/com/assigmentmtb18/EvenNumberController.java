package com.assigmentmtb18;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EvenNumberController {

    @GetMapping("/print-numbers")
    public String getEvenNumbers(@RequestParam("n") int n, @RequestParam("m") int m, Model model) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = n; i <= m; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        model.addAttribute("evenNumbers", evenNumbers);
        return "evenNumbers";
    }
}
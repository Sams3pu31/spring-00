package com.myproject.spring00.controller;

import com.myproject.spring00.translate.DayOfWeek;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DayOfWeekController {

    @GetMapping("/dayOfWeek")
    public String getRussianDayOfWeek(@RequestParam String day) {
        try {
            DayOfWeek dayOfWeek = DayOfWeek.valueOf(day.toUpperCase());
            return dayOfWeek.getRussianName();
        } catch (IllegalArgumentException e) {
            return "Некорректный день недели, пожалуйста введите правильный день на английском";
        }
    }
}

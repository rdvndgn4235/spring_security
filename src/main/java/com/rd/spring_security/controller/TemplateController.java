package com.rd.spring_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created at 27.05.2022.
 *
 * @author Ridvan Dogan
 */
@Controller
@RequestMapping("/")
public class TemplateController {

    @GetMapping("login")
    String getLoginView() {
        return "login";
    }
    @GetMapping("courses")
    String getCoursesView() {
        return "courses";
    }
}

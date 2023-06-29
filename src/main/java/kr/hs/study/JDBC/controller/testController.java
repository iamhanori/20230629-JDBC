package kr.hs.study.JDBC.controller;

import kr.hs.study.JDBC.dto.myuserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class testController {
    @GetMapping("/write_form")
    public String write_form() {
        return "write_form";
    }

    @PostMapping("/write_form")
    public String write_result(@ModelAttribute myuserDTO user) {

        System.out.println("id : " + user.getId());
        System.out.println("name : " + user.getName());

        return "write_form";
    }
}

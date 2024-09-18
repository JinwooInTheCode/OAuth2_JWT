package com.example.oauth2jwt.controller;

import com.example.oauth2jwt.dto.JoinDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class JoinController {
    @PostMapping("/join")
    public String joinAPI(JoinDTO joinDTO) {
        return "ok";
    }
}

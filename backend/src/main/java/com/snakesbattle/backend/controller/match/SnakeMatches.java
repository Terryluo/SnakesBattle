package com.snakesbattle.backend.controller.match;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/matches/")
public class SnakeMatches {

    @RequestMapping("getsnakeinfo/")
    public Map<String, String> getSnakeInfo() {
        Map<String, String> info = new HashMap<>();
        info.put("name", "serpent");
        info.put("rating", "1500");
        return info;
    }
}

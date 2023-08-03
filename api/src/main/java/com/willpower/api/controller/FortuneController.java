package com.willpower.api.controller;

import com.willpower.api.dto.FortuneResponse;
import com.willpower.api.entity.Fortune;
import com.willpower.api.service.FortuneService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class FortuneController {
    private final FortuneService fortuneService;

    @GetMapping("/api/fortunes")
    public ResponseEntity<FortuneResponse> getRandomFortune(){
        Fortune fortune = fortuneService.getRandomFortune();

        return ResponseEntity.ok().body(new FortuneResponse(fortune));
    }
}

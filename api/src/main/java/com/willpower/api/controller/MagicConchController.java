package com.willpower.api.controller;

import com.willpower.api.dto.FortuneResponse;
import com.willpower.api.dto.MagicConchResponse;
import com.willpower.api.entity.Fortune;
import com.willpower.api.entity.MagicConch;
import com.willpower.api.service.MagicConchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MagicConchController {
    private final MagicConchService magicConchService;

    @GetMapping("/api/conches")
    public ResponseEntity<MagicConchResponse> getRandomConch(){
        MagicConch magicConch = magicConchService.getRandomConch();

        return ResponseEntity.ok().body(new MagicConchResponse(magicConch));
    }
}

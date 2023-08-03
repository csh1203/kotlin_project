package com.willpower.api.dto;

import com.willpower.api.entity.Fortune;
import lombok.Getter;

@Getter
public class FortuneResponse {
    private final String content;

    public FortuneResponse(Fortune fortune) {
        this.content = fortune.getContent();
    }
}

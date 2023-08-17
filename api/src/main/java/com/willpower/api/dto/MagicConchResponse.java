package com.willpower.api.dto;

import com.willpower.api.entity.MagicConch;
import lombok.Getter;

@Getter
public class MagicConchResponse {
    private final String content;

    public MagicConchResponse(MagicConch magicConch) {
        this.content = magicConch.getContent();
    }
}

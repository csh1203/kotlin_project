package com.willpower.api.service;

import com.willpower.api.entity.MagicConch;
import com.willpower.api.repository.MagicConchRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

//서비스 : 컨트롤러한테 일 받아서 일함
@RequiredArgsConstructor
@Service
@Getter
public class MagicConchService {
    private final MagicConchRepository magicConchRepository;

    public MagicConch getRandomConch(){
        long randomId = (long) Math.ceil(Math.random() * 10 + 1);
        return magicConchRepository.findById(randomId).orElseThrow(() -> new IllegalArgumentException("not found : " + randomId));
    }

}

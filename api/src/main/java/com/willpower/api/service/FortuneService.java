package com.willpower.api.service;

import com.willpower.api.entity.Fortune;
import com.willpower.api.repository.FortuneRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Getter
@Service
public class FortuneService {
    private final FortuneRepository fortuneRepository;

    public Fortune getRandomFortune(){
        // TODO : Fortune 개수만큼 랜덤
        long randomId = (long) Math.ceil(Math.random() * 3 + 1);
        return fortuneRepository.findById(randomId)
                .orElseThrow(() -> new IllegalArgumentException("not found : " + randomId));
    }
}

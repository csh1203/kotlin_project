package com.willpower.api.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter //어노테이션 우클릭해서 만들어야 하는거 간편하게 해줌
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "conch")
public class MagicConch {

    //table 인자값, 고유한 값
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) //identity -> 자동으로 숫자 하나씩 추가
    @Column(name = "id")
    Long id;

    //table 안에 들어있는 내용
    @Column(name = "content", nullable = false)
    String content;

    //생성자
    @Builder
    public MagicConch(String content) {
        this.content = content;
    }
}

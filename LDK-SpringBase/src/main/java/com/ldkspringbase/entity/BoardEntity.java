package com.ldkspringbase.entity;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class BoardEntity {
    int id;
    String userName;
    String title;
    String content;
    String nowDay;
    int viewCount;
}

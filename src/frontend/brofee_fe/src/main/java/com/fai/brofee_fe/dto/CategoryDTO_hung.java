package com.fai.brofee_fe.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class CategoryDTO_hung {

    private Long id;

    private String name;

    private String icon;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}

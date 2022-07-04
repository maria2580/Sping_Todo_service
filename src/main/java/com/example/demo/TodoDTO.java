package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoDTO {
    private String id; //이 오브젝트의 아이디
    private String title; //Todo타이틀, ex) 운동하기
    private boolean done; //todo를 한 경우 - true(checked)
    public TodoDTO(final TodoEntity entity){
        this.id=entity.getId();
        this.title=entity.getTitle();
        this.done=entity.isDone();
    }
}

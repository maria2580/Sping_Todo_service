package com.example.demo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoEntity {
    private String id; //이 오브젝트의 아이디
    private String userId;//이 오브젝트를 생성한 사용자의 id
    private String title; //Todo타이틀, ex) 운동하기
    private boolean done; //todo를 한 경우 - true(checked)
}

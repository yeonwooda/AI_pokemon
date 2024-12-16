package org.koreait.email.controllers;

import lombok.Data;

import java.util.List;

@Data
public class RequestEmail {
    private List<String> to; // 받는 쪽 이메일

}

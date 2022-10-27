package com.example.springbootreview.controller;

import com.example.springbootreview.dto.MemberDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {

    @PostMapping("/member3")
    public ResponseEntity<MemberDto> putMemberDto(@RequestBody MemberDto memberDto) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDto);
    }


}

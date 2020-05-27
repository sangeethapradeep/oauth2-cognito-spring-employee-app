package com.enkode.cognito.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {

  @GetMapping("/message")
  public ResponseEntity<String> message() {
    return ResponseEntity.ok("Public message");
  }
}

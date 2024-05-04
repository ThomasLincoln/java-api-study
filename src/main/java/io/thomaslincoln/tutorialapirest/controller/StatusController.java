package io.thomaslincoln.tutorialapirest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Isso aqui é para dizer para o spring boot que estamos trabalhando com uma
// aplicação rest
@RestController
public class StatusController {

  @GetMapping(path = "/api/status")
  public String check(){
    return "online";
  }
}

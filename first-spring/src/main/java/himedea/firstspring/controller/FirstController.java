package himedea.firstspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
  /**
   * 1. MVC
   */
  @GetMapping("first-mvc")
  public String firstMvc() {
    return "first.html";
  }
}

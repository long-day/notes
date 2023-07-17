package me.longday.controller;

import lombok.AllArgsConstructor;
import me.longday.service.AutomaticInjection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author 刘恒君
 * @since 2023/7/17
 */
@RestController
@RequestMapping("/autowired")
@AllArgsConstructor
public class AutomaticInjectionController {

    private AutomaticInjection automaticInjection;

    @GetMapping("/sayHello")
    public String sayHello(){
        return automaticInjection.syaHello();
    }

    // @GetMapping("/say")
    public String say(){
        return automaticInjection.syaHello();
    }
}

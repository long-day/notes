package me.longday.controller;

import lombok.AllArgsConstructor;
import lombok.val;
import me.longday.common.UserInfo;
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
        UserInfo info = new UserInfo("美杜莎", "123@qq.com", 19);
        info.say(1);
        return automaticInjection.syaHello();
    }

    // @GetMapping("/say")
    public String say(){
        return automaticInjection.syaHello();
    }
}

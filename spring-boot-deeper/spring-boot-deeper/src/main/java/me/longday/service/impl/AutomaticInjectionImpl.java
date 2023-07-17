package me.longday.service.impl;

import lombok.AllArgsConstructor;
import me.longday.common.HelloWorld;
import me.longday.service.AutomaticInjection;
import org.springframework.stereotype.Service;

/**
 * 用以学习关于注入的知识
 *
 * @author 刘恒君
 * @since 2023/7/17
 */
@Service
@AllArgsConstructor
public class AutomaticInjectionImpl implements AutomaticInjection {

    private HelloWorld helloWorld;
    /**
     * 调用HelloWorld#sayHello()
     *
     * @return "Hello World!"
     */
    @Override
    public String syaHello() {
        return helloWorld.sayHello();
    }
}

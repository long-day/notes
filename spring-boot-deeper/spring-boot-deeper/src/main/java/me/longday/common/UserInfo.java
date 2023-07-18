package me.longday.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户信息
 *
 * @author 刘恒君
 * @since 2023/7/18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    String name;
    String email;
    Integer age;

    public void showInfo(){
        System.out.println("姓名: "+this.name+" 年龄："+this.age+" 邮箱："+this.email);
    }

    public void say(Integer type){
        System.out.println("姓名: "+this.name+" 邮箱："+this.email);
    }
}

package me.longday;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import redis.clients.jedis.UnifiedJedis;

import java.io.Serializable;

public class RedisJsonHello {
    public static void main(String[] args) {
        try (UnifiedJedis client = new UnifiedJedis("redis://default:cA35vEc2HC4KTwV75U8SAOa25YxmqZWd@redis-17394.c302.asia-northeast1-1.gce.cloud.redislabs.com:17394")) {
            client.jsonSetLegacy("tmp-user-1",new TmpUser("1","2@asfd.com",19));
            System.out.println("=== === === ===");
            TmpUser tmpUser = client.jsonGet("tmp-user-1", TmpUser.class);
            System.out.println(tmpUser);
        }catch (Exception e){

            System.out.println(e.getMessage());
        }
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class TmpUser implements Serializable {
    /**
     * 用户名
     */
    String username;
    String email;
    Integer age;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class TmpUser2 implements Serializable {
    /**
     * 用户名
     */
    String username;
    String email;
    Integer age;
}

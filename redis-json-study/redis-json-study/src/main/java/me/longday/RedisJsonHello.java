package me.longday;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import redis.clients.jedis.UnifiedJedis;
import redis.clients.jedis.json.Path;
import redis.clients.jedis.json.Path2;

import java.io.Serializable;
import java.time.LocalDate;

public class RedisJsonHello {
    public static void main(String[] args) {
        try (UnifiedJedis client = new UnifiedJedis("redis://default:cA35vEc2HC4KTwV75U8SAOa25YxmqZWd@redis-17394.c302.asia-northeast1-1.gce.cloud.redislabs.com:17394")) {
            client.jsonSetLegacy("tmp-user-1",
                    new TmpUser("1", "2@asfd.com", 19,new IPhone("123",LocalDate.now())));
            System.out.println("=== === === ===");
            TmpUser tmpUser = client.jsonGet("tmp-user-1", TmpUser.class);
            System.out.println(tmpUser);
            System.out.println(client.jsonGet("tmp-user-1", Path2.ROOT_PATH));
            System.out.println(client.jsonGet("tmp-user-1", IPhone.class,Path.of("phone")));

        } catch (Exception e) {

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
    IPhone phone;
}

@AllArgsConstructor
@NoArgsConstructor
abstract class Phone{
    String id;
    LocalDate WarrantyPeriodEndTime;

    abstract void call();
}

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
class IPhone extends Phone {

    public IPhone(String id, LocalDate WarrantyPeriodEndTime) {
        super(id, WarrantyPeriodEndTime);
    }

    @Override
    public void call() {
        System.out.println("iphone call!");
    }
}

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
class HuaWeiPhone extends Phone {
    public HuaWeiPhone(String id, LocalDate WarrantyPeriodEndTime) {
        super(id, WarrantyPeriodEndTime);
    }

    @Override
    public void call() {
        System.out.println("HuaWei phone call!");
    }
}


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
class VivoPhone extends Phone {

    public VivoPhone(String id, LocalDate WarrantyPeriodEndTime) {
        super(id, WarrantyPeriodEndTime);
    }

    @Override
    public void call() {
        System.out.println("Vivo phone call!");
    }
}
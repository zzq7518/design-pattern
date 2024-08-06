package com.strong.designmode.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangzhiqiang
 * @date 2022/12/7 15:37
 * @description
 *
 * 执行的顺序怎么去定义和实现？
 *
 * 单个通知失败了怎么办？
 *
 * 选不同的组件当配置中心有何区别？
 *
 * 增加一种新的发送渠道怎么办？
 *
 * 如果大批量短时间发送，有哪些地方可以优化？
 */
@SpringBootApplication
public class ObserverDemo implements CommandLineRunner {

    /**
     * 这里可以注册多个观察者，这个demo只注册了一个消息通知
     */
    @Autowired
    private List<Observer> observers;

    public static void main(String[] args) {
        new SpringApplication(ObserverDemo.class).run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        sendMsg("bizType1", "业务1的内容");
        sendMsg("bizType2", "业务2的内容");
    }

    private void sendMsg(String bizType, String msg) {
        observers.forEach(observer -> observer.notify(bizType, msg));
    }
}

interface SendMsgService {
    /**
     * 发消息
     */
    void sendMsg(String msg);
}

/**
 * 发短信
 */
@Service("sms")
class SmsSendService implements SendMsgService {

    @Override
    public void sendMsg(String msg) {
        System.out.println("短信发送 = " + msg);
    }
}

/**
 * 发邮件
 */
@Service("email")
class EmailSendService implements SendMsgService {

    @Override
    public void sendMsg(String msg) {
        System.out.println("邮件发送 = " + msg);
    }
}

/**
 * 模拟配置中心
 */
class ConfigCenter {
    private static Map<String, String> sendMsgConfig = new HashMap<>(16);

    static {
        sendMsgConfig.put("bizType1", "sms,email");
        sendMsgConfig.put("bizType2", "sms");
    }

    public static List<String> getStrategy(String bizType) {
        return Arrays.asList(sendMsgConfig.get(bizType).split(","));
    }
}

/**
 * 观察者，JDK自带有观察者，定义接口不指定实现
 */
interface Observer {
    void notify(String bizType, String msg);
}

@Component
class SendMsgObserver implements Observer {

    @Autowired
    private List<SendMsgService> sendMsgServices;

    @Override
    public void notify(String bizType, String msg) {
        List<String> strategy = ConfigCenter.getStrategy(bizType);
        sendMsgServices.stream().forEach(sendMsgService -> {
            if (strategy.contains(sendMsgService.getClass().getDeclaredAnnotation(Service.class).value())) {
                sendMsgService.sendMsg(msg);
            }
        });
    }
}


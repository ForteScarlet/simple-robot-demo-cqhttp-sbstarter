package com.cqtest.testlis;

import com.forte.qqrobot.MsgParser;
import com.forte.qqrobot.bot.BotManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 一个只有定时任务的controller
 */
@Component
@EnableScheduling
public class TestController {

    @Autowired
    private BotManager botManager;

    @Autowired
    private MsgParser parser;

    @Scheduled(fixedRate = 2000)
    public void time(){
        System.out.println(botManager);
        System.out.println(parser);
    }

}

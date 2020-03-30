package com.cqtest.testlis;

import com.forte.qqrobot.anno.Listen;
import com.forte.qqrobot.anno.depend.Beans;
import com.forte.qqrobot.beans.messages.msgget.PrivateMsg;
import com.forte.qqrobot.beans.messages.types.MsgGetTypes;

/**
 * 一个监听器
 */
@Beans
public class Listener1 {

    @Listen(MsgGetTypes.privateMsg)
    public void ls(PrivateMsg msg){
        System.out.println("私信: " + msg);
    }

}


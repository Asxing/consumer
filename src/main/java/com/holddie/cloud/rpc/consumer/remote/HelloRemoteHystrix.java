package com.holddie.cloud.rpc.consumer.remote;

import org.springframework.stereotype.Component;

/**
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2017/11/30 12:15
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{
    @Override
    public String hello(String name) {
        return "hello "+name+", this message send failed";
    }
}

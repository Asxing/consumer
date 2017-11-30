package com.holddie.cloud.rpc.consumer.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 远程调用
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2017/11/30 12:14
 */
@Component
@FeignClient(name = "SPIRNG-CLOUD-RPC-PRODUCER",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);

}

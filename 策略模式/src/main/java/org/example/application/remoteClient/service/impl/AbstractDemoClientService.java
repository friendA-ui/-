package org.example.application.remoteClient.service.impl;

import org.example.application.remoteClient.DemoClient;
import org.example.application.remoteClient.domain.dto.RemoteDTO;
import org.example.application.remoteClient.service.DemoClientService;

import javax.annotation.Resource;

/**
 * @description: TODO 类描述
 * @author: 杨振宇
 * @date: 2024/07/30 20:45
 **/
public abstract class AbstractDemoClientService implements DemoClientService {

    @Resource
    private DemoClient demoClient;

    public abstract String getDomain();

    @Override
    public void send(String param) {
        RemoteDTO body = new RemoteDTO().setParam(param);
        demoClient.sendRequest(getDomain(), body);
    }


}

package org.example.application.remoteClient;

import cn.hutool.core.util.StrUtil;
import org.example.application.remoteClient.service.DemoClientService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: TODO 类描述
 * @author: 杨振宇
 * @date: 2024/07/30 21:01
 **/
@Component
public class DemoClientAdapter {

    @Resource
    private List<DemoClientService> demoClientServiceList;

    public DemoClientService adapter(String region) {
        return demoClientServiceList.stream().filter(demoClientService -> StrUtil.equals(demoClientService.getRegion(), region)).findFirst().get();
    }

    public void sendAll(String param) {
        demoClientServiceList.forEach(demoClientService -> {
            try {
                demoClientService.send(param);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}

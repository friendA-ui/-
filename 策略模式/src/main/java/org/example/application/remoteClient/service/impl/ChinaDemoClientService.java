package org.example.application.remoteClient.service.impl;

import org.example.application.common.enums.RegionEnum;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @description: TODO 类描述
 * @author: 杨振宇
 * @date: 2024/07/30 20:52
 **/
@Component
public class ChinaDemoClientService extends AbstractDemoClientService {

    @Value("${china.domain}")
    private String domain;

    @Override
    public String getRegion() {
        return RegionEnum.CHINA.getRegion();
    }

    @Override
    public String getDomain() {
        return domain;
    }
}

package org.example.application.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: TODO 类描述
 * @author: 杨振宇
 * @date: 2024/07/30 20:56
 **/
@Getter
@AllArgsConstructor
public enum RegionEnum {

    CHINA("CHINA"),
    ASIA("ASIA");
    private final String region;
}

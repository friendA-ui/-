package org.example.application.remoteClient.domain.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @description: TODO 类描述
 * @author: 杨振宇
 * @date: 2024/07/30 20:40
 **/
@Data
@Accessors(chain = true)
public class RemoteDTO {

    private String param;
}

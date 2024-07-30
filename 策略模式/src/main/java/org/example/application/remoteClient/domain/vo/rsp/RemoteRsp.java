package org.example.application.remoteClient.domain.vo.rsp;

import lombok.Data;

/**
 * @description: TODO 类描述
 * @author: 杨振宇
 * @date: 2024/07/30 20:41
 **/
@Data
public class RemoteRsp {

    private Integer code;

    private String msg;

    private Object Data;
}

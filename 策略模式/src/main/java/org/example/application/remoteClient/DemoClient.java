package org.example.application.remoteClient;

import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.Body;
import com.dtflys.forest.annotation.Post;
import com.dtflys.forest.annotation.Var;
import org.example.application.remoteClient.domain.dto.RemoteDTO;
import org.example.application.remoteClient.domain.vo.rsp.RemoteRsp;

/**
 * @description: TODO 类描述
 * @author: 杨振宇
 * @date: 2024/07/30 20:21
 **/
@BaseRequest(
        baseURL = "${baseUrl}",
        contentType = "application/json"
)
public interface DemoClient {

    @Post(url = "send")
    RemoteRsp sendRequest(@Var("baseUrl") String baseUrl, @Body RemoteDTO body);
}

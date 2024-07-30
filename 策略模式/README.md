# 使用场景

一个程序通常会需要部署多个节点。例如，国内节点，亚洲节点，欧洲节点…..

通常要根据业务中的不用场景要去和不同节点的服务交互

例如：

- 查询各个大洲用户的消费数据

- 开启或关闭某个用户在，其中某个大洲的权限等

  

很明显随着节点的增多，需要维护越来越多的 **if else**

才用策略模式能有效的减少if else的代码量

且新增其他的节点，除了维护枚举类之外不需要更改之前的代码

```java
	@Resource
    private DemoClientAdapter demoClientAdapter;
    
    public void test(){
        // 指定一个服务器交互
        demoClientAdapter.adapter(RegionEnum.CHINA.getRegion()).send("");
        // 与所有服务器交互
        demoClientAdapter.sendAll("");
    }
```



且新增其他的节点，除了维护枚举类之外不需要更改之前的代码，只要新增不同地区的service即可（ChinaDemoClientService，AsiaDemoClientService）

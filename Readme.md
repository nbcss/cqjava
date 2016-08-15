酷Q的java socket实现

借用了[https://github.com/yukixz/cqsocketapi](https://github.com/yukixz/cqsocketapi)的酷q插件，该项目是用python实现的。

插件下载[https://github.com/yukixz/cqsocketapi/releases](https://github.com/yukixz/cqsocketapi/releases)，或者本项目的文件夹中也可下载

还不够完善，相关使用请阅读源码以及参考上头python的实现。

使用的时候，直接下载打包好的jar包使用即可。
具体使用请自行阅读一下源码，主要是
CQ.send 和CQ.receive 方法
有三个对应的实体对象：
PrivateMessage 私聊
GroupMessage 群消息
DiscussMessage 讨论组
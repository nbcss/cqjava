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

注意：接收讨论组消息时候没有问题，但是发送讨论组消息是会被插件识别成群消息导致发送不出去，具体原因未知，可能是上头插件作者的bug导致。已经提issue 等待反馈修改。（不过这个功能使用比较少好像也比较不重要是吧。）
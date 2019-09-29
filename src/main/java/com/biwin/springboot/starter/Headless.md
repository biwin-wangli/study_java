## SpringBoot启动过程学习

### Headless模式
在SpringBoot启动过程中，有这么一句：
```
    private void configureHeadlessProperty() {
        System.setProperty(SYSTEM_PROPERTY_JAVA_AWT_HEADLESS, System.getProperty(
                SYSTEM_PROPERTY_JAVA_AWT_HEADLESS, Boolean.toString(this.headless)));
    }
```
这块是用来设置java.awt.headless属性为true还是false。

Headless模式是在缺少显示屏、键盘或者鼠标是的系统配置。在java.awt.toolkit和java.awt.graphicsenvironment类中有许多方法，除了对
字体、图形和打印的操作外还可以调用显示器、键盘和鼠标的方法。但是有一些类中，比如Canvas和Panel，可以在headless模式下执行。

系统属性配置
①为了启用headless模式，需要使用setProperty方法去设置相应的系统属性。
```System.setProperty("java.awt.headless","true")```

②如果想在一个相同的程序中使用headless和传统环境，你可以使用下面的命令行来完成：
```java -Djava.awt.headless=true```

③通过反射设置java.awt.GraphicsEnvironment中这个属性的值为true

如果名字为java.awt.headless的系统属性被设置true，那么headless工具包就会被使用。应用程序可以执行如下操作：

（1）创建轻量级组件。

（2）收集关于可用的字体、字体指标和字体设置的信息。

（3）设置颜色来渲染准备图片。

（4）创造和获取图像，为渲染准备图片。

（5）使用java.awt.PrintJob,java.awt.print.*,和javax.print.*类里德打印。

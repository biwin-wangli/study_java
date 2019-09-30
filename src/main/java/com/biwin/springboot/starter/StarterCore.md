## SpringBoot 启动核心

由于该类涉及众多SpringBoot的思想，也是学习使用必须了解的核心类，所以专门贴出来进行单独分析理解。
[学习地址](https://www.jianshu.com/p/577906fa2cc2)
```
    @Override
    public void refresh() throws BeansException, IllegalStateException {
        synchronized (this.startupShutdownMonitor) {
            // Prepare this context for refreshing.
            // 准备，记录容器的启动时间startupDate, 标记容器为激活，初始化上下文环境如文件路径信息，验证必填属性是否填写
            prepareRefresh();

            // Tell the subclass to refresh the internal bean factory.
            // 这步比较重要(解析)，告诉子类去刷新bean工厂，这步完成后配置文件就解析成一个个bean定义，注册到BeanFactory（但是未被初始化，仅将信息写到了beanDefination的map中）
            ConfigurableListableBeanFactory beanFactory = obtainFreshBeanFactory();

            // Prepare the bean factory for use in this context.为BeanFactory
            // 设置beanFactory类加载器，添加多个beanPostProcesser
            prepareBeanFactory(beanFactory);

            try {
                // Allows post-processing of the bean factory in context subclasses.
                // 允许子类上下文中对beanFactory做后期处理
                postProcessBeanFactory(beanFactory);

                // Invoke factory processors registered as beans in the context.
                // 调用BeanFactoryPostProcessor各个实现类的方法
                invokeBeanFactoryPostProcessors(beanFactory);

                // Register bean processors that intercept bean creation.
                // 注册 BeanPostProcessor 的实现类，注意看和 BeanFactoryPostProcessor 的区别
                // 此接口两个方法: postProcessBeforeInitialization 和 postProcessAfterInitialization
                // 两个方法分别在 Bean 初始化之前和初始化之后得到执行。注意，到这里 Bean 还没初始化
                registerBeanPostProcessors(beanFactory);

                // Initialize message source for this context.
                // 初始化ApplicationContext的MessageSource
                initMessageSource();

                // Initialize event multicaster for this context.
                // 初始化ApplicationContext事件广播器
                initApplicationEventMulticaster();

                // Initialize other special beans in specific context subclasses.
                // 初始化子类特殊bean（钩子方法）
                onRefresh();

                // Check for listener beans and register them.
                // 注册事件监听器
                registerListeners();

                // Instantiate all remaining (non-lazy-init) singletons.
                // 初始化所有singleton bean  重点！！重点！！
                finishBeanFactoryInitialization(beanFactory);

                // Last step: publish corresponding event.
                // 广播事件，ApplicationContext初始化完成
                finishRefresh();
            }

            catch (BeansException ex) {
                if (logger.isWarnEnabled()) {
                    logger.warn("Exception encountered during context initialization - " +
                            "cancelling refresh attempt: " + ex);
                }

                // Destroy already created singletons to avoid dangling resources.销毁已经创建的单例Bean, 以避免资源占用.
                destroyBeans();

                // Reset 'active' flag.取消refresh操作, 重置active标志.
                cancelRefresh(ex);

                // Propagate exception to caller.
                throw ex;
            }

            finally {
                // Reset common introspection caches in Spring's core, since we
                // might not ever need metadata for singleton beans anymore...重置Spring的核心缓存
                resetCommonCaches();
            }
        }
    }
```
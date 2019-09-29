## SpringBoot 启动核心

由于该类涉及众多SpringBoot的思想，也是学习使用必须了解的核心类，所以专门贴出来进行单独分析理解。
[学习地址](https://www.jianshu.com/p/577906fa2cc2)
```
    @Override
	public void refresh() throws BeansException, IllegalStateException {
		synchronized (this.startupShutdownMonitor) {
			// Prepare this context for refreshing.准备刷新的上下文环境，例如对系统属性或者环境变量进行准备及验证。
			prepareRefresh();

			// Tell the subclass to refresh the internal bean factory.启动子类的refreshBeanFactory方法.解析xml
			ConfigurableListableBeanFactory beanFactory = obtainFreshBeanFactory();

			// Prepare the bean factory for use in this context.为BeanFactory配置容器特性，例如类加载器、事件处理器等.
			prepareBeanFactory(beanFactory);

			try {
				// Allows post-processing of the bean factory in context subclasses.设置BeanFactory的后置处理. 空方法，留给子类拓展用。
				postProcessBeanFactory(beanFactory);

				// Invoke factory processors registered as beans in the context.调用BeanFactory的后处理器, 这些后处理器是在Bean定义中向容器注册的.
				invokeBeanFactoryPostProcessors(beanFactory);

				// Register bean processors that intercept bean creation.注册Bean的后处理器, 在Bean创建过程中调用.  
				registerBeanPostProcessors(beanFactory);

				// Initialize message source for this context.初始化上下文中的消息源，即不同语言的消息体进行国际化处理
				initMessageSource();

				// Initialize event multicaster for this context.初始化ApplicationEventMulticaster bean,应用事件广播器
				initApplicationEventMulticaster();

				// Initialize other special beans in specific context subclasses.初始化其它特殊的Bean， 空方法，留给子类拓展用。
				onRefresh();

				// Check for listener beans and register them.检查并向容器注册监听器Bean
				registerListeners();

				// Instantiate all remaining (non-lazy-init) singletons.实例化所有剩余的(non-lazy-init) 单例Bean.
				finishBeanFactoryInitialization(beanFactory);

				// Last step: publish corresponding event.发布容器事件, 结束refresh过程.
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
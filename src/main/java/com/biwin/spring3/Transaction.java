package com.biwin.spring3;

/**
 * @Description Spring3事务
 * @auther wangli
 * @create 2019-09-09 11:02
 */
public class Transaction {

    /**
     * 事务的基础概念（ACID）
     * A:原子性(Atomic),事务是由一个或多个活动所组成的一个工作单元。原子性确保事务中的所有操作全部发生或全部不发生。如果所有的活动都成功了，事务也就成功了。如果任意一个活动失败，整个事务也失败并回滚。
     * C:一致性(Consistent),一旦事务完成（不管成功还是失败），系统必须确保它所建模的业务处于一致的状态。现实的数据不应该被损坏。
     * I:隔离性(Isolated),事务允许多个用户对相同的数据进行操作，每个用户的操作不会与其他用户纠缠在一起。因此，事务应该被彼此隔离，避免发生同步读写相同数据的事情（注意的是，隔离性往往涉及到锁定数据库中的行或表）。
     * D:持久性(Durable),一旦事务完成，事务的结果应该持久化，这样就能从任何的系统崩溃中恢复过来。这一般会涉及将结果存储到数据库或其他形式的持久化存储中。
     *
     * 事务属性：
     * 1.传播行为：定义了客户端与被调用方法之间的事务边界。Spring定义了7中不同的传播行为，参照org.springframework.transaction.TransactionDefinition类。
     *          传播行为                     含义
     *  0 PROPAGATION_REQUIRED              表示当前方法必须运行在事务中。如果当前事务存在，方法将会在该事务中运行。否则，会启动一个新的事务。
     *  1 PROPAGATION_SUPPORTS              表示当前方法不需要事务上下文，但是如果存在当前事务的话，那么该方法会在这个事务中运行。
     *  2 PROPAGATION_MANDATORY             表示该方法必须在事务中运行。如果当前事务不存在，则会抛出一个异常
     *  3 PROPAGATION_REQUIRES_NEW          表示当前方法必须运行在他自己的事务中。一个新的事务将被启动。如果存在当前事务，在该方法执行期间，当前事务会被挂起。如果使用JTATransactionManager,则需要访问TransactionManager
     *  4 PROPAGATION_NOT_SUPPORTED         表示该方法不应该运行在事务中。如果存在当前事务，在该方法运行期间，当前事务将被挂起。如果使用JTATransactionManager的话，则需要访问TransactionManager。
     *  5 PROPAGATION_NEVER                 表示当前方法不应该运行在事务上下文中。如果当前正有一个事务在运行，则会抛出异常。
     *  6 PROPAGATION_NESTED                表示如果当前已经存在一个事务，那么该方法将会在嵌套事务中运行。嵌套的事务可以独立于当前事务进行单独地提交或回滚。如果当前事务不存在，那么其行为与PROPAGATION_REQUIRED一样。注意各厂商对这种传播行为的支持是有所差异的。可以参考资源管理的文档来确定它们是否支持嵌套式事务。
     *
     * 2.隔离级别：定义了一个事务可能受其他并发事务影响的程度。并发，有可能会导致以下问题：Shape
     * 脏读：脏读发生在一个事务读取了另一个事务改些但尚未提交的数据时。如果改写在稍后被回滚了，那么第一个事务获取的数据就是无效的。
     * 不可重复读：不可重复读发生在一个事务执行相同的查询两次或两次以上，但是每次都得到不同的数据时。这通常是因为另一个并发实物在两次查询期间更新了数据。
     * 幻读：幻读与不可重复读类似。它发生在一个事务赌气了几行数据，接着另一个并发事务插入了一些数据时。在随后的查询中，第一个事务就会发现多了一些原本不存在的记录。
     *          隔离级别                     含义
     *  ISOLATION_DEFAULT                   使用后端数据默认的隔离级别。
     *  ISOLATION_READ_UNCOMMITTED          允许读取尚未提交的数据变更。可能会导致脏读、幻读或不可重复读。
     *  ISOLATION_READ_COMMITTED            允许读取并发事务已经提交的数据。可以阻止脏读，但是幻读或不可重复读仍然有可能发生。
     *  ISOLATION_REPEATABLE_READ           对同一字段的多次读取结果时一致的，除非数据是被本事务自己所修改。可以阻止脏读和不可重复读，但幻读仍然有可能发生。
     *  ISOLATION_SERIALIZABLE              完全服从ACID的隔离级别，确保阻止脏读、不可重复读以及幻读。这是最慢的事务隔离级别，因为它通常是通过完全锁定事务相关的数据库表来实现的。
     *
     * 3.回滚原则：是一组规则，这些规则定义了哪些异常会导致事务回滚而哪些不会。默认情况下，事务只有在遇到运行期异常时才会回滚，而在遇到检查型异常时不会回滚。
     * 4.事务超时：为了使应用程序很好地运行，事务不能运行太长的时间。因此，声明式事务下一个特性就是超时。
     * 5.是否只读：如果事务只对后端的数据库进行读操作，数据库可以利用事务的只读特性来进行一些特定的优化。通过将事务设置为只读，你就可以给数据库一个机会，让它应用它认为合适的优化措施。
     */
}

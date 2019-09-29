package com.biwin.designpattern.creattionalpattern.objectpool;

import java.util.Hashtable;

/**
 * @Description
 * @auther wangli
 * @create 2019-09-29 10:27
 */
public abstract class ObjectPool<T> {
    // 容器，容纳对象
    private Hashtable<T, ObjectStatus> pool = new Hashtable<T, ObjectStatus>();

    /**
     * 初始化时创建对象，并放入到池中
     */
    public ObjectPool() {
        this.pool.put(create(), new ObjectStatus());
    }

    /**
     * 从Hashtable中取出空闲元素
     *
     * @return
     */
    public synchronized T checkOut() {
        // 这是最简单的策略
        for (T t : this.pool.keySet()) {
            if (this.pool.get(t).validate()) {
                this.pool.get(t).setUsing();
                return t;
            }
        }
        return null;
    }

    /**
     * 归还对象
     *
     * @param t
     */
    public synchronized void checkIn(T t) {
        this.pool.get(t).setFree();
    }

    class ObjectStatus {
        /**
         * 占用
         */
        public void setUsing() {
        }

        /**
         * 释放
         */
        public void setFree() {
            // 注意：若T是有状态，则需要回归到初始化状态
        }

        /**
         * 检查是否可用
         *
         * @return
         */
        public boolean validate() {
            return false;
        }
    }

    /**
     * 创建池化对象
     *
     * @return
     */
    public abstract T create();
}

package com.biwin.designpattern.behavioralpattern.template;

/**
 * @Description
 * @auther wangli
 * @create 2019-10-08 16:03
 */
public abstract class Game {

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //模板
    public final void play() {

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }

}

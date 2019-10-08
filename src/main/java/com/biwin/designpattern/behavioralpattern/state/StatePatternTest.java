package com.biwin.designpattern.behavioralpattern.state;

/**
 * @Description
 * @auther wangli
 * @create 2019-10-08 13:57
 */
public class StatePatternTest {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }

}

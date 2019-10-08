package com.biwin.designpattern.behavioralpattern.template;

/**
 * @Description
 * @auther wangli
 * @create 2019-10-08 16:04
 */
public class TemplatePatternTest {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}

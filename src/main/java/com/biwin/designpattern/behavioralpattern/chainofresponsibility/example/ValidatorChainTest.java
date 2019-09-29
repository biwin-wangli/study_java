package com.biwin.designpattern.behavioralpattern.chainofresponsibility.example;

import com.biwin.designpattern.behavioralpattern.chainofresponsibility.example.ext.AValidator;
import com.biwin.designpattern.behavioralpattern.chainofresponsibility.example.ext.BValidator;

/**
 * @Description
 * @auther wangli
 * @create 2019-09-29 11:25
 */
public class ValidatorChainTest {

    public static void main(String[] args) {
        ValidatorChain validatorChain = new ValidatorChain();

        //按照自己想要的执行顺序进行添加处理即可
        validatorChain.addValidator(new AValidator());
        validatorChain.addValidator(new BValidator());

        //执行链
        validatorChain.execute(validatorChain);
    }
}

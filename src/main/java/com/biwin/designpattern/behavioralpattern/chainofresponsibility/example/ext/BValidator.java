package com.biwin.designpattern.behavioralpattern.chainofresponsibility.example.ext;

import com.biwin.designpattern.behavioralpattern.chainofresponsibility.example.Validator;
import com.biwin.designpattern.behavioralpattern.chainofresponsibility.example.ValidatorChain;

/**
 * @Description
 * @auther wangli
 * @create 2019-09-29 11:24
 */
public class BValidator extends Validator {
    @Override
    public void check(ValidatorChain chain, Object... obj) {
        // to do something...
        chain.execute( chain, obj);
    }
}

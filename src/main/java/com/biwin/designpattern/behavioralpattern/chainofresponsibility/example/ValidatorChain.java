package com.biwin.designpattern.behavioralpattern.chainofresponsibility.example;

/**
 * @author wangli
 * @Description 统一的链上对象预处理
 * @create 2019-09-04 14:49
 */
public class ValidatorChain {

    private Validator[] Validators = new Validator[0];
    /**
     * 验证器的总量
     */
    private int count = 0;
    /**
     * 验证器执行位置
     */
    private int index = 0;

    public void execute(ValidatorChain chain, Object... obj) {
        if (this.index == Validators.length) {
            return;
        }
        //每添加一个验证规则，index自增1
        Validator validator = Validators[this.index];
        this.index++;
        //根据索引值获取对应的规律规则对字符串进行处理
        validator.check(chain, obj);
    }

    public void addValidator(Validator validator) {
        if (Validators.length == 0) {
            this.Validators = new Validator[]{validator};
            this.count = 1;
            return;
        }
        for (int i = 0; i < Validators.length; i++) {
            if (Validators[i] == validator) {
                return;
            }
        }
        replaceFilter(validator);

    }

    private void replaceFilter(Validator validator) {
        Validator[] newValidators = new Validator[this.Validators.length + 1];
        System.arraycopy(this.Validators, 0, newValidators, 0, this.Validators.length);
        newValidators[this.Validators.length] = validator;
        this.Validators = newValidators;
        this.count = this.Validators.length;
    }
}

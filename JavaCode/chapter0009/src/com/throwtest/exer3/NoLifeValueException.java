package com.throwtest.exer3;

/**
 * ClassName: NoLifeValueException
 * Description:
 *      操作步骤描述：
 * （1）自定义异常类NoLifeValueException继承RuntimeException
 * ①提供空参和有参构造
 * ②在有参构造中，需要调用父类的有参构造，把异常信息传入
 * @Author wggglggg
 * @Create 2023/4/6 19:20
 * @Version 1.0
 */
public class NoLifeValueException extends RuntimeException{
    static final long serialVersionUID = -703489719074576693L;

    public NoLifeValueException() {
        super();
    }

    public NoLifeValueException(String message) {
        super(message);
    }
}

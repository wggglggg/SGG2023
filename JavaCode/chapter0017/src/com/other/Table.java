package com.other;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * ClassName: Table
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/5/2 19:20
 * @Version 1.0
 */

@Target({TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
    String value();
}

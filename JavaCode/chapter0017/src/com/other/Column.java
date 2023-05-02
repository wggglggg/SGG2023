package com.other;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * ClassName: Column
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/5/2 19:38
 * @Version 1.0
 */
@Target({FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    String columnName();
    String columnType();
}

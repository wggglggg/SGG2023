package com.datastucture.stack;

import org.junit.Test;

/**
 * ClassName: StackTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/24 20:23
 * @Version 1.0
 */
public class StackTest {
    @Test
    public void test1(){
        Stack stack = new Stack(10);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

    }
}

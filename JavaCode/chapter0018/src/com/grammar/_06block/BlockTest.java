package com.grammar._06block;

import org.junit.Test;

/**
 * ClassName: BlockTest
 * Description:
 *                                               文本块的使用
 * @Author wggglggg
 * @Create 2023/5/8 16:44
 * @Version 1.0
 */
public class BlockTest {
    //对比1： 以前时
    @Test
    public void test1() {
        String info = "<html>\n" +
                "  <body>\n" +
                "      <p>Hello, 尚硅谷</p>\n" +
                "  </body>\n" +
                "</html>";
        System.out.println(info);

    }

    // 用"""来包裹网页标签就行
    @Test
    public void test2(){
        String info = """
                <html>
                  <body>
                      <p>Hello, 尚硅谷</p>
                  </body>
                </html>
                """;
        System.out.println(info);

    }

    //对比2 以前 Json代码块
    @Test
    public void test3() {
        String myJson = "{\n" +
                "    \"name\":\"Song Hongkang\",\n" +
                "    \"gender\":\"男\",\n" +
                "    \"address\":\"www.atguigu.com\"\n" +
                "}";
        System.out.println(myJson);
    }

    //现在 Json代码块
    @Test
    public void test4(){
        String myJson = """
            {
                "name":"Song Hongkang",
                "gender":"男",
                "address":"www.atguigu.com"
            }
            """;
        System.out.println(myJson);

    }

    //对比3 以前SQL命令
    @Test
    public void test5() {
        String query = "SELECT employee_id,last_name,salary,department_id\n" +
                "FROM employees\n" +
                "WHERE department_id IN (40,50,60)\n" +
                "ORDER BY department_id ASC";
        System.out.println(query);
    }

    // 现在SQL命令
    /*
     * JDK14新特性：
     *  \:取消换行操作
     *  \s:表示一个空格
     **/
    @Test
    public void test6(){
        String query = """
                SELECT employee_id,last_name,salary,department_id \s\
                FROM employees \s\
                WHERE department_id IN (40,50,60) \s\
                ORDER BY department_id ASC
                """;
        System.out.println(query);
        String newQuery1 = """
                SELECT id,name,email \
                FROM customers\s\
                WHERE id > 4 \
                ORDER BY email DESC
                """;
        System.out.println(newQuery1);
    }
}

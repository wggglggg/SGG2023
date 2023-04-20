package com.project.team.junit;

import com.project.team.domain.Programmer;
import com.project.team.service.NameListService;
import com.project.team.service.TeamException;
import org.junit.Test;

/**
 * ClassName: NameListServiceTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/9 9:20
 * @Version 1.0
 */
public class NameListServiceTest {

    @Test
    public void test1(){
        NameListService n1 = new NameListService();
        for (int i = 0; i < n1.getAllEmployees().length; i++) {
            System.out.println(n1.getAllEmployees()[i]);

        }

        try {
            System.out.println(n1.getEmployee(10));

        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }
}

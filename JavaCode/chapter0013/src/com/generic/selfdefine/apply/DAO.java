package com.generic.selfdefine.apply;

import java.util.List;

/**
 * ClassName: DAO
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/22 16:26
 * @Version 1.0
 */
public class DAO<T> {

    //增
    public void insert(T bean){

    }

    // 删
    public T deleteById(int id) {
        return null;
    }

    // 改
    public void update(int id , T bean) {

    }

    // 查     查询一条记录
    public T queryForInstance(int id) {
        return null;
    }

    // 查     查询多条记录
    public List<T> queryForList(int id){
        return null;
    }
}

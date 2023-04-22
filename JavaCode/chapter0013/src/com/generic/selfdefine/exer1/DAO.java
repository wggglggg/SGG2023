package com.generic.selfdefine.exer1;

import java.util.*;

/**
 * ClassName: DAO
 * Description:
 *      定义个泛型类 DAO<T>，在其中定义一个Map 成员变量，Map 的键为 String 类型，值为 T 类型。
 *
 * 分别创建以下方法：
 * public void save(String id,T entity)： 保存 T 类型的对象到 Map 成员变量中
 * public T get(String id)：从 map 中获取 id 对应的对象
 * public void update(String id,T entity)：替换 map 中key为id的内容,改为 entity 对象
 * public List<T> list()：返回 map 中存放的所有 T 对象
 * public void delete(String id)：删除指定 id 对象
 * @Author wggglggg
 * @Create 2023/4/22 16:46
 * @Version 1.0
 */
public class DAO<T> {
    Map<String, T> map = null;

    {
        map = new HashMap<>();
    }

    // 保存 T 类型的对象到 Map 成员变量中
    public void save(String id, T entity) {
        if (!map.containsKey(id)) {     // 表中没有查询到此ID，才新建
            map.put(id, entity);
        }

    }
    // 从 map 中获取 id 对应的对象
    public T get(String id){
        return map.get(id);
    }

    // 替换 map 中key为id的内容,改为 entity 对象
    public void update(String id, T entity){
        if (map.containsKey(id)){       // 表中没有查询到此ID，才修改
            map.put(id, entity);
        }
    }

    // 查找 返回 map 中存放的所有 T 对象
    public List<T> list() {
        // 方法一
//        Collection<T> values = map.values();
//        ArrayList<T> list = new ArrayList<>(values);
//        return list;
        // 方法二
        Collection<T> values = map.values();
        ArrayList<T> arrayList = new ArrayList<>();
        arrayList.addAll(values);
        return arrayList;
    }

    // 删除指定 id 对象
    public void delete(String id) {
        if (map.containsKey(id)) {
            map.remove(id);
        }
    }
}

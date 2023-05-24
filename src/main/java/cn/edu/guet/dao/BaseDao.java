package cn.edu.guet.dao;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

/**
 * @Author liwei
 * @Date 2023/1/4 09:32
 * @Version 1.0
 */
public interface BaseDao<T> {

    int save(T t) throws SQLException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException;
    T get(int id);
}

package com.mycompany.controller.services;


import com.mycompany.model.bean.AbstractUser;
import com.mycompany.model.bean.Book;
import com.mycompany.model.bean.User;

import java.sql.SQLException;
import java.util.List;

public interface AbstractUserService<T extends AbstractUser> {
    /* 用户的注册行为 */
    T register(T t) throws SQLException;
    T findByAccount(T t);
    /**
     * 用户的登录行为
     * 如果登录成功：返回登录的那个User对象，如果失败返回null
     * */
    T login(T t) throws SQLException;
    /* 用户的修改用户名行为 */
    T rename(T t) throws SQLException;
    /* 用户的修改密码行为 */
    T changePwd(T t) throws SQLException;
    /* 用户的查询所有书的行为 */
    List<Book> showAllBooks() throws SQLException;
}

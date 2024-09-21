package com.cobin.dp;

import com.cobin.dp.annotation.LogRemark;
import com.cobin.dp.criterion.FiledNode;

import java.lang.reflect.Field;
import java.util.Date;

/**
 * Client
 *
 * @author bingodfok
 * @date 2024/9/21 下午8:10
 **/
public class Client {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        LogRemarkFilterChain chain = new LogRemarkFilterChain();
        chain.addFilter(new EmptyFilter());
        chain.addFilter(new DateTimeFilter());
        User user = new User();
        user.setName(new Date());
        Field field = User.class.getDeclaredField("name");
        field.setAccessible(true);
        Object name = field.get(user);
        FiledNode node = new FiledNode();
        node.setAnnotation(field.getAnnotation(LogRemark.class));
        node.setValue(name);
        System.out.println(chain.doFilter(node));
    }
}

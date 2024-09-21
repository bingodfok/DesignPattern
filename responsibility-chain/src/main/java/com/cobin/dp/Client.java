package com.cobin.dp;

import com.cobin.dp.criterion.FiledNode;

/**
 * Client
 * @author bingodfok
 * @date 2024/9/21 上午11:41
 **/
public class Client {
    public static void main(String[] args) {
        EmptyFilter emptyFilter = new EmptyFilter();
        LogRemarkFilterChain chain = new LogRemarkFilterChain();
        chain.addFilter(emptyFilter);
        FiledNode node = new FiledNode();
        node.setValue("Hello DP");
        System.out.println(chain.doFilter(node));
    }
}

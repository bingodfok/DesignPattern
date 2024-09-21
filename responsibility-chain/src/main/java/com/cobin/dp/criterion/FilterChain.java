package com.cobin.dp.criterion;
/**
 * FilterChain
 * @author bingodfok
 * @date 2024/9/21 上午10:44
 **/
public interface FilterChain {
    String doFilter(FiledNode node);
}

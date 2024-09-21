package com.cobin.dp;

import com.cobin.dp.criterion.FiledNode;
import com.cobin.dp.criterion.Filter;
import com.cobin.dp.criterion.FilterChain;

import java.util.LinkedList;
import java.util.List;

/**
 * AbstractFilterChain
 *
 * @author bingodfok
 * @date 2024/9/21 上午10:50
 **/
public abstract class AbstractFilterChain implements FilterChain {

    protected static final List<Filter> FILTER_LIST = new LinkedList<>();

    protected Integer index;

    public String start(FiledNode node) {
        index = 0;
        return doFilter(node);
    }

    /**
     * 添加过滤器到FilterChain结尾(EndFilter前一位)
     */
    public void addFilter(Filter filter) {
        FILTER_LIST.add(FILTER_LIST.size() - 1, filter);
    }

}

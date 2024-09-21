package com.cobin.dp;

import com.cobin.dp.criterion.FiledNode;
import com.cobin.dp.criterion.Filter;

import java.util.LinkedList;
import java.util.List;

/**
 * LogRemarkFilterChain
 *
 * @author bingodfok
 * @date 2024/9/21 上午10:48
 **/
public class LogRemarkFilterChain extends AbstractFilterChain {

    private final List<Filter> FILTER_LIST = new LinkedList<>();

    private Integer index = 0;

    public LogRemarkFilterChain() {
        FILTER_LIST.add(new EndFilter());
    }

    @Override
    public String doFilter(FiledNode node) {
        Filter filter = FILTER_LIST.get(index++);
        return filter.logRemarkParse(this, node);
    }

    public void addFilter(Filter filter) {
        FILTER_LIST.add(FILTER_LIST.size() - 1, filter);
    }
}

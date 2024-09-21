package com.cobin.dp;

import com.cobin.dp.criterion.FiledNode;
import com.cobin.dp.criterion.Filter;

/**
 * LogRemarkFilterChain
 *
 * @author bingodfok
 * @date 2024/9/21 上午10:48
 **/
public class LogRemarkFilterChain extends AbstractFilterChain {

    // 初始化通用过滤器
    static {
        FILTER_LIST.add(new EmptyFilter());
        FILTER_LIST.add(new EndFilter());
    }

    /**
     *  多次调用请请勿使用该方法启动 FilterChain，应该使用{@code start()}
     */
    @Override
    public String doFilter(FiledNode node) {
        Filter filter = FILTER_LIST.get(index++);
        return filter.logRemarkParse(this, node);
    }
}

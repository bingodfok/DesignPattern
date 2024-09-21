package com.cobin.dp;

import cn.hutool.core.date.DateUtil;
import com.cobin.dp.criterion.FiledNode;
import com.cobin.dp.criterion.Filter;
import com.cobin.dp.criterion.FilterChain;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * DateFilter
 *
 * @author bingodfok
 * @date 2024/9/21 下午6:36
 **/
public class DateTimeFilter implements Filter {

    @Override
    public String logRemarkParse(FilterChain chain, FiledNode node) {
        if(node.getValue() instanceof Date value){
           return DateUtil.format(value, "yyyy-MM-dd HH:mm:ss");
        }
        if(node.getValue() instanceof LocalDateTime value){
            return DateUtil.format(value,"yyyy-MM-dd HH:mm:ss");
        }
        return chain.doFilter(node);
    }
}

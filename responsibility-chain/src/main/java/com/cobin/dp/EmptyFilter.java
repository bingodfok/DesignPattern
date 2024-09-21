package com.cobin.dp;

import com.cobin.dp.criterion.FiledNode;
import com.cobin.dp.criterion.Filter;
import com.cobin.dp.criterion.FilterChain;

import java.util.Objects;
/**
 * EmptyFilter
 * @author bingodfok
 * @date 2024/9/21 上午11:27
 **/
public class EmptyFilter implements Filter {

    @Override
    public String logRemarkParse(FilterChain chain, FiledNode node) {
        if(Objects.isNull(node.getValue())){
            return "";
        }
       return chain.doFilter(node);
    }
}

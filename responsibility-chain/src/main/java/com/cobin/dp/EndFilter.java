package com.cobin.dp;

import com.cobin.dp.criterion.FiledNode;
import com.cobin.dp.criterion.Filter;
import com.cobin.dp.criterion.FilterChain;

import java.util.Objects;

/**
 * EndFilter
 *
 * @author bingodfok
 * @date 2024/9/21 下午12:03
 **/
public class EndFilter implements Filter {

    @Override
    public String logRemarkParse(FilterChain chain, FiledNode node) {
        return Objects.isNull(node.getValue()) ? "" : node.getValue().toString();
    }
}

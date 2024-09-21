package com.cobin.dp;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.cobin.dp.criterion.FiledNode;
import com.cobin.dp.criterion.Filter;
import com.cobin.dp.criterion.FilterChain;

/**
 * EmptyFilter
 *
 * @author bingodfok
 * @date 2024/9/21 上午11:27
 **/
public class EmptyFilter implements Filter {

    @Override
    public String logRemarkParse(FilterChain chain, FiledNode node) {
        if (ObjectUtil.isEmpty(node.getValue())) {
            if (!node.getAnnotation().ignoreEmpty()) {
                return node.getAnnotation().emptyDefault();
            }
            return StrUtil.EMPTY;
        }
        return chain.doFilter(node);
    }
}

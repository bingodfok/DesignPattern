package com.cobin.dp.criterion;

import com.cobin.dp.annotation.LogRemark;
import lombok.Data;

/**
 * FiledNode
 * @author bingodfok
 * @date 2024/9/21 上午11:04
 **/
@Data
public class FiledNode {

    private LogRemark annotation;

    private Object value;

    private String name;

}

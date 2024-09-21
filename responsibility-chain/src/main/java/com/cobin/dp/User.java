package com.cobin.dp;

import com.cobin.dp.annotation.LogRemark;
import lombok.Data;

import java.util.Date;

/**
 * User
 *
 * @author bingodfok
 * @date 2024/9/21 下午7:53
 **/
@Data
public class User {
    @LogRemark(ignoreEmpty = false,emptyDefault = "全部")
    private Date name;

}

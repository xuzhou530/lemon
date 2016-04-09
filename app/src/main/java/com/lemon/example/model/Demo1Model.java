package com.lemon.example.model;

import android.content.Context;

import com.lemon.LemonMessage;
import com.lemon.annotation.Autowired;
import com.lemon.annotation.Component;
import com.lemon.annotation.InitMethod;
import com.lemon.annotation.RefBean;

/**
 * 项目名称:  [lemon]
 * 包:        [com.lemon.example.model]
 * 类描述:    [简要描述]
 * 创建人:    [xflu]
 * 创建时间:  [2016/4/8 14:32]
 * 修改人:    [xflu]
 * 修改时间:  [2016/4/8 14:32]
 * 修改备注:  [说明本次修改内容]
 * 版本:      [v1.0]
 */
@Component
public class Demo1Model {

    @Autowired
    public Context mContext;

    @RefBean(name = "lemonMessage")
    public LemonMessage lemonMessage;

    private String name;

    @InitMethod
    public void init() {
        name = "demo1  model";
    }

    @Override
    public String toString() {
        return "Demo1Model{" +
                "mContext=" + mContext +
                ", lemonMessage=" + lemonMessage +
                ", name='" + name + '\'' +
                '}';
    }
}

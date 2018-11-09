package com.zuul.demozuul;

import com.netflix.zuul.ZuulFilter;

public class MyFilter extends ZuulFilter {


    @Override
    public String filterType(){
        return "pre";
    }
    @Override
    public int filterOrder(){
        return 10;
    }
    @Override
    public boolean shouldFilter() {
        return true; //表示是否需要执行该filter，true表示执行，false表示不执行
    }

    @Override
    public Object run() {
        return null; //filter需要执行的具体操作
    }
}

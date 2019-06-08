package org.zj.zuul.service;

import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

/**
 * @Auther: ZhangJun
 * @Date: 2019/6/8 20:04
 * @Description: zuul过滤器使用
 */
@Component
public class ZuulFilter extends com.netflix.zuul.ZuulFilter {

    public ZuulFilter(){
        System.out.println("我李云龙他娘的意大利炮来了------");
    }
    //这里好像一定要返回pre
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("请求-----------");
        return null;
    }
}

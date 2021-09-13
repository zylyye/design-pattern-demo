package org.erlong.pattern.responsibilitychain;

import java.util.ArrayList;
import java.util.List;

// 过滤器链维护类
public class FilterChain {

    private List<Filter> filterList = new ArrayList<>();


    // 当前 Filter 索引
    private int filterIndex = 0;

    public void addFilter(Filter filter) {
        this.filterList.add(filter);
    }

    public void doFilter(String msg) {
        if (filterIndex >= this.filterList.size()) {
            // 到达责任链结尾，退出
            return;
        }
        // 取出当前过滤器
        Filter nextFilter = filterList.get(filterIndex++);
        // 开始交由过滤器链的过滤器处理
        nextFilter.doFilter(msg, this);
    }
}

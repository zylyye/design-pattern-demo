package org.erlong.pattern.responsibilitychain;

// 过滤器
public interface Filter {

    void doFilter(String msg, FilterChain nextChain);

}

package org.erlong.pattern.responsibilitychain;

public class Client {

    public static void main(String[] args) {
        Filter filterA = (msg, nextChain) -> {
            System.out.println("filterA:" + msg);
            nextChain.doFilter(msg);
        };

        Filter filterB = (msg, nextChain) -> {
            System.out.println("filterB:" + msg);
            nextChain.doFilter(msg);
        };
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(filterA);
        filterChain.addFilter(filterB);
        filterChain.doFilter("哈哈哈哈哈");
    }
}

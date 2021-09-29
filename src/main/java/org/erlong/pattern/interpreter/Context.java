package org.erlong.pattern.interpreter;

import java.util.HashMap;
import java.util.Map;

// 环境角色
public class Context {

    private Map<String, Double> map = new HashMap<>();

    public void add(String name, Double value) {
        this.map.put(name, value);
    }

    public double get(String name) {
        Double value = map.get(name);
        if (value == null) {
            throw new RuntimeException(String.format("variable: %s not exist", name));
        }
        return value;
    }

}

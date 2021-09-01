package org.erlong.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 */
public class FlyweightFactory {

    private static final Map<String, Chess> CHESS_MAP = new HashMap<>();

    // 获取指定坐标上指定颜色的棋子对象
    public static Chess getChess(String color, int x, int y) {
        String key = color + x + y;
        Chess chess = CHESS_MAP.get(key);
        if (chess == null) {
            chess = new Chess(color);
            chess.move(x, y);
            CHESS_MAP.put(key, chess);
        }
        return chess;
    }
}

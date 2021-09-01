package org.erlong.pattern.flyweight;

/**
 * 棋子，享元接口
 */
public class Chess {

    // 颜色，内部状态
    private String color;

    // 外部状态 x 坐标
    private int x;

    // 外部状态 y 坐标
    private int y;

    public Chess(String color) {
        this.color = color;
    }

    // 外部状态操作
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

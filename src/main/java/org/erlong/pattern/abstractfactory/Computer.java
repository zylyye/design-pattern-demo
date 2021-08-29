package org.erlong.pattern.abstractfactory;

import org.erlong.pattern.abstractfactory.product.KeyBoard;
import org.erlong.pattern.abstractfactory.product.Mouse;
import org.erlong.pattern.abstractfactory.product.Screen;

public abstract class Computer {

    public abstract Mouse getMouse();

    public abstract Screen getScreen();

    public abstract KeyBoard getKeyBoard();

    // 电脑开始运行
    public void run() {
        // 通过抽象工厂方法获取鼠标、屏幕、键盘
        Mouse mouse = getMouse();
        Screen screen = getScreen();
        KeyBoard keyBoard = getKeyBoard();
        // do something
    }
}

package org.erlong.pattern.abstractfactory;

import org.erlong.pattern.abstractfactory.impl.MacKeyBoard;
import org.erlong.pattern.abstractfactory.impl.MacMouse;
import org.erlong.pattern.abstractfactory.impl.MacScreen;
import org.erlong.pattern.abstractfactory.product.KeyBoard;
import org.erlong.pattern.abstractfactory.product.Mouse;
import org.erlong.pattern.abstractfactory.product.Screen;

public class MacComputer extends Computer {
    @Override
    public Mouse getMouse() {
        return new MacMouse();
    }

    @Override
    public Screen getScreen() {
        return new MacScreen();
    }

    @Override
    public KeyBoard getKeyBoard() {
        return new MacKeyBoard();
    }
}

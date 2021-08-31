package org.erlong.pattern.decorator;

import java.io.Reader;

public class Client {

    public static void main(String[] args) {
        HttpRequest resp = new HttpRequest();
        HttpRequestDecorator httpRequestDecorator = new HttpRequestDecorator(resp);
        Reader reader = httpRequestDecorator.getReader();
        // todo with reader
    }
}

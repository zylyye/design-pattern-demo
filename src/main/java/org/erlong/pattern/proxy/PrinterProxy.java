package org.erlong.pattern.proxy;

/**
 * 打印机代理对象
 */
public class PrinterProxy extends Printer {

    private Printer printer;

    public PrinterProxy(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String content) {
        // 监听打印开始
        System.out.println("print start, content:" + content);
        printer.print(content);
        // 监听打印结束
        System.out.println("print end");
    }
}

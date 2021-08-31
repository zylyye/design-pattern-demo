package org.erlong.pattern.decorator;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class HttpRequestDecorator implements Request {

    private HttpRequest request;

    public HttpRequestDecorator(HttpRequest request) {
        this.request = request;
    }

    @Override
    public InputStream getInputStream() {
        return request.getInputStream();
    }

    @Override
    public Map<String, String> getHeaders() {
        return request.getHeaders();
    }

    // 拓展一个获取 reader 的功能
    public Reader getReader() {
        return new InputStreamReader(getInputStream(), StandardCharsets.UTF_8);
    }
}

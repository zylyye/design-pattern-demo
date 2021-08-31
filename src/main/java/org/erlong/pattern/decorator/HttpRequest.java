package org.erlong.pattern.decorator;

import java.io.InputStream;
import java.util.Map;

public class HttpRequest implements Request {
    @Override
    public InputStream getInputStream() {
        return null;
    }

    @Override
    public Map<String, String> getHeaders() {
        return null;
    }
}

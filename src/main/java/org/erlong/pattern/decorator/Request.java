package org.erlong.pattern.decorator;

import java.io.InputStream;
import java.util.Map;

public interface Request {

    InputStream getInputStream();

    Map<String, String> getHeaders();
}

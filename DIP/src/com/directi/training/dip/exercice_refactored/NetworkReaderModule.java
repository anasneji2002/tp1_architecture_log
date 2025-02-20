package com.directi.training.dip.refactored;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkReaderModule implements IReader {
    private String urlString;

    public NetworkReaderModule(String urlString) {
        this.urlString = urlString;
    }

    @Override
    public String read() throws Exception {
        URL url = new URL(urlString);
        InputStream in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder content = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            content.append((char) c);
        }
        return content.toString();
    }
}

package com.mbp.MaidGuild.utils;

import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/**
 * Created by Sharuru on 2015/11/18 0018.
 */
public class APIUtil {
    /**
     * 发起 Http 请求并捕获返回内容
     *
     * @param urlString URL 地址
     * @return 响应字符串
     * @throws Exception
     */
    public static String readUrl(String urlString, Map<String, String> param) throws Exception {
        URL url = new URL(urlString);
        URLConnection con = url.openConnection();
        if (param != null) {
            for (Map.Entry<String, String> entry : param.entrySet()) {
                con.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        InputStream in = con.getInputStream();
        String encoding = con.getContentEncoding();
        encoding = encoding == null ? "UTF-8" : encoding;
        return IOUtils.toString(in, encoding);
    }
}

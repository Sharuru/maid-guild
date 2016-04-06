package com.mbp.MaidGuild.utils;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
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
     */
    public static String readUrl(String urlString, Map<String, String> param) {
        InputStream in;
        HttpURLConnection con = null;
        try{
            URL url = new URL(urlString);
            con = (HttpURLConnection) url.openConnection();
            if (param != null) {
                for (Map.Entry<String, String> entry : param.entrySet()) {
                    con.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            //伪造浏览器请求以避免 503
            con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.110 Safari/537.36");
            con.setRequestProperty("Content-Type", "text/plain; charset=utf-8");
            con.setRequestProperty("Accept", "*/*");
            con.setRequestProperty("DNT", "1");
            con.setRequestProperty("Accept-Language", "zh-CN,zh;q=0.8,en;q=0.6,ja;q=0.4,zh-TW;q=0.2");
            in = con.getInputStream();
        }
        catch (Exception e){
            in = con != null ? con.getErrorStream() : null;
        }
        String encoding = con != null ? con.getContentEncoding() : null;
        encoding = encoding == null ? "UTF-8" : encoding;
        try {
            return IOUtils.toString(in, encoding);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

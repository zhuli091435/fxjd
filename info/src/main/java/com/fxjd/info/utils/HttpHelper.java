package com.fxjd.info.utils;

import org.apache.hc.client5.http.ClientProtocolException;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpStatus;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import org.apache.hc.core5.util.Timeout;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HttpHelper {
    /**
     * http post 请求
     */
    public static String doPost(String url, Map<String, String> params, Map<String, String> headParams) {
        String result = null;

        CloseableHttpClient httpClient = null;
        CloseableHttpResponse response = null;
        try {
            //1. 获取httpclient对象
            httpClient = HttpClients.createDefault();

            //2. 创建post请求
            HttpPost httpPost = new HttpPost(url);

            //3.设置请求和传输超时时间
            RequestConfig config = RequestConfig.custom()
                    .setConnectTimeout(Timeout.ofMilliseconds(5000L))
                    .setConnectionRequestTimeout(Timeout.ofMilliseconds(5000L))
                    .setResponseTimeout(Timeout.ofMilliseconds(5000L))
                    .build();
            httpPost.setConfig(config);

            //4.提交参数发送请求
            List<BasicNameValuePair> paramsList = new ArrayList<>();
            for (String key : params.keySet()) {
                paramsList.add(new BasicNameValuePair(key, params.get(key)));
            }
            UrlEncodedFormEntity urlEncodedFormEntity = new UrlEncodedFormEntity(paramsList, StandardCharsets.UTF_8);
            httpPost.setEntity(urlEncodedFormEntity);

            //5.设置请求头
            for (String head : headParams.keySet()) {
                httpPost.addHeader(head, headParams.get(head));
            }

            response = httpClient.execute(httpPost);

            //5.得到响应信息
            int statusCode = response.getCode();
            //6. 判断响应信息是否正确
            if (HttpStatus.SC_OK != statusCode) {
                //结束请求并抛出异常
                httpPost.abort();
                throw new RuntimeException("HttpClient,error status code :" + statusCode);
            }
            //7. 转换成实体类
            HttpEntity entity = response.getEntity();
            if (null != entity) {
                result = EntityUtils.toString(entity, "UTF-8");
            }
            EntityUtils.consume(entity);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } finally {
            //8. 关闭所有资源连接
            if (null != response) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != httpClient) {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

    public static String doPostJson(String url, String jsonBody, Map<String, String> headParams) {
        String result = null;

        CloseableHttpClient httpClient = null;
        CloseableHttpResponse response = null;
        try {
            //1. 获取httpclient对象
            httpClient = HttpClients.createDefault();

            //2. 创建post请求
            HttpPost httpPost = new HttpPost(url);

            //3.设置请求和传输超时时间
            RequestConfig config = RequestConfig.custom()
                    .setConnectTimeout(Timeout.ofMilliseconds(5000L))
                    .setConnectionRequestTimeout(Timeout.ofMilliseconds(5000L))
                    .setResponseTimeout(Timeout.ofMilliseconds(5000L))
                    .build();
            httpPost.setConfig(config);

            //4.提交参数发送请求
            httpPost.setEntity(new StringEntity(jsonBody, ContentType.APPLICATION_JSON));

            //5.设置请求头
            if (headParams != null) {
                for (String head : headParams.keySet()) {
                    httpPost.addHeader(head, headParams.get(head));
                }
            }

            response = httpClient.execute(httpPost);

            //5.得到响应信息
            int statusCode = response.getCode();
            //6. 判断响应信息是否正确
            if (HttpStatus.SC_OK != statusCode) {
                //结束请求并抛出异常
                httpPost.abort();
                throw new RuntimeException("HttpClient,error status code :" + statusCode);
            }
            //7. 转换成实体类
            HttpEntity entity = response.getEntity();
            if (null != entity) {
                result = EntityUtils.toString(entity, "UTF-8");
            }
            EntityUtils.consume(entity);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } finally {
            //8. 关闭所有资源连接
            if (null != response) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != httpClient) {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
}

package com.fxjd.info.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPUtils {

    public static boolean isReachable(String ip) {

        try {
            InetAddress localHost = InetAddress.getByName(ip);
            return localHost.isReachable(50);
        } catch (Exception e) {

        }
        return false;
    }

    public static boolean isPing(String ip) {
        //.debug("ip地址为：" + ip);
        if (ip == null) {
            return false;
        }
        BufferedReader in = null;
        try {
            Process pro = Runtime.getRuntime().exec("ping " + ip + " -n 5 -w 5000");
            //GB2312  解决InputStreamReader乱码问题
            in = new BufferedReader(new InputStreamReader(pro.getInputStream(), "GB2312"));
            //逐行检查输出，计算类似出现=23ms TTL=62字样的次数
            int connectedCount = 0;
            String line = null;
            while ((line = in.readLine()) != null) {
                //log.info(line);
                connectedCount += getCheckResult(line);// 如果出现类似=23ms TTL=62这样的字样,出现的次数=测试次数则返回真
            }
            return connectedCount == 5;
        } catch (Exception ex) {
            ex.printStackTrace();   // 出现异常则返回假
            return false;
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //若line含有=18ms TTL=16字样,说明已经ping通,返回1,否則返回0.
    private static int getCheckResult(String line) {  // System.out.println("控制台输出的结果为:"+line);
        Pattern pattern = Pattern.compile("(\\d+ms)(\\s+)(TTL=\\d+)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            return 1;
        }
        return 0;
    }
}

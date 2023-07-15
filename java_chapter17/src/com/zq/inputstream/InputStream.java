package com.zq.inputstream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @className: com.zq.inputstream.InputStream
 * @description:TODO
 * @author: zhaoqing
 * @create: 2023-06-06 18:05
 */

@SuppressWarnings("all")
public class InputStream {
    public static void main(String[] args) {

    }

    @Test
    public void redFile01() throws Exception {
        String filePath = "E:\\hello.txt";
        int readData = 0;
        //全局变量
        FileInputStream fileInputStream = null;
        try {
            //创建FileInputStream 对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileInputStream.close();

        }
    }


    @Test
    public void redFile02() throws Exception {
        String filePath = "E:\\hello.txt";
        byte[] buf = new byte[8];
        int readlen=0;
        //全局变量
        FileInputStream fileInputStream = null;
        try {
            //创建FileInputStream 对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);
            while ((readlen = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf,0,readlen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileInputStream.close();

        }
    }

}

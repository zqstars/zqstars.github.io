package com.zq.outputstream;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @className: com.zq.outputstream.FileOutPutSteram01
 * @description:TODO
 * @author: zhaoqing
 * @create: 2023-06-29 12:26
 */

@SuppressWarnings("all")
public class FileOutPutSteram01 {
    public static void main(String[] args) {

    }
    @Test
    public void writeFile (){
        String filepath = "e:\\a.txt";
        FileOutputStream fileOutputStream = null;
        try {
            //1、new FileOutputStream(filepath) 创建方式，当写入内容时，会覆盖原来的内容
            //2、new FileOutputStream(filepath ,true) 创建方式，当写入内容时，内容会追加到文件的后面
            fileOutputStream = new FileOutputStream(filepath ,true);
            //写入一个字节
            //fileOutputStream.write('Z');
            //写入一个字符串
            String str = "zq,word!";
            //str.getBytes()可以把字符串 ——》字节数组
            //fileOutputStream.write(str.getBytes());
            fileOutputStream.write(str.getBytes(),0,str.length());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

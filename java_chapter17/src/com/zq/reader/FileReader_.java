package com.zq.reader;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

/**
 * @className: com.zq.reader.FileReader
 * @description:TODO
 * @author: zhaoqing
 * @create: 2023-06-29 16:06
 */

@SuppressWarnings("all")
public class FileReader_ {
    public static void main(String[] args) {
        String filePath = "e:\\zq.txt";
        FileReader fileReader = null;
        int data = 0;
        try {
            fileReader = new FileReader(filePath);
            //循环读取 使用read 单个字符读取
            while ((data = fileReader.read()) != -1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader !=null ){
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    @Test
    public void readFile01(){
        System.out.println("======readFile01======");
        String filePath = "e:\\zq.txt";
        FileReader fileReader = null;
        int readLen = 0;
        char[] buf = new char[8];
        try {
            fileReader = new FileReader(filePath);
            while ((readLen = fileReader.read(buf)) != -1){
                System.out.print(new java.lang.String(buf,0,readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader !=null ){
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

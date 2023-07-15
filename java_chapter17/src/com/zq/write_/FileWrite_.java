package com.zq.write_;


import java.io.FileWriter;
import java.io.IOException;

/**
 * @className: com.zq.write_.FileWrite
 * @description:TODO
 * @author: zhaoqing
 * @create: 2023-06-29 17:39
 */

@SuppressWarnings("all")
public class FileWrite_ {
    public static void main(String[] args) {

        String filePath="e:\\note.txt";
        FileWriter fileWriter = null;
        char[] chars={'a','b','c'};
        try {
            fileWriter = new FileWriter(filePath);
            //write(int)写入单个字符
            fileWriter.write('Z');
            //write（char[]）写入指定数组
            fileWriter.write(chars);
            //write(cahr[],off,len):写入指定数组的指定部分
            fileWriter.write("赵卿你好".toCharArray(),0,2);
            //write(string):写入整个字符串
            fileWriter.write(" 工作在北京~");
            //wirte(String,off,len):写入字符串的指定部分
            fileWriter.write("上海天津",0,2);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //对应的FileWriter 一定要关闭流，或者flush才能真正的把数据写入到文件
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("程序结束~");
        }


    }
}

package com.zq.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @className: com.zq.outputstream.FileCopy
 * @description:TODO
 * @author: zhaoqing
 * @create: 2023-06-29 12:59
 */

@SuppressWarnings("all")
public class FileCopy {
    public static void main(String[] args) {
        String srcFilePath = "e:\\guaishou.jpeg";
        String copyFilePath = "e:\\guaishou1.jpeg";

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;


        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(copyFilePath);
            //定义一个字节数组提高读取效果
            byte[] buf=new byte[1024];
            int readLen = 0;
            while ((readLen=fileInputStream.read(buf)) !=-1){
                //读取到后，就写入文件 通过fileOutputStream
                //即一边读一边写
                fileOutputStream.write(buf,0,readLen);//一定要是这个方法
            }
            System.out.println("拷贝完成");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //关闭输入输出流，释放资源
                if (fileInputStream !=null){
                    fileInputStream.close();
                }
                if (fileOutputStream !=null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

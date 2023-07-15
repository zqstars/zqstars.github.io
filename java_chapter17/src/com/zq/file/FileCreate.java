package com.zq.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @className: com.zq.file.FileCreate
 * @description:TODO
 * @author: zhaoqing
 * @create: 2023-06-06 16:17
 */

@SuppressWarnings("all")
public class FileCreate {
    public static void main(String[] args) {

    }
    //方式一 new File(String pathname)
    @Test
    public void create01(){
        String filePath = "E:\\news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //方式二 new File(File parent,String child) 根据父目录文件+子路径构建
    @Test
    public void create02(){
        File parentFile=new File("E:\\");
        String fileName="news2.txt";
        //这里的file对象，在java程序中，只是一个对象
        //只有执行了createNewFile 方法，才会真正的 在磁盘创建该文件
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//方式三  new File(String parent, String child) 根据父目录+子路径构建
    @Test
    public void create03(){
        String parentPath="E:\\";
        String fileNmae="news3.txt";
        File file = new File(parentPath, fileNmae);

        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

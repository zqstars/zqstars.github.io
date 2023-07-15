package com.zq.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @className: com.zq.file.FileInformation
 * @description:TODO
 * @author: zhaoqing
 * @create: 2023-06-06 16:39
 */

@SuppressWarnings("all")
public class FileInformation {
    public static void main(String[] args) {

    }
    //获取文件信息
    @Test
    public void info(){
        //先创建文件对象
        File file = new File("E:\\news1.txt");
        //调用相应的方法，得到对应信息
        System.out.println("文件名字=" + file.getName());
        System.out.println("绝对路径=" + file.getAbsolutePath());
        System.out.println("文件父级目录="+ file.getParent());
        System.out.println("文件大小（字节）=" + file.length());
        System.out.println("文件是否存在=" + file.exists());
        System.out.println("是不是一个文件=" + file.isFile());
        System.out.println("是不是一个目录=" + file.isDirectory());
    }
}

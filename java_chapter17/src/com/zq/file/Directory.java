package com.zq.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @className: com.zq.file.Directory
 * @description:TODO
 * @author: zhaoqing
 * @create: 2023-06-06 16:50
 */

@SuppressWarnings("all")
public class Directory {
    public static void main(String[] args) {

    }
    //判断E:\\news1.txt 是否存在，如果存在就删除
    @Test
    public void m1(){
        String filePath = "E:\\news1.txt";
        File file = new File(filePath);
        if(file.exists()){
            if(file.delete()){
                System.out.println(filePath + "删除成功");
            }else {
                System.out.println(filePath + "删除失败");
            }
        }else {
            System.out.println("该文件不存在");
        }
    }
    //判断 E:demo2是否存在，存在就删除，否则提示不存在
    //这里我们需要体会到，在java编程中，目录也被当作文件
    @Test
    public void m2(){
        String filePath = "E:\\demo02";
        File file = new File(filePath);
        if(file.exists()){
            if(file.delete()){
                System.out.println(filePath + "删除成功");
            }else {
                System.out.println(filePath + "删除失败");
            }
        }else {
            System.out.println("该目录不存在");
        }
    }

    //判断E:\\demo\\a\\b\\c目录是否存在，如果存在就提示已经存在，否则就创建
    @Test
    public void m3(){
        String filePath="E:\\demo\\a\\b\\c";
        File file = new File(filePath);
        if (file.exists()){
            System.out.println("存在此目录");
        }else {
            if (file.mkdirs()){//创建以及目录使用mkdir(),创建多级目录使用mkdirs（）
                System.out.println("创建成功...");
            }else {
                System.out.println("创建失败...");
            }
        }
    }
}

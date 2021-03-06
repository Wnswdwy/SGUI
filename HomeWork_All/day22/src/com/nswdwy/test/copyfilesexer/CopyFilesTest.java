package com.nswdwy.test.copyfilesexer;

import java.io.*;

/*
 * @author yycstart
 * @create 2020-08-19 20:59
*/

public class CopyFilesTest {
    public static void main(String[] args) {
        File temfile = new File("D:/a");
        temfile.mkdir();

        File file1 = new File("C:/Pragram Files");
        File file2 = new File(temfile,file1.getName());
        copyDir(file1,file2);
    }

    public static void copyDir(File file1 , File file2){
        file2.mkdir();//先把目标目录创建出来
        File[] files = file1.listFiles();
        if(files == null){
            System.out.println(file1 + "不允许访问！！");
            return;
        }
        for (int i = 0; i < files.length; i++) {
            File target = new File(file2.getAbsolutePath() +
                    "\\" + files[i].getName());
            if(files[i].isFile()){
                //直接复制文件
                copyFile(files[i],target);
            }else{
                //如果是目录，直接将子目录递归到目标的子目录中
                copyDir(files[i],target);
            }
        }
    }
    public static void copyFile(File file1, File file2){
        System.out.println("复制文件:" + file1 + "到" + file2);
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);
            byte[] bytes = new byte[8192];
            int count;
            while((count = fis.read(bytes)) != -1){
                fos.write(count);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}

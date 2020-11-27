package com.nswdwy.test02;

import java.io.*;

/**
 * @author yycstart
 * @create 2020-08-18 19:59
 * 把C:/Program Files 复制为 D:/a/Program Files
 */
public class Test02 {

    public static void main(String[] args) {
        String srcPath = "C:\\Program Files";
        String destPath = "D:\\aa\\Program Files";
        copyDir(srcPath, destPath);
    }

    /**
     * 复制文件夹
     * @param srcDirPath
     * @param destDirPath
     */
    public static void copyDir(String srcDirPath, String destDirPath) {
        File srcDir = new File(srcDirPath);
        if (!srcDir.exists() || !srcDir.isDirectory()) {
            throw new IllegalArgumentException("参数错误");
        }
        File destDir = new File(destDirPath);
        if (!destDir.exists()) {
            destDir.mkdirs();
        }
        File[] files = srcDir.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                copyFile(f, new File(destDirPath, f.getName()));
            } else if (f.isDirectory()) {
                copyDir(srcDirPath + File.separator + f.getName(),
                        destDirPath + File.separator + f.getName());
            }
        }
    }

    /**
     * 复制文件
     * @param srcFile
     * @param destFile
     */
    public static void copyFile(File srcFile, File destFile) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        byte[] b = new byte[1024];

        try {
            bis = new BufferedInputStream(new FileInputStream(srcFile));
            bos = new BufferedOutputStream(new FileOutputStream(destFile));
            int len;
            while ((len = bis.read(b)) > -1) {
                bos.write(b, 0, len);
            }
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

package Chapter13_IO;


import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Date;

/**演示File类的常用方法
 * @ author:Tony
 * @ date 2022/6/24 9:47
 * @ version 1.0
 * @ description:TODO
 */
public class FileDemo {


    public static void main(String[] args) throws IOException {
        JFileChooser fileChooser = new JFileChooser(new File(".")); //设置文件对话框打开时的根目录
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);   //显示选择文件的对话框
        fileChooser.showOpenDialog(null);
        String pathName = fileChooser.getName();   //获得用户选择的文件
        //当前工程所在的根目录
        File file = fileChooser.getSelectedFile();//获得用户选择的文件  建议使用时判断file是否为null,如果为null 表示用户点了取消
        System.out.println("文件/文件夹是否存在:" + file.exists());
        System.out.println("是不是一个文件:" + file.exists());
        BasicFileAttributes basicFileAttributes = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
        System.out.println("是不是一个文件夹:" + basicFileAttributes.isDirectory());
        System.out.println("文件名/目录名:" + file.getName());
        System.out.println("绝对路径:" + file.getAbsoluteFile());
        System.out.println("路径：" + file.getPath());
        System.out.println("最后修改时间：" + new Date(basicFileAttributes.lastModifiedTime().toMillis()));
        System.out.println("是否隐藏："+ file.isHidden());
        System.out.println("是否可读：" + file.canRead());
        System.out.println("是否可写：" + file.canWrite());
        System.out.println("文件的大小，所占的空间：" + basicFileAttributes.size());
        //使用File类创建文件
//        if (!file.exists()){  //如果文件不存在，则自己创建一个
//            if (file.createNewFile())
//                System.out.println("文件创建成功");
//        }
//                if(file.exists()){
//                file.delete();  //直接删除文件，删除的时候不用判断文件是否存在，也不报异常
//                    //file.deleteonExit(); 在进程结束的时候把文件删除了，注意：如果在当前进程重新创建文件，最终也会被删除掉
//                    System.out.println("文件删除成功");
//            }
//            file.createNewFile(); //创建目录
//                System.out.println("文件重新创建成功");
//
        if (basicFileAttributes.isDirectory()){
            System.out.println(file.getAbsoluteFile() + "路径下的所有文件及文件夹");
            String[] fileNames = file.list();
            for (int i = 0; i < fileNames.length; i++) {
                System.out.println(fileNames[i]);
            }
        }



        //补充：选学
        /**
         * 我们自定义的文件名过滤器，必须实现FileFileter接口
         * @ author Tony
         * @ date 2022/6/25 11:05
         *  * @param args
         * @ return void
         */



    }
    //mkdir() 创建此抽象路径名称指定的目录（及只能创建一级的目录，且需要存在父目录中）
    //mkdirs() 创建此抽象路径指定的目录，包括所有必须但不存在的父目录 （及可以创建多级目录，无论是否存在父目录）- 多级目录时使用
        
        



}


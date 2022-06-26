package Chapter13_IO;


import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Date;

/**��ʾFile��ĳ��÷���
 * @ author:Tony
 * @ date 2022/6/24 9:47
 * @ version 1.0
 * @ description:TODO
 */
public class FileDemo {


    public static void main(String[] args) throws IOException {
        JFileChooser fileChooser = new JFileChooser(new File(".")); //�����ļ��Ի����ʱ�ĸ�Ŀ¼
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);   //��ʾѡ���ļ��ĶԻ���
        fileChooser.showOpenDialog(null);
        String pathName = fileChooser.getName();   //����û�ѡ����ļ�
        //��ǰ�������ڵĸ�Ŀ¼
        File file = fileChooser.getSelectedFile();//����û�ѡ����ļ�  ����ʹ��ʱ�ж�file�Ƿ�Ϊnull,���Ϊnull ��ʾ�û�����ȡ��
        System.out.println("�ļ�/�ļ����Ƿ����:" + file.exists());
        System.out.println("�ǲ���һ���ļ�:" + file.exists());
        BasicFileAttributes basicFileAttributes = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
        System.out.println("�ǲ���һ���ļ���:" + basicFileAttributes.isDirectory());
        System.out.println("�ļ���/Ŀ¼��:" + file.getName());
        System.out.println("����·��:" + file.getAbsoluteFile());
        System.out.println("·����" + file.getPath());
        System.out.println("����޸�ʱ�䣺" + new Date(basicFileAttributes.lastModifiedTime().toMillis()));
        System.out.println("�Ƿ����أ�"+ file.isHidden());
        System.out.println("�Ƿ�ɶ���" + file.canRead());
        System.out.println("�Ƿ��д��" + file.canWrite());
        System.out.println("�ļ��Ĵ�С����ռ�Ŀռ䣺" + basicFileAttributes.size());
        //ʹ��File�ഴ���ļ�
//        if (!file.exists()){  //����ļ������ڣ����Լ�����һ��
//            if (file.createNewFile())
//                System.out.println("�ļ������ɹ�");
//        }
//                if(file.exists()){
//                file.delete();  //ֱ��ɾ���ļ���ɾ����ʱ�����ж��ļ��Ƿ���ڣ�Ҳ�����쳣
//                    //file.deleteonExit(); �ڽ��̽�����ʱ����ļ�ɾ���ˣ�ע�⣺����ڵ�ǰ�������´����ļ�������Ҳ�ᱻɾ����
//                    System.out.println("�ļ�ɾ���ɹ�");
//            }
//            file.createNewFile(); //����Ŀ¼
//                System.out.println("�ļ����´����ɹ�");
//
        if (basicFileAttributes.isDirectory()){
            System.out.println(file.getAbsoluteFile() + "·���µ������ļ����ļ���");
            String[] fileNames = file.list();
            for (int i = 0; i < fileNames.length; i++) {
                System.out.println(fileNames[i]);
            }
        }



        //���䣺ѡѧ
        /**
         * �����Զ�����ļ���������������ʵ��FileFileter�ӿ�
         * @ author Tony
         * @ date 2022/6/25 11:05
         *  * @param args
         * @ return void
         */



    }
    //mkdir() �����˳���·������ָ����Ŀ¼����ֻ�ܴ���һ����Ŀ¼������Ҫ���ڸ�Ŀ¼�У�
    //mkdirs() �����˳���·��ָ����Ŀ¼���������б��뵫�����ڵĸ�Ŀ¼ �������Դ����༶Ŀ¼�������Ƿ���ڸ�Ŀ¼��- �༶Ŀ¼ʱʹ��
        
        



}


package Chapter13_IO;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @ author:Tony
 * @ date 2022/6/27 10:13
 * @ version 1.0
 * @ description:TODO
 */
 class DirFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        //��������ֻ����ʾgitΪ��׺���ļ������������ĺ�׺
        return !name.endsWith(".git") && !name.endsWith(".project");
    }
}

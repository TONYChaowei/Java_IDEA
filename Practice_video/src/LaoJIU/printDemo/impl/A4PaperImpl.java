package LaoJIU.printDemo.impl;

import LaoJIU.printDemo.Iface.Paper;

/**ֽ�Ŵ�С��ʵ�����ʵ����
 * @ author:Tony
 * @ date 2022/6/13 16:07
 * @ version 1.0
 * @ description:TODO
 */
public class A4PaperImpl implements Paper {
    @Override
    public String getSize() {
        return "A4";
    }
}

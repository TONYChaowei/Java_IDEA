package LaoJIU.printDemo.impl;

import LaoJIU.printDemo.Iface.Paper;

/**纸张大小的实现类的实现类
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

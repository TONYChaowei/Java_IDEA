package LaoJIU.printDemo.impl;

import LaoJIU.printDemo.Iface.Paper;

/**纸张大小的实现类
 * @ author:Tony
 * @ date 2022/6/13 16:15
 * @ version 1.0
 * @ description:TODO
 */
public class B5PaperImpl implements Paper {
    @Override
    public String getSize() {
        return "B5纸张";
    }
}

package LaoJIU.printDemo.impl;

import LaoJIU.printDemo.Iface.inkBox;

/**彩色墨盒的实现类
 * @ author:Tony
 * @ date 2022/6/13 16:00
 * @ version 1.0
 * @ description:TODO
 */
public class ColorlnkBoxImpl implements inkBox {
    @Override
    public String getColor() {
        return "红色";
    }
}

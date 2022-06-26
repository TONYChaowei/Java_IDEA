/** 单例模式（只能获取唯一的实例） -套路，模板
 * @ author:Tony
 * @ date 2022/5/23 15:30
 * @ version 1.0
 * @ description:TODO
 */
public class SingleMode {
    //用来保存唯一的本类实例
    private static SingleMode me = null;
    public int count = 0;

    private SingleMode() {
        count++;
    }
    //获得本类中唯一的一个实例 -- 单例的核心
    public static SingleMode getInstance() {
        if (me == null) {
            me = new SingleMode();

        }
        return me;
    }
}
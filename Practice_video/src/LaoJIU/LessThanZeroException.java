package LaoJIU;

/** 自定义异常 - 小于0时触发
 * @ author:Tony
 * @ date 2022/6/22 12:50
 * @ version 1.0
 * @ description:TODO
 */
public class LessThanZeroException extends Exception {
    //重写父类的两个方法即可
    private int value;
    public lessThanZeroException(){
        super("数字不能小于零！");
    }
    public LessThanZeroException(int value){
        super("输入的数字为" + value + "不能小于零！");
    }
}

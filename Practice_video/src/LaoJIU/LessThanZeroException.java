package LaoJIU;

/** �Զ����쳣 - С��0ʱ����
 * @ author:Tony
 * @ date 2022/6/22 12:50
 * @ version 1.0
 * @ description:TODO
 */
public class LessThanZeroException extends Exception {
    //��д�����������������
    private int value;
    public lessThanZeroException(){
        super("���ֲ���С���㣡");
    }
    public LessThanZeroException(int value){
        super("���������Ϊ" + value + "����С���㣡");
    }
}

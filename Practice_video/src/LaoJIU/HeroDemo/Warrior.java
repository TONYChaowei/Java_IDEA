package LaoJIU.HeroDemo;

import LaoJIU.HeroDemo.Hero;

/**战士类(子类)- 继承了Hero类
 * @ author:Tony
 * @ date 2022/5/15 17:38
 * @ version 1.0
 * @ description:TODO
 */
public class Warrior extends Hero {
    private int pysicalAttach;     //战士特有属性，物理攻击力
    public Warrior() {
        setNickname("默认战士");
        setLevel(1);
        setMaxLife(1500);
    }

    public Warrior(String nickname,int pysicalAttach) {
        setNickname(nickname);
        setPysicalAttach(pysicalAttach);
    }
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append(getLevel());
        str.append("\t");
        str.append(getNickname());
        str.append("\t");
        str.append(getMaxLife());
        str.append("\t");
        str.append(getCurrLife());
        str.append("\t");
        return str.toString();
    }
    @Override
    //重写Object类的equals方法，以便比较两个对象是否相等
    public boolean equals(Object obj) {
        //如果传入的obj对象是warrior类的实例
        if(!(obj instanceof Warrior)){
            return false;
        }
        Warrior newwarrior = (Warrior)obj;
        if (getNickname().equals(newwarrior.getNickname()) && getPysicalAttach() == newwarrior.getPysicalAttach()){
            return true;
        }
        return false;
    }

    public int getPysicalAttach() {

        return pysicalAttach;
    }

    public void setPysicalAttach(int pysicalAttach) {
        this.pysicalAttach = pysicalAttach;
    }
}

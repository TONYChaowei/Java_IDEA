package LaoJIU.HeroDemo;

import LaoJIU.HeroDemo.Hero;

/**战士类- 继承了Hero类
 * @ author:Tony
 * @ date 2022/5/15 17:38
 * @ version 1.0
 * @ description:TODO
 */
public class Warrior extends Hero {
    private int pysicalAttach;     //战士特有属性，物理攻击力
    public Warrior() {}

    public Warrior(String nickname,int pysicalAttach) {
        setNickname(nickname);
        setPysicalAttach(pysicalAttach);
    }

    public int getPysicalAttach() {
        return pysicalAttach;
    }

    public void setPysicalAttach(int pysicalAttach) {
        this.pysicalAttach = pysicalAttach;
    }
}

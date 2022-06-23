package LaoJIU;

/**英雄异常经验值
 * @ author:Tony
 * @ date 2022/6/22 11:45
 * @ version 1.0
 * @ description:TODO
 */
public class ThrowDemo {
    public static void main(String[] args) {
            Hero hero = new Hero("貂蝉");
        try {
            hero.setExp(100);
            hero.setHealth(100);
        } catch (Exception e) {
           e.printStackTrace();
            System.err.print("在设置经验值时出现异常：" + e.getMessage());
        }
        System.out.println("当前英雄的经验值" + hero.getExp());
    }


}
class Hero{
    private String name;
    private long exp;
    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    Hero(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getExp() {
        return exp;
    }

    public void setExp(long exp) throws Exception {
        if (exp >= 0){
            this.exp = exp;
        }else{
            throw new Exception("经验值不能为负数");
        }
    }
    public void rideHorse()throws LessThanZeroException{
        if (health >= 50){
            System.out.println(name + "正在快乐的骑马！");
        }else
            throw new LessThanZeroException();

    }

}

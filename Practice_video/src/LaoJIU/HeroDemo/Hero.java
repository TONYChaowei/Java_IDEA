package LaoJIU.HeroDemo;

/** 英雄类-父类
 * @ author:Tony
 * @ date 2022/5/15 17:18
 * @ version 1.0
 * @ description:TODO
 */
public class Hero {
   private String nickname;
   private int level;
   private int maxLife;
   private int currLife;

    public Hero() {
    }

    public Hero(String nickname, int level, int maxLife, int currLife) {
        this.nickname = nickname;
        this.currLife = currLife;
        this.maxLife  = maxLife;
        this.level = level;
    }
    public void move(){
        System.out.println("HERO类的movo方法");
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public int getCurrLife() {
        return currLife;
    }

    public void setCurrLife(int currLife) {
        this.currLife = currLife;
    }
}

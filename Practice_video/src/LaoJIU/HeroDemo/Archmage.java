package LaoJIU.HeroDemo;

/**
 * @ author:Tony
 * @ date 2022/5/18 16:41
 * @ version 1.0
 * @ description:TODO
 */
public class Archmage extends Hero{
     public Archmage(){
         setNickname("默认法师");
         setLevel(1);
         setMaxLife(1200);
     }
     public Archmage(String nickname){
         this();
         setNickname(nickname);
     }

    @Override
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

    public void biubiubiu(){
        System.out.println(getNickname() + "正在搓火球" );
    }
}

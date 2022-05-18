package LaoJIU.HeroDemo;

/**
 * @ author:Tony
 * @ date 2022/5/15 17:52
 * @ version 1.0
 * @ description:TODO
 */
public class HeroTest {
    public static void main(String[] args) {
            Warrior libai = new Warrior("李白",210);
            Warrior libai2 = new Warrior("李白",210);
            System.out.println(libai == libai2);
            System.out.println(libai.equals(libai2));
            Archmage 貂蝉 = new Archmage("貂蝉");
            貂蝉.biubiubiu();
             System.out.println("级别：" + 貂蝉.getLevel());
             System.out.println("最大生命值" + 貂蝉.getMaxLife());


    }
}

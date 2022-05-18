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
            System.out.println(貂蝉);



    }
}

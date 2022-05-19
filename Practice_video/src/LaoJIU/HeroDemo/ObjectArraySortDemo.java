package LaoJIU.HeroDemo;


/**
 * @ author:Tony
 * @ date 2022/5/19 14:08
 * @ version 1.0
 * @ description:TODO
 */
public class ObjectArraySortDemo {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior();
        Warrior warrior2 = new Warrior();
        Warrior warrior3 =new Warrior();
        Warrior warrior4 =new Warrior();
        Warrior warrior5 =new Warrior();
        Archmage archmage1 = new Archmage();
        Archmage archmage2 = new Archmage();
        Archmage archmage3 = new Archmage();
        Archmage archmage4 = new Archmage();
        Archmage archmage5 = new Archmage();

        Hero [] heroarray = {
                    warrior1,warrior2,warrior3,warrior4,warrior5,
                    archmage1,archmage2,archmage3,archmage4,archmage5
            };
        for (Hero hero : heroarray) {
            System.out.println(hero);
        }
    }
}

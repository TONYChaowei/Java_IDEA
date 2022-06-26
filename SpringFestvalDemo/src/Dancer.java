/** 舞者
 * @ author:Tony
 * @ date 2022/5/19 15:50
 * @ version 1.0
 * @ description:TODO
 */
public class Dancer extends Actor{
   public Dancer(String name) {
      super(name);
   }

   @Override
   public void perform() {
      System.out.println("舞者" + getName() + "正在跳最炫民族风格");
   }
}

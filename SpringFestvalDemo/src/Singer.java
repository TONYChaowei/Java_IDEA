/**歌手类
 * @ author:Tony
 * @ date 2022/5/19 15:27
 * @ version 1.0
 * @ description:TODO
 */
public class Singer extends Actor {
     private String name;

    public Singer(String name) {
          super(name);
    }

    @Override
    public void perform() {
        System.out.println("歌唱演员" + getName() + "正在表演节目《在这桃花盛开的地方》");
    }
}

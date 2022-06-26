/** 演员父类
 * @ author:Tony
 * @ date 2022/5/19 15:22
 * @ version 1.0
 * @ description:TODO
 */
public class Actor {
    private String name;

    public Actor(String name) {
        this.name = name;
    }
    public void perform(){
        System.out.println("演员" + name + "正在表演");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

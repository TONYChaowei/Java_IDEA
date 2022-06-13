package LaoJIU;


/**
* @ author: Tony
* @ data:  2022/6/9 16:18
* @ version: 1.0
* @ desription:TODO
*/
public interface Eat {
     public String name = "接口中定义的数据域";
     default public void eating(){
          System.out.println("eat接口的默认实现");
     }
}

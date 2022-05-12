/**
*@ author:Tony
*@ date 2022/5/12 16:16
*@ version 1.0
*@ description:TODO
*/
public class product {
     private String name;
     private double price;
     private String description;  //商品的描述
      private String services;
      public  product(){}                    //构造器
      public product (String name){        //带参构造器
            setName(name);
      }

      public String getServices() {
            return services;
      }

      public void setServices(String services) {
            this.services = services;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public String getDescription() {
            return description;
      }

      public void setDescription(String description) {
            this.description = description;
      }

      public double getPrice() {
            return price;
      }

      public void setPrice(double price) {
            this.price = price;
      }
}

/**
*@ author:Tony
*@ date 2022/5/12 16:16
*@ version 1.0
*@ description:TODO
*/
public class product {
     private String name;
     private double price;
     private String description;  //��Ʒ������
      private String services;
      public  product(){}                    //������
      public product (String name){        //���ι�����
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

package BookManage;/**
*@ author:Tony
*@ date 2022/5/11 18:25
*@ version 1.0
*@ description:TODO
*/
public class TestMain {
      public static void main(String[] args){
            Book book = new Book("计算机就该笑着学","123-234",55.55,6);
            //实例化书籍对象
            BookManage bookManage = new BookManage();
            bookManage.sellBook(book);
            System.out.println(book.getCount());

      }
}

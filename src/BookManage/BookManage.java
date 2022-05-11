package BookManage;
/**
* @ author: Tony
* @ data:  2022/5/11 18:03
* @ version: 1.0
* @ description:TODO
*/
public class BookManage {
    
    /**
     * @ description:如果销售成功，返回销售的数量；销售失败，返回-1
     * @ param:book要销售图书的对象
     * @ return: 如果销售成功，则返回销售的数量，销售失败，返回-1
    */
    public int sellBook(Book book){
        //1.判断图书的库存是否大于1
        //2.图书的的库存-1
        //3.返回销售的数量
        if(!(book.getCount() > 1)){
            return -1;
        }
        book.setCount(book.getCount() - 1);
        return 1;
    }

}

package BookManage;

/**
*@ author:Tony
*@ date 2022/5/11 17:30
*@ version 1.0
*@ description:图书管理系统
*/
public class Book {
    private String isbn;
    private double price;
    private int count;   //当前图书对象的库存
    private String name;
    private boolean borrow;  //当前图书是否可见

    public boolean isBorrow() {
        return borrow;
    }

    public void setBorrow(boolean borrow) {
        this.borrow = borrow;
    }

    public Book(){}    //构造器
    public Book(String name){
        this.setName(name);
    }
    public Book(String name,String isbn,double price,int count){
        setName(name);
        setIsbn(isbn);
        setPrice(price);
        setCount(count);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsbn() {
        return  isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}


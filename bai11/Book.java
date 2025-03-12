package bai11;

import java.util.Scanner;

public class Book {
    private int bookId;
    private String bookName;
    private int importPrice;
    private int exportPrice;
    private String title;
    private String author;
    private int interest;
    private int year;

    public Book() {}

    public Book(int bookId, String bookName, int importPrice, int exportPrice, String title, String author, int interest, int year) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.title = title;
        this.author = author;
        this.interest = interest;
        this.year = year;

    }
    // Getters and Setters
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(int importPrice) {
        this.importPrice = importPrice;
        this.interest = calInterest(this.importPrice, this.exportPrice);
    }

    public int getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(int exportPrice) {
        this.exportPrice = exportPrice;
        this.interest = calInterest(this.importPrice, this.exportPrice);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getInterest() {
        return interest;
    }
    public void setInterest(int i) {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void inputDataBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mã sách: ");
        setBookId(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập vào tên sách: ");
        setBookName(sc.nextLine());
        System.out.println("Giá nhập sách: ");
        setImportPrice(sc.nextInt());
        System.out.println("Giá bán ra: ");
        setExportPrice(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập tiêu đề sách: ");
        setTitle(sc.nextLine());
        System.out.println("Nhập tên tác giả: ");
        setAuthor(sc.nextLine());
        System.out.println("Năm xuất bản: ");
        setYear(sc.nextInt());
    }

    public void displayBook() {
        System.out.println("Mã sách: " + getBookId());
        System.out.println("Tên sách: " + getBookName());
        System.out.println("Giá nhập vào: " + getImportPrice());
        System.out.println("Giá bán ra: " + getExportPrice());
        System.out.println("Tiêu đề sách: " + getTitle());
        System.out.println("Tác giả: " + getAuthor());
        System.out.println("Lợi nhuận: " + getInterest());
        System.out.println("Năm xuất bản: " + getYear());
    }
    public int calInterest(int importPrice, int exportPrice) {
        return  exportPrice - importPrice;
    }


}


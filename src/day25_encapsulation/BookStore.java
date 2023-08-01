package day25_encapsulation;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

class Main {
	public static void main(String args[]) throws IOException, NumberFormatException {
		String bookname;
		int isbnnumber;
		String publishername;
		float totalprice;
		int customersnumber;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Name of the book");
		bookname = br.readLine();
		System.out.println("ISBN Number");
		isbnnumber = Integer.parseInt(br.readLine());
		System.out.println("Publisher name");
		publishername = br.readLine();
		System.out.println("Price of a book");
		totalprice = Float.parseFloat(br.readLine());
		System.out.println("Number of Customers");
		customersnumber = Integer.parseInt(br.readLine());
		Customer[] c = new Customer[customersnumber];
		Book bb = new Book(bookname, isbnnumber, publishername, totalprice, customersnumber);
		for (int i = 0; i < customersnumber; i++) {
			System.out.println("Details for Customer " + (i + 1));
			System.out.println("Name");
			String name = br.readLine();
			System.out.println("Type of Customer (S or I or F)");
			char Customertype = (char) br.readLine().charAt(0);
			c[i] = new Customer(name, Customertype);
		}
		System.out.println(bb.toString());
		System.out.println("Total Amount Received :" + bb.Totalamount(c));
	}
}

class Book {
	private String bookname;
	private int isbnnumber;
	private String publishername;
	private float totalprice;
	private int n;

	public Book(String bookname, int isbnnumber, String publishername, float totalprice, int n) {
		this.bookname = bookname;
		this.isbnnumber = isbnnumber;
		this.publishername = publishername;
		this.totalprice = totalprice;
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public int getIsbnnumber() {
		return isbnnumber;
	}

	public void setIsbnnumber(int isbnnumber) {
		this.isbnnumber = isbnnumber;
	}

	public String getPublishername() {
		return publishername;
	}

	public void setPublishername(String publishername) {
		this.publishername = publishername;
	}

	public float getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(float totalprice) {
		this.totalprice = totalprice;
	}

	public float Totalamount(Customer[] c) {
		float price1 = 0, price1_1 = 0, price2 = 0, price2_2 = 0, price3 = 0, price3_3 = 0;
		int i;
		float total = 0;
		for (i = 0; i < getN(); i++) {
			if (c[i].getCustomertype() == 'S') {
				price1 = getTotalprice() - (getTotalprice() * ((float) 50 / (float) 100));
				price1_1 = price1_1 + price1;
			}
			if (c[i].getCustomertype() == 'F') {
				price2 = (getTotalprice()) - (getTotalprice() * ((float) 75 / (float) 100));
				price2_2 = price2_2 + price2;
			}
			if (c[i].getCustomertype() == 'I') {
				price3 = (getTotalprice()) - (getTotalprice() * ((float) 90 / (float) 100));
				price3_3 = price3_3 + price3;
			}
			total = price1_1 + price2_2 + price3_3;
		}
		return total;
	}

	public String toString() {
		return "Book Details are \nName of the book : " + getBookname() + "\nISBN Number of the book : "
				+ getIsbnnumber() + "\nPublisher name of the book : " + getPublishername() + "\nNumber of Customers : "
				+ getN() + "\nPrice of a book : " + getTotalprice();
	}
}

class Customer {
	private String customername;
	private char customertype;

	public Customer(String customername, char customertype) {
		this.customername = customername;
		this.customertype = customertype;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public char getCustomertype() {
		return customertype;
	}

	public void setCustomertype(char customertype) {
		this.customertype = customertype;
	}
}

//
//Input (stdin)
//OOPS
//14523
//Balagurusamy
//500
//3
//Ram
//S
//Sheela
//F
//Ragu
//F
//
//Output (stdout)
//Name of the book
//ISBN Number
//Publisher name
//Price of a book
//Number of Customers
//Details for Customer 1
//Name
//Type of Customer (S or I or F)
//Details for Customer 2
//Name
//Type of Customer (S or I or F)
//Details for Customer 3
//Name
//Type of Customer (S or I or F)
//Book Details are
//Name of the book :  OOPS
//ISBN Number of the book : 14523
//Publisher name of the book : Balagurusamy
//Number of Customers : 3
//Price of a book : 500.0
//Total Amount Received :500.0
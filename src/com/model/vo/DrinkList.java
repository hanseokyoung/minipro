package com.model.vo;

/*Option 클래스를 상속받는 DrinkList클래스*/
public class DrinkList extends Option {

	String name; //음료 이름
	int price; //가격
	
	public DrinkList() { }

	public DrinkList(String name, int price, boolean hot, int size, int cnt, boolean take, int[] syrup, int shot, boolean milk, boolean cream) {
		super(hot, size, cnt, take, syrup, shot, milk, cream);
		this.name = name;
		this.price = price;
	}

	/*getter & setter*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "DrinkList [name=" + name + ", price=" + price + super.toString() + "]";
	}
	
	
	
	
	
}

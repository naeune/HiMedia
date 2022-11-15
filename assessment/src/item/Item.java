package item;

public class Item {
	private Long id;
	private String itemName;
	private Integer price;
	private int quantity;
	
	public String getItemName() {
		return itemName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Item(String itemName, Integer price, int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void showInfo() {
		System.out.println(id + "\t" + itemName + "\t" + price + "\t" + quantity);
	}
}

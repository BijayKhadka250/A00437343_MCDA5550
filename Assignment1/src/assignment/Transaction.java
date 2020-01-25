package assignment;

public class Transaction {

	private int id;
	private int quantity;
	private String expDate;
	private String createdBy;
	private double unitPrice;
	private long createdOn;
	private double totalPrice;
	private String nameOnCard;
	private String cardNumber;
	private String creditCardType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getTotalPrice() {
		return unitPrice*quantity;
	}

	public void setTotalPrice() {
		this.totalPrice = unitPrice*quantity;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public long getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(long createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", quantity=" + quantity + ", expDate=" + expDate + ", createdBy=" + createdBy
				+ ", unitPrice=" + unitPrice + ", totalPrice=" + totalPrice
				+ ", nameOnCard=" + nameOnCard + ", cardNumber=" + cardNumber + ", creditCardType=" + creditCardType
				+ "]";
	}
}

package waa.project.domain;

public class OrderLine {
	private TestProduct testProduct;
	private int quantity;
	
	public TestProduct getTestProduct() {
		return testProduct;
	}
	public void setTestProduct(TestProduct testProduct) {
		this.testProduct = testProduct;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		
	}
		
}

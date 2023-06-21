package com.techlabs.ShopingCart;

public class LineItem {
		private int id;
		private int quantity;
		private int unitPrice;
		private Product product;
		
		public LineItem(int id, int quantity,int unitPrice, Product product) {
			super();
			this.id = id;
			this.quantity = quantity;
			this.unitPrice=unitPrice;
			this.product = product;
		}
		
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
		public Product getProduct() {
			return product;
		}
		public void setProduct(Product product) {
			this.product = product;
		}
		
		public double CalculateLineItemCost() {
					return quantity*unitPrice; 	
		}
		
		
		@Override
		public String toString() {
			return "LineItem [id=" + id + ", quantity=" + quantity + ", product=" + product + "]";
		}
		
}

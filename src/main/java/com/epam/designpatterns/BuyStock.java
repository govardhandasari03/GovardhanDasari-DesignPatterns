package com.epam.designpatterns;

public class BuyStock implements Order {
	   private Stock abcStock;

	   public BuyStock(Stock abcStock){
	      this.abcStock = abcStock;
	   }

	   public void execute() {
	      abcStock.buy();
	   }
	}
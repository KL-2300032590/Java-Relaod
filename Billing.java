package LLM;

//Interface for Discount Cards
interface DiscountCard {
 double applyDiscount(double amount);
}

//Concrete implementation for Gold Card
class GoldCard implements DiscountCard {
 private static final double DISCOUNT_PERCENTAGE = 0.20;

 @Override
 public double applyDiscount(double amount) {
     return amount - (amount * DISCOUNT_PERCENTAGE);
 }
}

//Concrete implementation for Silver Card
class SilverCard implements DiscountCard {
 private static final double DISCOUNT_PERCENTAGE = 0.10;

 @Override
 public double applyDiscount(double amount) {
     return amount - (amount * DISCOUNT_PERCENTAGE);
 }
}

//Class for managing billing
class Billingaamount{
 private DiscountCard discountCard;

 public Billingaamount(DiscountCard discountCard) {
     this.discountCard = discountCard;
 }

 public double calculateTotalCost(double purchaseAmount) {
     return discountCard.applyDiscount(purchaseAmount);
 }
}

public class Billing {
 public static void main(String[] args) {
     // Create a Gold Card and a Silver Card
     DiscountCard goldCard = new GoldCard();
     DiscountCard silverCard = new SilverCard();

     // Calculate total cost for first purchase
     double goldCardFirstPurchase = goldCard.applyDiscount(500);
     double silverCardFirstPurchase = silverCard.applyDiscount(300);

     System.out.println("Total cost for first purchase with Gold Card: $" + goldCardFirstPurchase);
     System.out.println("Total cost for first purchase with Silver Card: $" + silverCardFirstPurchase);
 }
}

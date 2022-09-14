package lab2;

import java.util.List;

public class AmericaShopping implements Shopping{

    int baseDeliveryFee=15;
    double dutyTax= 1.01;
    double customsTax = 0.0075;
    double shippingFee=0;



    @Override
    public double calculatePrice(List<Product> products) {

        for(int i =0; i < products.size(); i++){

            shippingFee += products.get(i).getPrice() + (products.get(i).getPrice()*customsTax);
            if(products.get(i).getSize()== Size.XL){
                shippingFee += 10;
            }
            else{
                shippingFee += 5;
            }

        }

        shippingFee *=dutyTax;
        shippingFee += baseDeliveryFee;
        return shippingFee;


    }

    @Override
    public Currency getCurrency() {
        return Currency.USD;
    }
}

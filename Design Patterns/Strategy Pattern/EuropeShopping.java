package lab2;

import java.util.List;

public class EuropeShopping implements Shopping {

    int base_delivery_fee=11;
    double customsDuty= 1.015;
    double shippingFee=0;



    @Override
    public double calculatePrice(List<Product> products) {
        for(int i =0; i < products.size(); i++){

            if(products.get(i).getSize()== Size.XL){
                shippingFee += products.get(i).getPrice() + 10;
            }
            else{
                shippingFee += products.get(i).getPrice();
            }

        }
        shippingFee *=customsDuty;
        shippingFee += base_delivery_fee;
        return shippingFee;
    }

    @Override
    public Currency getCurrency() {
        return Currency.EUR;
    }
}

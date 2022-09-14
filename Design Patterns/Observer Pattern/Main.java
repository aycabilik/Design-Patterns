package lab3;

public class Main {
    public static void main(String[] args) {

        Celebrity karsuDonmez = new Celebrity("Karsu Donmez");
        Celebrity feritOdman = new Celebrity("Ferit Odman");
        Fans deniz = new Fans("Deniz");
        Fans robert = new Fans("Robert");
        Fans steven = new Fans("Steven");
        Fans jeff =  new Fans("Jeff");
        Fans sandra = new Fans("Sandra");
        Fans olivia =  new Fans("Olivia");

        karsuDonmez.registerObserver(deniz);
        karsuDonmez.registerObserver(robert);
        karsuDonmez.registerObserver(steven);
        feritOdman.registerObserver(jeff);
        feritOdman.registerObserver(sandra);
        feritOdman.registerObserver(olivia);




        String a= ":) Which artist will be guest in my room? \nSometimes I will sing songs with their valuable guest and sometimes I will give my guest pleasant moments with the little games I have prepared!";

        karsuDonmez.chatting(a);

        deniz.update("Karsu Donmez", a);
        robert.update("Karsu Donmez", a);
        steven.update("Karsu Donmez", a);

        String b= "It rarely happens to me, but I was hittin' it hard tonight. !!";

        feritOdman.chatting(b);

        jeff.update("Ferit Odman", b);
        sandra.update("Ferit Odman", b);
        olivia.update("Ferit Odman", b);

        karsuDonmez.removeObserver(jeff);

        String c= "WHAAA I am the new FOOD COLUMNIST of @andcgram Magazine! Thank you @chantaljanzen!! I am soo soo soo HAPPY! my first dish is #Ceviche..!!";

        karsuDonmez.chatting(c);

        deniz.update("Karsu Donmez", c);
        robert.update("Karsu Donmez", c);
        steven.update("Karsu Donmez", c);


    }






}

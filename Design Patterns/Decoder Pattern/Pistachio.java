package lab4;

class Pistachio extends Nuts {


        public Pistachio(Waffle waffle) {
                super(waffle);
                this.price = 1.00;
        }

public String getDescription() {
        return waffle.getDescription() + ", Pistachio ";
        }
        }

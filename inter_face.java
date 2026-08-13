interface Vehicle{
    
    void ChangeGear(int a);
    void SpeedUp(int a);
    void applyBrakes(int a);
}

class Bicycle implements Vehicle{
    int speed;
    int gear;

    @Override
    public void ChangeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void SpeedUp(int increment) {
        speed += increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }
    public void printStates() {
        System.out.println("Speed: " + speed
         + ", Gear: " + gear);
    }
}
class Car implements Vehicle{


    int speed;
    int gear;

    @Override
    public void ChangeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void SpeedUp(int increment) {
        speed += increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("Speed: " + speed
         + ", Gear: " + gear);
    }
}
class inter_face{
    public static void main (String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.ChangeGear(2);
        bicycle.SpeedUp(3);
        bicycle.applyBrakes(1);

        System.out.println("Bicycle present state :");
        bicycle.printStates();

        Car car = new Car();
        car.ChangeGear(1);
        car.SpeedUp(4);
        car.applyBrakes(3);

        System.out.println("Car present state :");
        car.printStates();


    }
}

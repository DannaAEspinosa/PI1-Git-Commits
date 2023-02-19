public class Car {

    private boolean wheels;
    private int cylinders;

    public Car(boolean wheels, int cylinders) {
        this.wheels = wheels;
        this.cylinders = cylinders;
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> auxcarlos

    public boolean isWheels() {
        return wheels;
    }

    public void setWheels(boolean wheels) {
        this.wheels = wheels;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "Wheels: " + wheels + "cylinders: " + cylinders + "\n";
    }
<<<<<<< HEAD
=======
>>>>>>> e92731b (add cars toString and print)
>>>>>>> auxcarlos
}

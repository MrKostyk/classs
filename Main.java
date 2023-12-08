public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        VehicleManager.operateVehicle(car);
        VehicleManager.operateVehicle(motorcycle);


        ElectronicDevice tv = new Television();
        ElectronicDevice computer = new Computer();

        ElectronicDeviceManager.operateDevice(tv);
        ElectronicDeviceManager.operateDevice(computer);


        Dish soup = new Soup();
        Dish steak = new Steak();

        RestaurantChef.cookDish(soup);
        RestaurantChef.cookDish(steak);
    }
}
interface Vehicle {
    void start();

    void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped");
    }
}

class VehicleManager {
    static void operateVehicle(Vehicle vehicle) {
        vehicle.start();
        vehicle.stop();
    }
}



interface ElectronicDevice {
    void turnOn();

    void turnOff();
}

class Television implements ElectronicDevice {
    @Override
    public void turnOn() {
        System.out.println("TV turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turned off");
    }
}

class Computer implements ElectronicDevice {
    @Override
    public void turnOn() {
        System.out.println("Computer turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Computer turned off");
    }
}

class ElectronicDeviceManager {
    static void operateDevice(ElectronicDevice device) {
        device.turnOn();
        device.turnOff();
    }
}



interface Dish {
    void cook();
}

class Soup implements Dish {
    @Override
    public void cook() {
        System.out.println("Soup is being cooked");
    }
}

class Steak implements Dish {
    @Override
    public void cook() {
        System.out.println("Steak is being cooked");
    }
}

class RestaurantChef {
    static void cookDish(Dish dish) {
        dish.cook();
    }
}


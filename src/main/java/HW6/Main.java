package HW6;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(2, 7);
        elevator.move(4);
//        Elevator elevator1 = new Elevator(3,3);
        elevator.move(3);

        System.out.println(elevator.toString());


    }

}

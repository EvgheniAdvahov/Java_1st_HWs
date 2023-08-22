package HW6;

public class Elevator {
    public int maxFloor;
    public int minFloor;
    private int floor = minFloor;

    public Elevator(int minFloor, int maxFloor) {
        if(minFloor >= maxFloor){
            throw new IllegalArgumentException("Minimal floor should be lower than maximum floor");
        }
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
    }

    public Elevator(int maxFloor) {
        this.maxFloor = maxFloor;
        this.minFloor = 1;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        if(floor >= maxFloor || floor <= minFloor){
            throw new IllegalArgumentException("Floor should be lower than maximum floor and higher than minimal floor");
        }
        else {
            this.floor = floor;
        }
    }

    public int move(int floor) {
            setFloor(floor);
            System.out.println("You arrived to " + floor + " floor");
            return floor;
    }

    @Override
    public String toString() {
        return "Elevator: [" +
                 minFloor +
                "," + maxFloor +
                "] -> " + floor;
    }

}

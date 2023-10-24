public class Bicycle {
    // fields
    String idle;
    String gear;
    String tire;
    String wheel;
    public Bicycle(String idle, String gear){
        this.idle = idle;
        this.gear = gear;
        // constructor with arguement
    }
    public Bicycle(){
       // constructor with no arguement
    }
    // methods
    public void accelerate(){ // without return type
        System.out.println("The bicycle is accelerating");
    }
    public int getNumberOfWheels(int wheel){ //  return type
       return wheel;
    }
    public int getNumberOfWheels(int wheel, String chair){ //  return type //method overloading because they have the same method name but different number of parameters
        return wheel;
    }
    public String getNumberOfWheels(int wheel, int cycle,String sterring){ //  return type
        return sterring;
    }

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("3", "5");
        bicycle.accelerate();
       bicycle.getNumberOfWheels(2);
        bicycle.getNumberOfWheels(2,"chairs");
        System.out.println( bicycle.getNumberOfWheels(2,4,"good"));
       int totalWheel = bicycle.getNumberOfWheels(1);
      System.out.println(totalWheel);
    }
}

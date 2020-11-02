class Vehicle { /// inheritanc การถ่ายทอดคุณสมบัติ // Super
    protected String brand = "ford";
    protected int   speed = 300;
    public void honk(){
        System.out.println("TUST , TUST");

    }
}
class Car extends Vehicle{ // Subclass
    private String  modelname = "Mustang";
    public static void main (String[] args){
            Car myFastCar = new Car();
            myFastCar.honk();
            System.out.println(myFastCar.brand+"   "+myFastCar.modelname+"Speed:"+myFastCar.speed);
    }

}
class Bilke {
    public static void main(String[] args){
        Vehicle role = new Vehicle();
        System.out.println(role.brand);
        1
    }

}

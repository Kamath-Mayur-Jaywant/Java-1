class Car{
    private String make;
    private String model;
    private int year;
    private String colour;
    Car(String mk,String md,int yr,String clr){
        this.make=mk;
        this.model=md;
        this.year=yr;
        this.colour=clr;
    }
    public void getCarDetails(){
        System.out.println(colour+""+make+"-"+model+""+year);
    }
}
public class K93{
    public static void main(String[]args){
        Car principalCar=new Car("Hyundai","Creta",2022,"White");
        Car vprincipalCar=new Car("Maruti","Swift",2020,"Grey");
        System.out.println("The two cars parked in front of SMVITM are");
        principalCar.getCarDetails();
        vprincipalCar.getCarDetails();
    }
}
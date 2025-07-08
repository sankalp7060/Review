
// ●  Custom constructors for different vehicle types
// ●  protected for vehicle attributes to allow subclass access
// ●  Rentable with method calculateRent(int days)
// ●  Used in rent calculation (e.g., baseRate × days ± surcharges)

// ○  Rentable abstracts rental behavior
// ○  Car, Bike, Truck inherit from Vehicle
// ○  Rent calculation differs by vehicle type
// ○  All fields hidden behind getters/setters.


interface Rent{
    double calculateRent(int days);
}
abstract  class vehicle implements Rent{
    protected   String model;
    protected   String make;
    protected   int year;

    protected vehicle(String model,String make,int year){
        this.model = model;
        this.make = make;
        this.year = year;

    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getMake(){
        return  make;
    }
    public void setMake(String setMake){
        this.make = make;
    }
    public int getYear(){
        return  year;
    }
    public void setYear(){
        this.year = year;
    }
   

}

class bike extends  vehicle{
    private  double rate;
    private  double  charge;
    public bike(String model,String make,int year,double rate,double charge){
        super(model, make, year);
        this.rate = rate;
        this.charge = charge;
    }

    @Override
    public double calculateRent(int days){
        return rate*days+charge;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }
}

class car extends  vehicle{
    private  double rate;
    private  double  charge;
    public car(String model,String make,int year,double rate,double charge){
        super(model, make, year);
        this.rate = rate;
        this.charge = charge;
    }

    @Override
    public double calculateRent(int days){
        return rate*days+charge;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }
}

class truck extends  vehicle{
    private  double rate;
    private  double  charge;
    public truck(String model,String make,int year,double rate,double charge){
        super(model, make, year);
        this.rate = rate;
        this.charge = charge;
    }

    @Override
    public double calculateRent(int days){
        return rate*days+charge;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }
}
public class vehicleRentalSystem{
    public static void main(String[] args) {
        vehicle v1 = new bike("honda", "TAta", 2, 1000,200);
        vehicle v2 = new car("Innova", "fortune", 6, 400, 60);
        System.out.println(v1.calculateRent(6));;
    }
}
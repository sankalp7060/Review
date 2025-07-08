package vehicleRentalSystem;

class bike extends  vehicle{
    private  double rate = 600.00;
    private  double  charge = 100.00;
    public bike(String model,String make,int year){
        super(model, make, year);
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
package vehicleRentalSystem;

class truck extends  vehicle{
    private  double rate = 1000.00;
    private  double  charge = 200.00;
    public truck(String model,String make,int year){
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
package vehicleRentalSystem;

class car extends  vehicle{
    private  double rate = 800.00;
    private  double  charge = 150.00;
    public car(String model,String make,int year){
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




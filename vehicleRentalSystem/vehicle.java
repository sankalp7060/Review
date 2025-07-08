package vehicleRentalSystem;

abstract  class vehicle implements Rent{
    protected  String model;
    protected  String make;
    protected  int year;

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
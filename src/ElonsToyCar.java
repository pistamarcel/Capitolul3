public class ElonsToyCar {
    private int metters = 0;
    private int battery = 100;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven "+metters +" meters";

    }
    public String batteryDisplay() {
        if(battery==0){
            return "Battery empty";
        }else{
            return "Battery at "+ battery+"%" ;
        }
    }

    public void drive() {
        if(battery>=1){
            metters=metters +20;
            battery=battery -1;
        }
    }
}
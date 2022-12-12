package cases.inheritancevehicles;

public class Cars extends Vehicles {
    int oneway_count;
    public void Cars(int oneway_count){
        this.oneway_count = oneway_count;
    }
    public void speed(int kms, int hours, int oneway_count){
        System.out.println(kms/hours + oneway_count);
    }   
}

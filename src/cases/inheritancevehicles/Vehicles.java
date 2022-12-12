package cases.inheritancevehicles;

public class Vehicles extends Object {
    public void speed(int kms, int hours){
        System.out.println(kms / hours);
    }
    public void weight(int height, int width, int depth){
        System.out.println(height * width * depth);
    }
}

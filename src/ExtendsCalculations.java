public class ExtendsCalculations extends Calculations{
    ExtendsCalculations(){
        System.out.println("ExtendsCacaltaion - constructor");
    }

    //multiply
    public int multiplication(int first, int second){
        int result = first * second;
        return result;
    }

    // Public Methods substraction
    public int substraction(int first, int second){
        int result = first + second;
        return result;
    }
}

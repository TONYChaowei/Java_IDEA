package LaoJIU;

public class ExceptionDemoV2 {
    public  void division ( int num1, int num2){
        int result = Integer.MIN_VALUE;
        try {
            System.out.println("Perform Division");
            result = num1 / num2;
            System.out.println("result = " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Calculation completed");
    }
}

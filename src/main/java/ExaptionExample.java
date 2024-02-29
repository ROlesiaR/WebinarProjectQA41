public class ExaptionExample {
    public static void main(String[] args) {
        System.out.println(1);
boolean flag = false;
        try {
            double a = 7/2;
            flag = true;
        } catch (ArithmeticException e) { //Exception
            System.out.println(e.getMessage());
            e.getMessage();
        }
        catch (Exception e) { //Exception
            System.out.println(e.getMessage());
            e.getMessage();
        }
        finally {
            if (flag){
                System.out.println(2);
            }
            else {
                System.out.println(3);
            }
        }
        System.out.println(5);
    }
}

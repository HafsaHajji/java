public class nastedIf {
    public static void main(String args[]){
        int s = 9;
        if(s >10){
            if(s % 2 == 0){
                System.out.println("s is even number and greater than 10");
            } else {
                System.out.println("s is odd number and greater than 10");
            }
        } else {
            System.out.println("s is less or equal to 10");
        }
    }
}

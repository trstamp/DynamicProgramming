public class Main {

    public static void main(String[] args){
        Assignment3 As3 = new Assignment3();
        int[][] test = As3.createMatrix();
        System.out.print(As3.findPath(test,0,0));
    }
}

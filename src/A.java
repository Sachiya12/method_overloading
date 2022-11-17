public class A {
    static void B(int x ){
        System.out.println("Argument ="+ x );
    }
    static void B (int y,int z){
        System.out.println("Argument = "+y+ " and "+ z);
    }

    public static void main(String[] args) {
        B(3,25);
        B(6);



    }

}

public class Method_overloading {
    void display (int a,double b){
        System.out.println("method01");
    }
    void display(int a ,double b,double c){
        System.out.println("method02");
    }

    void school(){
        System.out.println("Srilanka");
    }
    public static void main(String[] args) {
        Method_overloading mol = new Method_overloading();
        mol.display(2,2.5);
        mol.display(2,2.35,3.2665);
        mol.school();

    }

}

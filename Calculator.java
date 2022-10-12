public class Calculator{
    void print(){
        System.out.println("Main Function");
    }

    int multiply(int x,int y){
        return x*y;
    }
    public static void main(String[] args) { 
        Calculator c = new Calculator();
        c.print();
        System.out.println(c.multiply(10, 7));
    }
}
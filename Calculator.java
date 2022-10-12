public class Calculator{
    void print(){
        System.out.println("Main Function");
    }

    double divide(int x,int y){
        return x/y;
    }

    int multiply(int x,int y){
        return x*y;
    }

    int subtract(int x,int y){
        return x-y;
    }

    int addition(int x,int y){
        return x+y;
    }
    public static void main(String[] args) { 
        Calculator c = new Calculator();
        c.print();
        System.out.println(c.addition(10, 20));
        System.out.println(c.subtract(10, 4));
        System.out.println(c.multiply(10, 7));
        System.out.println(c.divide(76, 2));
    }
}
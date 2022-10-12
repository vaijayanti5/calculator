public class Calculator{
    void print(){
        System.out.println("Main Function");
    }

    double divide(int x,int y){
        return x/y;
    }

    public static void main(String[] args) { 
        Calculator c = new Calculator();
        c.print();
        System.out.println(c.divide(76, 2));
    }
}
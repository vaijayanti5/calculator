public class Calculator{
    void print(){
        System.out.println("Main Function");
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
    }
}
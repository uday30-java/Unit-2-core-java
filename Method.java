class Method{
    static void display(){
        System.out.println("Welcome to credo systemz");
    }
    // with parameters,with return type
   /*  static int add(int a,int b, int c,int d,int e){
        return a+b+c+d+e;
    }
    //without parameters,with return type
    static int sub(){
        int x = 90;
        int y = 10;
        return x-y;
    }*/
    //with parameters,without return type
    static void mul(int f,int g,int h){
        int mul = f*g*h;
        System.out.println("Multiplication ="+mul);
    }
    //without parameters,without return type
    static void div(){
        int i = 500;
        int j = 100;
        System.out.println("Division ="+(i/j));
    }
    public static void main(String args[]){
        display();

       // System.out.println("Sum = " + add(90, 70, 100, 100, 100));
       // System.out.println("Subtraction ="+sub());
         mul(2,5,10);
         div();
    }

}




class Switchcase {
    public static void main(String[] args) {
        String opr = "+";
        int num1 = 10;
        int num2 = 2;

        switch (opr) {
            case "+": {
                int answer = num1+num2;
                System.out.println(answer);
                break;
            }
            case "-": {
                int answer = num1-num2;
                System.out.println(answer);
                break;
            }
            case "/": {
                int answer = num1/num2;
                System.out.println(answer);
                break;
            }
            case "*": {
                int answer = num1*num2;
                System.out.println(answer);
                break;
            }
            default: {
                System.out.println("please enter +,-,*,/");
            }
    }

    }
}

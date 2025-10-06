class Ternaryop {
    public static void main(String[] args) {
        //Graging system
        int marks=85;
        String grade = (marks>=90)?"A+":
                       (marks>=80)?"A":
                       (marks>=70)?"B+":
                       (marks>=60)?"C":
                       (marks>=50)?"D":"Fail";

         System.out.println("marks:"+marks);
         System.out.println("grade:"+grade);
         //Largest value example
         int a = 75;
         int b = 100;
         int c = 50;
         int largest = (a>=b && a>=c)?a:
                       (b>=a && b>=c)?b:c;
         System.out.println("largest value is:"+largest);           


    }              
}

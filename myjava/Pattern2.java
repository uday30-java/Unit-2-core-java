class Pattern2 {
    public static void main(String[] args) {
        
         for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= 'E'; j++) {
            System.out.print(i);
        }
            System.out.println("");
        }
    
   
         for (int i = 1; i <= 5; i++) { 
            for (char ch = 'E'; ch >= 'A'; ch--) { 
            System.out.print(ch);
        }
            System.out.println("");
        }

         char k = 'A'; 
        for (int i = 1; i <= 5; i++) { 
            for (int j = 1; j <= 5; j++) { 
                System.out.print(k);
                k++; 
        }
            System.out.println(); 
        }
    }
}



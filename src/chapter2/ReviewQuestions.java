package chapter2;

public class ReviewQuestions {
    
    public static void main(String[] args) {
        ques20();
      /*
        ques7();
        ques14();
        ques15();
        ques18();
        ques18_2();
        ques20();
*/
    }
    
    public static void ques7(){
        int x = 5;
        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
        System.out.println((x > 2) ? ((x < 4) ? 10 : 8) : 7);
    }
    
    public static void ques14(){
        int c = 7;
        int result = 4;
        result += ++c;
        System.out.println(result);
        System.out.println(c);
    }
    
    public static void ques15(){
        int x = 1, y = 15;
        while (x < 10){
            y--;
            x++;
        System.out.println(x + ", " + y);
        }
        
        System.out.println("Final result: " + x + ", " + y);
    }
 public static void ques18(){
     int count = 0;
     System.out.println("______________ ques18() ______________");
     
     ROW_LOOP: for (int row = 1; row <=3; row++)
         for (int col = 1; col <=2; col++){
             System.out.println("printing from inner loop b4 if");
             if(row * col % 2 == 0) continue ROW_LOOP;
             count++;
             System.out.println("inner loop/if: \n"
                     + "count" + count);
         }
     System.out.println(count);
 }   
 
  public static void ques18_2(){
     int count = 0;
     System.out.println("______________ ques18_2() ______________");
     
     ROW_LOOP: for (int row = 1; row <=3; row++){   
         System.out.println("printing from first loop");
         for (int col = 1; col <=2; col++){
             if(row * col % 2 == 0) continue ROW_LOOP;
             count++;
             System.out.println("inner loop/if: \n"
                     + "count" + count);
         }
         
         
    }
     System.out.println(count);
 }   
    public static void ques20(){
        final char a = 'A', d = 'D';
        char grade = 'B';
        
        switch (grade) {
            case a:
            case 'B': System.out.print("great");
            case 'C': System.out.print("good"); break;
            case d:
            case 'F': System.out.print("not good");
        }        
    }
}

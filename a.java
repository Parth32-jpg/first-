
import java.util.Scanner;
public class a{

    public static void print_detail ()
    {
      System.out.println(" 1. INR TO DOLLAR \n 2. INR TO EURO \n 3. INR TO Swiss France \n 4. INR TO Pound sterling \n 5. INR TO Gibralter pound ");
    }
  public static void main(String[] args) {
      float takeNumber;
      float result;
      System.out.println(" \n welcome to the currency concept ");
      print_detail();
      System.out.println( " select any of them : ");
      Scanner  sc = new Scanner(System.in);
      int takeinput;
      takeinput = sc.nextInt();
       
      switch (takeinput){
          case 1 : 
          System.out.println( " Enter ruppes to convert INR to DOLLAR ");
          takeNumber=sc.nextFloat();
          result= ( float) ( takeNumber * 0.012);
          System.out.printf( " 2f INR is equal to %.2f DOLLAR  %n" , takeNumber, result);
          break;  

          case 2 : 
          System.out.println( " Enter ruppes to convert INR to EURO");
          takeNumber=sc.nextFloat();
          result= ( float) ( takeNumber * 0.011);
          System.out.printf( " % 2f INR is equal to %.2f EURO %n " , takeNumber, result);
          break;

          case 3 : 
          System.out.println( " Enter ruppes to convert INR to Swiss France");
          takeNumber=sc.nextFloat();
          result= ( float) ( takeNumber * 0.010);
          System.out.printf( " 2f INR is equal to %.2f Swiss France %n " , takeNumber, result);
          break;
          
          case 4 : 
          System.out.println( " Enter ruppes to convert INR to pound Sterling");
          takeNumber=sc.nextFloat();
          result= ( float) ( takeNumber * 0.0095);
          System.out.printf( " 2f INR is equal to %.2f Pound Sterling %n " , takeNumber, result);
          break;

          case 5 : 
          System.out.println( " Enter ruppes to convert INR to Gibralter Pound");
          takeNumber=sc.nextFloat();
          result= ( float) ( takeNumber * 0.00969 );
          System.out.printf( " 2f INR is equal to %.2f Gibralter Pound  %n " , takeNumber, result);
          break;
          

          default:
           
          System.out.println(" oops something went wrong may you can Entered Invalid input ");

          break;

          
          


      }


     
      }

  }

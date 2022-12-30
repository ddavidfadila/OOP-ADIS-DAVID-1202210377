import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Calculation call = new Calculation();
    int inputMenu;
    boolean repeat = true;
    double res; 

    do{
      try {
        System.out.println("""
        ===Menu Program===
        1. Square
        2. Circle
        3. Trapezoid
        """);
        System.out.print("Select Menu : ");
        inputMenu =s.nextInt();
        switch (inputMenu) {
          case 1:
            System.out.print("Enter the length of the side of the square: ");
            double side = s.nextDouble();
            call.setSquare(side);
            call.run();
            System.out.println();
            System.out.println("The calculation result: "+ call.getsquare());
            break;
          case 2:
            System.out.print("Enter the length of the radius of the circle: ");
            double radius = s.nextDouble();
            call.setCircle(radius);
            call.run();
            System.out.println("The calculation result: "+call.getCircle());
            break;
          case 3: 
            System.out.print("Insert the side of the base of the trapezoid: ");
            double a = s.nextDouble();
            System.out.print("Enter the upper side of the trapezoid: ");
            double b = s.nextDouble();
            System.out.print("Enter the height side of the trapezoid: ");
            double t = s.nextDouble();
            call.setTripezoid(a, b, t);
            res = call.getTripezoid();
            call.run();
            System.out.println("The calculation result: "+res);
            break;
          case 0:
            System.out.println("Program End");
            break;
          default:
            System.out.println("Option not Available");
            continue;
        } 
        repeat = false;
      } catch (InputMismatchException e) {
        System.out.println("Error: Input Must be number!!!\n");
       
      } catch (IllegalArgumentException e){
        System.out.println(e.getMessage());
        e.getStackTrace();
      }
      s.nextLine();
    } while (repeat);
    s.close();
  }
}

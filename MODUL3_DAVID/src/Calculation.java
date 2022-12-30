public class Calculation implements Runnable{
    public double radius = 0;
    public double side = 0; 
    public double area = 0;
    public double phi = 3.14;

    public void setSquare(double side) throws IllegalArgumentException{
        this.side = side;
        if (side<1){
            throw new IllegalArgumentException();
        }else {
            this.area = side*side;
        }

    }

    public double getsquare(){
        return area;

    }
    public void setCircle(double radius){
        this.radius= radius;
        if(radius<1){
            throw new IllegalArgumentException();
        }else{
            this.area = phi * (radius * radius);
        }
    }

    public double getCircle() {
        return this.area; 

    }
    public void setTripezoid(double a, double b, double t) {
        this.area = 0.5 * t * (a+b);
    } 
    public double getTripezoid() {
        return this.area;
    }
    @Override
    public void run(){
        System.out.println("======Program will Start in ======");
        for (int i=3; i>0; i--){
            try{
                System.out.println("starting with thrad" +i);
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            }
        }
    } 





    


public class Rectangle {
    public double length ;
            public double width ;
            public double area(double length, double width){
                return length * width;
            }
            public double perimeter(double length, double width){
                return 2*(length + width) ;
            }
            public boolean isSquare(double x, double y){
                return x==y;
            }
            public void printDetails(){
                System.out.println("Length: " + length + " Width: " + width);
            }
        }
package inheritance;

class Operation10 {
    int square(int n) {
        return n * n;
    }
}

//public
class Circle10 {
    Operation10 op; //aggregation (HAS-A relation)
    double pi = 3.14;

    double area(int radius) {
        op = new Operation10();
        int rsquare = op.square(radius); //code reusability (i.e. delegates the method call).
        return pi * rsquare;
    }



    public static void main(String args[]) {
        Circle10 c = new Circle10();
        double result = c.area(5);
        System.out.println(result);
    }
}
public class Main {
    public static void main(String[] args) {
       double left = 0;
       double right = 10;
       Func func = new Func();
        System.out.println(func.func(left,right));
        double res = func.func(left,right);
        System.out.println((Math.cos(Math.pow(res,5))+Math.pow(res,4)-345.3*res-23));
    }
}
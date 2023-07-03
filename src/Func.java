public class Func {
    double func(double left, double right) {
        double mid = (left+right)/2;
            if(right-left<0.0000000001)
            return ((left+right)/2);
        else if ( (Math.cos(Math.pow(left,5))+Math.pow(left,4)-345.3*left-23) * (Math.cos(Math.pow(mid,5))+Math.pow(mid,4)-345.3*mid-23)  < 0)
            return this.func(left,mid);
        else
            return this.func(mid,right);
    }

}

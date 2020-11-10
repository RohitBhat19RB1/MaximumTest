public class Maximum {

        public static <T extends Comparable<T>> T checkMaximum(T x,T y,T z){
            T maximum=x;
            if(y.compareTo(maximum)>0){
                maximum=y;
            }
            if(z.compareTo(maximum)>0){
                maximum=z;
            }
            return maximum;
        }}
import static java.util.Arrays.sort;

public class Maximum {

        public static <E extends Comparable<E>> E checkMaximum(E x,E y,E z){
            E maximum=x;
            if(y.compareTo(maximum)>0){
                maximum=y;
            }
            if(z.compareTo(maximum)>0){
                maximum=z;
            }
            return maximum;
        }

    @SafeVarargs
    public static <E extends Comparable<E>> E moreThan_ThreeParameters(E ...elements){
        sort(elements);
        return elements[elements.length-1];
    }

    @SafeVarargs
    public static <E extends Comparable<E>> void printMaximum(E ...elements){
        E e = moreThan_ThreeParameters(elements);
        System.out.printf("Maximum %s\n", e);
    }

}
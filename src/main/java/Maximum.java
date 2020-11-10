public class Maximum {
    public Integer maximumInteger(Integer x,Integer y,Integer z) {
        Integer maximum = x;
        if(y.compareTo(maximum)>0){
            maximum=y;
        }
        if(z.compareTo(maximum)>0){
            maximum=z;
        }
        return maximum;
    }

    public Float maximumFloat(Float x,Float y,Float z) {
        Float maximum=x;
        if(y.compareTo(maximum)>0){
            maximum=y;
        }
        if(z.compareTo(maximum)>0){
            maximum=z;
        }
        return maximum;
    }
}
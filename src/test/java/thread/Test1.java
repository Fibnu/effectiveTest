package thread;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author Liqn
 * @create 2017-07-27 22:33
 **/
public class Test1 {

//    private volatile OneValueCache cache = new OneValueCache(null,null);

    private int value;
    public synchronized int getNext(){
        return value++;
    }

    public static void main(String args[]){
        for (int i=0 ;i<1000;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(new Test1().getNext());
                }
            }).start();
        }



    }





}


class  OneValueCache{
//    private final BigInteger lastNumber;
//    private final BigInteger[] lastFactors;
//
//    public OneValueCache(BigInteger i,BigInteger[] factors){
//        lastNumber = i;
//        lastFactors = Arrays.copyOf(factors, factors.length);
//    }

//    public BigInteger[] getFactors(){
//        if (lastNumber == null || !lastNumber.equals(i)){
//            return null;
//        }else {
//            return Arrays.copyOf(lastFactors,lastFactors.length);
//        }
//    }

}

package server.app1;

import com.ericbruno.library1.MyLibrary1;
import com.ericbruno.library1.MyLibrary1Impl;

/**
 * @author ebruno
 */
public class MyApplication1 {
    private MyLibrary1 lib1 = MyLibrary1Impl.getInstance();
    
    public static void main(String[] args) {
        MyApplication1 app1 = new MyApplication1();
    }
    
    public MyApplication1() {
        System.out.println("MyApplication1 started");
        log( "2021+1=" + 
                lib1.add(2021, 1) );
        log( "2021-1=" + 
                lib1.subtract(2021, 1) );
        log( "2021*2=" + 
                lib1.multiply(2021, 2) );
        log( "2021/2=" + 
                lib1.divide(2021, 2) );
    }
    
    private static void log(String s) {
        System.out.println("[App1]: "+s);
    }
}

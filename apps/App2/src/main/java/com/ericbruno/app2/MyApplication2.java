package com.ericbruno.app2;

import com.ericbruno.library2.MyLibrary2Impl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author ebruno
 */
public class MyApplication2 {
    private static final Logger logger = LogManager.getLogger(MyApplication2.class);

    MyLibrary2Impl lib2 = new MyLibrary2Impl();
    
    public static void main(String[] args) {
        MyApplication2 app2 = new MyApplication2();
    }
    
    public MyApplication2() {
        log( "sine 1=" +
                lib2.sine(1) );
        log( "cosine 1=" +
                lib2.cosine(1) );
        log( "tangent 1=" +
                lib2.tangent(1) );
    }

    private static void log(String s) {
        logger.info("[App2]: "+s);
    }
}

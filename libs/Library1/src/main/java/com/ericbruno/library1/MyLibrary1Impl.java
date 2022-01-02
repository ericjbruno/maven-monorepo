package com.ericbruno.library1;

import com.ericbruno.librarybase.*;

/**
 * @author ebruno
 */
public class MyLibrary1Impl extends MyLibraryBaseImpl implements MyLibraryBase, MyLibrary1 {
    public static MyLibrary1Impl getInstance() {
        // Factory pattern. Could optionally make it a singleton
        return new MyLibrary1Impl();
    }

//    @Override
//    public int add(int val1, int val2) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public int subtract(int val1, int val2) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public int multiply(int op1, int op2) {
        return op1 * op2;
    }

    @Override
    public int divide(int op, int divisor) {
        return op / divisor;
    }
    
}

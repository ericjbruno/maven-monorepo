package com.ericbruno.librarybase;

/**
 * @author ebruno
 */
public class MyLibraryBaseImpl implements MyLibraryBase {

    @Override
    public int add(int val1, int val2) {
        return val1 + val2;
    }

    @Override
    public int subtract(int val1, int val2) {
        return val1 - val2;
    }
    
}

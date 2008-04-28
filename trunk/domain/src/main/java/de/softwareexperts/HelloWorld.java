package de.softwareexperts;

import org.apache.commons.collections.ArrayStack;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.log4j.Logger;

public class HelloWorld {

    // --------------------------------------------------------------------------
    // constants
    // --------------------------------------------------------------------------

    private static final Logger LOG = Logger.getLogger(HelloWorld.class);

    private ArrayStack          fArrayStack;



    // --------------------------------------------------------------------------
    // instance methods
    // --------------------------------------------------------------------------

    public String getHelloWorld() {
        return "Hello World";
    }



    // --------------------------------------------------------------------------
    // Object methods (overridden)
    // --------------------------------------------------------------------------

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

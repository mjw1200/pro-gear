
/**
 * UnexpectedErrorFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.rightnow.ws.wsdl;

public class UnexpectedErrorFault extends java.lang.Exception{

    private static final long serialVersionUID = 1441900995763L;
    
    private com.rightnow.ws.faults.UnexpectedErrorFault faultMessage;

    
        public UnexpectedErrorFault() {
            super("UnexpectedErrorFault");
        }

        public UnexpectedErrorFault(java.lang.String s) {
           super(s);
        }

        public UnexpectedErrorFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UnexpectedErrorFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.rightnow.ws.faults.UnexpectedErrorFault msg){
       faultMessage = msg;
    }
    
    public com.rightnow.ws.faults.UnexpectedErrorFault getFaultMessage(){
       return faultMessage;
    }
}
    
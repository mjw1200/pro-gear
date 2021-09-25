
/**
 * ServerErrorFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.rightnow.ws.wsdl;

public class ServerErrorFault extends java.lang.Exception{

    private static final long serialVersionUID = 1441900995767L;
    
    private com.rightnow.ws.faults.ServerErrorFault faultMessage;

    
        public ServerErrorFault() {
            super("ServerErrorFault");
        }

        public ServerErrorFault(java.lang.String s) {
           super(s);
        }

        public ServerErrorFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ServerErrorFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.rightnow.ws.faults.ServerErrorFault msg){
       faultMessage = msg;
    }
    
    public com.rightnow.ws.faults.ServerErrorFault getFaultMessage(){
       return faultMessage;
    }
}
    
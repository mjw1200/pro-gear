
/**
 * RightNowSyncServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.rightnow.ws.wsdl;

    /**
     *  RightNowSyncServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class RightNowSyncServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public RightNowSyncServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public RightNowSyncServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getValuesForNamedID method
            * override this method for handling normal response from getValuesForNamedID operation
            */
           public void receiveResultgetValuesForNamedID(
                    com.rightnow.ws.base.NamedID[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getValuesForNamedID operation
           */
            public void receiveErrorgetValuesForNamedID(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for executeMarketingFlow method
            * override this method for handling normal response from executeMarketingFlow operation
            */
           public void receiveResultexecuteMarketingFlow(
                    com.rightnow.ws.messages.ExecuteMarketingFlowResponseMsg result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from executeMarketingFlow operation
           */
            public void receiveErrorexecuteMarketingFlow(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for sendMailingToContact method
            * override this method for handling normal response from sendMailingToContact operation
            */
           public void receiveResultsendMailingToContact(
                    com.rightnow.ws.messages.SendMailingToContactResponseMsg result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from sendMailingToContact operation
           */
            public void receiveErrorsendMailingToContact(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for batch method
            * override this method for handling normal response from batch operation
            */
           public void receiveResultbatch(
                    com.rightnow.ws.messages.BatchResponseItem[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from batch operation
           */
            public void receiveErrorbatch(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMetaDataForOperation method
            * override this method for handling normal response from getMetaDataForOperation operation
            */
           public void receiveResultgetMetaDataForOperation(
                    com.rightnow.ws.metadata.MetaDataClassOperation[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMetaDataForOperation operation
           */
            public void receiveErrorgetMetaDataForOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for create method
            * override this method for handling normal response from create operation
            */
           public void receiveResultcreate(
                    com.rightnow.ws.messages.RNObjectsResult result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from create operation
           */
            public void receiveErrorcreate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for destroy method
            * override this method for handling normal response from destroy operation
            */
           public void receiveResultdestroy(
                    com.rightnow.ws.messages.DestroyResponseMsg result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from destroy operation
           */
            public void receiveErrordestroy(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for transferSubObjects method
            * override this method for handling normal response from transferSubObjects operation
            */
           public void receiveResulttransferSubObjects(
                    com.rightnow.ws.messages.TransferSubObjectsResponseMsg result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from transferSubObjects operation
           */
            public void receiveErrortransferSubObjects(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for get method
            * override this method for handling normal response from get operation
            */
           public void receiveResultget(
                    com.rightnow.ws.messages.RNObjectsResult result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from get operation
           */
            public void receiveErrorget(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getValuesForNamedIDHierarchy method
            * override this method for handling normal response from getValuesForNamedIDHierarchy operation
            */
           public void receiveResultgetValuesForNamedIDHierarchy(
                    com.rightnow.ws.base.NamedIDWithParent[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getValuesForNamedIDHierarchy operation
           */
            public void receiveErrorgetValuesForNamedIDHierarchy(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getFileData method
            * override this method for handling normal response from getFileData operation
            */
           public void receiveResultgetFileData(
                    javax.activation.DataHandler result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getFileData operation
           */
            public void receiveErrorgetFileData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for resetContactPassword method
            * override this method for handling normal response from resetContactPassword operation
            */
           public void receiveResultresetContactPassword(
                    com.rightnow.ws.messages.ResetContactPasswordResponseMsg result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from resetContactPassword operation
           */
            public void receiveErrorresetContactPassword(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queryObjects method
            * override this method for handling normal response from queryObjects operation
            */
           public void receiveResultqueryObjects(
                    com.rightnow.ws.messages.QueryResultData[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queryObjects operation
           */
            public void receiveErrorqueryObjects(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for convertGenericToObject method
            * override this method for handling normal response from convertGenericToObject operation
            */
           public void receiveResultconvertGenericToObject(
                    com.rightnow.ws.messages.RNObjectsResult result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from convertGenericToObject operation
           */
            public void receiveErrorconvertGenericToObject(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMetaData method
            * override this method for handling normal response from getMetaData operation
            */
           public void receiveResultgetMetaData(
                    com.rightnow.ws.metadata.MetaDataClass[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMetaData operation
           */
            public void receiveErrorgetMetaData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for runAnalyticsReport method
            * override this method for handling normal response from runAnalyticsReport operation
            */
           public void receiveResultrunAnalyticsReport(
                    com.rightnow.ws.messages.RunAnalyticsReportResponseMsg result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from runAnalyticsReport operation
           */
            public void receiveErrorrunAnalyticsReport(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSubscribableObjects method
            * override this method for handling normal response from getSubscribableObjects operation
            */
           public void receiveResultgetSubscribableObjects(
                    com.rightnow.ws.messages.SubscribableObject[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSubscribableObjects operation
           */
            public void receiveErrorgetSubscribableObjects(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for update method
            * override this method for handling normal response from update operation
            */
           public void receiveResultupdate(
                    com.rightnow.ws.messages.UpdateResponseMsg result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from update operation
           */
            public void receiveErrorupdate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queryCSV method
            * override this method for handling normal response from queryCSV operation
            */
           public void receiveResultqueryCSV(
                    com.rightnow.ws.messages.QueryCSVResponseMsg result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queryCSV operation
           */
            public void receiveErrorqueryCSV(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMetaDataLastChangeTime method
            * override this method for handling normal response from getMetaDataLastChangeTime operation
            */
           public void receiveResultgetMetaDataLastChangeTime(
                    java.util.Calendar result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMetaDataLastChangeTime operation
           */
            public void receiveErrorgetMetaDataLastChangeTime(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getPrimaryClassNames method
            * override this method for handling normal response from getPrimaryClassNames operation
            */
           public void receiveResultgetPrimaryClassNames(
                    com.rightnow.ws.generic.RNObjectType[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getPrimaryClassNames operation
           */
            public void receiveErrorgetPrimaryClassNames(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for convertObjectToGeneric method
            * override this method for handling normal response from convertObjectToGeneric operation
            */
           public void receiveResultconvertObjectToGeneric(
                    com.rightnow.ws.messages.RNObjectsResult result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from convertObjectToGeneric operation
           */
            public void receiveErrorconvertObjectToGeneric(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMetaDataForClass method
            * override this method for handling normal response from getMetaDataForClass operation
            */
           public void receiveResultgetMetaDataForClass(
                    com.rightnow.ws.metadata.MetaDataClass[] result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMetaDataForClass operation
           */
            public void receiveErrorgetMetaDataForClass(java.lang.Exception e) {
            }
                


    }
    
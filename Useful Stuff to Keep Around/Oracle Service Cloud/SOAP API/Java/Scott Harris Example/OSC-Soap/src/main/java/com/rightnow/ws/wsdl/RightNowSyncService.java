

/**
 * RightNowSyncService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.rightnow.ws.wsdl;

    /*
     *  RightNowSyncService java interface
     */

    public interface RightNowSyncService {
          

        /**
          * Auto generated method signature
          * 
                    * @param getValuesForNamedID49
                
                    * @param clientInfoHeader52
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.base.NamedID[] getValuesForNamedID(

                        java.lang.String packageName50,java.lang.String fieldName51,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader52)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getValuesForNamedID49
            
                * @param clientInfoHeader52
            
          */
        public void startgetValuesForNamedID(

            java.lang.String packageName50,java.lang.String fieldName51,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader52,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param executeMarketingFlow55
                
                    * @param clientInfoHeader59
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.ExecuteMarketingFlowResponseMsg executeMarketingFlow(

                        com.rightnow.ws.base.ID contactID56,com.rightnow.ws.base.ID campaignID57,java.lang.String entryPoint58,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader59)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param executeMarketingFlow55
            
                * @param clientInfoHeader59
            
          */
        public void startexecuteMarketingFlow(

            com.rightnow.ws.base.ID contactID56,com.rightnow.ws.base.ID campaignID57,java.lang.String entryPoint58,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader59,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param sendMailingToContact61
                
                    * @param clientInfoHeader68
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.SendMailingToContactResponseMsg sendMailingToContact(

                        com.rightnow.ws.base.ID contactID62,com.rightnow.ws.base.ID mailingID63,java.util.Calendar scheduledTime64,com.rightnow.ws.base.ID incidentID65,com.rightnow.ws.base.ID opportunityID66,com.rightnow.ws.base.ID chatID67,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader68)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param sendMailingToContact61
            
                * @param clientInfoHeader68
            
          */
        public void startsendMailingToContact(

            com.rightnow.ws.base.ID contactID62,com.rightnow.ws.base.ID mailingID63,java.util.Calendar scheduledTime64,com.rightnow.ws.base.ID incidentID65,com.rightnow.ws.base.ID opportunityID66,com.rightnow.ws.base.ID chatID67,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader68,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param batch70
                
                    * @param clientInfoHeader72
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.BatchResponseItem[] batch(

                        com.rightnow.ws.messages.BatchRequestItem[] batchRequestItem71,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader72)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param batch70
            
                * @param clientInfoHeader72
            
          */
        public void startbatch(

            com.rightnow.ws.messages.BatchRequestItem[] batchRequestItem71,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader72,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getMetaDataForOperation75
                
                    * @param clientInfoHeader79
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.metadata.MetaDataClassOperation[] getMetaDataForOperation(

                        java.lang.String[] operation76,java.lang.String[] className77,com.rightnow.ws.generic.RNObjectType[] qualifiedClassName78,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader79)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getMetaDataForOperation75
            
                * @param clientInfoHeader79
            
          */
        public void startgetMetaDataForOperation(

            java.lang.String[] operation76,java.lang.String[] className77,com.rightnow.ws.generic.RNObjectType[] qualifiedClassName78,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader79,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param create82
                
                    * @param clientInfoHeader85
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.RNObjectsResult create(

                        com.rightnow.ws.base.RNObject[] rNObjects83,com.rightnow.ws.messages.CreateProcessingOptions processingOptions84,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader85)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param create82
            
                * @param clientInfoHeader85
            
          */
        public void startcreate(

            com.rightnow.ws.base.RNObject[] rNObjects83,com.rightnow.ws.messages.CreateProcessingOptions processingOptions84,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader85,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param destroy88
                
                    * @param clientInfoHeader91
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.DestroyResponseMsg destroy(

                        com.rightnow.ws.base.RNObject[] rNObjects89,com.rightnow.ws.messages.DestroyProcessingOptions processingOptions90,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader91)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param destroy88
            
                * @param clientInfoHeader91
            
          */
        public void startdestroy(

            com.rightnow.ws.base.RNObject[] rNObjects89,com.rightnow.ws.messages.DestroyProcessingOptions processingOptions90,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader91,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param transferSubObjects93
                
                    * @param clientInfoHeader96
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.TransferSubObjectsResponseMsg transferSubObjects(

                        com.rightnow.ws.base.RNObject destinationRNObject94,com.rightnow.ws.base.RNObject[] sourceRNObjects95,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader96)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param transferSubObjects93
            
                * @param clientInfoHeader96
            
          */
        public void starttransferSubObjects(

            com.rightnow.ws.base.RNObject destinationRNObject94,com.rightnow.ws.base.RNObject[] sourceRNObjects95,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader96,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param get98
                
                    * @param clientInfoHeader101
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.RNObjectsResult get(

                        com.rightnow.ws.base.RNObject[] rNObjects99,com.rightnow.ws.messages.GetProcessingOptions processingOptions100,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader101)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param get98
            
                * @param clientInfoHeader101
            
          */
        public void startget(

            com.rightnow.ws.base.RNObject[] rNObjects99,com.rightnow.ws.messages.GetProcessingOptions processingOptions100,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader101,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getValuesForNamedIDHierarchy104
                
                    * @param clientInfoHeader106
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.base.NamedIDWithParent[] getValuesForNamedIDHierarchy(

                        java.lang.String fieldName105,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader106)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getValuesForNamedIDHierarchy104
            
                * @param clientInfoHeader106
            
          */
        public void startgetValuesForNamedIDHierarchy(

            java.lang.String fieldName105,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader106,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getFileData109
                
                    * @param clientInfoHeader113
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public javax.activation.DataHandler getFileData(

                        com.rightnow.ws.base.RNObject rNObject110,com.rightnow.ws.base.ID fileID111,boolean disableMTOM112,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader113)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getFileData109
            
                * @param clientInfoHeader113
            
          */
        public void startgetFileData(

            com.rightnow.ws.base.RNObject rNObject110,com.rightnow.ws.base.ID fileID111,boolean disableMTOM112,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader113,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param resetContactPassword116
                
                    * @param clientInfoHeader118
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.ResetContactPasswordResponseMsg resetContactPassword(

                        com.rightnow.ws.base.ID contactID117,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader118)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param resetContactPassword116
            
                * @param clientInfoHeader118
            
          */
        public void startresetContactPassword(

            com.rightnow.ws.base.ID contactID117,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader118,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param queryObjects120
                
                    * @param clientInfoHeader124
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.QueryResultData[] queryObjects(

                        java.lang.String query121,com.rightnow.ws.base.RNObject[] objectTemplates122,int pageSize123,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader124)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param queryObjects120
            
                * @param clientInfoHeader124
            
          */
        public void startqueryObjects(

            java.lang.String query121,com.rightnow.ws.base.RNObject[] objectTemplates122,int pageSize123,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader124,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param convertGenericToObject127
                
                    * @param clientInfoHeader129
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.RNObjectsResult convertGenericToObject(

                        com.rightnow.ws.base.RNObject[] rNObjects128,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader129)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param convertGenericToObject127
            
                * @param clientInfoHeader129
            
          */
        public void startconvertGenericToObject(

            com.rightnow.ws.base.RNObject[] rNObjects128,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader129,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getMetaData132
                
                    * @param clientInfoHeader133
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.metadata.MetaDataClass[] getMetaData(

                        com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader133)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getMetaData132
            
                * @param clientInfoHeader133
            
          */
        public void startgetMetaData(

            com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader133,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param runAnalyticsReport136
                
                    * @param clientInfoHeader143
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.RunAnalyticsReportResponseMsg runAnalyticsReport(

                        com.rightnow.ws.objects.AnalyticsReport analyticsReport137,int limit138,int start139,java.lang.String delimiter140,boolean returnRawResult141,boolean disableMTOM142,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader143)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param runAnalyticsReport136
            
                * @param clientInfoHeader143
            
          */
        public void startrunAnalyticsReport(

            com.rightnow.ws.objects.AnalyticsReport analyticsReport137,int limit138,int start139,java.lang.String delimiter140,boolean returnRawResult141,boolean disableMTOM142,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader143,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getSubscribableObjects147
                
                    * @param clientInfoHeader148
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.SubscribableObject[] getSubscribableObjects(

                        com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader148)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getSubscribableObjects147
            
                * @param clientInfoHeader148
            
          */
        public void startgetSubscribableObjects(

            com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader148,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param update151
                
                    * @param clientInfoHeader154
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.UpdateResponseMsg update(

                        com.rightnow.ws.base.RNObject[] rNObjects152,com.rightnow.ws.messages.UpdateProcessingOptions processingOptions153,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader154)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param update151
            
                * @param clientInfoHeader154
            
          */
        public void startupdate(

            com.rightnow.ws.base.RNObject[] rNObjects152,com.rightnow.ws.messages.UpdateProcessingOptions processingOptions153,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader154,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param queryCSV156
                
                    * @param clientInfoHeader162
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.QueryCSVResponseMsg queryCSV(

                        java.lang.String query157,int pageSize158,java.lang.String delimiter159,boolean returnRawResult160,boolean disableMTOM161,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader162)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param queryCSV156
            
                * @param clientInfoHeader162
            
          */
        public void startqueryCSV(

            java.lang.String query157,int pageSize158,java.lang.String delimiter159,boolean returnRawResult160,boolean disableMTOM161,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader162,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getMetaDataLastChangeTime166
                
                    * @param clientInfoHeader167
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public java.util.Calendar getMetaDataLastChangeTime(

                        com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader167)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getMetaDataLastChangeTime166
            
                * @param clientInfoHeader167
            
          */
        public void startgetMetaDataLastChangeTime(

            com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader167,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getPrimaryClassNames170
                
                    * @param clientInfoHeader171
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.generic.RNObjectType[] getPrimaryClassNames(

                        com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader171)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getPrimaryClassNames170
            
                * @param clientInfoHeader171
            
          */
        public void startgetPrimaryClassNames(

            com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader171,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param convertObjectToGeneric174
                
                    * @param clientInfoHeader176
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.messages.RNObjectsResult convertObjectToGeneric(

                        com.rightnow.ws.base.RNObject[] rNObjects175,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader176)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param convertObjectToGeneric174
            
                * @param clientInfoHeader176
            
          */
        public void startconvertObjectToGeneric(

            com.rightnow.ws.base.RNObject[] rNObjects175,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader176,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getMetaDataForClass179
                
                    * @param clientInfoHeader183
                
             * @throws com.rightnow.ws.wsdl.RequestErrorFault : 
             * @throws com.rightnow.ws.wsdl.UnexpectedErrorFault : 
             * @throws com.rightnow.ws.wsdl.ServerErrorFault : 
         */

         
                     public com.rightnow.ws.metadata.MetaDataClass[] getMetaDataForClass(

                        java.lang.String[] className180,com.rightnow.ws.generic.RNObjectType[] qualifiedClassName181,java.lang.String[] metaDataLink182,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader183)
                        throws java.rmi.RemoteException
             
          ,com.rightnow.ws.wsdl.RequestErrorFault
          ,com.rightnow.ws.wsdl.UnexpectedErrorFault
          ,com.rightnow.ws.wsdl.ServerErrorFault;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getMetaDataForClass179
            
                * @param clientInfoHeader183
            
          */
        public void startgetMetaDataForClass(

            java.lang.String[] className180,com.rightnow.ws.generic.RNObjectType[] qualifiedClassName181,java.lang.String[] metaDataLink182,com.rightnow.ws.messages.ClientInfoHeader clientInfoHeader183,
                

            final com.rightnow.ws.wsdl.RightNowSyncServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    
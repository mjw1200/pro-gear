
/**
 * BatchRequestItemChoice_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.rightnow.ws.messages;
            

            /**
            *  BatchRequestItemChoice_type0 bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class BatchRequestItemChoice_type0
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = BatchRequestItemChoice_type0
                Namespace URI = urn:messages.ws.rightnow.com/v1_3
                Namespace Prefix = ns7
                */
            
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localCreateMsgTracker = false;
                
                   localGetMsgTracker = false;
                
                   localUpdateMsgTracker = false;
                
                   localDestroyMsgTracker = false;
                
                   localQueryCSVMsgTracker = false;
                
                   localQueryObjectsMsgTracker = false;
                
                   localExecuteMarketingFlowMsgTracker = false;
                
                   localGetFileDataMsgTracker = false;
                
                   localResetContactPasswordMsgTracker = false;
                
                   localSendMailingToContactMsgTracker = false;
                
                   localTransferSubObjectsMsgTracker = false;
                
                   localGetMetaDataMsgTracker = false;
                
                   localGetMetaDataForClassMsgTracker = false;
                
                   localGetMetaDataForOperationMsgTracker = false;
                
                   localGetMetaDataLastChangeTimeMsgTracker = false;
                
                   localGetPrimaryClassNamesMsgTracker = false;
                
                   localGetValuesForNamedIDMsgTracker = false;
                
                   localGetValuesForNamedIDHierarchyMsgTracker = false;
                
                   localRunAnalyticsReportMsgTracker = false;
                
            }
        

                        /**
                        * field for CreateMsg
                        */

                        
                                    protected com.rightnow.ws.messages.CreateMsg localCreateMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreateMsgTracker = false ;

                           public boolean isCreateMsgSpecified(){
                               return localCreateMsgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.CreateMsg
                           */
                           public  com.rightnow.ws.messages.CreateMsg getCreateMsg(){
                               return localCreateMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreateMsg
                               */
                               public void setCreateMsg(com.rightnow.ws.messages.CreateMsg param){
                            
                                clearAllSettingTrackers();
                            localCreateMsgTracker = param != null;
                                   
                                            this.localCreateMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetMsg
                        */

                        
                                    protected com.rightnow.ws.messages.GetMsg localGetMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetMsgTracker = false ;

                           public boolean isGetMsgSpecified(){
                               return localGetMsgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.GetMsg
                           */
                           public  com.rightnow.ws.messages.GetMsg getGetMsg(){
                               return localGetMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetMsg
                               */
                               public void setGetMsg(com.rightnow.ws.messages.GetMsg param){
                            
                                clearAllSettingTrackers();
                            localGetMsgTracker = param != null;
                                   
                                            this.localGetMsg=param;
                                    

                               }
                            

                        /**
                        * field for UpdateMsg
                        */

                        
                                    protected com.rightnow.ws.messages.UpdateMsg localUpdateMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUpdateMsgTracker = false ;

                           public boolean isUpdateMsgSpecified(){
                               return localUpdateMsgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.UpdateMsg
                           */
                           public  com.rightnow.ws.messages.UpdateMsg getUpdateMsg(){
                               return localUpdateMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UpdateMsg
                               */
                               public void setUpdateMsg(com.rightnow.ws.messages.UpdateMsg param){
                            
                                clearAllSettingTrackers();
                            localUpdateMsgTracker = param != null;
                                   
                                            this.localUpdateMsg=param;
                                    

                               }
                            

                        /**
                        * field for DestroyMsg
                        */

                        
                                    protected com.rightnow.ws.messages.DestroyMsg localDestroyMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDestroyMsgTracker = false ;

                           public boolean isDestroyMsgSpecified(){
                               return localDestroyMsgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.DestroyMsg
                           */
                           public  com.rightnow.ws.messages.DestroyMsg getDestroyMsg(){
                               return localDestroyMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DestroyMsg
                               */
                               public void setDestroyMsg(com.rightnow.ws.messages.DestroyMsg param){
                            
                                clearAllSettingTrackers();
                            localDestroyMsgTracker = param != null;
                                   
                                            this.localDestroyMsg=param;
                                    

                               }
                            

                        /**
                        * field for QueryCSVMsg
                        */

                        
                                    protected com.rightnow.ws.messages.QueryMsg localQueryCSVMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQueryCSVMsgTracker = false ;

                           public boolean isQueryCSVMsgSpecified(){
                               return localQueryCSVMsgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.QueryMsg
                           */
                           public  com.rightnow.ws.messages.QueryMsg getQueryCSVMsg(){
                               return localQueryCSVMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QueryCSVMsg
                               */
                               public void setQueryCSVMsg(com.rightnow.ws.messages.QueryMsg param){
                            
                                clearAllSettingTrackers();
                            localQueryCSVMsgTracker = param != null;
                                   
                                            this.localQueryCSVMsg=param;
                                    

                               }
                            

                        /**
                        * field for QueryObjectsMsg
                        */

                        
                                    protected com.rightnow.ws.messages.QueryObjectsMsg localQueryObjectsMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQueryObjectsMsgTracker = false ;

                           public boolean isQueryObjectsMsgSpecified(){
                               return localQueryObjectsMsgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.QueryObjectsMsg
                           */
                           public  com.rightnow.ws.messages.QueryObjectsMsg getQueryObjectsMsg(){
                               return localQueryObjectsMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param QueryObjectsMsg
                               */
                               public void setQueryObjectsMsg(com.rightnow.ws.messages.QueryObjectsMsg param){
                            
                                clearAllSettingTrackers();
                            localQueryObjectsMsgTracker = param != null;
                                   
                                            this.localQueryObjectsMsg=param;
                                    

                               }
                            

                        /**
                        * field for ExecuteMarketingFlowMsg
                        */

                        
                                    protected com.rightnow.ws.messages.ExecuteMarketingFlowMsg localExecuteMarketingFlowMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExecuteMarketingFlowMsgTracker = false ;

                           public boolean isExecuteMarketingFlowMsgSpecified(){
                               return localExecuteMarketingFlowMsgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.ExecuteMarketingFlowMsg
                           */
                           public  com.rightnow.ws.messages.ExecuteMarketingFlowMsg getExecuteMarketingFlowMsg(){
                               return localExecuteMarketingFlowMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExecuteMarketingFlowMsg
                               */
                               public void setExecuteMarketingFlowMsg(com.rightnow.ws.messages.ExecuteMarketingFlowMsg param){
                            
                                clearAllSettingTrackers();
                            localExecuteMarketingFlowMsgTracker = param != null;
                                   
                                            this.localExecuteMarketingFlowMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetFileDataMsg
                        */

                        
                                    protected com.rightnow.ws.messages.GetFileDataMsg localGetFileDataMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetFileDataMsgTracker = false ;

                           public boolean isGetFileDataMsgSpecified(){
                               return localGetFileDataMsgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.GetFileDataMsg
                           */
                           public  com.rightnow.ws.messages.GetFileDataMsg getGetFileDataMsg(){
                               return localGetFileDataMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetFileDataMsg
                               */
                               public void setGetFileDataMsg(com.rightnow.ws.messages.GetFileDataMsg param){
                            
                                clearAllSettingTrackers();
                            localGetFileDataMsgTracker = param != null;
                                   
                                            this.localGetFileDataMsg=param;
                                    

                               }
                            

                        /**
                        * field for ResetContactPasswordMsg
                        */

                        
                                    protected com.rightnow.ws.messages.ResetContactPasswordMsg localResetContactPasswordMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResetContactPasswordMsgTracker = false ;

                           public boolean isResetContactPasswordMsgSpecified(){
                               return localResetContactPasswordMsgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.ResetContactPasswordMsg
                           */
                           public  com.rightnow.ws.messages.ResetContactPasswordMsg getResetContactPasswordMsg(){
                               return localResetContactPasswordMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResetContactPasswordMsg
                               */
                               public void setResetContactPasswordMsg(com.rightnow.ws.messages.ResetContactPasswordMsg param){
                            
                                clearAllSettingTrackers();
                            localResetContactPasswordMsgTracker = param != null;
                                   
                                            this.localResetContactPasswordMsg=param;
                                    

                               }
                            

                        /**
                        * field for SendMailingToContactMsg
                        */

                        
                                    protected com.rightnow.ws.messages.SendMailingToContactMsg localSendMailingToContactMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSendMailingToContactMsgTracker = false ;

                           public boolean isSendMailingToContactMsgSpecified(){
                               return localSendMailingToContactMsgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.SendMailingToContactMsg
                           */
                           public  com.rightnow.ws.messages.SendMailingToContactMsg getSendMailingToContactMsg(){
                               return localSendMailingToContactMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SendMailingToContactMsg
                               */
                               public void setSendMailingToContactMsg(com.rightnow.ws.messages.SendMailingToContactMsg param){
                            
                                clearAllSettingTrackers();
                            localSendMailingToContactMsgTracker = param != null;
                                   
                                            this.localSendMailingToContactMsg=param;
                                    

                               }
                            

                        /**
                        * field for TransferSubObjectsMsg
                        */

                        
                                    protected com.rightnow.ws.messages.TransferSubObjectsMsg localTransferSubObjectsMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransferSubObjectsMsgTracker = false ;

                           public boolean isTransferSubObjectsMsgSpecified(){
                               return localTransferSubObjectsMsgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.TransferSubObjectsMsg
                           */
                           public  com.rightnow.ws.messages.TransferSubObjectsMsg getTransferSubObjectsMsg(){
                               return localTransferSubObjectsMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransferSubObjectsMsg
                               */
                               public void setTransferSubObjectsMsg(com.rightnow.ws.messages.TransferSubObjectsMsg param){
                            
                                clearAllSettingTrackers();
                            localTransferSubObjectsMsgTracker = param != null;
                                   
                                            this.localTransferSubObjectsMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetMetaDataMsg
                        */

                        
                                    protected com.rightnow.ws.messages.GetMetaDataMsg localGetMetaDataMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetMetaDataMsgTracker = false ;

                           public boolean isGetMetaDataMsgSpecified(){
                               return localGetMetaDataMsgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.GetMetaDataMsg
                           */
                           public  com.rightnow.ws.messages.GetMetaDataMsg getGetMetaDataMsg(){
                               return localGetMetaDataMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetMetaDataMsg
                               */
                               public void setGetMetaDataMsg(com.rightnow.ws.messages.GetMetaDataMsg param){
                            
                                clearAllSettingTrackers();
                            localGetMetaDataMsgTracker = param != null;
                                   
                                            this.localGetMetaDataMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetMetaDataForClassMsg
                        */

                        
                                    protected com.rightnow.ws.messages.GetMetaDataForClassMsg localGetMetaDataForClassMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetMetaDataForClassMsgTracker = false ;

                           public boolean isGetMetaDataForClassMsgSpecified(){
                               return localGetMetaDataForClassMsgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.GetMetaDataForClassMsg
                           */
                           public  com.rightnow.ws.messages.GetMetaDataForClassMsg getGetMetaDataForClassMsg(){
                               return localGetMetaDataForClassMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetMetaDataForClassMsg
                               */
                               public void setGetMetaDataForClassMsg(com.rightnow.ws.messages.GetMetaDataForClassMsg param){
                            
                                clearAllSettingTrackers();
                            localGetMetaDataForClassMsgTracker = param != null;
                                   
                                            this.localGetMetaDataForClassMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetMetaDataForOperationMsg
                        */

                        
                                    protected com.rightnow.ws.messages.GetMetaDataForOperationMsg localGetMetaDataForOperationMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetMetaDataForOperationMsgTracker = false ;

                           public boolean isGetMetaDataForOperationMsgSpecified(){
                               return localGetMetaDataForOperationMsgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.GetMetaDataForOperationMsg
                           */
                           public  com.rightnow.ws.messages.GetMetaDataForOperationMsg getGetMetaDataForOperationMsg(){
                               return localGetMetaDataForOperationMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetMetaDataForOperationMsg
                               */
                               public void setGetMetaDataForOperationMsg(com.rightnow.ws.messages.GetMetaDataForOperationMsg param){
                            
                                clearAllSettingTrackers();
                            localGetMetaDataForOperationMsgTracker = param != null;
                                   
                                            this.localGetMetaDataForOperationMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetMetaDataLastChangeTimeMsg
                        */

                        
                                    protected com.rightnow.ws.messages.GetMetaDataLastChangeTimeMsg localGetMetaDataLastChangeTimeMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetMetaDataLastChangeTimeMsgTracker = false ;

                           public boolean isGetMetaDataLastChangeTimeMsgSpecified(){
                               return localGetMetaDataLastChangeTimeMsgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.GetMetaDataLastChangeTimeMsg
                           */
                           public  com.rightnow.ws.messages.GetMetaDataLastChangeTimeMsg getGetMetaDataLastChangeTimeMsg(){
                               return localGetMetaDataLastChangeTimeMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetMetaDataLastChangeTimeMsg
                               */
                               public void setGetMetaDataLastChangeTimeMsg(com.rightnow.ws.messages.GetMetaDataLastChangeTimeMsg param){
                            
                                clearAllSettingTrackers();
                            localGetMetaDataLastChangeTimeMsgTracker = param != null;
                                   
                                            this.localGetMetaDataLastChangeTimeMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetPrimaryClassNamesMsg
                        */

                        
                                    protected com.rightnow.ws.messages.GetPrimaryClassNamesMsg localGetPrimaryClassNamesMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetPrimaryClassNamesMsgTracker = false ;

                           public boolean isGetPrimaryClassNamesMsgSpecified(){
                               return localGetPrimaryClassNamesMsgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.GetPrimaryClassNamesMsg
                           */
                           public  com.rightnow.ws.messages.GetPrimaryClassNamesMsg getGetPrimaryClassNamesMsg(){
                               return localGetPrimaryClassNamesMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetPrimaryClassNamesMsg
                               */
                               public void setGetPrimaryClassNamesMsg(com.rightnow.ws.messages.GetPrimaryClassNamesMsg param){
                            
                                clearAllSettingTrackers();
                            localGetPrimaryClassNamesMsgTracker = param != null;
                                   
                                            this.localGetPrimaryClassNamesMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetValuesForNamedIDMsg
                        */

                        
                                    protected com.rightnow.ws.messages.GetValuesForNamedIDMsg localGetValuesForNamedIDMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetValuesForNamedIDMsgTracker = false ;

                           public boolean isGetValuesForNamedIDMsgSpecified(){
                               return localGetValuesForNamedIDMsgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.GetValuesForNamedIDMsg
                           */
                           public  com.rightnow.ws.messages.GetValuesForNamedIDMsg getGetValuesForNamedIDMsg(){
                               return localGetValuesForNamedIDMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetValuesForNamedIDMsg
                               */
                               public void setGetValuesForNamedIDMsg(com.rightnow.ws.messages.GetValuesForNamedIDMsg param){
                            
                                clearAllSettingTrackers();
                            localGetValuesForNamedIDMsgTracker = param != null;
                                   
                                            this.localGetValuesForNamedIDMsg=param;
                                    

                               }
                            

                        /**
                        * field for GetValuesForNamedIDHierarchyMsg
                        */

                        
                                    protected com.rightnow.ws.messages.GetValuesForNamedIDHierarchyMsg localGetValuesForNamedIDHierarchyMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localGetValuesForNamedIDHierarchyMsgTracker = false ;

                           public boolean isGetValuesForNamedIDHierarchyMsgSpecified(){
                               return localGetValuesForNamedIDHierarchyMsgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.GetValuesForNamedIDHierarchyMsg
                           */
                           public  com.rightnow.ws.messages.GetValuesForNamedIDHierarchyMsg getGetValuesForNamedIDHierarchyMsg(){
                               return localGetValuesForNamedIDHierarchyMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param GetValuesForNamedIDHierarchyMsg
                               */
                               public void setGetValuesForNamedIDHierarchyMsg(com.rightnow.ws.messages.GetValuesForNamedIDHierarchyMsg param){
                            
                                clearAllSettingTrackers();
                            localGetValuesForNamedIDHierarchyMsgTracker = param != null;
                                   
                                            this.localGetValuesForNamedIDHierarchyMsg=param;
                                    

                               }
                            

                        /**
                        * field for RunAnalyticsReportMsg
                        */

                        
                                    protected com.rightnow.ws.messages.RunAnalyticsReportMsg localRunAnalyticsReportMsg ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRunAnalyticsReportMsgTracker = false ;

                           public boolean isRunAnalyticsReportMsgSpecified(){
                               return localRunAnalyticsReportMsgTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.messages.RunAnalyticsReportMsg
                           */
                           public  com.rightnow.ws.messages.RunAnalyticsReportMsg getRunAnalyticsReportMsg(){
                               return localRunAnalyticsReportMsg;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RunAnalyticsReportMsg
                               */
                               public void setRunAnalyticsReportMsg(com.rightnow.ws.messages.RunAnalyticsReportMsg param){
                            
                                clearAllSettingTrackers();
                            localRunAnalyticsReportMsgTracker = param != null;
                                   
                                            this.localRunAnalyticsReportMsg=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn:messages.ws.rightnow.com/v1_3");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":BatchRequestItemChoice_type0",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "BatchRequestItemChoice_type0",
                           xmlWriter);
                   }

               
                   }
                if (localCreateMsgTracker){
                                            if (localCreateMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CreateMsg cannot be null!!");
                                            }
                                           localCreateMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","CreateMsg"),
                                               xmlWriter);
                                        } if (localGetMsgTracker){
                                            if (localGetMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetMsg cannot be null!!");
                                            }
                                           localGetMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetMsg"),
                                               xmlWriter);
                                        } if (localUpdateMsgTracker){
                                            if (localUpdateMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("UpdateMsg cannot be null!!");
                                            }
                                           localUpdateMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","UpdateMsg"),
                                               xmlWriter);
                                        } if (localDestroyMsgTracker){
                                            if (localDestroyMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("DestroyMsg cannot be null!!");
                                            }
                                           localDestroyMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","DestroyMsg"),
                                               xmlWriter);
                                        } if (localQueryCSVMsgTracker){
                                            if (localQueryCSVMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("QueryCSVMsg cannot be null!!");
                                            }
                                           localQueryCSVMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","QueryCSVMsg"),
                                               xmlWriter);
                                        } if (localQueryObjectsMsgTracker){
                                            if (localQueryObjectsMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("QueryObjectsMsg cannot be null!!");
                                            }
                                           localQueryObjectsMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","QueryObjectsMsg"),
                                               xmlWriter);
                                        } if (localExecuteMarketingFlowMsgTracker){
                                            if (localExecuteMarketingFlowMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ExecuteMarketingFlowMsg cannot be null!!");
                                            }
                                           localExecuteMarketingFlowMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","ExecuteMarketingFlowMsg"),
                                               xmlWriter);
                                        } if (localGetFileDataMsgTracker){
                                            if (localGetFileDataMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetFileDataMsg cannot be null!!");
                                            }
                                           localGetFileDataMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetFileDataMsg"),
                                               xmlWriter);
                                        } if (localResetContactPasswordMsgTracker){
                                            if (localResetContactPasswordMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ResetContactPasswordMsg cannot be null!!");
                                            }
                                           localResetContactPasswordMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","ResetContactPasswordMsg"),
                                               xmlWriter);
                                        } if (localSendMailingToContactMsgTracker){
                                            if (localSendMailingToContactMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("SendMailingToContactMsg cannot be null!!");
                                            }
                                           localSendMailingToContactMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","SendMailingToContactMsg"),
                                               xmlWriter);
                                        } if (localTransferSubObjectsMsgTracker){
                                            if (localTransferSubObjectsMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TransferSubObjectsMsg cannot be null!!");
                                            }
                                           localTransferSubObjectsMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","TransferSubObjectsMsg"),
                                               xmlWriter);
                                        } if (localGetMetaDataMsgTracker){
                                            if (localGetMetaDataMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetMetaDataMsg cannot be null!!");
                                            }
                                           localGetMetaDataMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetMetaDataMsg"),
                                               xmlWriter);
                                        } if (localGetMetaDataForClassMsgTracker){
                                            if (localGetMetaDataForClassMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetMetaDataForClassMsg cannot be null!!");
                                            }
                                           localGetMetaDataForClassMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetMetaDataForClassMsg"),
                                               xmlWriter);
                                        } if (localGetMetaDataForOperationMsgTracker){
                                            if (localGetMetaDataForOperationMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetMetaDataForOperationMsg cannot be null!!");
                                            }
                                           localGetMetaDataForOperationMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetMetaDataForOperationMsg"),
                                               xmlWriter);
                                        } if (localGetMetaDataLastChangeTimeMsgTracker){
                                            if (localGetMetaDataLastChangeTimeMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetMetaDataLastChangeTimeMsg cannot be null!!");
                                            }
                                           localGetMetaDataLastChangeTimeMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetMetaDataLastChangeTimeMsg"),
                                               xmlWriter);
                                        } if (localGetPrimaryClassNamesMsgTracker){
                                            if (localGetPrimaryClassNamesMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetPrimaryClassNamesMsg cannot be null!!");
                                            }
                                           localGetPrimaryClassNamesMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetPrimaryClassNamesMsg"),
                                               xmlWriter);
                                        } if (localGetValuesForNamedIDMsgTracker){
                                            if (localGetValuesForNamedIDMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetValuesForNamedIDMsg cannot be null!!");
                                            }
                                           localGetValuesForNamedIDMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetValuesForNamedIDMsg"),
                                               xmlWriter);
                                        } if (localGetValuesForNamedIDHierarchyMsgTracker){
                                            if (localGetValuesForNamedIDHierarchyMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("GetValuesForNamedIDHierarchyMsg cannot be null!!");
                                            }
                                           localGetValuesForNamedIDHierarchyMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetValuesForNamedIDHierarchyMsg"),
                                               xmlWriter);
                                        } if (localRunAnalyticsReportMsgTracker){
                                            if (localRunAnalyticsReportMsg==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RunAnalyticsReportMsg cannot be null!!");
                                            }
                                           localRunAnalyticsReportMsg.serialize(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","RunAnalyticsReportMsg"),
                                               xmlWriter);
                                        }

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("urn:messages.ws.rightnow.com/v1_3")){
                return "ns7";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localCreateMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "CreateMsg"));
                            
                            
                                    if (localCreateMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("CreateMsg cannot be null!!");
                                    }
                                    elementList.add(localCreateMsg);
                                } if (localGetMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "GetMsg"));
                            
                            
                                    if (localGetMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetMsg cannot be null!!");
                                    }
                                    elementList.add(localGetMsg);
                                } if (localUpdateMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "UpdateMsg"));
                            
                            
                                    if (localUpdateMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("UpdateMsg cannot be null!!");
                                    }
                                    elementList.add(localUpdateMsg);
                                } if (localDestroyMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "DestroyMsg"));
                            
                            
                                    if (localDestroyMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("DestroyMsg cannot be null!!");
                                    }
                                    elementList.add(localDestroyMsg);
                                } if (localQueryCSVMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "QueryCSVMsg"));
                            
                            
                                    if (localQueryCSVMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("QueryCSVMsg cannot be null!!");
                                    }
                                    elementList.add(localQueryCSVMsg);
                                } if (localQueryObjectsMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "QueryObjectsMsg"));
                            
                            
                                    if (localQueryObjectsMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("QueryObjectsMsg cannot be null!!");
                                    }
                                    elementList.add(localQueryObjectsMsg);
                                } if (localExecuteMarketingFlowMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "ExecuteMarketingFlowMsg"));
                            
                            
                                    if (localExecuteMarketingFlowMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("ExecuteMarketingFlowMsg cannot be null!!");
                                    }
                                    elementList.add(localExecuteMarketingFlowMsg);
                                } if (localGetFileDataMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "GetFileDataMsg"));
                            
                            
                                    if (localGetFileDataMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetFileDataMsg cannot be null!!");
                                    }
                                    elementList.add(localGetFileDataMsg);
                                } if (localResetContactPasswordMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "ResetContactPasswordMsg"));
                            
                            
                                    if (localResetContactPasswordMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("ResetContactPasswordMsg cannot be null!!");
                                    }
                                    elementList.add(localResetContactPasswordMsg);
                                } if (localSendMailingToContactMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "SendMailingToContactMsg"));
                            
                            
                                    if (localSendMailingToContactMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("SendMailingToContactMsg cannot be null!!");
                                    }
                                    elementList.add(localSendMailingToContactMsg);
                                } if (localTransferSubObjectsMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "TransferSubObjectsMsg"));
                            
                            
                                    if (localTransferSubObjectsMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("TransferSubObjectsMsg cannot be null!!");
                                    }
                                    elementList.add(localTransferSubObjectsMsg);
                                } if (localGetMetaDataMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "GetMetaDataMsg"));
                            
                            
                                    if (localGetMetaDataMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetMetaDataMsg cannot be null!!");
                                    }
                                    elementList.add(localGetMetaDataMsg);
                                } if (localGetMetaDataForClassMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "GetMetaDataForClassMsg"));
                            
                            
                                    if (localGetMetaDataForClassMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetMetaDataForClassMsg cannot be null!!");
                                    }
                                    elementList.add(localGetMetaDataForClassMsg);
                                } if (localGetMetaDataForOperationMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "GetMetaDataForOperationMsg"));
                            
                            
                                    if (localGetMetaDataForOperationMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetMetaDataForOperationMsg cannot be null!!");
                                    }
                                    elementList.add(localGetMetaDataForOperationMsg);
                                } if (localGetMetaDataLastChangeTimeMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "GetMetaDataLastChangeTimeMsg"));
                            
                            
                                    if (localGetMetaDataLastChangeTimeMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetMetaDataLastChangeTimeMsg cannot be null!!");
                                    }
                                    elementList.add(localGetMetaDataLastChangeTimeMsg);
                                } if (localGetPrimaryClassNamesMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "GetPrimaryClassNamesMsg"));
                            
                            
                                    if (localGetPrimaryClassNamesMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetPrimaryClassNamesMsg cannot be null!!");
                                    }
                                    elementList.add(localGetPrimaryClassNamesMsg);
                                } if (localGetValuesForNamedIDMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "GetValuesForNamedIDMsg"));
                            
                            
                                    if (localGetValuesForNamedIDMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetValuesForNamedIDMsg cannot be null!!");
                                    }
                                    elementList.add(localGetValuesForNamedIDMsg);
                                } if (localGetValuesForNamedIDHierarchyMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "GetValuesForNamedIDHierarchyMsg"));
                            
                            
                                    if (localGetValuesForNamedIDHierarchyMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("GetValuesForNamedIDHierarchyMsg cannot be null!!");
                                    }
                                    elementList.add(localGetValuesForNamedIDHierarchyMsg);
                                } if (localRunAnalyticsReportMsgTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3",
                                                                      "RunAnalyticsReportMsg"));
                            
                            
                                    if (localRunAnalyticsReportMsg==null){
                                         throw new org.apache.axis2.databinding.ADBException("RunAnalyticsReportMsg cannot be null!!");
                                    }
                                    elementList.add(localRunAnalyticsReportMsg);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static BatchRequestItemChoice_type0 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            BatchRequestItemChoice_type0 object =
                new BatchRequestItemChoice_type0();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","CreateMsg").equals(reader.getName())){
                                
                                                object.setCreateMsg(com.rightnow.ws.messages.CreateMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetMsg").equals(reader.getName())){
                                
                                                object.setGetMsg(com.rightnow.ws.messages.GetMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","UpdateMsg").equals(reader.getName())){
                                
                                                object.setUpdateMsg(com.rightnow.ws.messages.UpdateMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","DestroyMsg").equals(reader.getName())){
                                
                                                object.setDestroyMsg(com.rightnow.ws.messages.DestroyMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","QueryCSVMsg").equals(reader.getName())){
                                
                                                object.setQueryCSVMsg(com.rightnow.ws.messages.QueryMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","QueryObjectsMsg").equals(reader.getName())){
                                
                                                object.setQueryObjectsMsg(com.rightnow.ws.messages.QueryObjectsMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","ExecuteMarketingFlowMsg").equals(reader.getName())){
                                
                                                object.setExecuteMarketingFlowMsg(com.rightnow.ws.messages.ExecuteMarketingFlowMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetFileDataMsg").equals(reader.getName())){
                                
                                                object.setGetFileDataMsg(com.rightnow.ws.messages.GetFileDataMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","ResetContactPasswordMsg").equals(reader.getName())){
                                
                                                object.setResetContactPasswordMsg(com.rightnow.ws.messages.ResetContactPasswordMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","SendMailingToContactMsg").equals(reader.getName())){
                                
                                                object.setSendMailingToContactMsg(com.rightnow.ws.messages.SendMailingToContactMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","TransferSubObjectsMsg").equals(reader.getName())){
                                
                                                object.setTransferSubObjectsMsg(com.rightnow.ws.messages.TransferSubObjectsMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetMetaDataMsg").equals(reader.getName())){
                                
                                                object.setGetMetaDataMsg(com.rightnow.ws.messages.GetMetaDataMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetMetaDataForClassMsg").equals(reader.getName())){
                                
                                                object.setGetMetaDataForClassMsg(com.rightnow.ws.messages.GetMetaDataForClassMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetMetaDataForOperationMsg").equals(reader.getName())){
                                
                                                object.setGetMetaDataForOperationMsg(com.rightnow.ws.messages.GetMetaDataForOperationMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetMetaDataLastChangeTimeMsg").equals(reader.getName())){
                                
                                                object.setGetMetaDataLastChangeTimeMsg(com.rightnow.ws.messages.GetMetaDataLastChangeTimeMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetPrimaryClassNamesMsg").equals(reader.getName())){
                                
                                                object.setGetPrimaryClassNamesMsg(com.rightnow.ws.messages.GetPrimaryClassNamesMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetValuesForNamedIDMsg").equals(reader.getName())){
                                
                                                object.setGetValuesForNamedIDMsg(com.rightnow.ws.messages.GetValuesForNamedIDMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","GetValuesForNamedIDHierarchyMsg").equals(reader.getName())){
                                
                                                object.setGetValuesForNamedIDHierarchyMsg(com.rightnow.ws.messages.GetValuesForNamedIDHierarchyMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:messages.ws.rightnow.com/v1_3","RunAnalyticsReportMsg").equals(reader.getName())){
                                
                                                object.setRunAnalyticsReportMsg(com.rightnow.ws.messages.RunAnalyticsReportMsg.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
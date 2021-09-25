
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package com.rightnow.ws.objects;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AssignedSLAInstance".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.AssignedSLAInstance.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "OpportunityNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.OpportunityNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "Phone".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.Phone.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AccountNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.AccountNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "EventSubscription".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.EventSubscription.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "PurchasedProduct".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.PurchasedProduct.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:base.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "NamedReadOnlyID".equals(typeName)){
                   
                            return  com.rightnow.ws.base.NamedReadOnlyID.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "OpportunityContactDelta".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.OpportunityContactDelta.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "IncidentContact".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.IncidentContact.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GetMetaDataLastChangeTimeResponseMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.GetMetaDataLastChangeTimeResponseMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GetResponseMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.GetResponseMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:metadata.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MetaDataAttributeList".equals(typeName)){
                   
                            return  com.rightnow.ws.metadata.MetaDataAttributeList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GetMetaDataLastChangeTimeMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.GetMetaDataLastChangeTimeMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "OrganizationSalesSettings".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.OrganizationSalesSettings.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "TimeBilledNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.TimeBilledNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ServiceProductDelta".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.ServiceProductDelta.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "Variable".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.Variable.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "FileAttachmentIncidentList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.FileAttachmentIncidentList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "CreateProcessingOptions".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.CreateProcessingOptions.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "QueryResultData".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.QueryResultData.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:base.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ID".equals(typeName)){
                   
                            return  com.rightnow.ws.base.ID.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MailMessageRecipientsNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.MailMessageRecipientsNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "NoteList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.NoteList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ThreadList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.ThreadList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:faults.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ExceptionCode".equals(typeName)){
                   
                            return  com.rightnow.ws.faults.ExceptionCode.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GetMetaDataForClassResponseMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.GetMetaDataForClassResponseMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:base.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "NamedIDWithParent".equals(typeName)){
                   
                            return  com.rightnow.ws.base.NamedIDWithParent.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "OpportunityContactList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.OpportunityContactList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "SiteInterface".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.SiteInterface.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "SalesProductSchedule".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.SalesProductSchedule.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ContactSalesSettings".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.ContactSalesSettings.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:base.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ConnectError".equals(typeName)){
                   
                            return  com.rightnow.ws.base.ConnectError.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:base.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ChainDestinationID".equals(typeName)){
                   
                            return  com.rightnow.ws.base.ChainDestinationID.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "TimeBilledList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.TimeBilledList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "SendMailingToContactResponseMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.SendMailingToContactResponseMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "TypedAddressList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.TypedAddressList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "RunAnalyticsReportMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.RunAnalyticsReportMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "Incident".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.Incident.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "SLAInstance".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.SLAInstance.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MailMessageBody".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.MailMessageBody.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MailMessage".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.MailMessage.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ConvertObjectResponseMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.ConvertObjectResponseMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "OrganizationServiceSettingsNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.OrganizationServiceSettingsNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "EmailList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.EmailList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "FileAttachmentShared".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.FileAttachmentShared.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "Contact".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.Contact.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AccountSalesSettingsNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.AccountSalesSettingsNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "DestroyProcessingOptions".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.DestroyProcessingOptions.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "IncidentContactDelta".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.IncidentContactDelta.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "LabelRequired".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.LabelRequired.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:metadata.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MetaDataKeyTypeEnum".equals(typeName)){
                   
                            return  com.rightnow.ws.metadata.MetaDataKeyTypeEnum.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AccountSalesSettings".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.AccountSalesSettings.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "TransferSubObjectsMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.TransferSubObjectsMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "OpportunityContactNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.OpportunityContactNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:metadata.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "SubscriptionEvents".equals(typeName)){
                   
                            return  com.rightnow.ws.metadata.SubscriptionEvents.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GetValuesForNamedIDMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.GetValuesForNamedIDMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "Task".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.Task.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ExecuteMarketingFlowMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.ExecuteMarketingFlowMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GetFileDataMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.GetFileDataMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:base.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ActionEnum".equals(typeName)){
                   
                            return  com.rightnow.ws.base.ActionEnum.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:metadata.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MetaDataAttributeUsage".equals(typeName)){
                   
                            return  com.rightnow.ws.metadata.MetaDataAttributeUsage.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:generic.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GenericObject".equals(typeName)){
                   
                            return  com.rightnow.ws.generic.GenericObject.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "IncidentNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.IncidentNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "OpportunityContact".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.OpportunityContact.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ServiceDisposition".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.ServiceDisposition.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "StageWithStrategy".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.StageWithStrategy.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ContactOpenIDAccount".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.ContactOpenIDAccount.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "FileAttachmentList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.FileAttachmentList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MailboxOutgoingEmailSettingsNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.MailboxOutgoingEmailSettingsNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ProductNotificationList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.ProductNotificationList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AnswerNotificationNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.AnswerNotificationNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GetSubscribableObjectsMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.GetSubscribableObjectsMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ContactSalesSettingsNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.ContactSalesSettingsNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "SalesProductOptions".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.SalesProductOptions.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ProvinceList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.ProvinceList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GetMetaDataForClassMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.GetMetaDataForClassMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "CRMModules".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.CRMModules.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "BatchResponseItem".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.BatchResponseItem.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "UpdateResponseMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.UpdateResponseMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "Province".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.Province.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:base.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ConnectErrorDetail".equals(typeName)){
                   
                            return  com.rightnow.ws.base.ConnectErrorDetail.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "FileAttachmentIncident".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.FileAttachmentIncident.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AddressNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.AddressNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "CategoryNotificationList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.CategoryNotificationList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "BatchMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.BatchMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "OrganizationSalesSettingsNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.OrganizationSalesSettingsNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "QuoteNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.QuoteNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "Organization".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.Organization.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "PersonNameNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.PersonNameNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "CreateResponseMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.CreateResponseMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AccountOptions".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.AccountOptions.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AnalyticsReportSearchFilter".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.AnalyticsReportSearchFilter.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ContactServiceSettings".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.ContactServiceSettings.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "FileAttachmentCommon".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.FileAttachmentCommon.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GetMetaDataForOperationResponseMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.GetMetaDataForOperationResponseMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AnswerRelatedAnswerList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.AnswerRelatedAnswerList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:metadata.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MetaDataRelationship".equals(typeName)){
                   
                            return  com.rightnow.ws.metadata.MetaDataRelationship.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "TaskServiceSettings".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.TaskServiceSettings.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ContactMarketingSettingsNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.ContactMarketingSettingsNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "TransferSubObjectsResponseMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.TransferSubObjectsResponseMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:faults.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "UnexpectedErrorFaultType".equals(typeName)){
                   
                            return  com.rightnow.ws.faults.UnexpectedErrorFaultType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "TaskMarketingSettings".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.TaskMarketingSettings.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ContactMarketingSettings".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.ContactMarketingSettings.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ChannelType".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.ChannelType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "SalesProductScheduleNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.SalesProductScheduleNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "CategoryNotificationNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.CategoryNotificationNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GroupAccountNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.GroupAccountNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "Banner".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.Banner.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ChannelUsernameNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.ChannelUsernameNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:metadata.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "UsageTypeEnum".equals(typeName)){
                   
                            return  com.rightnow.ws.metadata.UsageTypeEnum.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "Thread".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.Thread.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "RNObjectsResult".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.RNObjectsResult.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MailMessageNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.MailMessageNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "DestroyMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.DestroyMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MailMessageSendResponseMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.MailMessageSendResponseMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "UpdateMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.UpdateMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ResetContactPasswordResponseMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.ResetContactPasswordResponseMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "BatchResponseMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.BatchResponseMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "PhoneList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.PhoneList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "CSVTableSet".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.CSVTableSet.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "Asset".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.Asset.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ResetContactPasswordMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.ResetContactPasswordMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "StatusWithType".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.StatusWithType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "Account".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.Account.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "DestroyResponseMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.DestroyResponseMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AnalyticsReport".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.AnalyticsReport.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "Address".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.Address.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "PersonFullName".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.PersonFullName.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GetMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.GetMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GetPrimaryClassNamesResponseMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.GetPrimaryClassNamesResponseMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AnswerRelatedAnswer".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.AnswerRelatedAnswer.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:generic.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "DataValue".equals(typeName)){
                   
                            return  com.rightnow.ws.generic.DataValue.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "IncidentMilestoneInstanceList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.IncidentMilestoneInstanceList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:generic.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "RNObjectType".equals(typeName)){
                   
                            return  com.rightnow.ws.generic.RNObjectType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "Country".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.Country.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GetFileDataResponseMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.GetFileDataResponseMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "InheritOptions".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.InheritOptions.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "QueryObjectsMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.QueryObjectsMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ConvertObjectMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.ConvertObjectMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AnalyticsReportFilter".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.AnalyticsReportFilter.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "OrganizationServiceSettings".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.OrganizationServiceSettings.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "RunAnalyticsReportResponseMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.RunAnalyticsReportResponseMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:base.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "NamedIDHierarchy".equals(typeName)){
                   
                            return  com.rightnow.ws.base.NamedIDHierarchy.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MailboxIncomingEmailSettingsNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.MailboxIncomingEmailSettingsNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "IncidentContactList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.IncidentContactList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "SalesProductNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.SalesProductNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GetPrimaryClassNamesMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.GetPrimaryClassNamesMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ProductNotification".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.ProductNotification.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "Opportunity".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.Opportunity.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ChannelTypeOptions".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.ChannelTypeOptions.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MailMessageRecipients".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.MailMessageRecipients.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "StageWithStrategyNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.StageWithStrategyNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:faults.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "RNFault".equals(typeName)){
                   
                            return  com.rightnow.ws.faults.RNFault.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "NoteNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.NoteNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ProductNotificationNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.ProductNotificationNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ServiceProductList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.ServiceProductList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ChannelUsernameList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.ChannelUsernameList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AssetStatus".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.AssetStatus.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "SalesProductScheduleList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.SalesProductScheduleList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ServiceProduct".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.ServiceProduct.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MailMessageOptions".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.MailMessageOptions.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "StringFileAttachment".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.StringFileAttachment.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:base.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "NamedID".equals(typeName)){
                   
                            return  com.rightnow.ws.base.NamedID.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "Answer".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.Answer.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GetSubscribableObjectsResponseMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.GetSubscribableObjectsResponseMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "Quote".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.Quote.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MailMessageStatus".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.MailMessageStatus.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MailboxIncomingEmailSettings".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.MailboxIncomingEmailSettings.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "StandardContentUsage".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.StandardContentUsage.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "SLAInstanceList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.SLAInstanceList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "StandardContent".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.StandardContent.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:metadata.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MetaDataClass".equals(typeName)){
                   
                            return  com.rightnow.ws.metadata.MetaDataClass.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "LabelRequiredList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.LabelRequiredList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "CategoryNotification".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.CategoryNotification.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "StandardContentAttributes".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.StandardContentAttributes.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "PersonName".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.PersonName.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MessageContentType".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.MessageContentType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ThreadNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.ThreadNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "TaskNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.TaskNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MenuAssignableAccount".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.MenuAssignableAccount.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "TaskServiceSettingsNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.TaskServiceSettingsNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AccountServiceSettings".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.AccountServiceSettings.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "QueryCSVResponseMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.QueryCSVResponseMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:base.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "RNObject".equals(typeName)){
                   
                            return  com.rightnow.ws.base.RNObject.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MarketingMailbox".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.MarketingMailbox.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:metadata.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MetaDataAttribute".equals(typeName)){
                   
                            return  com.rightnow.ws.metadata.MetaDataAttribute.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "CSVRow".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.CSVRow.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "SharedFileAttachmentIncident".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.SharedFileAttachmentIncident.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AnalyticsReportColumn".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.AnalyticsReportColumn.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:base.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "NamedIDHierarchyList".equals(typeName)){
                   
                            return  com.rightnow.ws.base.NamedIDHierarchyList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "Email".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.Email.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AnalyticsReportFilterAttributes".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.AnalyticsReportFilterAttributes.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "SalesTerritory".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.SalesTerritory.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "FileAttachmentSharedList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.FileAttachmentSharedList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "FileAttachment".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.FileAttachment.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:metadata.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MetaDataNavigabilityEnum".equals(typeName)){
                   
                            return  com.rightnow.ws.metadata.MetaDataNavigabilityEnum.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "SharedFileAttachmentCommon".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.SharedFileAttachmentCommon.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "SubscribableObject".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.SubscribableObject.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ContactOpenIDAccountList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.ContactOpenIDAccountList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "SalesTerritoryNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.SalesTerritoryNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "Label".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.Label.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:faults.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ServerErrorFaultType".equals(typeName)){
                   
                            return  com.rightnow.ws.faults.ServerErrorFaultType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:generic.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GenericField".equals(typeName)){
                   
                            return  com.rightnow.ws.generic.GenericField.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ServiceDispositionDelta".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.ServiceDispositionDelta.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AnswerNotificationList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.AnswerNotificationList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:base.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "NamedIDList".equals(typeName)){
                   
                            return  com.rightnow.ws.base.NamedIDList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "TaskMarketingSettingsNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.TaskMarketingSettingsNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ServiceCategoryDelta".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.ServiceCategoryDelta.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "BannerNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.BannerNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GetProcessingOptions".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.GetProcessingOptions.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "StandardContentNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.StandardContentNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ServiceCategoryList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.ServiceCategoryList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "LabelList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.LabelList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ContactNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.ContactNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AnswerRelatedAnswerNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.AnswerRelatedAnswerNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MonetaryValueNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.MonetaryValueNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:metadata.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MetaDataOperationList".equals(typeName)){
                   
                            return  com.rightnow.ws.metadata.MetaDataOperationList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GetValuesForNamedIDResponseMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.GetValuesForNamedIDResponseMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "TaskSalesSettingsNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.TaskSalesSettingsNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ContactServiceSettingsNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.ContactServiceSettingsNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "FileAttachmentAnswerList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.FileAttachmentAnswerList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "CreateMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.CreateMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "Mailbox".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.Mailbox.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:base.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "NamedIDDeltaList".equals(typeName)){
                   
                            return  com.rightnow.ws.base.NamedIDDeltaList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:base.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "NamedIDDelta".equals(typeName)){
                   
                            return  com.rightnow.ws.base.NamedIDDelta.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "OrganizationNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.OrganizationNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AssetSLAInstance".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.AssetSLAInstance.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ServiceCategory".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.ServiceCategory.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "BatchRequestItem".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.BatchRequestItem.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ServiceCategoryNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.ServiceCategoryNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ServiceDispositionNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.ServiceDispositionNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AssignedSLAInstanceNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.AssignedSLAInstanceNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AnswerNotification".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.AnswerNotification.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "SalesProduct".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.SalesProduct.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "PurchasedProductNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.PurchasedProductNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "TimeBilled".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.TimeBilled.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GetMetaDataResponseMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.GetMetaDataResponseMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "QuoteLineItemNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.QuoteLineItemNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AssetNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.AssetNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "LabelNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.LabelNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GetValuesForNamedIDHierarchyMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.GetValuesForNamedIDHierarchyMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:metadata.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MetaDataAttributeUsageList".equals(typeName)){
                   
                            return  com.rightnow.ws.metadata.MetaDataAttributeUsageList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "Holiday".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.Holiday.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MailboxOutgoingEmailSettings".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.MailboxOutgoingEmailSettings.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "UpdateProcessingOptions".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.UpdateProcessingOptions.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "CountryNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.CountryNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ChannelUsername".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.ChannelUsername.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "CSVTables".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.CSVTables.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:base.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ChainSourceID".equals(typeName)){
                   
                            return  com.rightnow.ws.base.ChainSourceID.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "VariableNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.VariableNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AssetSLAInstanceList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.AssetSLAInstanceList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:metadata.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MetaDataCardinalityEnum".equals(typeName)){
                   
                            return  com.rightnow.ws.metadata.MetaDataCardinalityEnum.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "QuoteLineItem".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.QuoteLineItem.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:generic.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "DataTypeEnum".equals(typeName)){
                   
                            return  com.rightnow.ws.generic.DataTypeEnum.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "QueryMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.QueryMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "PagingResponse".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.PagingResponse.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "StandardContentContentValue".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.StandardContentContentValue.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MonetaryValue".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.MonetaryValue.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "HolidayNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.HolidayNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "QuoteList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.QuoteList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ServiceMailbox".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.ServiceMailbox.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "SendMailingToContactMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.SendMailingToContactMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "StandardContentContentValueNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.StandardContentContentValueNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MailboxNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.MailboxNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GetMetaDataMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.GetMetaDataMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:metadata.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MetaDataOperation".equals(typeName)){
                   
                            return  com.rightnow.ws.metadata.MetaDataOperation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "InterfaceValue".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.InterfaceValue.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "TypedAddress".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.TypedAddress.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GetValuesForNamedIDHierarchyResponseMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.GetValuesForNamedIDHierarchyResponseMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GetMetaDataForOperationMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.GetMetaDataForOperationMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MailMessageSendMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.MailMessageSendMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ExecuteMarketingFlowResponseMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.ExecuteMarketingFlowResponseMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "GroupAccount".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.GroupAccount.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "Configuration".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.Configuration.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AccessLevelType".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.AccessLevelType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "TaskSalesSettings".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.TaskSalesSettings.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "StandardContentContentValueList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.StandardContentContentValueList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MessageBase".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.MessageBase.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "FileAttachmentAnswer".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.FileAttachmentAnswer.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ServiceProductNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.ServiceProductNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:metadata.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MetaDataUsageEnum".equals(typeName)){
                   
                            return  com.rightnow.ws.metadata.MetaDataUsageEnum.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "IncidentMilestoneInstance".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.IncidentMilestoneInstance.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "Note".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.Note.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "SharedFileAttachmentAnswer".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.SharedFileAttachmentAnswer.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "SharedFileAttachmentShared".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.SharedFileAttachmentShared.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:faults.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "RequestErrorFaultType".equals(typeName)){
                   
                            return  com.rightnow.ws.faults.RequestErrorFaultType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:metadata.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "MetaDataClassOperation".equals(typeName)){
                   
                            return  com.rightnow.ws.metadata.MetaDataClassOperation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "FileAttachmentCommonList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.FileAttachmentCommonList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "QuoteLineItemList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.QuoteLineItemList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "ServiceDispositionList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.ServiceDispositionList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:nullfields.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AnswerNullFields".equals(typeName)){
                   
                            return  com.rightnow.ws.nullfields.AnswerNullFields.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "CSVTable".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.CSVTable.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:messages.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "QueryObjectsResponseMsg".equals(typeName)){
                   
                            return  com.rightnow.ws.messages.QueryObjectsResponseMsg.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "InterfaceValueList".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.InterfaceValueList.Factory.parse(reader);
                        

                  }

              
                  if (
                  "urn:objects.ws.rightnow.com/v1_3".equals(namespaceURI) &&
                  "AssetStatuses".equals(typeName)){
                   
                            return  com.rightnow.ws.objects.AssetStatuses.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
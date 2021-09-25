
/**
 * Incident.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.rightnow.ws.objects;
            

            /**
            *  Incident bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Incident extends com.rightnow.ws.base.RNObject
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Incident
                Namespace URI = urn:objects.ws.rightnow.com/v1_3
                Namespace Prefix = ns4
                */
            

                        /**
                        * field for Asset
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localAsset ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAssetTracker = false ;

                           public boolean isAssetSpecified(){
                               return localAssetTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getAsset(){
                               return localAsset;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Asset
                               */
                               public void setAsset(com.rightnow.ws.base.NamedID param){
                            localAssetTracker = true;
                                   
                                            this.localAsset=param;
                                    

                               }
                            

                        /**
                        * field for AssignedTo
                        */

                        
                                    protected com.rightnow.ws.objects.GroupAccount localAssignedTo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAssignedToTracker = false ;

                           public boolean isAssignedToSpecified(){
                               return localAssignedToTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.GroupAccount
                           */
                           public  com.rightnow.ws.objects.GroupAccount getAssignedTo(){
                               return localAssignedTo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AssignedTo
                               */
                               public void setAssignedTo(com.rightnow.ws.objects.GroupAccount param){
                            localAssignedToTracker = param != null;
                                   
                                            this.localAssignedTo=param;
                                    

                               }
                            

                        /**
                        * field for Banner
                        */

                        
                                    protected com.rightnow.ws.objects.Banner localBanner ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBannerTracker = false ;

                           public boolean isBannerSpecified(){
                               return localBannerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.Banner
                           */
                           public  com.rightnow.ws.objects.Banner getBanner(){
                               return localBanner;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Banner
                               */
                               public void setBanner(com.rightnow.ws.objects.Banner param){
                            localBannerTracker = param != null;
                                   
                                            this.localBanner=param;
                                    

                               }
                            

                        /**
                        * field for BilledMinutes
                        */

                        
                                    protected com.rightnow.ws.objects.TimeBilledList localBilledMinutes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBilledMinutesTracker = false ;

                           public boolean isBilledMinutesSpecified(){
                               return localBilledMinutesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.TimeBilledList
                           */
                           public  com.rightnow.ws.objects.TimeBilledList getBilledMinutes(){
                               return localBilledMinutes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BilledMinutes
                               */
                               public void setBilledMinutes(com.rightnow.ws.objects.TimeBilledList param){
                            localBilledMinutesTracker = true;
                                   
                                            this.localBilledMinutes=param;
                                    

                               }
                            

                        /**
                        * field for Category
                        */

                        
                                    protected com.rightnow.ws.base.NamedIDHierarchy localCategory ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCategoryTracker = false ;

                           public boolean isCategorySpecified(){
                               return localCategoryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedIDHierarchy
                           */
                           public  com.rightnow.ws.base.NamedIDHierarchy getCategory(){
                               return localCategory;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Category
                               */
                               public void setCategory(com.rightnow.ws.base.NamedIDHierarchy param){
                            localCategoryTracker = true;
                                   
                                            this.localCategory=param;
                                    

                               }
                            

                        /**
                        * field for Channel
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localChannel ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChannelTracker = false ;

                           public boolean isChannelSpecified(){
                               return localChannelTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getChannel(){
                               return localChannel;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Channel
                               */
                               public void setChannel(com.rightnow.ws.base.NamedID param){
                            localChannelTracker = true;
                                   
                                            this.localChannel=param;
                                    

                               }
                            

                        /**
                        * field for ChatQueue
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localChatQueue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChatQueueTracker = false ;

                           public boolean isChatQueueSpecified(){
                               return localChatQueueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getChatQueue(){
                               return localChatQueue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChatQueue
                               */
                               public void setChatQueue(com.rightnow.ws.base.NamedID param){
                            localChatQueueTracker = true;
                                   
                                            this.localChatQueue=param;
                                    

                               }
                            

                        /**
                        * field for ClosedTime
                        */

                        
                                    protected java.util.Calendar localClosedTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClosedTimeTracker = false ;

                           public boolean isClosedTimeSpecified(){
                               return localClosedTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getClosedTime(){
                               return localClosedTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClosedTime
                               */
                               public void setClosedTime(java.util.Calendar param){
                            localClosedTimeTracker = true;
                                   
                                            this.localClosedTime=param;
                                    

                               }
                            

                        /**
                        * field for CreatedByAccount
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localCreatedByAccount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreatedByAccountTracker = false ;

                           public boolean isCreatedByAccountSpecified(){
                               return localCreatedByAccountTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getCreatedByAccount(){
                               return localCreatedByAccount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreatedByAccount
                               */
                               public void setCreatedByAccount(com.rightnow.ws.base.NamedID param){
                            localCreatedByAccountTracker = true;
                                   
                                            this.localCreatedByAccount=param;
                                    

                               }
                            

                        /**
                        * field for CustomFields
                        */

                        
                                    protected com.rightnow.ws.generic.GenericObject localCustomFields ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustomFieldsTracker = false ;

                           public boolean isCustomFieldsSpecified(){
                               return localCustomFieldsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.generic.GenericObject
                           */
                           public  com.rightnow.ws.generic.GenericObject getCustomFields(){
                               return localCustomFields;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustomFields
                               */
                               public void setCustomFields(com.rightnow.ws.generic.GenericObject param){
                            localCustomFieldsTracker = param != null;
                                   
                                            this.localCustomFields=param;
                                    

                               }
                            

                        /**
                        * field for Disposition
                        */

                        
                                    protected com.rightnow.ws.base.NamedIDHierarchy localDisposition ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDispositionTracker = false ;

                           public boolean isDispositionSpecified(){
                               return localDispositionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedIDHierarchy
                           */
                           public  com.rightnow.ws.base.NamedIDHierarchy getDisposition(){
                               return localDisposition;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Disposition
                               */
                               public void setDisposition(com.rightnow.ws.base.NamedIDHierarchy param){
                            localDispositionTracker = true;
                                   
                                            this.localDisposition=param;
                                    

                               }
                            

                        /**
                        * field for FileAttachments
                        */

                        
                                    protected com.rightnow.ws.objects.FileAttachmentIncidentList localFileAttachments ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFileAttachmentsTracker = false ;

                           public boolean isFileAttachmentsSpecified(){
                               return localFileAttachmentsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.FileAttachmentIncidentList
                           */
                           public  com.rightnow.ws.objects.FileAttachmentIncidentList getFileAttachments(){
                               return localFileAttachments;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FileAttachments
                               */
                               public void setFileAttachments(com.rightnow.ws.objects.FileAttachmentIncidentList param){
                            localFileAttachmentsTracker = true;
                                   
                                            this.localFileAttachments=param;
                                    

                               }
                            

                        /**
                        * field for InitialResponseDueTime
                        */

                        
                                    protected java.util.Calendar localInitialResponseDueTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInitialResponseDueTimeTracker = false ;

                           public boolean isInitialResponseDueTimeSpecified(){
                               return localInitialResponseDueTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getInitialResponseDueTime(){
                               return localInitialResponseDueTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InitialResponseDueTime
                               */
                               public void setInitialResponseDueTime(java.util.Calendar param){
                            localInitialResponseDueTimeTracker = true;
                                   
                                            this.localInitialResponseDueTime=param;
                                    

                               }
                            

                        /**
                        * field for InitialSolutionTime
                        */

                        
                                    protected java.util.Calendar localInitialSolutionTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInitialSolutionTimeTracker = false ;

                           public boolean isInitialSolutionTimeSpecified(){
                               return localInitialSolutionTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getInitialSolutionTime(){
                               return localInitialSolutionTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InitialSolutionTime
                               */
                               public void setInitialSolutionTime(java.util.Calendar param){
                            localInitialSolutionTimeTracker = true;
                                   
                                            this.localInitialSolutionTime=param;
                                    

                               }
                            

                        /**
                        * field for Interface
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localInterface ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInterfaceTracker = false ;

                           public boolean isInterfaceSpecified(){
                               return localInterfaceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getInterface(){
                               return localInterface;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Interface
                               */
                               public void setInterface(com.rightnow.ws.base.NamedID param){
                            localInterfaceTracker = param != null;
                                   
                                            this.localInterface=param;
                                    

                               }
                            

                        /**
                        * field for Language
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localLanguage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLanguageTracker = false ;

                           public boolean isLanguageSpecified(){
                               return localLanguageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getLanguage(){
                               return localLanguage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Language
                               */
                               public void setLanguage(com.rightnow.ws.base.NamedID param){
                            localLanguageTracker = true;
                                   
                                            this.localLanguage=param;
                                    

                               }
                            

                        /**
                        * field for LastResponseTime
                        */

                        
                                    protected java.util.Calendar localLastResponseTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastResponseTimeTracker = false ;

                           public boolean isLastResponseTimeSpecified(){
                               return localLastResponseTimeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getLastResponseTime(){
                               return localLastResponseTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastResponseTime
                               */
                               public void setLastResponseTime(java.util.Calendar param){
                            localLastResponseTimeTracker = true;
                                   
                                            this.localLastResponseTime=param;
                                    

                               }
                            

                        /**
                        * field for Mailbox
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localMailbox ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMailboxTracker = false ;

                           public boolean isMailboxSpecified(){
                               return localMailboxTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getMailbox(){
                               return localMailbox;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Mailbox
                               */
                               public void setMailbox(com.rightnow.ws.base.NamedID param){
                            localMailboxTracker = true;
                                   
                                            this.localMailbox=param;
                                    

                               }
                            

                        /**
                        * field for Mailing
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localMailing ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMailingTracker = false ;

                           public boolean isMailingSpecified(){
                               return localMailingTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getMailing(){
                               return localMailing;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Mailing
                               */
                               public void setMailing(com.rightnow.ws.base.NamedID param){
                            localMailingTracker = true;
                                   
                                            this.localMailing=param;
                                    

                               }
                            

                        /**
                        * field for MilestoneInstances
                        */

                        
                                    protected com.rightnow.ws.objects.IncidentMilestoneInstanceList localMilestoneInstances ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMilestoneInstancesTracker = false ;

                           public boolean isMilestoneInstancesSpecified(){
                               return localMilestoneInstancesTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.IncidentMilestoneInstanceList
                           */
                           public  com.rightnow.ws.objects.IncidentMilestoneInstanceList getMilestoneInstances(){
                               return localMilestoneInstances;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MilestoneInstances
                               */
                               public void setMilestoneInstances(com.rightnow.ws.objects.IncidentMilestoneInstanceList param){
                            localMilestoneInstancesTracker = true;
                                   
                                            this.localMilestoneInstances=param;
                                    

                               }
                            

                        /**
                        * field for Organization
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localOrganization ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOrganizationTracker = false ;

                           public boolean isOrganizationSpecified(){
                               return localOrganizationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getOrganization(){
                               return localOrganization;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Organization
                               */
                               public void setOrganization(com.rightnow.ws.base.NamedID param){
                            localOrganizationTracker = true;
                                   
                                            this.localOrganization=param;
                                    

                               }
                            

                        /**
                        * field for OtherContacts
                        */

                        
                                    protected com.rightnow.ws.objects.IncidentContactList localOtherContacts ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOtherContactsTracker = false ;

                           public boolean isOtherContactsSpecified(){
                               return localOtherContactsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.IncidentContactList
                           */
                           public  com.rightnow.ws.objects.IncidentContactList getOtherContacts(){
                               return localOtherContacts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OtherContacts
                               */
                               public void setOtherContacts(com.rightnow.ws.objects.IncidentContactList param){
                            localOtherContactsTracker = true;
                                   
                                            this.localOtherContacts=param;
                                    

                               }
                            

                        /**
                        * field for PrimaryContact
                        */

                        
                                    protected com.rightnow.ws.objects.IncidentContact localPrimaryContact ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrimaryContactTracker = false ;

                           public boolean isPrimaryContactSpecified(){
                               return localPrimaryContactTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.IncidentContact
                           */
                           public  com.rightnow.ws.objects.IncidentContact getPrimaryContact(){
                               return localPrimaryContact;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrimaryContact
                               */
                               public void setPrimaryContact(com.rightnow.ws.objects.IncidentContact param){
                            localPrimaryContactTracker = param != null;
                                   
                                            this.localPrimaryContact=param;
                                    

                               }
                            

                        /**
                        * field for Product
                        */

                        
                                    protected com.rightnow.ws.base.NamedIDHierarchy localProduct ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProductTracker = false ;

                           public boolean isProductSpecified(){
                               return localProductTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedIDHierarchy
                           */
                           public  com.rightnow.ws.base.NamedIDHierarchy getProduct(){
                               return localProduct;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Product
                               */
                               public void setProduct(com.rightnow.ws.base.NamedIDHierarchy param){
                            localProductTracker = true;
                                   
                                            this.localProduct=param;
                                    

                               }
                            

                        /**
                        * field for Queue
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localQueue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localQueueTracker = false ;

                           public boolean isQueueSpecified(){
                               return localQueueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getQueue(){
                               return localQueue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Queue
                               */
                               public void setQueue(com.rightnow.ws.base.NamedID param){
                            localQueueTracker = true;
                                   
                                            this.localQueue=param;
                                    

                               }
                            

                        /**
                        * field for ReferenceNumber
                        */

                        
                                    protected java.lang.String localReferenceNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReferenceNumberTracker = false ;

                           public boolean isReferenceNumberSpecified(){
                               return localReferenceNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReferenceNumber(){
                               return localReferenceNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReferenceNumber
                               */
                               public void setReferenceNumber(java.lang.String param){
                            localReferenceNumberTracker = param != null;
                                   
                                            this.localReferenceNumber=param;
                                    

                               }
                            

                        /**
                        * field for ResolutionInterval
                        */

                        
                                    protected int localResolutionInterval ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResolutionIntervalTracker = false ;

                           public boolean isResolutionIntervalSpecified(){
                               return localResolutionIntervalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getResolutionInterval(){
                               return localResolutionInterval;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResolutionInterval
                               */
                               public void setResolutionInterval(int param){
                            localResolutionIntervalTracker = true;
                                   
                                            this.localResolutionInterval=param;
                                    

                               }
                            

                        /**
                        * field for ResponseEmailAddressType
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localResponseEmailAddressType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResponseEmailAddressTypeTracker = false ;

                           public boolean isResponseEmailAddressTypeSpecified(){
                               return localResponseEmailAddressTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getResponseEmailAddressType(){
                               return localResponseEmailAddressType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResponseEmailAddressType
                               */
                               public void setResponseEmailAddressType(com.rightnow.ws.base.NamedID param){
                            localResponseEmailAddressTypeTracker = param != null;
                                   
                                            this.localResponseEmailAddressType=param;
                                    

                               }
                            

                        /**
                        * field for ResponseInterval
                        */

                        
                                    protected int localResponseInterval ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResponseIntervalTracker = false ;

                           public boolean isResponseIntervalSpecified(){
                               return localResponseIntervalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getResponseInterval(){
                               return localResponseInterval;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResponseInterval
                               */
                               public void setResponseInterval(int param){
                            localResponseIntervalTracker = true;
                                   
                                            this.localResponseInterval=param;
                                    

                               }
                            

                        /**
                        * field for Severity
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localSeverity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSeverityTracker = false ;

                           public boolean isSeveritySpecified(){
                               return localSeverityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getSeverity(){
                               return localSeverity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Severity
                               */
                               public void setSeverity(com.rightnow.ws.base.NamedID param){
                            localSeverityTracker = true;
                                   
                                            this.localSeverity=param;
                                    

                               }
                            

                        /**
                        * field for SLAInstance
                        */

                        
                                    protected com.rightnow.ws.objects.AssignedSLAInstance localSLAInstance ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSLAInstanceTracker = false ;

                           public boolean isSLAInstanceSpecified(){
                               return localSLAInstanceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.AssignedSLAInstance
                           */
                           public  com.rightnow.ws.objects.AssignedSLAInstance getSLAInstance(){
                               return localSLAInstance;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SLAInstance
                               */
                               public void setSLAInstance(com.rightnow.ws.objects.AssignedSLAInstance param){
                            localSLAInstanceTracker = true;
                                   
                                            this.localSLAInstance=param;
                                    

                               }
                            

                        /**
                        * field for SmartSenseCustomer
                        */

                        
                                    protected int localSmartSenseCustomer ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSmartSenseCustomerTracker = false ;

                           public boolean isSmartSenseCustomerSpecified(){
                               return localSmartSenseCustomerTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getSmartSenseCustomer(){
                               return localSmartSenseCustomer;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SmartSenseCustomer
                               */
                               public void setSmartSenseCustomer(int param){
                            localSmartSenseCustomerTracker = true;
                                   
                                            this.localSmartSenseCustomer=param;
                                    

                               }
                            

                        /**
                        * field for SmartSenseStaff
                        */

                        
                                    protected int localSmartSenseStaff ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSmartSenseStaffTracker = false ;

                           public boolean isSmartSenseStaffSpecified(){
                               return localSmartSenseStaffTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getSmartSenseStaff(){
                               return localSmartSenseStaff;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SmartSenseStaff
                               */
                               public void setSmartSenseStaff(int param){
                            localSmartSenseStaffTracker = true;
                                   
                                            this.localSmartSenseStaff=param;
                                    

                               }
                            

                        /**
                        * field for Source
                        */

                        
                                    protected com.rightnow.ws.base.NamedIDHierarchy localSource ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSourceTracker = false ;

                           public boolean isSourceSpecified(){
                               return localSourceTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedIDHierarchy
                           */
                           public  com.rightnow.ws.base.NamedIDHierarchy getSource(){
                               return localSource;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Source
                               */
                               public void setSource(com.rightnow.ws.base.NamedIDHierarchy param){
                            localSourceTracker = param != null;
                                   
                                            this.localSource=param;
                                    

                               }
                            

                        /**
                        * field for StatusWithType
                        */

                        
                                    protected com.rightnow.ws.objects.StatusWithType localStatusWithType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStatusWithTypeTracker = false ;

                           public boolean isStatusWithTypeSpecified(){
                               return localStatusWithTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.StatusWithType
                           */
                           public  com.rightnow.ws.objects.StatusWithType getStatusWithType(){
                               return localStatusWithType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StatusWithType
                               */
                               public void setStatusWithType(com.rightnow.ws.objects.StatusWithType param){
                            localStatusWithTypeTracker = param != null;
                                   
                                            this.localStatusWithType=param;
                                    

                               }
                            

                        /**
                        * field for Subject
                        */

                        
                                    protected java.lang.String localSubject ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSubjectTracker = false ;

                           public boolean isSubjectSpecified(){
                               return localSubjectTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSubject(){
                               return localSubject;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Subject
                               */
                               public void setSubject(java.lang.String param){
                            localSubjectTracker = true;
                                   
                                            this.localSubject=param;
                                    

                               }
                            

                        /**
                        * field for Threads
                        */

                        
                                    protected com.rightnow.ws.objects.ThreadList localThreads ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localThreadsTracker = false ;

                           public boolean isThreadsSpecified(){
                               return localThreadsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.objects.ThreadList
                           */
                           public  com.rightnow.ws.objects.ThreadList getThreads(){
                               return localThreads;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Threads
                               */
                               public void setThreads(com.rightnow.ws.objects.ThreadList param){
                            localThreadsTracker = param != null;
                                   
                                            this.localThreads=param;
                                    

                               }
                            

                        /**
                        * field for ValidNullFields
                        */

                        
                                    protected com.rightnow.ws.nullfields.IncidentNullFields localValidNullFields ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localValidNullFieldsTracker = false ;

                           public boolean isValidNullFieldsSpecified(){
                               return localValidNullFieldsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.nullfields.IncidentNullFields
                           */
                           public  com.rightnow.ws.nullfields.IncidentNullFields getValidNullFields(){
                               return localValidNullFields;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ValidNullFields
                               */
                               public void setValidNullFields(com.rightnow.ws.nullfields.IncidentNullFields param){
                            localValidNullFieldsTracker = true;
                                   
                                            this.localValidNullFields=param;
                                    

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
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn:objects.ws.rightnow.com/v1_3");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":Incident",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Incident",
                           xmlWriter);
                   }

                if (localIDTracker){
                                            if (localID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ID cannot be null!!");
                                            }
                                           localID.serialize(new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_3","ID"),
                                               xmlWriter);
                                        } if (localLookupNameTracker){
                                    namespace = "urn:base.ws.rightnow.com/v1_3";
                                    writeStartElement(null, namespace, "LookupName", xmlWriter);
                             

                                          if (localLookupName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("LookupName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLookupName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCreatedTimeTracker){
                                    namespace = "urn:base.ws.rightnow.com/v1_3";
                                    writeStartElement(null, namespace, "CreatedTime", xmlWriter);
                             

                                          if (localCreatedTime==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CreatedTime cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreatedTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUpdatedTimeTracker){
                                    namespace = "urn:base.ws.rightnow.com/v1_3";
                                    writeStartElement(null, namespace, "UpdatedTime", xmlWriter);
                             

                                          if (localUpdatedTime==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("UpdatedTime cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdatedTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAssetTracker){
                                    if (localAsset==null){

                                        writeStartElement(null, "urn:objects.ws.rightnow.com/v1_3", "Asset", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAsset.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Asset"),
                                        xmlWriter);
                                    }
                                } if (localAssignedToTracker){
                                            if (localAssignedTo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("AssignedTo cannot be null!!");
                                            }
                                           localAssignedTo.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","AssignedTo"),
                                               xmlWriter);
                                        } if (localBannerTracker){
                                            if (localBanner==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Banner cannot be null!!");
                                            }
                                           localBanner.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Banner"),
                                               xmlWriter);
                                        } if (localBilledMinutesTracker){
                                    if (localBilledMinutes==null){

                                        writeStartElement(null, "urn:objects.ws.rightnow.com/v1_3", "BilledMinutes", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localBilledMinutes.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","BilledMinutes"),
                                        xmlWriter);
                                    }
                                } if (localCategoryTracker){
                                    if (localCategory==null){

                                        writeStartElement(null, "urn:objects.ws.rightnow.com/v1_3", "Category", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCategory.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Category"),
                                        xmlWriter);
                                    }
                                } if (localChannelTracker){
                                    if (localChannel==null){

                                        writeStartElement(null, "urn:objects.ws.rightnow.com/v1_3", "Channel", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localChannel.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Channel"),
                                        xmlWriter);
                                    }
                                } if (localChatQueueTracker){
                                    if (localChatQueue==null){

                                        writeStartElement(null, "urn:objects.ws.rightnow.com/v1_3", "ChatQueue", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localChatQueue.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","ChatQueue"),
                                        xmlWriter);
                                    }
                                } if (localClosedTimeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    writeStartElement(null, namespace, "ClosedTime", xmlWriter);
                             

                                          if (localClosedTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClosedTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCreatedByAccountTracker){
                                    if (localCreatedByAccount==null){

                                        writeStartElement(null, "urn:objects.ws.rightnow.com/v1_3", "CreatedByAccount", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCreatedByAccount.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","CreatedByAccount"),
                                        xmlWriter);
                                    }
                                } if (localCustomFieldsTracker){
                                            if (localCustomFields==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
                                            }
                                           localCustomFields.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","CustomFields"),
                                               xmlWriter);
                                        } if (localDispositionTracker){
                                    if (localDisposition==null){

                                        writeStartElement(null, "urn:objects.ws.rightnow.com/v1_3", "Disposition", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localDisposition.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Disposition"),
                                        xmlWriter);
                                    }
                                } if (localFileAttachmentsTracker){
                                    if (localFileAttachments==null){

                                        writeStartElement(null, "urn:objects.ws.rightnow.com/v1_3", "FileAttachments", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localFileAttachments.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","FileAttachments"),
                                        xmlWriter);
                                    }
                                } if (localInitialResponseDueTimeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    writeStartElement(null, namespace, "InitialResponseDueTime", xmlWriter);
                             

                                          if (localInitialResponseDueTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInitialResponseDueTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localInitialSolutionTimeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    writeStartElement(null, namespace, "InitialSolutionTime", xmlWriter);
                             

                                          if (localInitialSolutionTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInitialSolutionTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localInterfaceTracker){
                                            if (localInterface==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Interface cannot be null!!");
                                            }
                                           localInterface.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Interface"),
                                               xmlWriter);
                                        } if (localLanguageTracker){
                                    if (localLanguage==null){

                                        writeStartElement(null, "urn:objects.ws.rightnow.com/v1_3", "Language", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localLanguage.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Language"),
                                        xmlWriter);
                                    }
                                } if (localLastResponseTimeTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    writeStartElement(null, namespace, "LastResponseTime", xmlWriter);
                             

                                          if (localLastResponseTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastResponseTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMailboxTracker){
                                    if (localMailbox==null){

                                        writeStartElement(null, "urn:objects.ws.rightnow.com/v1_3", "Mailbox", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMailbox.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Mailbox"),
                                        xmlWriter);
                                    }
                                } if (localMailingTracker){
                                    if (localMailing==null){

                                        writeStartElement(null, "urn:objects.ws.rightnow.com/v1_3", "Mailing", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMailing.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Mailing"),
                                        xmlWriter);
                                    }
                                } if (localMilestoneInstancesTracker){
                                    if (localMilestoneInstances==null){

                                        writeStartElement(null, "urn:objects.ws.rightnow.com/v1_3", "MilestoneInstances", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localMilestoneInstances.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","MilestoneInstances"),
                                        xmlWriter);
                                    }
                                } if (localOrganizationTracker){
                                    if (localOrganization==null){

                                        writeStartElement(null, "urn:objects.ws.rightnow.com/v1_3", "Organization", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localOrganization.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Organization"),
                                        xmlWriter);
                                    }
                                } if (localOtherContactsTracker){
                                    if (localOtherContacts==null){

                                        writeStartElement(null, "urn:objects.ws.rightnow.com/v1_3", "OtherContacts", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localOtherContacts.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","OtherContacts"),
                                        xmlWriter);
                                    }
                                } if (localPrimaryContactTracker){
                                            if (localPrimaryContact==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PrimaryContact cannot be null!!");
                                            }
                                           localPrimaryContact.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","PrimaryContact"),
                                               xmlWriter);
                                        } if (localProductTracker){
                                    if (localProduct==null){

                                        writeStartElement(null, "urn:objects.ws.rightnow.com/v1_3", "Product", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localProduct.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Product"),
                                        xmlWriter);
                                    }
                                } if (localQueueTracker){
                                    if (localQueue==null){

                                        writeStartElement(null, "urn:objects.ws.rightnow.com/v1_3", "Queue", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localQueue.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Queue"),
                                        xmlWriter);
                                    }
                                } if (localReferenceNumberTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    writeStartElement(null, namespace, "ReferenceNumber", xmlWriter);
                             

                                          if (localReferenceNumber==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ReferenceNumber cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReferenceNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localResolutionIntervalTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    writeStartElement(null, namespace, "ResolutionInterval", xmlWriter);
                             
                                               if (localResolutionInterval==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResolutionInterval));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localResponseEmailAddressTypeTracker){
                                            if (localResponseEmailAddressType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ResponseEmailAddressType cannot be null!!");
                                            }
                                           localResponseEmailAddressType.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","ResponseEmailAddressType"),
                                               xmlWriter);
                                        } if (localResponseIntervalTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    writeStartElement(null, namespace, "ResponseInterval", xmlWriter);
                             
                                               if (localResponseInterval==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResponseInterval));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSeverityTracker){
                                    if (localSeverity==null){

                                        writeStartElement(null, "urn:objects.ws.rightnow.com/v1_3", "Severity", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSeverity.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Severity"),
                                        xmlWriter);
                                    }
                                } if (localSLAInstanceTracker){
                                    if (localSLAInstance==null){

                                        writeStartElement(null, "urn:objects.ws.rightnow.com/v1_3", "SLAInstance", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSLAInstance.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","SLAInstance"),
                                        xmlWriter);
                                    }
                                } if (localSmartSenseCustomerTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    writeStartElement(null, namespace, "SmartSenseCustomer", xmlWriter);
                             
                                               if (localSmartSenseCustomer==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSmartSenseCustomer));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSmartSenseStaffTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    writeStartElement(null, namespace, "SmartSenseStaff", xmlWriter);
                             
                                               if (localSmartSenseStaff==java.lang.Integer.MIN_VALUE) {
                                           
                                                         writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSmartSenseStaff));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSourceTracker){
                                            if (localSource==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Source cannot be null!!");
                                            }
                                           localSource.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Source"),
                                               xmlWriter);
                                        } if (localStatusWithTypeTracker){
                                            if (localStatusWithType==null){
                                                 throw new org.apache.axis2.databinding.ADBException("StatusWithType cannot be null!!");
                                            }
                                           localStatusWithType.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","StatusWithType"),
                                               xmlWriter);
                                        } if (localSubjectTracker){
                                    namespace = "urn:objects.ws.rightnow.com/v1_3";
                                    writeStartElement(null, namespace, "Subject", xmlWriter);
                             

                                          if (localSubject==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSubject);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localThreadsTracker){
                                            if (localThreads==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Threads cannot be null!!");
                                            }
                                           localThreads.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Threads"),
                                               xmlWriter);
                                        } if (localValidNullFieldsTracker){
                                    if (localValidNullFields==null){

                                        writeStartElement(null, "urn:objects.ws.rightnow.com/v1_3", "ValidNullFields", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localValidNullFields.serialize(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","ValidNullFields"),
                                        xmlWriter);
                                    }
                                }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("urn:objects.ws.rightnow.com/v1_3")){
                return "ns4";
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

                
                    attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance","type"));
                    attribList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Incident"));
                 if (localIDTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_3",
                                                                      "ID"));
                            
                            
                                    if (localID==null){
                                         throw new org.apache.axis2.databinding.ADBException("ID cannot be null!!");
                                    }
                                    elementList.add(localID);
                                } if (localLookupNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_3",
                                                                      "LookupName"));
                                 
                                        if (localLookupName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLookupName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("LookupName cannot be null!!");
                                        }
                                    } if (localCreatedTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_3",
                                                                      "CreatedTime"));
                                 
                                        if (localCreatedTime != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreatedTime));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CreatedTime cannot be null!!");
                                        }
                                    } if (localUpdatedTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_3",
                                                                      "UpdatedTime"));
                                 
                                        if (localUpdatedTime != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdatedTime));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("UpdatedTime cannot be null!!");
                                        }
                                    } if (localAssetTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Asset"));
                            
                            
                                    elementList.add(localAsset==null?null:
                                    localAsset);
                                } if (localAssignedToTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "AssignedTo"));
                            
                            
                                    if (localAssignedTo==null){
                                         throw new org.apache.axis2.databinding.ADBException("AssignedTo cannot be null!!");
                                    }
                                    elementList.add(localAssignedTo);
                                } if (localBannerTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Banner"));
                            
                            
                                    if (localBanner==null){
                                         throw new org.apache.axis2.databinding.ADBException("Banner cannot be null!!");
                                    }
                                    elementList.add(localBanner);
                                } if (localBilledMinutesTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "BilledMinutes"));
                            
                            
                                    elementList.add(localBilledMinutes==null?null:
                                    localBilledMinutes);
                                } if (localCategoryTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Category"));
                            
                            
                                    elementList.add(localCategory==null?null:
                                    localCategory);
                                } if (localChannelTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Channel"));
                            
                            
                                    elementList.add(localChannel==null?null:
                                    localChannel);
                                } if (localChatQueueTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "ChatQueue"));
                            
                            
                                    elementList.add(localChatQueue==null?null:
                                    localChatQueue);
                                } if (localClosedTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "ClosedTime"));
                                 
                                         elementList.add(localClosedTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClosedTime));
                                    } if (localCreatedByAccountTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "CreatedByAccount"));
                            
                            
                                    elementList.add(localCreatedByAccount==null?null:
                                    localCreatedByAccount);
                                } if (localCustomFieldsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "CustomFields"));
                            
                            
                                    if (localCustomFields==null){
                                         throw new org.apache.axis2.databinding.ADBException("CustomFields cannot be null!!");
                                    }
                                    elementList.add(localCustomFields);
                                } if (localDispositionTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Disposition"));
                            
                            
                                    elementList.add(localDisposition==null?null:
                                    localDisposition);
                                } if (localFileAttachmentsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "FileAttachments"));
                            
                            
                                    elementList.add(localFileAttachments==null?null:
                                    localFileAttachments);
                                } if (localInitialResponseDueTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "InitialResponseDueTime"));
                                 
                                         elementList.add(localInitialResponseDueTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInitialResponseDueTime));
                                    } if (localInitialSolutionTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "InitialSolutionTime"));
                                 
                                         elementList.add(localInitialSolutionTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInitialSolutionTime));
                                    } if (localInterfaceTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Interface"));
                            
                            
                                    if (localInterface==null){
                                         throw new org.apache.axis2.databinding.ADBException("Interface cannot be null!!");
                                    }
                                    elementList.add(localInterface);
                                } if (localLanguageTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Language"));
                            
                            
                                    elementList.add(localLanguage==null?null:
                                    localLanguage);
                                } if (localLastResponseTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "LastResponseTime"));
                                 
                                         elementList.add(localLastResponseTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastResponseTime));
                                    } if (localMailboxTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Mailbox"));
                            
                            
                                    elementList.add(localMailbox==null?null:
                                    localMailbox);
                                } if (localMailingTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Mailing"));
                            
                            
                                    elementList.add(localMailing==null?null:
                                    localMailing);
                                } if (localMilestoneInstancesTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "MilestoneInstances"));
                            
                            
                                    elementList.add(localMilestoneInstances==null?null:
                                    localMilestoneInstances);
                                } if (localOrganizationTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Organization"));
                            
                            
                                    elementList.add(localOrganization==null?null:
                                    localOrganization);
                                } if (localOtherContactsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "OtherContacts"));
                            
                            
                                    elementList.add(localOtherContacts==null?null:
                                    localOtherContacts);
                                } if (localPrimaryContactTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "PrimaryContact"));
                            
                            
                                    if (localPrimaryContact==null){
                                         throw new org.apache.axis2.databinding.ADBException("PrimaryContact cannot be null!!");
                                    }
                                    elementList.add(localPrimaryContact);
                                } if (localProductTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Product"));
                            
                            
                                    elementList.add(localProduct==null?null:
                                    localProduct);
                                } if (localQueueTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Queue"));
                            
                            
                                    elementList.add(localQueue==null?null:
                                    localQueue);
                                } if (localReferenceNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "ReferenceNumber"));
                                 
                                        if (localReferenceNumber != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReferenceNumber));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ReferenceNumber cannot be null!!");
                                        }
                                    } if (localResolutionIntervalTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "ResolutionInterval"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResolutionInterval));
                            } if (localResponseEmailAddressTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "ResponseEmailAddressType"));
                            
                            
                                    if (localResponseEmailAddressType==null){
                                         throw new org.apache.axis2.databinding.ADBException("ResponseEmailAddressType cannot be null!!");
                                    }
                                    elementList.add(localResponseEmailAddressType);
                                } if (localResponseIntervalTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "ResponseInterval"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResponseInterval));
                            } if (localSeverityTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Severity"));
                            
                            
                                    elementList.add(localSeverity==null?null:
                                    localSeverity);
                                } if (localSLAInstanceTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "SLAInstance"));
                            
                            
                                    elementList.add(localSLAInstance==null?null:
                                    localSLAInstance);
                                } if (localSmartSenseCustomerTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "SmartSenseCustomer"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSmartSenseCustomer));
                            } if (localSmartSenseStaffTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "SmartSenseStaff"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSmartSenseStaff));
                            } if (localSourceTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Source"));
                            
                            
                                    if (localSource==null){
                                         throw new org.apache.axis2.databinding.ADBException("Source cannot be null!!");
                                    }
                                    elementList.add(localSource);
                                } if (localStatusWithTypeTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "StatusWithType"));
                            
                            
                                    if (localStatusWithType==null){
                                         throw new org.apache.axis2.databinding.ADBException("StatusWithType cannot be null!!");
                                    }
                                    elementList.add(localStatusWithType);
                                } if (localSubjectTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Subject"));
                                 
                                         elementList.add(localSubject==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSubject));
                                    } if (localThreadsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "Threads"));
                            
                            
                                    if (localThreads==null){
                                         throw new org.apache.axis2.databinding.ADBException("Threads cannot be null!!");
                                    }
                                    elementList.add(localThreads);
                                } if (localValidNullFieldsTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3",
                                                                      "ValidNullFields"));
                            
                            
                                    elementList.add(localValidNullFields==null?null:
                                    localValidNullFields);
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
        public static Incident parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Incident object =
                new Incident();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"Incident".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Incident)com.rightnow.ws.objects.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_3","ID").equals(reader.getName())){
                                
                                                object.setID(com.rightnow.ws.base.ID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_3","LookupName").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"LookupName" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLookupName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_3","CreatedTime").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"CreatedTime" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCreatedTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:base.ws.rightnow.com/v1_3","UpdatedTime").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"UpdatedTime" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUpdatedTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Asset").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAsset(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAsset(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","AssignedTo").equals(reader.getName())){
                                
                                                object.setAssignedTo(com.rightnow.ws.objects.GroupAccount.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Banner").equals(reader.getName())){
                                
                                                object.setBanner(com.rightnow.ws.objects.Banner.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","BilledMinutes").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setBilledMinutes(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setBilledMinutes(com.rightnow.ws.objects.TimeBilledList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Category").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCategory(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCategory(com.rightnow.ws.base.NamedIDHierarchy.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Channel").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setChannel(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setChannel(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","ChatQueue").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setChatQueue(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setChatQueue(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","ClosedTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClosedTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","CreatedByAccount").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCreatedByAccount(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCreatedByAccount(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","CustomFields").equals(reader.getName())){
                                
                                                object.setCustomFields(com.rightnow.ws.generic.GenericObject.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Disposition").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setDisposition(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setDisposition(com.rightnow.ws.base.NamedIDHierarchy.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","FileAttachments").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setFileAttachments(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setFileAttachments(com.rightnow.ws.objects.FileAttachmentIncidentList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","InitialResponseDueTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInitialResponseDueTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","InitialSolutionTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInitialSolutionTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Interface").equals(reader.getName())){
                                
                                                object.setInterface(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Language").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setLanguage(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setLanguage(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","LastResponseTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastResponseTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Mailbox").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMailbox(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMailbox(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Mailing").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMailing(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMailing(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","MilestoneInstances").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setMilestoneInstances(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setMilestoneInstances(com.rightnow.ws.objects.IncidentMilestoneInstanceList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Organization").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setOrganization(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setOrganization(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","OtherContacts").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setOtherContacts(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setOtherContacts(com.rightnow.ws.objects.IncidentContactList.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","PrimaryContact").equals(reader.getName())){
                                
                                                object.setPrimaryContact(com.rightnow.ws.objects.IncidentContact.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Product").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setProduct(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setProduct(com.rightnow.ws.base.NamedIDHierarchy.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Queue").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setQueue(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setQueue(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","ReferenceNumber").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ReferenceNumber" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReferenceNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","ResolutionInterval").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setResolutionInterval(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setResolutionInterval(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setResolutionInterval(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","ResponseEmailAddressType").equals(reader.getName())){
                                
                                                object.setResponseEmailAddressType(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","ResponseInterval").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setResponseInterval(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setResponseInterval(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setResponseInterval(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Severity").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSeverity(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSeverity(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","SLAInstance").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSLAInstance(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSLAInstance(com.rightnow.ws.objects.AssignedSLAInstance.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","SmartSenseCustomer").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSmartSenseCustomer(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setSmartSenseCustomer(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setSmartSenseCustomer(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","SmartSenseStaff").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSmartSenseStaff(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                            
                                       } else {
                                           
                                           
                                                   object.setSmartSenseStaff(java.lang.Integer.MIN_VALUE);
                                               
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setSmartSenseStaff(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Source").equals(reader.getName())){
                                
                                                object.setSource(com.rightnow.ws.base.NamedIDHierarchy.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","StatusWithType").equals(reader.getName())){
                                
                                                object.setStatusWithType(com.rightnow.ws.objects.StatusWithType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Subject").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSubject(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","Threads").equals(reader.getName())){
                                
                                                object.setThreads(com.rightnow.ws.objects.ThreadList.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:objects.ws.rightnow.com/v1_3","ValidNullFields").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setValidNullFields(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setValidNullFields(com.rightnow.ws.nullfields.IncidentNullFields.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
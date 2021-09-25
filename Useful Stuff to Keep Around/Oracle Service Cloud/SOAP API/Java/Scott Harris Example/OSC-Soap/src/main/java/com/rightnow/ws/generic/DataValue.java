
/**
 * DataValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.rightnow.ws.generic;
            

            /**
            *  DataValue bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class DataValue
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = DataValue
                Namespace URI = urn:generic.ws.rightnow.com/v1_3
                Namespace Prefix = ns2
                */
            
            /** Whenever a new property is set ensure all others are unset
             *  There can be only one choice and the last one wins
             */
            private void clearAllSettingTrackers() {
            
                   localBase64BinaryValueTracker = false;
                
                   localBooleanValueTracker = false;
                
                   localBooleanValueListTracker = false;
                
                   localDateTimeValueTracker = false;
                
                   localDateTimeValueListTracker = false;
                
                   localDateValueTracker = false;
                
                   localDateValueListTracker = false;
                
                   localDecimalValueTracker = false;
                
                   localDecimalValueListTracker = false;
                
                   localIDValueTracker = false;
                
                   localIDValueListTracker = false;
                
                   localIntegerValueTracker = false;
                
                   localIntegerValueListTracker = false;
                
                   localLongValueTracker = false;
                
                   localLongValueListTracker = false;
                
                   localNamedIDDeltaValueListTracker = false;
                
                   localNamedIDHierarchyValueTracker = false;
                
                   localNamedIDHierarchyValueListTracker = false;
                
                   localNamedIDValueTracker = false;
                
                   localNamedIDValueListTracker = false;
                
                   localObjectValueTracker = false;
                
                   localObjectValueListTracker = false;
                
                   localStringValueTracker = false;
                
                   localStringValueListTracker = false;
                
            }
        

                        /**
                        * field for Base64BinaryValue
                        */

                        
                                    protected javax.activation.DataHandler localBase64BinaryValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBase64BinaryValueTracker = false ;

                           public boolean isBase64BinaryValueSpecified(){
                               return localBase64BinaryValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return javax.activation.DataHandler
                           */
                           public  javax.activation.DataHandler getBase64BinaryValue(){
                               return localBase64BinaryValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Base64BinaryValue
                               */
                               public void setBase64BinaryValue(javax.activation.DataHandler param){
                            
                                clearAllSettingTrackers();
                            localBase64BinaryValueTracker = param != null;
                                   
                                            this.localBase64BinaryValue=param;
                                    

                               }
                            

                        /**
                        * field for BooleanValue
                        */

                        
                                    protected boolean localBooleanValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBooleanValueTracker = false ;

                           public boolean isBooleanValueSpecified(){
                               return localBooleanValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getBooleanValue(){
                               return localBooleanValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BooleanValue
                               */
                               public void setBooleanValue(boolean param){
                            
                                clearAllSettingTrackers();
                            
                                       // setting primitive attribute tracker to true
                                       localBooleanValueTracker =
                                       true;
                                   
                                            this.localBooleanValue=param;
                                    

                               }
                            

                        /**
                        * field for BooleanValueList
                        * This was an Array!
                        */

                        
                                    protected boolean[] localBooleanValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBooleanValueListTracker = false ;

                           public boolean isBooleanValueListSpecified(){
                               return localBooleanValueListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return boolean[]
                           */
                           public  boolean[] getBooleanValueList(){
                               return localBooleanValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for BooleanValueList
                               */
                              protected void validateBooleanValueList(boolean[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param BooleanValueList
                              */
                              public void setBooleanValueList(boolean[] param){
                              
                                   validateBooleanValueList(param);

                               
                                   clearAllSettingTrackers();
                               localBooleanValueListTracker = param != null;
                                      
                                      this.localBooleanValueList=param;
                              }

                               
                             

                        /**
                        * field for DateTimeValue
                        */

                        
                                    protected java.util.Calendar localDateTimeValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDateTimeValueTracker = false ;

                           public boolean isDateTimeValueSpecified(){
                               return localDateTimeValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getDateTimeValue(){
                               return localDateTimeValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DateTimeValue
                               */
                               public void setDateTimeValue(java.util.Calendar param){
                            
                                clearAllSettingTrackers();
                            localDateTimeValueTracker = param != null;
                                   
                                            this.localDateTimeValue=param;
                                    

                               }
                            

                        /**
                        * field for DateTimeValueList
                        * This was an Array!
                        */

                        
                                    protected java.util.Calendar[] localDateTimeValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDateTimeValueListTracker = false ;

                           public boolean isDateTimeValueListSpecified(){
                               return localDateTimeValueListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar[]
                           */
                           public  java.util.Calendar[] getDateTimeValueList(){
                               return localDateTimeValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for DateTimeValueList
                               */
                              protected void validateDateTimeValueList(java.util.Calendar[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param DateTimeValueList
                              */
                              public void setDateTimeValueList(java.util.Calendar[] param){
                              
                                   validateDateTimeValueList(param);

                               
                                   clearAllSettingTrackers();
                               localDateTimeValueListTracker = param != null;
                                      
                                      this.localDateTimeValueList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.util.Calendar
                             */
                             public void addDateTimeValueList(java.util.Calendar param){
                                   if (localDateTimeValueList == null){
                                   localDateTimeValueList = new java.util.Calendar[]{};
                                   }

                            
                                   clearAllSettingTrackers();
                            
                                 //update the setting tracker
                                localDateTimeValueListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localDateTimeValueList);
                               list.add(param);
                               this.localDateTimeValueList =
                             (java.util.Calendar[])list.toArray(
                            new java.util.Calendar[list.size()]);

                             }
                             

                        /**
                        * field for DateValue
                        */

                        
                                    protected java.util.Date localDateValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDateValueTracker = false ;

                           public boolean isDateValueSpecified(){
                               return localDateValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date
                           */
                           public  java.util.Date getDateValue(){
                               return localDateValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DateValue
                               */
                               public void setDateValue(java.util.Date param){
                            
                                clearAllSettingTrackers();
                            localDateValueTracker = param != null;
                                   
                                            this.localDateValue=param;
                                    

                               }
                            

                        /**
                        * field for DateValueList
                        * This was an Array!
                        */

                        
                                    protected java.util.Date[] localDateValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDateValueListTracker = false ;

                           public boolean isDateValueListSpecified(){
                               return localDateValueListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Date[]
                           */
                           public  java.util.Date[] getDateValueList(){
                               return localDateValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for DateValueList
                               */
                              protected void validateDateValueList(java.util.Date[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param DateValueList
                              */
                              public void setDateValueList(java.util.Date[] param){
                              
                                   validateDateValueList(param);

                               
                                   clearAllSettingTrackers();
                               localDateValueListTracker = param != null;
                                      
                                      this.localDateValueList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.util.Date
                             */
                             public void addDateValueList(java.util.Date param){
                                   if (localDateValueList == null){
                                   localDateValueList = new java.util.Date[]{};
                                   }

                            
                                   clearAllSettingTrackers();
                            
                                 //update the setting tracker
                                localDateValueListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localDateValueList);
                               list.add(param);
                               this.localDateValueList =
                             (java.util.Date[])list.toArray(
                            new java.util.Date[list.size()]);

                             }
                             

                        /**
                        * field for DecimalValue
                        */

                        
                                    protected double localDecimalValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDecimalValueTracker = false ;

                           public boolean isDecimalValueSpecified(){
                               return localDecimalValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getDecimalValue(){
                               return localDecimalValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DecimalValue
                               */
                               public void setDecimalValue(double param){
                            
                                clearAllSettingTrackers();
                            
                                       // setting primitive attribute tracker to true
                                       localDecimalValueTracker =
                                       !java.lang.Double.isNaN(param);
                                   
                                            this.localDecimalValue=param;
                                    

                               }
                            

                        /**
                        * field for DecimalValueList
                        * This was an Array!
                        */

                        
                                    protected double[] localDecimalValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDecimalValueListTracker = false ;

                           public boolean isDecimalValueListSpecified(){
                               return localDecimalValueListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return double[]
                           */
                           public  double[] getDecimalValueList(){
                               return localDecimalValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for DecimalValueList
                               */
                              protected void validateDecimalValueList(double[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param DecimalValueList
                              */
                              public void setDecimalValueList(double[] param){
                              
                                   validateDecimalValueList(param);

                               
                                   clearAllSettingTrackers();
                               localDecimalValueListTracker = param != null;
                                      
                                      this.localDecimalValueList=param;
                              }

                               
                             

                        /**
                        * field for IDValue
                        */

                        
                                    protected com.rightnow.ws.base.ID localIDValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIDValueTracker = false ;

                           public boolean isIDValueSpecified(){
                               return localIDValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.ID
                           */
                           public  com.rightnow.ws.base.ID getIDValue(){
                               return localIDValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IDValue
                               */
                               public void setIDValue(com.rightnow.ws.base.ID param){
                            
                                clearAllSettingTrackers();
                            localIDValueTracker = param != null;
                                   
                                            this.localIDValue=param;
                                    

                               }
                            

                        /**
                        * field for IDValueList
                        * This was an Array!
                        */

                        
                                    protected com.rightnow.ws.base.ID[] localIDValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIDValueListTracker = false ;

                           public boolean isIDValueListSpecified(){
                               return localIDValueListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.ID[]
                           */
                           public  com.rightnow.ws.base.ID[] getIDValueList(){
                               return localIDValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for IDValueList
                               */
                              protected void validateIDValueList(com.rightnow.ws.base.ID[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param IDValueList
                              */
                              public void setIDValueList(com.rightnow.ws.base.ID[] param){
                              
                                   validateIDValueList(param);

                               
                                   clearAllSettingTrackers();
                               localIDValueListTracker = param != null;
                                      
                                      this.localIDValueList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.rightnow.ws.base.ID
                             */
                             public void addIDValueList(com.rightnow.ws.base.ID param){
                                   if (localIDValueList == null){
                                   localIDValueList = new com.rightnow.ws.base.ID[]{};
                                   }

                            
                                   clearAllSettingTrackers();
                            
                                 //update the setting tracker
                                localIDValueListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localIDValueList);
                               list.add(param);
                               this.localIDValueList =
                             (com.rightnow.ws.base.ID[])list.toArray(
                            new com.rightnow.ws.base.ID[list.size()]);

                             }
                             

                        /**
                        * field for IntegerValue
                        */

                        
                                    protected int localIntegerValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIntegerValueTracker = false ;

                           public boolean isIntegerValueSpecified(){
                               return localIntegerValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getIntegerValue(){
                               return localIntegerValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IntegerValue
                               */
                               public void setIntegerValue(int param){
                            
                                clearAllSettingTrackers();
                            
                                       // setting primitive attribute tracker to true
                                       localIntegerValueTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localIntegerValue=param;
                                    

                               }
                            

                        /**
                        * field for IntegerValueList
                        * This was an Array!
                        */

                        
                                    protected int[] localIntegerValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIntegerValueListTracker = false ;

                           public boolean isIntegerValueListSpecified(){
                               return localIntegerValueListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int[]
                           */
                           public  int[] getIntegerValueList(){
                               return localIntegerValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for IntegerValueList
                               */
                              protected void validateIntegerValueList(int[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param IntegerValueList
                              */
                              public void setIntegerValueList(int[] param){
                              
                                   validateIntegerValueList(param);

                               
                                   clearAllSettingTrackers();
                               localIntegerValueListTracker = param != null;
                                      
                                      this.localIntegerValueList=param;
                              }

                               
                             

                        /**
                        * field for LongValue
                        */

                        
                                    protected long localLongValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLongValueTracker = false ;

                           public boolean isLongValueSpecified(){
                               return localLongValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getLongValue(){
                               return localLongValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LongValue
                               */
                               public void setLongValue(long param){
                            
                                clearAllSettingTrackers();
                            
                                       // setting primitive attribute tracker to true
                                       localLongValueTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localLongValue=param;
                                    

                               }
                            

                        /**
                        * field for LongValueList
                        * This was an Array!
                        */

                        
                                    protected long[] localLongValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLongValueListTracker = false ;

                           public boolean isLongValueListSpecified(){
                               return localLongValueListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long[]
                           */
                           public  long[] getLongValueList(){
                               return localLongValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for LongValueList
                               */
                              protected void validateLongValueList(long[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param LongValueList
                              */
                              public void setLongValueList(long[] param){
                              
                                   validateLongValueList(param);

                               
                                   clearAllSettingTrackers();
                               localLongValueListTracker = param != null;
                                      
                                      this.localLongValueList=param;
                              }

                               
                             

                        /**
                        * field for NamedIDDeltaValueList
                        * This was an Array!
                        */

                        
                                    protected com.rightnow.ws.base.NamedIDDelta[] localNamedIDDeltaValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNamedIDDeltaValueListTracker = false ;

                           public boolean isNamedIDDeltaValueListSpecified(){
                               return localNamedIDDeltaValueListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedIDDelta[]
                           */
                           public  com.rightnow.ws.base.NamedIDDelta[] getNamedIDDeltaValueList(){
                               return localNamedIDDeltaValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for NamedIDDeltaValueList
                               */
                              protected void validateNamedIDDeltaValueList(com.rightnow.ws.base.NamedIDDelta[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param NamedIDDeltaValueList
                              */
                              public void setNamedIDDeltaValueList(com.rightnow.ws.base.NamedIDDelta[] param){
                              
                                   validateNamedIDDeltaValueList(param);

                               
                                   clearAllSettingTrackers();
                               localNamedIDDeltaValueListTracker = param != null;
                                      
                                      this.localNamedIDDeltaValueList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.rightnow.ws.base.NamedIDDelta
                             */
                             public void addNamedIDDeltaValueList(com.rightnow.ws.base.NamedIDDelta param){
                                   if (localNamedIDDeltaValueList == null){
                                   localNamedIDDeltaValueList = new com.rightnow.ws.base.NamedIDDelta[]{};
                                   }

                            
                                   clearAllSettingTrackers();
                            
                                 //update the setting tracker
                                localNamedIDDeltaValueListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localNamedIDDeltaValueList);
                               list.add(param);
                               this.localNamedIDDeltaValueList =
                             (com.rightnow.ws.base.NamedIDDelta[])list.toArray(
                            new com.rightnow.ws.base.NamedIDDelta[list.size()]);

                             }
                             

                        /**
                        * field for NamedIDHierarchyValue
                        */

                        
                                    protected com.rightnow.ws.base.NamedIDHierarchy localNamedIDHierarchyValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNamedIDHierarchyValueTracker = false ;

                           public boolean isNamedIDHierarchyValueSpecified(){
                               return localNamedIDHierarchyValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedIDHierarchy
                           */
                           public  com.rightnow.ws.base.NamedIDHierarchy getNamedIDHierarchyValue(){
                               return localNamedIDHierarchyValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NamedIDHierarchyValue
                               */
                               public void setNamedIDHierarchyValue(com.rightnow.ws.base.NamedIDHierarchy param){
                            
                                clearAllSettingTrackers();
                            localNamedIDHierarchyValueTracker = param != null;
                                   
                                            this.localNamedIDHierarchyValue=param;
                                    

                               }
                            

                        /**
                        * field for NamedIDHierarchyValueList
                        * This was an Array!
                        */

                        
                                    protected com.rightnow.ws.base.NamedIDHierarchy[] localNamedIDHierarchyValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNamedIDHierarchyValueListTracker = false ;

                           public boolean isNamedIDHierarchyValueListSpecified(){
                               return localNamedIDHierarchyValueListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedIDHierarchy[]
                           */
                           public  com.rightnow.ws.base.NamedIDHierarchy[] getNamedIDHierarchyValueList(){
                               return localNamedIDHierarchyValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for NamedIDHierarchyValueList
                               */
                              protected void validateNamedIDHierarchyValueList(com.rightnow.ws.base.NamedIDHierarchy[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param NamedIDHierarchyValueList
                              */
                              public void setNamedIDHierarchyValueList(com.rightnow.ws.base.NamedIDHierarchy[] param){
                              
                                   validateNamedIDHierarchyValueList(param);

                               
                                   clearAllSettingTrackers();
                               localNamedIDHierarchyValueListTracker = param != null;
                                      
                                      this.localNamedIDHierarchyValueList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.rightnow.ws.base.NamedIDHierarchy
                             */
                             public void addNamedIDHierarchyValueList(com.rightnow.ws.base.NamedIDHierarchy param){
                                   if (localNamedIDHierarchyValueList == null){
                                   localNamedIDHierarchyValueList = new com.rightnow.ws.base.NamedIDHierarchy[]{};
                                   }

                            
                                   clearAllSettingTrackers();
                            
                                 //update the setting tracker
                                localNamedIDHierarchyValueListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localNamedIDHierarchyValueList);
                               list.add(param);
                               this.localNamedIDHierarchyValueList =
                             (com.rightnow.ws.base.NamedIDHierarchy[])list.toArray(
                            new com.rightnow.ws.base.NamedIDHierarchy[list.size()]);

                             }
                             

                        /**
                        * field for NamedIDValue
                        */

                        
                                    protected com.rightnow.ws.base.NamedID localNamedIDValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNamedIDValueTracker = false ;

                           public boolean isNamedIDValueSpecified(){
                               return localNamedIDValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID
                           */
                           public  com.rightnow.ws.base.NamedID getNamedIDValue(){
                               return localNamedIDValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NamedIDValue
                               */
                               public void setNamedIDValue(com.rightnow.ws.base.NamedID param){
                            
                                clearAllSettingTrackers();
                            localNamedIDValueTracker = param != null;
                                   
                                            this.localNamedIDValue=param;
                                    

                               }
                            

                        /**
                        * field for NamedIDValueList
                        * This was an Array!
                        */

                        
                                    protected com.rightnow.ws.base.NamedID[] localNamedIDValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNamedIDValueListTracker = false ;

                           public boolean isNamedIDValueListSpecified(){
                               return localNamedIDValueListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.base.NamedID[]
                           */
                           public  com.rightnow.ws.base.NamedID[] getNamedIDValueList(){
                               return localNamedIDValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for NamedIDValueList
                               */
                              protected void validateNamedIDValueList(com.rightnow.ws.base.NamedID[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param NamedIDValueList
                              */
                              public void setNamedIDValueList(com.rightnow.ws.base.NamedID[] param){
                              
                                   validateNamedIDValueList(param);

                               
                                   clearAllSettingTrackers();
                               localNamedIDValueListTracker = param != null;
                                      
                                      this.localNamedIDValueList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.rightnow.ws.base.NamedID
                             */
                             public void addNamedIDValueList(com.rightnow.ws.base.NamedID param){
                                   if (localNamedIDValueList == null){
                                   localNamedIDValueList = new com.rightnow.ws.base.NamedID[]{};
                                   }

                            
                                   clearAllSettingTrackers();
                            
                                 //update the setting tracker
                                localNamedIDValueListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localNamedIDValueList);
                               list.add(param);
                               this.localNamedIDValueList =
                             (com.rightnow.ws.base.NamedID[])list.toArray(
                            new com.rightnow.ws.base.NamedID[list.size()]);

                             }
                             

                        /**
                        * field for ObjectValue
                        */

                        
                                    protected com.rightnow.ws.generic.GenericObject localObjectValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localObjectValueTracker = false ;

                           public boolean isObjectValueSpecified(){
                               return localObjectValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.generic.GenericObject
                           */
                           public  com.rightnow.ws.generic.GenericObject getObjectValue(){
                               return localObjectValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ObjectValue
                               */
                               public void setObjectValue(com.rightnow.ws.generic.GenericObject param){
                            
                                clearAllSettingTrackers();
                            localObjectValueTracker = param != null;
                                   
                                            this.localObjectValue=param;
                                    

                               }
                            

                        /**
                        * field for ObjectValueList
                        * This was an Array!
                        */

                        
                                    protected com.rightnow.ws.generic.GenericObject[] localObjectValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localObjectValueListTracker = false ;

                           public boolean isObjectValueListSpecified(){
                               return localObjectValueListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.rightnow.ws.generic.GenericObject[]
                           */
                           public  com.rightnow.ws.generic.GenericObject[] getObjectValueList(){
                               return localObjectValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for ObjectValueList
                               */
                              protected void validateObjectValueList(com.rightnow.ws.generic.GenericObject[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ObjectValueList
                              */
                              public void setObjectValueList(com.rightnow.ws.generic.GenericObject[] param){
                              
                                   validateObjectValueList(param);

                               
                                   clearAllSettingTrackers();
                               localObjectValueListTracker = param != null;
                                      
                                      this.localObjectValueList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.rightnow.ws.generic.GenericObject
                             */
                             public void addObjectValueList(com.rightnow.ws.generic.GenericObject param){
                                   if (localObjectValueList == null){
                                   localObjectValueList = new com.rightnow.ws.generic.GenericObject[]{};
                                   }

                            
                                   clearAllSettingTrackers();
                            
                                 //update the setting tracker
                                localObjectValueListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localObjectValueList);
                               list.add(param);
                               this.localObjectValueList =
                             (com.rightnow.ws.generic.GenericObject[])list.toArray(
                            new com.rightnow.ws.generic.GenericObject[list.size()]);

                             }
                             

                        /**
                        * field for StringValue
                        */

                        
                                    protected java.lang.String localStringValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStringValueTracker = false ;

                           public boolean isStringValueSpecified(){
                               return localStringValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStringValue(){
                               return localStringValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StringValue
                               */
                               public void setStringValue(java.lang.String param){
                            
                                clearAllSettingTrackers();
                            localStringValueTracker = param != null;
                                   
                                            this.localStringValue=param;
                                    

                               }
                            

                        /**
                        * field for StringValueList
                        * This was an Array!
                        */

                        
                                    protected java.lang.String[] localStringValueList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStringValueListTracker = false ;

                           public boolean isStringValueListSpecified(){
                               return localStringValueListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String[]
                           */
                           public  java.lang.String[] getStringValueList(){
                               return localStringValueList;
                           }

                           
                        


                               
                              /**
                               * validate the array for StringValueList
                               */
                              protected void validateStringValueList(java.lang.String[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param StringValueList
                              */
                              public void setStringValueList(java.lang.String[] param){
                              
                                   validateStringValueList(param);

                               
                                   clearAllSettingTrackers();
                               localStringValueListTracker = param != null;
                                      
                                      this.localStringValueList=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param java.lang.String
                             */
                             public void addStringValueList(java.lang.String param){
                                   if (localStringValueList == null){
                                   localStringValueList = new java.lang.String[]{};
                                   }

                            
                                   clearAllSettingTrackers();
                            
                                 //update the setting tracker
                                localStringValueListTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localStringValueList);
                               list.add(param);
                               this.localStringValueList =
                             (java.lang.String[])list.toArray(
                            new java.lang.String[list.size()]);

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
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn:generic.ws.rightnow.com/v1_3");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":DataValue",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "DataValue",
                           xmlWriter);
                   }

               
                   }
                if (localBase64BinaryValueTracker){
                                    namespace = "urn:generic.ws.rightnow.com/v1_3";
                                    writeStartElement(null, namespace, "Base64BinaryValue", xmlWriter);
                             
                                        
                                    if (localBase64BinaryValue!=null)  {
                                       try {
                                           org.apache.axiom.util.stax.XMLStreamWriterUtils.writeDataHandler(xmlWriter, localBase64BinaryValue, null, true);
                                       } catch (java.io.IOException ex) {
                                           throw new javax.xml.stream.XMLStreamException("Unable to read data handler for Base64BinaryValue", ex);
                                       }
                                    } else {
                                         
                                    }
                                 
                                   xmlWriter.writeEndElement();
                             } if (localBooleanValueTracker){
                                    namespace = "urn:generic.ws.rightnow.com/v1_3";
                                    writeStartElement(null, namespace, "BooleanValue", xmlWriter);
                             
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("BooleanValue cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBooleanValue));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBooleanValueListTracker){
                             if (localBooleanValueList!=null) {
                                   namespace = "urn:generic.ws.rightnow.com/v1_3";
                                   for (int i = 0;i < localBooleanValueList.length;i++){
                                        
                                                   if (true) {
                                               
                                                writeStartElement(null, namespace, "BooleanValueList", xmlWriter);

                                            
                                                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBooleanValueList[i]));
                                                xmlWriter.writeEndElement();
                                            
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("BooleanValueList cannot be null!!");
                                    
                             }

                        } if (localDateTimeValueTracker){
                                    namespace = "urn:generic.ws.rightnow.com/v1_3";
                                    writeStartElement(null, namespace, "DateTimeValue", xmlWriter);
                             

                                          if (localDateTimeValue==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("DateTimeValue cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateTimeValue));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDateTimeValueListTracker){
                             if (localDateTimeValueList!=null) {
                                   namespace = "urn:generic.ws.rightnow.com/v1_3";
                                   for (int i = 0;i < localDateTimeValueList.length;i++){
                                        
                                            if (localDateTimeValueList[i] != null){
                                        
                                                writeStartElement(null, namespace, "DateTimeValueList", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateTimeValueList[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("DateTimeValueList cannot be null!!");
                                    
                             }

                        } if (localDateValueTracker){
                                    namespace = "urn:generic.ws.rightnow.com/v1_3";
                                    writeStartElement(null, namespace, "DateValue", xmlWriter);
                             

                                          if (localDateValue==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("DateValue cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateValue));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDateValueListTracker){
                             if (localDateValueList!=null) {
                                   namespace = "urn:generic.ws.rightnow.com/v1_3";
                                   for (int i = 0;i < localDateValueList.length;i++){
                                        
                                            if (localDateValueList[i] != null){
                                        
                                                writeStartElement(null, namespace, "DateValueList", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateValueList[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("DateValueList cannot be null!!");
                                    
                             }

                        } if (localDecimalValueTracker){
                                    namespace = "urn:generic.ws.rightnow.com/v1_3";
                                    writeStartElement(null, namespace, "DecimalValue", xmlWriter);
                             
                                               if (java.lang.Double.isNaN(localDecimalValue)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("DecimalValue cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDecimalValue));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDecimalValueListTracker){
                             if (localDecimalValueList!=null) {
                                   namespace = "urn:generic.ws.rightnow.com/v1_3";
                                   for (int i = 0;i < localDecimalValueList.length;i++){
                                        
                                                   if (!java.lang.Double.isNaN(localDecimalValueList[i])) {
                                               
                                                writeStartElement(null, namespace, "DecimalValueList", xmlWriter);

                                            
                                                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDecimalValueList[i]));
                                                xmlWriter.writeEndElement();
                                            
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("DecimalValueList cannot be null!!");
                                    
                             }

                        } if (localIDValueTracker){
                                            if (localIDValue==null){
                                                 throw new org.apache.axis2.databinding.ADBException("IDValue cannot be null!!");
                                            }
                                           localIDValue.serialize(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","IDValue"),
                                               xmlWriter);
                                        } if (localIDValueListTracker){
                                       if (localIDValueList!=null){
                                            for (int i = 0;i < localIDValueList.length;i++){
                                                if (localIDValueList[i] != null){
                                                 localIDValueList[i].serialize(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","IDValueList"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("IDValueList cannot be null!!");
                                        
                                    }
                                 } if (localIntegerValueTracker){
                                    namespace = "urn:generic.ws.rightnow.com/v1_3";
                                    writeStartElement(null, namespace, "IntegerValue", xmlWriter);
                             
                                               if (localIntegerValue==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("IntegerValue cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIntegerValue));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIntegerValueListTracker){
                             if (localIntegerValueList!=null) {
                                   namespace = "urn:generic.ws.rightnow.com/v1_3";
                                   for (int i = 0;i < localIntegerValueList.length;i++){
                                        
                                                   if (localIntegerValueList[i]!=java.lang.Integer.MIN_VALUE) {
                                               
                                                writeStartElement(null, namespace, "IntegerValueList", xmlWriter);

                                            
                                                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIntegerValueList[i]));
                                                xmlWriter.writeEndElement();
                                            
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("IntegerValueList cannot be null!!");
                                    
                             }

                        } if (localLongValueTracker){
                                    namespace = "urn:generic.ws.rightnow.com/v1_3";
                                    writeStartElement(null, namespace, "LongValue", xmlWriter);
                             
                                               if (localLongValue==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("LongValue cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLongValue));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLongValueListTracker){
                             if (localLongValueList!=null) {
                                   namespace = "urn:generic.ws.rightnow.com/v1_3";
                                   for (int i = 0;i < localLongValueList.length;i++){
                                        
                                                   if (localLongValueList[i]!=java.lang.Long.MIN_VALUE) {
                                               
                                                writeStartElement(null, namespace, "LongValueList", xmlWriter);

                                            
                                                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLongValueList[i]));
                                                xmlWriter.writeEndElement();
                                            
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("LongValueList cannot be null!!");
                                    
                             }

                        } if (localNamedIDDeltaValueListTracker){
                                       if (localNamedIDDeltaValueList!=null){
                                            for (int i = 0;i < localNamedIDDeltaValueList.length;i++){
                                                if (localNamedIDDeltaValueList[i] != null){
                                                 localNamedIDDeltaValueList[i].serialize(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","NamedIDDeltaValueList"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("NamedIDDeltaValueList cannot be null!!");
                                        
                                    }
                                 } if (localNamedIDHierarchyValueTracker){
                                            if (localNamedIDHierarchyValue==null){
                                                 throw new org.apache.axis2.databinding.ADBException("NamedIDHierarchyValue cannot be null!!");
                                            }
                                           localNamedIDHierarchyValue.serialize(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","NamedIDHierarchyValue"),
                                               xmlWriter);
                                        } if (localNamedIDHierarchyValueListTracker){
                                       if (localNamedIDHierarchyValueList!=null){
                                            for (int i = 0;i < localNamedIDHierarchyValueList.length;i++){
                                                if (localNamedIDHierarchyValueList[i] != null){
                                                 localNamedIDHierarchyValueList[i].serialize(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","NamedIDHierarchyValueList"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("NamedIDHierarchyValueList cannot be null!!");
                                        
                                    }
                                 } if (localNamedIDValueTracker){
                                            if (localNamedIDValue==null){
                                                 throw new org.apache.axis2.databinding.ADBException("NamedIDValue cannot be null!!");
                                            }
                                           localNamedIDValue.serialize(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","NamedIDValue"),
                                               xmlWriter);
                                        } if (localNamedIDValueListTracker){
                                       if (localNamedIDValueList!=null){
                                            for (int i = 0;i < localNamedIDValueList.length;i++){
                                                if (localNamedIDValueList[i] != null){
                                                 localNamedIDValueList[i].serialize(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","NamedIDValueList"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("NamedIDValueList cannot be null!!");
                                        
                                    }
                                 } if (localObjectValueTracker){
                                            if (localObjectValue==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ObjectValue cannot be null!!");
                                            }
                                           localObjectValue.serialize(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","ObjectValue"),
                                               xmlWriter);
                                        } if (localObjectValueListTracker){
                                       if (localObjectValueList!=null){
                                            for (int i = 0;i < localObjectValueList.length;i++){
                                                if (localObjectValueList[i] != null){
                                                 localObjectValueList[i].serialize(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","ObjectValueList"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("ObjectValueList cannot be null!!");
                                        
                                    }
                                 } if (localStringValueTracker){
                                    namespace = "urn:generic.ws.rightnow.com/v1_3";
                                    writeStartElement(null, namespace, "StringValue", xmlWriter);
                             

                                          if (localStringValue==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("StringValue cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStringValue);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStringValueListTracker){
                             if (localStringValueList!=null) {
                                   namespace = "urn:generic.ws.rightnow.com/v1_3";
                                   for (int i = 0;i < localStringValueList.length;i++){
                                        
                                            if (localStringValueList[i] != null){
                                        
                                                writeStartElement(null, namespace, "StringValueList", xmlWriter);

                                            
                                                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStringValueList[i]));
                                                    
                                                xmlWriter.writeEndElement();
                                              
                                                } else {
                                                   
                                                           // we have to do nothing since minOccurs is zero
                                                       
                                                }

                                   }
                             } else {
                                 
                                         throw new org.apache.axis2.databinding.ADBException("StringValueList cannot be null!!");
                                    
                             }

                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("urn:generic.ws.rightnow.com/v1_3")){
                return "ns2";
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

                 if (localBase64BinaryValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                        "Base64BinaryValue"));
                                
                            elementList.add(localBase64BinaryValue);
                        } if (localBooleanValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                                                      "BooleanValue"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBooleanValue));
                            } if (localBooleanValueListTracker){
                            if (localBooleanValueList!=null){
                                  for (int i = 0;i < localBooleanValueList.length;i++){
                                      
                                          elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                                                                                                       "BooleanValueList"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBooleanValueList[i]));

                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("BooleanValueList cannot be null!!");
                                
                            }

                        } if (localDateTimeValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                                                      "DateTimeValue"));
                                 
                                        if (localDateTimeValue != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateTimeValue));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("DateTimeValue cannot be null!!");
                                        }
                                    } if (localDateTimeValueListTracker){
                            if (localDateTimeValueList!=null){
                                  for (int i = 0;i < localDateTimeValueList.length;i++){
                                      
                                         if (localDateTimeValueList[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                                                              "DateTimeValueList"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateTimeValueList[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("DateTimeValueList cannot be null!!");
                                
                            }

                        } if (localDateValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                                                      "DateValue"));
                                 
                                        if (localDateValue != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateValue));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("DateValue cannot be null!!");
                                        }
                                    } if (localDateValueListTracker){
                            if (localDateValueList!=null){
                                  for (int i = 0;i < localDateValueList.length;i++){
                                      
                                         if (localDateValueList[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                                                              "DateValueList"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateValueList[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("DateValueList cannot be null!!");
                                
                            }

                        } if (localDecimalValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                                                      "DecimalValue"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDecimalValue));
                            } if (localDecimalValueListTracker){
                            if (localDecimalValueList!=null){
                                  for (int i = 0;i < localDecimalValueList.length;i++){
                                      
                                          elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                                                                                                       "DecimalValueList"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDecimalValueList[i]));

                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("DecimalValueList cannot be null!!");
                                
                            }

                        } if (localIDValueTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                                                      "IDValue"));
                            
                            
                                    if (localIDValue==null){
                                         throw new org.apache.axis2.databinding.ADBException("IDValue cannot be null!!");
                                    }
                                    elementList.add(localIDValue);
                                } if (localIDValueListTracker){
                             if (localIDValueList!=null) {
                                 for (int i = 0;i < localIDValueList.length;i++){

                                    if (localIDValueList[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                                                          "IDValueList"));
                                         elementList.add(localIDValueList[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("IDValueList cannot be null!!");
                                    
                             }

                        } if (localIntegerValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                                                      "IntegerValue"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIntegerValue));
                            } if (localIntegerValueListTracker){
                            if (localIntegerValueList!=null){
                                  for (int i = 0;i < localIntegerValueList.length;i++){
                                      
                                          elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                                                                                                       "IntegerValueList"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIntegerValueList[i]));

                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("IntegerValueList cannot be null!!");
                                
                            }

                        } if (localLongValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                                                      "LongValue"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLongValue));
                            } if (localLongValueListTracker){
                            if (localLongValueList!=null){
                                  for (int i = 0;i < localLongValueList.length;i++){
                                      
                                          elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                                                                                                       "LongValueList"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLongValueList[i]));

                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("LongValueList cannot be null!!");
                                
                            }

                        } if (localNamedIDDeltaValueListTracker){
                             if (localNamedIDDeltaValueList!=null) {
                                 for (int i = 0;i < localNamedIDDeltaValueList.length;i++){

                                    if (localNamedIDDeltaValueList[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                                                          "NamedIDDeltaValueList"));
                                         elementList.add(localNamedIDDeltaValueList[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("NamedIDDeltaValueList cannot be null!!");
                                    
                             }

                        } if (localNamedIDHierarchyValueTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                                                      "NamedIDHierarchyValue"));
                            
                            
                                    if (localNamedIDHierarchyValue==null){
                                         throw new org.apache.axis2.databinding.ADBException("NamedIDHierarchyValue cannot be null!!");
                                    }
                                    elementList.add(localNamedIDHierarchyValue);
                                } if (localNamedIDHierarchyValueListTracker){
                             if (localNamedIDHierarchyValueList!=null) {
                                 for (int i = 0;i < localNamedIDHierarchyValueList.length;i++){

                                    if (localNamedIDHierarchyValueList[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                                                          "NamedIDHierarchyValueList"));
                                         elementList.add(localNamedIDHierarchyValueList[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("NamedIDHierarchyValueList cannot be null!!");
                                    
                             }

                        } if (localNamedIDValueTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                                                      "NamedIDValue"));
                            
                            
                                    if (localNamedIDValue==null){
                                         throw new org.apache.axis2.databinding.ADBException("NamedIDValue cannot be null!!");
                                    }
                                    elementList.add(localNamedIDValue);
                                } if (localNamedIDValueListTracker){
                             if (localNamedIDValueList!=null) {
                                 for (int i = 0;i < localNamedIDValueList.length;i++){

                                    if (localNamedIDValueList[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                                                          "NamedIDValueList"));
                                         elementList.add(localNamedIDValueList[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("NamedIDValueList cannot be null!!");
                                    
                             }

                        } if (localObjectValueTracker){
                            elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                                                      "ObjectValue"));
                            
                            
                                    if (localObjectValue==null){
                                         throw new org.apache.axis2.databinding.ADBException("ObjectValue cannot be null!!");
                                    }
                                    elementList.add(localObjectValue);
                                } if (localObjectValueListTracker){
                             if (localObjectValueList!=null) {
                                 for (int i = 0;i < localObjectValueList.length;i++){

                                    if (localObjectValueList[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                                                          "ObjectValueList"));
                                         elementList.add(localObjectValueList[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("ObjectValueList cannot be null!!");
                                    
                             }

                        } if (localStringValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                                                      "StringValue"));
                                 
                                        if (localStringValue != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStringValue));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("StringValue cannot be null!!");
                                        }
                                    } if (localStringValueListTracker){
                            if (localStringValueList!=null){
                                  for (int i = 0;i < localStringValueList.length;i++){
                                      
                                         if (localStringValueList[i] != null){
                                          elementList.add(new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3",
                                                                              "StringValueList"));
                                          elementList.add(
                                          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStringValueList[i]));
                                          } else {
                                             
                                                    // have to do nothing
                                                
                                          }
                                      

                                  }
                            } else {
                              
                                    throw new org.apache.axis2.databinding.ADBException("StringValueList cannot be null!!");
                                
                            }

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
        public static DataValue parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            DataValue object =
                new DataValue();

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
                    
                            if (!"DataValue".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (DataValue)com.rightnow.ws.objects.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                        java.util.ArrayList list5 = new java.util.ArrayList();
                    
                        java.util.ArrayList list7 = new java.util.ArrayList();
                    
                        java.util.ArrayList list9 = new java.util.ArrayList();
                    
                        java.util.ArrayList list11 = new java.util.ArrayList();
                    
                        java.util.ArrayList list13 = new java.util.ArrayList();
                    
                        java.util.ArrayList list15 = new java.util.ArrayList();
                    
                        java.util.ArrayList list16 = new java.util.ArrayList();
                    
                        java.util.ArrayList list18 = new java.util.ArrayList();
                    
                        java.util.ArrayList list20 = new java.util.ArrayList();
                    
                        java.util.ArrayList list22 = new java.util.ArrayList();
                    
                        java.util.ArrayList list24 = new java.util.ArrayList();
                       
                while(!reader.isEndElement()) {
                    if (reader.isStartElement() ){
                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","Base64BinaryValue").equals(reader.getName())){
                                
                                            object.setBase64BinaryValue(org.apache.axiom.util.stax.XMLStreamReaderUtils.getDataHandlerFromElement(reader));
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","BooleanValue").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"BooleanValue" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBooleanValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","BooleanValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list3.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone3 = false;
                                            while(!loopDone3){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone3 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","BooleanValueList").equals(reader.getName())){
                                                         list3.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone3 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                            object.setBooleanValueList((boolean[])
                                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                            boolean.class,list3));
                                                
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","DateTimeValue").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"DateTimeValue" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDateTimeValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","DateTimeValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list5.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone5 = false;
                                            while(!loopDone5){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone5 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","DateTimeValueList").equals(reader.getName())){
                                                         list5.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone5 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                            object.setDateTimeValueList((java.util.Calendar[])
                                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                            java.util.Calendar.class,list5));
                                                
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","DateValue").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"DateValue" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDateValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDate(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","DateValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list7.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone7 = false;
                                            while(!loopDone7){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone7 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","DateValueList").equals(reader.getName())){
                                                         list7.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone7 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                            object.setDateValueList((java.util.Date[])
                                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                            java.util.Date.class,list7));
                                                
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","DecimalValue").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"DecimalValue" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDecimalValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","DecimalValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list9.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone9 = false;
                                            while(!loopDone9){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone9 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","DecimalValueList").equals(reader.getName())){
                                                         list9.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone9 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                            object.setDecimalValueList((double[])
                                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                            double.class,list9));
                                                
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","IDValue").equals(reader.getName())){
                                
                                                object.setIDValue(com.rightnow.ws.base.ID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","IDValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list11.add(com.rightnow.ws.base.ID.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone11 = false;
                                                        while(!loopDone11){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone11 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","IDValueList").equals(reader.getName())){
                                                                    list11.add(com.rightnow.ws.base.ID.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone11 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setIDValueList((com.rightnow.ws.base.ID[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.rightnow.ws.base.ID.class,
                                                                list11));
                                                            
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","IntegerValue").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"IntegerValue" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIntegerValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","IntegerValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list13.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone13 = false;
                                            while(!loopDone13){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone13 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","IntegerValueList").equals(reader.getName())){
                                                         list13.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone13 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                            object.setIntegerValueList((int[])
                                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                            int.class,list13));
                                                
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","LongValue").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"LongValue" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLongValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","LongValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list15.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone15 = false;
                                            while(!loopDone15){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone15 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","LongValueList").equals(reader.getName())){
                                                         list15.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone15 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                            object.setLongValueList((long[])
                                                org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                            long.class,list15));
                                                
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","NamedIDDeltaValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list16.add(com.rightnow.ws.base.NamedIDDelta.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone16 = false;
                                                        while(!loopDone16){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone16 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","NamedIDDeltaValueList").equals(reader.getName())){
                                                                    list16.add(com.rightnow.ws.base.NamedIDDelta.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone16 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setNamedIDDeltaValueList((com.rightnow.ws.base.NamedIDDelta[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.rightnow.ws.base.NamedIDDelta.class,
                                                                list16));
                                                            
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","NamedIDHierarchyValue").equals(reader.getName())){
                                
                                                object.setNamedIDHierarchyValue(com.rightnow.ws.base.NamedIDHierarchy.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","NamedIDHierarchyValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list18.add(com.rightnow.ws.base.NamedIDHierarchy.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone18 = false;
                                                        while(!loopDone18){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone18 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","NamedIDHierarchyValueList").equals(reader.getName())){
                                                                    list18.add(com.rightnow.ws.base.NamedIDHierarchy.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone18 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setNamedIDHierarchyValueList((com.rightnow.ws.base.NamedIDHierarchy[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.rightnow.ws.base.NamedIDHierarchy.class,
                                                                list18));
                                                            
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","NamedIDValue").equals(reader.getName())){
                                
                                                object.setNamedIDValue(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","NamedIDValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list20.add(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone20 = false;
                                                        while(!loopDone20){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone20 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","NamedIDValueList").equals(reader.getName())){
                                                                    list20.add(com.rightnow.ws.base.NamedID.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone20 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setNamedIDValueList((com.rightnow.ws.base.NamedID[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.rightnow.ws.base.NamedID.class,
                                                                list20));
                                                            
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","ObjectValue").equals(reader.getName())){
                                
                                                object.setObjectValue(com.rightnow.ws.generic.GenericObject.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","ObjectValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list22.add(com.rightnow.ws.generic.GenericObject.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone22 = false;
                                                        while(!loopDone22){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone22 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","ObjectValueList").equals(reader.getName())){
                                                                    list22.add(com.rightnow.ws.generic.GenericObject.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone22 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setObjectValueList((com.rightnow.ws.generic.GenericObject[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.rightnow.ws.generic.GenericObject.class,
                                                                list22));
                                                            
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","StringValue").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"StringValue" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStringValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                        else
                                    
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","StringValueList").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list24.add(reader.getElementText());
                                            
                                            //loop until we find a start element that is not part of this array
                                            boolean loopDone24 = false;
                                            while(!loopDone24){
                                                // Ensure we are at the EndElement
                                                while (!reader.isEndElement()){
                                                    reader.next();
                                                }
                                                // Step out of this element
                                                reader.next();
                                                // Step to next element event.
                                                while (!reader.isStartElement() && !reader.isEndElement())
                                                    reader.next();
                                                if (reader.isEndElement()){
                                                    //two continuous end elements means we are exiting the xml structure
                                                    loopDone24 = true;
                                                } else {
                                                    if (new javax.xml.namespace.QName("urn:generic.ws.rightnow.com/v1_3","StringValueList").equals(reader.getName())){
                                                         list24.add(reader.getElementText());
                                                        
                                                    }else{
                                                        loopDone24 = true;
                                                    }
                                                }
                                            }
                                            // call the converter utility  to convert and set the array
                                            
                                                    object.setStringValueList((java.lang.String[])
                                                        list24.toArray(new java.lang.String[list24.size()]));
                                                
                              }  // End of if for expected property start element
                                
                             } else {
                                reader.next();
                             }  
                           }  // end of while loop
                        



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
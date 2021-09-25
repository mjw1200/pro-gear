
/**
 * ContactMarketingSettingsNullFields.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.rightnow.ws.nullfields;
            

            /**
            *  ContactMarketingSettingsNullFields bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ContactMarketingSettingsNullFields
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = ContactMarketingSettingsNullFields
                Namespace URI = urn:nullfields.ws.rightnow.com/v1_3
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for ContactLists
                        * This was an Attribute!
                        */

                        
                                    protected boolean localContactLists =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getContactLists(){
                               return localContactLists;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ContactLists
                               */
                               public void setContactLists(boolean param){
                            
                                            this.localContactLists=param;
                                    

                               }
                            

                        /**
                        * field for EmailFormat
                        * This was an Attribute!
                        */

                        
                                    protected boolean localEmailFormat =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getEmailFormat(){
                               return localEmailFormat;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EmailFormat
                               */
                               public void setEmailFormat(boolean param){
                            
                                            this.localEmailFormat=param;
                                    

                               }
                            

                        /**
                        * field for MarketingOptIn
                        * This was an Attribute!
                        */

                        
                                    protected boolean localMarketingOptIn =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getMarketingOptIn(){
                               return localMarketingOptIn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MarketingOptIn
                               */
                               public void setMarketingOptIn(boolean param){
                            
                                            this.localMarketingOptIn=param;
                                    

                               }
                            

                        /**
                        * field for MarketingOrganizationName
                        * This was an Attribute!
                        */

                        
                                    protected boolean localMarketingOrganizationName =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getMarketingOrganizationName(){
                               return localMarketingOrganizationName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MarketingOrganizationName
                               */
                               public void setMarketingOrganizationName(boolean param){
                            
                                            this.localMarketingOrganizationName=param;
                                    

                               }
                            

                        /**
                        * field for MarketingOrganizationNameAlt
                        * This was an Attribute!
                        */

                        
                                    protected boolean localMarketingOrganizationNameAlt =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getMarketingOrganizationNameAlt(){
                               return localMarketingOrganizationNameAlt;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MarketingOrganizationNameAlt
                               */
                               public void setMarketingOrganizationNameAlt(boolean param){
                            
                                            this.localMarketingOrganizationNameAlt=param;
                                    

                               }
                            

                        /**
                        * field for SurveyOptIn
                        * This was an Attribute!
                        */

                        
                                    protected boolean localSurveyOptIn =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getSurveyOptIn(){
                               return localSurveyOptIn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SurveyOptIn
                               */
                               public void setSurveyOptIn(boolean param){
                            
                                            this.localSurveyOptIn=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn:nullfields.ws.rightnow.com/v1_3");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":ContactMarketingSettingsNullFields",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "ContactMarketingSettingsNullFields",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "ContactLists",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localContactLists), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "EmailFormat",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailFormat), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "MarketingOptIn",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMarketingOptIn), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "MarketingOrganizationName",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMarketingOrganizationName), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "MarketingOrganizationNameAlt",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMarketingOrganizationNameAlt), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "SurveyOptIn",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSurveyOptIn), xmlWriter);

                                            
                                      }
                                    
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("urn:nullfields.ws.rightnow.com/v1_3")){
                return "ns3";
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

                
                            attribList.add(
                            new javax.xml.namespace.QName("","ContactLists"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localContactLists));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","EmailFormat"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailFormat));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","MarketingOptIn"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMarketingOptIn));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","MarketingOrganizationName"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMarketingOrganizationName));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","MarketingOrganizationNameAlt"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMarketingOrganizationNameAlt));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","SurveyOptIn"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSurveyOptIn));
                                

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
        public static ContactMarketingSettingsNullFields parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ContactMarketingSettingsNullFields object =
                new ContactMarketingSettingsNullFields();

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
                    
                            if (!"ContactMarketingSettingsNullFields".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ContactMarketingSettingsNullFields)com.rightnow.ws.objects.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "ContactLists"
                    java.lang.String tempAttribContactLists =
                        
                                reader.getAttributeValue(null,"ContactLists");
                            
                   if (tempAttribContactLists!=null){
                         java.lang.String content = tempAttribContactLists;
                        
                                                 object.setContactLists(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribContactLists));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ContactLists");
                    
                    // handle attribute "EmailFormat"
                    java.lang.String tempAttribEmailFormat =
                        
                                reader.getAttributeValue(null,"EmailFormat");
                            
                   if (tempAttribEmailFormat!=null){
                         java.lang.String content = tempAttribEmailFormat;
                        
                                                 object.setEmailFormat(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribEmailFormat));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("EmailFormat");
                    
                    // handle attribute "MarketingOptIn"
                    java.lang.String tempAttribMarketingOptIn =
                        
                                reader.getAttributeValue(null,"MarketingOptIn");
                            
                   if (tempAttribMarketingOptIn!=null){
                         java.lang.String content = tempAttribMarketingOptIn;
                        
                                                 object.setMarketingOptIn(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribMarketingOptIn));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("MarketingOptIn");
                    
                    // handle attribute "MarketingOrganizationName"
                    java.lang.String tempAttribMarketingOrganizationName =
                        
                                reader.getAttributeValue(null,"MarketingOrganizationName");
                            
                   if (tempAttribMarketingOrganizationName!=null){
                         java.lang.String content = tempAttribMarketingOrganizationName;
                        
                                                 object.setMarketingOrganizationName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribMarketingOrganizationName));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("MarketingOrganizationName");
                    
                    // handle attribute "MarketingOrganizationNameAlt"
                    java.lang.String tempAttribMarketingOrganizationNameAlt =
                        
                                reader.getAttributeValue(null,"MarketingOrganizationNameAlt");
                            
                   if (tempAttribMarketingOrganizationNameAlt!=null){
                         java.lang.String content = tempAttribMarketingOrganizationNameAlt;
                        
                                                 object.setMarketingOrganizationNameAlt(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribMarketingOrganizationNameAlt));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("MarketingOrganizationNameAlt");
                    
                    // handle attribute "SurveyOptIn"
                    java.lang.String tempAttribSurveyOptIn =
                        
                                reader.getAttributeValue(null,"SurveyOptIn");
                            
                   if (tempAttribSurveyOptIn!=null){
                         java.lang.String content = tempAttribSurveyOptIn;
                        
                                                 object.setSurveyOptIn(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribSurveyOptIn));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("SurveyOptIn");
                    
                    
                    reader.next();
                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
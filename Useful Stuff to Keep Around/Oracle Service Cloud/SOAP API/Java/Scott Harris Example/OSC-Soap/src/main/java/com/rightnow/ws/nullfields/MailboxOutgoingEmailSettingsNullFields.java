
/**
 * MailboxOutgoingEmailSettingsNullFields.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.rightnow.ws.nullfields;
            

            /**
            *  MailboxOutgoingEmailSettingsNullFields bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class MailboxOutgoingEmailSettingsNullFields
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = MailboxOutgoingEmailSettingsNullFields
                Namespace URI = urn:nullfields.ws.rightnow.com/v1_3
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for DisplayName
                        * This was an Attribute!
                        */

                        
                                    protected boolean localDisplayName =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getDisplayName(){
                               return localDisplayName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DisplayName
                               */
                               public void setDisplayName(boolean param){
                            
                                            this.localDisplayName=param;
                                    

                               }
                            

                        /**
                        * field for FriendlyFromAddress
                        * This was an Attribute!
                        */

                        
                                    protected boolean localFriendlyFromAddress =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getFriendlyFromAddress(){
                               return localFriendlyFromAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FriendlyFromAddress
                               */
                               public void setFriendlyFromAddress(boolean param){
                            
                                            this.localFriendlyFromAddress=param;
                                    

                               }
                            

                        /**
                        * field for FromAddress
                        * This was an Attribute!
                        */

                        
                                    protected boolean localFromAddress =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getFromAddress(){
                               return localFromAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FromAddress
                               */
                               public void setFromAddress(boolean param){
                            
                                            this.localFromAddress=param;
                                    

                               }
                            

                        /**
                        * field for IsEnabled
                        * This was an Attribute!
                        */

                        
                                    protected boolean localIsEnabled =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getIsEnabled(){
                               return localIsEnabled;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsEnabled
                               */
                               public void setIsEnabled(boolean param){
                            
                                            this.localIsEnabled=param;
                                    

                               }
                            

                        /**
                        * field for ReplyToAddress
                        * This was an Attribute!
                        */

                        
                                    protected boolean localReplyToAddress =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getReplyToAddress(){
                               return localReplyToAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReplyToAddress
                               */
                               public void setReplyToAddress(boolean param){
                            
                                            this.localReplyToAddress=param;
                                    

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
                           namespacePrefix+":MailboxOutgoingEmailSettingsNullFields",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "MailboxOutgoingEmailSettingsNullFields",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "DisplayName",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDisplayName), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "FriendlyFromAddress",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFriendlyFromAddress), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "FromAddress",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFromAddress), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "IsEnabled",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsEnabled), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "ReplyToAddress",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReplyToAddress), xmlWriter);

                                            
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
                            new javax.xml.namespace.QName("","DisplayName"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDisplayName));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","FriendlyFromAddress"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFriendlyFromAddress));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","FromAddress"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFromAddress));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","IsEnabled"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsEnabled));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","ReplyToAddress"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReplyToAddress));
                                

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
        public static MailboxOutgoingEmailSettingsNullFields parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            MailboxOutgoingEmailSettingsNullFields object =
                new MailboxOutgoingEmailSettingsNullFields();

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
                    
                            if (!"MailboxOutgoingEmailSettingsNullFields".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (MailboxOutgoingEmailSettingsNullFields)com.rightnow.ws.objects.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "DisplayName"
                    java.lang.String tempAttribDisplayName =
                        
                                reader.getAttributeValue(null,"DisplayName");
                            
                   if (tempAttribDisplayName!=null){
                         java.lang.String content = tempAttribDisplayName;
                        
                                                 object.setDisplayName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribDisplayName));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("DisplayName");
                    
                    // handle attribute "FriendlyFromAddress"
                    java.lang.String tempAttribFriendlyFromAddress =
                        
                                reader.getAttributeValue(null,"FriendlyFromAddress");
                            
                   if (tempAttribFriendlyFromAddress!=null){
                         java.lang.String content = tempAttribFriendlyFromAddress;
                        
                                                 object.setFriendlyFromAddress(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribFriendlyFromAddress));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("FriendlyFromAddress");
                    
                    // handle attribute "FromAddress"
                    java.lang.String tempAttribFromAddress =
                        
                                reader.getAttributeValue(null,"FromAddress");
                            
                   if (tempAttribFromAddress!=null){
                         java.lang.String content = tempAttribFromAddress;
                        
                                                 object.setFromAddress(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribFromAddress));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("FromAddress");
                    
                    // handle attribute "IsEnabled"
                    java.lang.String tempAttribIsEnabled =
                        
                                reader.getAttributeValue(null,"IsEnabled");
                            
                   if (tempAttribIsEnabled!=null){
                         java.lang.String content = tempAttribIsEnabled;
                        
                                                 object.setIsEnabled(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribIsEnabled));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("IsEnabled");
                    
                    // handle attribute "ReplyToAddress"
                    java.lang.String tempAttribReplyToAddress =
                        
                                reader.getAttributeValue(null,"ReplyToAddress");
                            
                   if (tempAttribReplyToAddress!=null){
                         java.lang.String content = tempAttribReplyToAddress;
                        
                                                 object.setReplyToAddress(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribReplyToAddress));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("ReplyToAddress");
                    
                    
                    reader.next();
                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
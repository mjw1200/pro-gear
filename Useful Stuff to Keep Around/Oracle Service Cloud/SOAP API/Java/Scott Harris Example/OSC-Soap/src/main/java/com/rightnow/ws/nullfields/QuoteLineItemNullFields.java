
/**
 * QuoteLineItemNullFields.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.rightnow.ws.nullfields;
            

            /**
            *  QuoteLineItemNullFields bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class QuoteLineItemNullFields
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = QuoteLineItemNullFields
                Namespace URI = urn:nullfields.ws.rightnow.com/v1_3
                Namespace Prefix = ns3
                */
            

                        /**
                        * field for AdjustedDescription
                        * This was an Attribute!
                        */

                        
                                    protected boolean localAdjustedDescription =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAdjustedDescription(){
                               return localAdjustedDescription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdjustedDescription
                               */
                               public void setAdjustedDescription(boolean param){
                            
                                            this.localAdjustedDescription=param;
                                    

                               }
                            

                        /**
                        * field for AdjustedName
                        * This was an Attribute!
                        */

                        
                                    protected boolean localAdjustedName =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAdjustedName(){
                               return localAdjustedName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdjustedName
                               */
                               public void setAdjustedName(boolean param){
                            
                                            this.localAdjustedName=param;
                                    

                               }
                            

                        /**
                        * field for AdjustedPartNumber
                        * This was an Attribute!
                        */

                        
                                    protected boolean localAdjustedPartNumber =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAdjustedPartNumber(){
                               return localAdjustedPartNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdjustedPartNumber
                               */
                               public void setAdjustedPartNumber(boolean param){
                            
                                            this.localAdjustedPartNumber=param;
                                    

                               }
                            

                        /**
                        * field for AdjustedPrice
                        * This was an Attribute!
                        */

                        
                                    protected boolean localAdjustedPrice =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAdjustedPrice(){
                               return localAdjustedPrice;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdjustedPrice
                               */
                               public void setAdjustedPrice(boolean param){
                            
                                            this.localAdjustedPrice=param;
                                    

                               }
                            

                        /**
                        * field for AdjustedTotal
                        * This was an Attribute!
                        */

                        
                                    protected boolean localAdjustedTotal =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAdjustedTotal(){
                               return localAdjustedTotal;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdjustedTotal
                               */
                               public void setAdjustedTotal(boolean param){
                            
                                            this.localAdjustedTotal=param;
                                    

                               }
                            

                        /**
                        * field for Comment
                        * This was an Attribute!
                        */

                        
                                    protected boolean localComment =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getComment(){
                               return localComment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Comment
                               */
                               public void setComment(boolean param){
                            
                                            this.localComment=param;
                                    

                               }
                            

                        /**
                        * field for Product
                        * This was an Attribute!
                        */

                        
                                    protected boolean localProduct =
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");
                                

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getProduct(){
                               return localProduct;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Product
                               */
                               public void setProduct(boolean param){
                            
                                            this.localProduct=param;
                                    

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
                           namespacePrefix+":QuoteLineItemNullFields",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "QuoteLineItemNullFields",
                           xmlWriter);
                   }

               
                   }
               
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "AdjustedDescription",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdjustedDescription), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "AdjustedName",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdjustedName), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "AdjustedPartNumber",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdjustedPartNumber), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "AdjustedPrice",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdjustedPrice), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "AdjustedTotal",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdjustedTotal), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "Comment",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localComment), xmlWriter);

                                            
                                      }
                                    
                                                   if (true) {
                                               
                                                writeAttribute("",
                                                         "Product",
                                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProduct), xmlWriter);

                                            
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
                            new javax.xml.namespace.QName("","AdjustedDescription"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdjustedDescription));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","AdjustedName"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdjustedName));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","AdjustedPartNumber"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdjustedPartNumber));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","AdjustedPrice"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdjustedPrice));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","AdjustedTotal"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdjustedTotal));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Comment"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localComment));
                                
                            attribList.add(
                            new javax.xml.namespace.QName("","Product"));
                            
                                      attribList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProduct));
                                

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
        public static QuoteLineItemNullFields parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            QuoteLineItemNullFields object =
                new QuoteLineItemNullFields();

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
                    
                            if (!"QuoteLineItemNullFields".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (QuoteLineItemNullFields)com.rightnow.ws.objects.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    // handle attribute "AdjustedDescription"
                    java.lang.String tempAttribAdjustedDescription =
                        
                                reader.getAttributeValue(null,"AdjustedDescription");
                            
                   if (tempAttribAdjustedDescription!=null){
                         java.lang.String content = tempAttribAdjustedDescription;
                        
                                                 object.setAdjustedDescription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribAdjustedDescription));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("AdjustedDescription");
                    
                    // handle attribute "AdjustedName"
                    java.lang.String tempAttribAdjustedName =
                        
                                reader.getAttributeValue(null,"AdjustedName");
                            
                   if (tempAttribAdjustedName!=null){
                         java.lang.String content = tempAttribAdjustedName;
                        
                                                 object.setAdjustedName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribAdjustedName));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("AdjustedName");
                    
                    // handle attribute "AdjustedPartNumber"
                    java.lang.String tempAttribAdjustedPartNumber =
                        
                                reader.getAttributeValue(null,"AdjustedPartNumber");
                            
                   if (tempAttribAdjustedPartNumber!=null){
                         java.lang.String content = tempAttribAdjustedPartNumber;
                        
                                                 object.setAdjustedPartNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribAdjustedPartNumber));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("AdjustedPartNumber");
                    
                    // handle attribute "AdjustedPrice"
                    java.lang.String tempAttribAdjustedPrice =
                        
                                reader.getAttributeValue(null,"AdjustedPrice");
                            
                   if (tempAttribAdjustedPrice!=null){
                         java.lang.String content = tempAttribAdjustedPrice;
                        
                                                 object.setAdjustedPrice(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribAdjustedPrice));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("AdjustedPrice");
                    
                    // handle attribute "AdjustedTotal"
                    java.lang.String tempAttribAdjustedTotal =
                        
                                reader.getAttributeValue(null,"AdjustedTotal");
                            
                   if (tempAttribAdjustedTotal!=null){
                         java.lang.String content = tempAttribAdjustedTotal;
                        
                                                 object.setAdjustedTotal(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribAdjustedTotal));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("AdjustedTotal");
                    
                    // handle attribute "Comment"
                    java.lang.String tempAttribComment =
                        
                                reader.getAttributeValue(null,"Comment");
                            
                   if (tempAttribComment!=null){
                         java.lang.String content = tempAttribComment;
                        
                                                 object.setComment(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribComment));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Comment");
                    
                    // handle attribute "Product"
                    java.lang.String tempAttribProduct =
                        
                                reader.getAttributeValue(null,"Product");
                            
                   if (tempAttribProduct!=null){
                         java.lang.String content = tempAttribProduct;
                        
                                                 object.setProduct(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(tempAttribProduct));
                                            
                    } else {
                       
                    }
                    handledAttributes.add("Product");
                    
                    
                    reader.next();
                



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
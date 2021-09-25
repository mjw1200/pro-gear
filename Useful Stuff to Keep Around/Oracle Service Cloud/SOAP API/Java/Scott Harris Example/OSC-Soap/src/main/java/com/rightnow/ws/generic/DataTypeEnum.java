
/**
 * DataTypeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.rightnow.ws.generic;
            

            /**
            *  DataTypeEnum bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class DataTypeEnum
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "urn:generic.ws.rightnow.com/v1_3",
                "DataTypeEnum",
                "ns2");

            

                        /**
                        * field for DataTypeEnum
                        */

                        
                                    protected java.lang.String localDataTypeEnum ;
                                
                            private static java.util.HashMap _table_ = new java.util.HashMap();

                            // Constructor
                            
                                protected DataTypeEnum(java.lang.String value, boolean isRegisterValue) {
                                    localDataTypeEnum = value;
                                    if (isRegisterValue){
                                        
                                               _table_.put(localDataTypeEnum, this);
                                           
                                    }

                                }
                            
                                    public static final java.lang.String _BASE64_BINARY =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("BASE64_BINARY");
                                
                                    public static final java.lang.String _BOOLEAN =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("BOOLEAN");
                                
                                    public static final java.lang.String _BOOLEAN_LIST =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("BOOLEAN_LIST");
                                
                                    public static final java.lang.String _DATE =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("DATE");
                                
                                    public static final java.lang.String _DATE_LIST =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("DATE_LIST");
                                
                                    public static final java.lang.String _DATETIME =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("DATETIME");
                                
                                    public static final java.lang.String _DATETIME_LIST =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("DATETIME_LIST");
                                
                                    public static final java.lang.String _DECIMAL =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("DECIMAL");
                                
                                    public static final java.lang.String _DECIMAL_LIST =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("DECIMAL_LIST");
                                
                                    public static final java.lang.String _ID =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("ID");
                                
                                    public static final java.lang.String _ID_LIST =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("ID_LIST");
                                
                                    public static final java.lang.String _INTEGER =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("INTEGER");
                                
                                    public static final java.lang.String _INTEGER_LIST =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("INTEGER_LIST");
                                
                                    public static final java.lang.String _LONG =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("LONG");
                                
                                    public static final java.lang.String _LONG_LIST =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("LONG_LIST");
                                
                                    public static final java.lang.String _NAMED_ID =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("NAMED_ID");
                                
                                    public static final java.lang.String _NAMED_ID_DELTA_LIST =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("NAMED_ID_DELTA_LIST");
                                
                                    public static final java.lang.String _NAMED_ID_LIST =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("NAMED_ID_LIST");
                                
                                    public static final java.lang.String _NAMED_ID_HIERARCHY =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("NAMED_ID_HIERARCHY");
                                
                                    public static final java.lang.String _NAMED_ID_HIERARCHY_LIST =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("NAMED_ID_HIERARCHY_LIST");
                                
                                    public static final java.lang.String _OBJECT =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("OBJECT");
                                
                                    public static final java.lang.String _OBJECT_LIST =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("OBJECT_LIST");
                                
                                    public static final java.lang.String _STRING =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("STRING");
                                
                                    public static final java.lang.String _STRING_LIST =
                                        org.apache.axis2.databinding.utils.ConverterUtil.convertToString("STRING_LIST");
                                
                                public static final DataTypeEnum BASE64_BINARY =
                                    new DataTypeEnum(_BASE64_BINARY,true);
                            
                                public static final DataTypeEnum BOOLEAN =
                                    new DataTypeEnum(_BOOLEAN,true);
                            
                                public static final DataTypeEnum BOOLEAN_LIST =
                                    new DataTypeEnum(_BOOLEAN_LIST,true);
                            
                                public static final DataTypeEnum DATE =
                                    new DataTypeEnum(_DATE,true);
                            
                                public static final DataTypeEnum DATE_LIST =
                                    new DataTypeEnum(_DATE_LIST,true);
                            
                                public static final DataTypeEnum DATETIME =
                                    new DataTypeEnum(_DATETIME,true);
                            
                                public static final DataTypeEnum DATETIME_LIST =
                                    new DataTypeEnum(_DATETIME_LIST,true);
                            
                                public static final DataTypeEnum DECIMAL =
                                    new DataTypeEnum(_DECIMAL,true);
                            
                                public static final DataTypeEnum DECIMAL_LIST =
                                    new DataTypeEnum(_DECIMAL_LIST,true);
                            
                                public static final DataTypeEnum ID =
                                    new DataTypeEnum(_ID,true);
                            
                                public static final DataTypeEnum ID_LIST =
                                    new DataTypeEnum(_ID_LIST,true);
                            
                                public static final DataTypeEnum INTEGER =
                                    new DataTypeEnum(_INTEGER,true);
                            
                                public static final DataTypeEnum INTEGER_LIST =
                                    new DataTypeEnum(_INTEGER_LIST,true);
                            
                                public static final DataTypeEnum LONG =
                                    new DataTypeEnum(_LONG,true);
                            
                                public static final DataTypeEnum LONG_LIST =
                                    new DataTypeEnum(_LONG_LIST,true);
                            
                                public static final DataTypeEnum NAMED_ID =
                                    new DataTypeEnum(_NAMED_ID,true);
                            
                                public static final DataTypeEnum NAMED_ID_DELTA_LIST =
                                    new DataTypeEnum(_NAMED_ID_DELTA_LIST,true);
                            
                                public static final DataTypeEnum NAMED_ID_LIST =
                                    new DataTypeEnum(_NAMED_ID_LIST,true);
                            
                                public static final DataTypeEnum NAMED_ID_HIERARCHY =
                                    new DataTypeEnum(_NAMED_ID_HIERARCHY,true);
                            
                                public static final DataTypeEnum NAMED_ID_HIERARCHY_LIST =
                                    new DataTypeEnum(_NAMED_ID_HIERARCHY_LIST,true);
                            
                                public static final DataTypeEnum OBJECT =
                                    new DataTypeEnum(_OBJECT,true);
                            
                                public static final DataTypeEnum OBJECT_LIST =
                                    new DataTypeEnum(_OBJECT_LIST,true);
                            
                                public static final DataTypeEnum STRING =
                                    new DataTypeEnum(_STRING,true);
                            
                                public static final DataTypeEnum STRING_LIST =
                                    new DataTypeEnum(_STRING_LIST,true);
                            

                                public java.lang.String getValue() { return localDataTypeEnum;}

                                public boolean equals(java.lang.Object obj) {return (obj == this);}
                                public int hashCode() { return toString().hashCode();}
                                public java.lang.String toString() {
                                
                                        return localDataTypeEnum.toString();
                                    

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
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
               return factory.createOMElement(dataSource,MY_QNAME);
            
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
            
                
                //We can safely assume an element has only one type associated with it
                
                            java.lang.String namespace = parentQName.getNamespaceURI();
                            java.lang.String _localName = parentQName.getLocalPart();
                        
                            writeStartElement(null, namespace, _localName, xmlWriter);

                            // add the type details if this is used in a simple type
                               if (serializeType){
                                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"urn:generic.ws.rightnow.com/v1_3");
                                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                                           namespacePrefix+":DataTypeEnum",
                                           xmlWriter);
                                   } else {
                                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                                           "DataTypeEnum",
                                           xmlWriter);
                                   }
                               }
                            
                                          if (localDataTypeEnum==null){
                                            
                                                     throw new org.apache.axis2.databinding.ADBException("DataTypeEnum cannot be null !!");
                                                
                                         }else{
                                        
                                                       xmlWriter.writeCharacters(localDataTypeEnum);
                                            
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


        
                
                //We can safely assume an element has only one type associated with it
                 return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
                            new java.lang.Object[]{
                            org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataTypeEnum)
                            },
                            null);

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        
                public static DataTypeEnum fromValue(java.lang.String value)
                      throws java.lang.IllegalArgumentException {
                    DataTypeEnum enumeration = (DataTypeEnum)
                       
                               _table_.get(value);
                           

                    if ((enumeration == null) && !((value == null) || (value.equals("")))) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    return enumeration;
                }
                public static DataTypeEnum fromString(java.lang.String value,java.lang.String namespaceURI)
                      throws java.lang.IllegalArgumentException {
                    try {
                       
                                       return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));
                                   

                    } catch (java.lang.Exception e) {
                        throw new java.lang.IllegalArgumentException();
                    }
                }

                public static DataTypeEnum fromString(javax.xml.stream.XMLStreamReader xmlStreamReader,
                                                                    java.lang.String content) {
                    if (content.indexOf(":") > -1){
                        java.lang.String prefix = content.substring(0,content.indexOf(":"));
                        java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);
                        return DataTypeEnum.Factory.fromString(content,namespaceUri);
                    } else {
                       return DataTypeEnum.Factory.fromString(content,"");
                    }
                }
            

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static DataTypeEnum parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            DataTypeEnum object = null;
                // initialize a hash map to keep values
                java.util.Map attributeMap = new java.util.HashMap();
                java.util.List extraAttributeList = new java.util.ArrayList<org.apache.axiom.om.OMAttribute>();
            

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
                

                   
                while(!reader.isEndElement()) {
                    if (reader.isStartElement()  || reader.hasText()){
                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"DataTypeEnum" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                        if (content.indexOf(":") > 0) {
                                            // this seems to be a Qname so find the namespace and send
                                            prefix = content.substring(0, content.indexOf(":"));
                                            namespaceuri = reader.getNamespaceURI(prefix);
                                            object = DataTypeEnum.Factory.fromString(content,namespaceuri);
                                        } else {
                                            // this seems to be not a qname send and empty namespace incase of it is
                                            // check is done in fromString method
                                            object = DataTypeEnum.Factory.fromString(content,"");
                                        }
                                        
                                        
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
           
    
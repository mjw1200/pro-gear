package helix;


import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMAttribute;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.om.impl.OMNamespaceImpl;
import org.apache.axiom.om.impl.llom.OMElementImpl;
import org.apache.axiom.soap.impl.llom.soap11.SOAP11Factory;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.ServiceClient;
import org.apache.ws.security.WSConstants;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.rightnow.ws.base.ActionEnum;
import com.rightnow.ws.base.ID;
import com.rightnow.ws.base.NamedID;
import com.rightnow.ws.base.RNObject;
import com.rightnow.ws.messages.CSVRow;
import com.rightnow.ws.messages.CSVTable;
import com.rightnow.ws.messages.CSVTableSet;
import com.rightnow.ws.messages.CSVTables;
import com.rightnow.ws.messages.ClientInfoHeader;
import com.rightnow.ws.messages.GetProcessingOptions;
import com.rightnow.ws.messages.CreateProcessingOptions;
import com.rightnow.ws.messages.RNObjectsResult;
import com.rightnow.ws.messages.RunAnalyticsReportResponseMsg;
import com.rightnow.ws.messages.UpdateProcessingOptions;
import com.rightnow.ws.messages.UpdateResponseMsg;
import com.rightnow.ws.objects.AnalyticsReport;
import com.rightnow.ws.objects.AnalyticsReportColumn;
import com.rightnow.ws.objects.AnalyticsReportFilter;
import com.rightnow.ws.objects.Contact;
import com.rightnow.ws.objects.FileAttachmentCommon;
import com.rightnow.ws.objects.FileAttachmentCommonList;
import com.rightnow.ws.objects.FileAttachmentIncident;
import com.rightnow.ws.objects.FileAttachmentIncidentList;
import com.rightnow.ws.objects.Incident;
import com.rightnow.ws.objects.Thread;
import com.rightnow.ws.objects.ThreadList;
import com.rightnow.ws.generic.*;
import com.rightnow.ws.objects.NoteList;
import com.rightnow.ws.wsdl.RequestErrorFault;
import com.rightnow.ws.wsdl.RightNowSyncService;
import com.rightnow.ws.wsdl.RightNowSyncServiceStub;
import com.rightnow.ws.wsdl.ServerErrorFault;
import com.rightnow.ws.wsdl.UnexpectedErrorFault;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.RemoteException;

import javax.activation.DataHandler;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import helix.OSCUtils;

public class OSCClient {
	
	
	RightNowSyncService _service;
	    
	    
	public OSCClient() throws AxisFault {
	    _service = new RightNowSyncServiceStub();
	    ServiceClient serviceClient = ((org.apache.axis2.client.Stub)_service)._getServiceClient();

	    OMElement sechdr = createSecurityHeader();
		serviceClient.addHeader(sechdr);
	}
	
	public void updateParentIncident(String incID) {
		
		System.out.println("update inc with status:"+incID);
		//getType "assign" update to cf curr_wo_status
		Incident inc = new Incident();
		ID id = new ID();
        id.setId(Integer.parseInt(incID));
        inc.setID(id);
        
        GenericObject genericObject2 = new GenericObject();
        RNObjectType objType2 = new RNObjectType();
        objType2.setTypeName("ContactCustomFieldsc");
        GenericField [] genericFieldsArray2 = new GenericField[1];
        GenericField genericField2 = new GenericField ();
        genericField2.setDataType(DataTypeEnum.STRING);
        genericField2.setName("curr_wo_status");
      
         
        DataValue myDataValue1 = new DataValue();
        myDataValue1.setStringValue("wait");
        genericField2.setDataValue( myDataValue1 ); 
         
        genericFieldsArray2[0] = genericField2;  
        genericObject2.setGenericFields(genericFieldsArray2);
        genericObject2.setObjectType(objType2);
                  
        GenericObject genericObject = new GenericObject();
        RNObjectType objType = new RNObjectType();
        objType.setTypeName("IncidentCustomFields");
        GenericField [] genericFieldsArray = new GenericField[1];
        GenericField genericField = new GenericField ();           
        genericField.setName("c");
        genericField.setDataType(DataTypeEnum.OBJECT);             
          
        DataValue myDataValue2 = new DataValue();
        myDataValue2.setObjectValue(genericObject2);
        genericField.setDataValue(myDataValue2);
         
        genericFieldsArray[0] = genericField;                
        genericObject.setGenericFields(genericFieldsArray);
        genericObject.setObjectType(objType);
        
        inc.setCustomFields(genericObject);
       
      
        ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
        clientInfoHeader.setAppID("Run workorder update");
        UpdateProcessingOptions processingOptions = new UpdateProcessingOptions();
        processingOptions.setSuppressExternalEvents(true);
        
        RNObject[] updateObjects = new RNObject[] { inc };

        try {
        	
            UpdateResponseMsg updRes = _service.update(updateObjects, processingOptions, clientInfoHeader);
        }
        catch (Exception e)
        {
            System.out.println(e.getStackTrace().toString()+ e.getMessage());
        }
        
        
	}
	
	public void updateWorkOrder(String incID) {
		
		boolean updateIncident = false;
		
		GenericObject go = new GenericObject();
        RNObjectType ot = new RNObjectType();
        ot.setNamespace("TOA");
        ot.setTypeName("Work_Order");
        go.setObjectType(ot);
        
        ID id = new ID();
        id.setId(Integer.parseInt(incID));
        go.setID(id);
                
        GenericField techPhone = OSCUtils.createGenericField("Tech_Phone", DataTypeEnum.STRING, OSCUtils.createStringDataValue("222-333-4444"));
        GenericField fieldNote = OSCUtils.createGenericField("Field_Service_Note", DataTypeEnum.STRING, OSCUtils.createStringDataValue("note"));
       
        
        GenericField[] fldArr = new GenericField[] { techPhone, fieldNote };
        go.setGenericFields(fldArr);

        ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
        clientInfoHeader.setAppID("Run workorder update");
        UpdateProcessingOptions processingOptions = new UpdateProcessingOptions();
        processingOptions.setSuppressExternalEvents(true);
        
        RNObject[] updateObjects = new RNObject[] { go };

        try {
            UpdateResponseMsg updRes = _service.update(updateObjects, processingOptions, clientInfoHeader);
        }
        catch (Exception e)
        {
            System.out.println(e.getStackTrace().toString()+ e.getMessage());
        }
        
        
	}
	
	   public String runReport(int rptID) {
		      
	        String delim = new String(",");
	        StringBuilder strBuilder = new StringBuilder();
	        
	        try {
	            ClientInfoHeader clientInfoHeader = new ClientInfoHeader();
	            clientInfoHeader.setAppID("Run roql");

	             AnalyticsReport analyticsReport = new AnalyticsReport();
	            //create limit and start parameters. Specifies the max number of rows to return (10,000 is the overall maximum)
	            int limit = 10000;
	            int start = 0;  //specify the starting row from the report

	            //Specify a report ID
	            ID reportID = new ID();
	            reportID.setId(rptID);  //dw_contacts report
	            analyticsReport.setID(reportID);
	            
	            analyticsReport.setFilters(new AnalyticsReportFilter[] {null});
	            
	            @SuppressWarnings("unused")
	            GetProcessingOptions processingOptions = new GetProcessingOptions();
	            processingOptions.setFetchAllNames(true);

	            RNObject[] runAnalyticsObjects = new RNObject[] {analyticsReport};
	            
	            RNObjectsResult getResults = _service.get(runAnalyticsObjects, processingOptions, clientInfoHeader);      
	            
	            AnalyticsReport report = (AnalyticsReport)getResults.getRNObjects()[0];
	            AnalyticsReportColumn[] cols = report.getColumns();
	          
	            //prepare csv header
	            for(AnalyticsReportColumn col : cols)
	            {
	                strBuilder.append(col.getHeading().replace(" ", "")); strBuilder.append(",");
	            }

	            System.out.println(strBuilder.toString());
	                
	            String[] labels = strBuilder.toString().split(",");
	        
	            
	            
	            CSVTableSet thisset = new CSVTableSet();
	            RunAnalyticsReportResponseMsg responseMsg = _service.runAnalyticsReport(analyticsReport, limit, start, delim, false, true, clientInfoHeader);
	            thisset = responseMsg.getCSVTableSet();

	            CSVTables tables = thisset.getCSVTables();
	            CSVTable[] tableArray = tables.getCSVTable();
	            CSVRow rows = tableArray[0].getRows();
	            String[] rowData = rows.getRow();
	  
	            if(rowData != null) {
	                 
	                   //write out each csv row 
	                   for(String row : rowData)
	                   {
	                    row = row + "\r\n";
	                    System.out.print(row);
	                   }
	                   
	            }

	            
	        }
	         catch (RemoteException e)
	        {
	                System.out.println("Remote exception encountered: " + e.getMessage());
	        }
	        catch (ServerErrorFault e)
	        {
	                System.out.println("Server error exception encountered: " + e.getFaultMessage().getServerErrorFault().getExceptionMessage());
	        }
	        catch (RequestErrorFault e)
	        {
	                System.out.println("Request error exception encountered: " + e.getFaultMessage().getRequestErrorFault().getExceptionMessage());
	        }
	        catch (UnexpectedErrorFault e)
	        {
	                System.out.println("Unexpected error exception encountered:" + e.getFaultMessage().getUnexpectedErrorFault().getExceptionMessage());    
	        } 
	      

	        return strBuilder.toString();
	        
	    }

    public static OMElement createSecurityHeader() {
        OMFactory fac = OMAbstractFactory.getOMFactory();
        OMNamespace ns = fac.createOMNamespace("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", WSConstants.WSSE_PREFIX);
        OMNamespace ns2 = fac.createOMNamespace("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText", WSConstants.WSSE_PREFIX);

        OMElement payload = fac.createOMElement("Security", ns);
        payload.addAttribute("mustUnderstand", "1", null);

        OMElement unToken = fac.createOMElement(WSConstants.USERNAME_TOKEN_LN, ns);

        OMElement userNameElement = fac.createOMElement(WSConstants.USERNAME_LN, ns);
        userNameElement.setText("sharris_fs");

        OMElement passwordElement = fac.createOMElement(WSConstants.PASSWORD_LN, ns);
        passwordElement.setText("Password1");

        OMAttribute attrib = fac.createOMAttribute("type", null, "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
        passwordElement.addAttribute(attrib);

        unToken.addChild(userNameElement);
        unToken.addChild(passwordElement);

        payload.addChild(unToken);

        System.out.println("payload = " + payload.toString());

    return payload;
    }	
}

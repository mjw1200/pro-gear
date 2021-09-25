package helix;

import java.util.regex.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.rightnow.ws.base.ID;
import com.rightnow.ws.base.NamedID;
import com.rightnow.ws.base.RNObject;

import com.rightnow.ws.generic.DataValue;
import com.rightnow.ws.generic.GenericField;
import com.rightnow.ws.generic.GenericObject;
import com.rightnow.ws.generic.*;
import com.rightnow.ws.messages.BatchRequestItem;
import com.rightnow.ws.messages.BatchRequestItemChoice_type0;

import com.rightnow.ws.messages.DestroyMsg;
import com.rightnow.ws.messages.DestroyProcessingOptions;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OSCUtils {

	
	
	
	public static GenericField createGenericField(String name, DataTypeEnum type, DataValue dataValue) {
		GenericField  gf= new GenericField(); //genericField
	    gf.setDataType(type);
	    gf.setName(name);
	    gf.setDataValue(dataValue);
	    return gf;
	}
	
	   /**
     * createStringDataValue
     * @param val
     * @return
     */
    public static DataValue createStringDataValue(String val)
    {
        DataValue dv = new DataValue();
        dv.setStringValue(val);
        return dv;
    }
   
    /**
     * createIntegerDataValue
     * @param val
     * @return
     */
    public static DataValue createIntegerDataValue(Integer val)
    {

        DataValue dv = new DataValue();
        dv.setIntegerValue(val);
        return dv;
    }
   
    /**
     *
     * @param val
     * @return
     */
    public static DataValue createNamedIDDataValue(NamedID val)
    {
        DataValue dv = new DataValue();
        dv.setNamedIDValue(val);
        return dv;
    }
   

   
    

	  
}

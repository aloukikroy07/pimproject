package com.pim.util;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.springframework.context.annotation.Configuration;

import com.pim.PIMProject.Model.InterfaceLogs;
import com.pim.PIMProject.Model.TransferFunds;

@Configuration
public class CommonFunctions<T> {
	
	public String makeXmlForInterfaceLogs(JAXBContext reqClass, Object object) 
	  {
		String xmlContent = convertToXmlFromModel(reqClass, (T) object);
		System.out.println(xmlContent);
		return xmlContent;
	}
	
	
	public String convertToXmlFromModel(JAXBContext classType, T t) 
	  {
		String xmlContent = "";
	      try
	      {
	        //Create JAXB Context
	    	  JAXBContext jaxbContext = classType;
	           
	          //Create Marshaller
	          Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	 
	          //Required formatting??
	          jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	 
	          //Print XML String to Console
	          StringWriter sw = new StringWriter();
	           
	          //Write XML to StringWriter
	          jaxbMarshaller.marshal(t, sw);
	           
	          //Verify XML Content
	          xmlContent = sw.toString();
	 
	      } catch (JAXBException e) {
	          e.printStackTrace();
	      }
		return xmlContent;
	}
	
	public Integer setIntegerDefaultVal (Integer val) {
		if (val == null || val.equals("")) {
			val = 0;
		}
		return val;
	}
	
	public String setStringDefaultVal (String val){
		if (val == null || val.equals("")) {
			val = "None";
		}
		return val;
	}



}

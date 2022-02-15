package com.pim.util;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pim.PIMProject.Controller.AppController;
import com.pim.PIMProject.Model.TransferFunds;

@Configuration
public class CommonFunctions<T> {
	
	private static final Logger logger = LoggerFactory.getLogger(AppController.class);
	
	public String convertToXmlFromModel(T request, JAXBContext classType ) 
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
	          jaxbMarshaller.marshal(request, sw);
	           
	          //Verify XML Content
	          xmlContent = sw.toString();
	 
	      } catch (JAXBException e) {
	          e.printStackTrace();
	      }
		return xmlContent;
	}
}

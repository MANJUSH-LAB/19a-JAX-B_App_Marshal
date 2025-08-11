package com.mkorg.converters;

import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.mkorg.bindings.Student;

public class JavaToXmlConverter_Marshilling {

	// Marshilling

	public static void main(String[] args) throws Exception {

		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);

		Marshaller marshaller = jaxbContext.createMarshaller();

		// Perform marshiling-2
		Student s = new Student();
		s.setId(201);
		s.setName("Arun");
		s.setRank(80);
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);//for proper format print
		//marshaller.marshal(s, System.out); // print in consol
	
	marshaller.marshal(s, new FileOutputStream("student.xml")); //to print out put in .xml file inside project
	}
}

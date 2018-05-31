package com.ar.hibernate;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import javax.xml.transform.stream.StreamResult;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.Marshaller;

public class EmployeeTest {

	public static void main(String[] args) throws JAXBException, IOException {
		// TODO Auto-generated method stub
 
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Marshaller m=(Marshaller) ac.getBean("xstreamMarshallerBean");
		Employee e=new Employee();
		e.setId(400);
		e.setName("abdul raheeman");
		e.setSalary(94834);
		m.marshal(e, new StreamResult(new FileWriter("emp1.xml")));
		System.out.println("XML created Successfully");
	}

}

package com.mkorg.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="student")  //Add to work with JAX-B api -oneTime operation-1
public class Student {
private Integer id;
private String name;
private Integer rank;
	
//2-convert Java to XML format-Marshlling
	
}

package org.kkbp.ejemplo1.model;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import lombok.*;

@Entity @Getter @Setter
public class Student extends Identifiable {
	@Required @Column(length = 50)
	private String name;
	
	@Required
	private int age;
	
	@Required
	private LocalDate birthDate;
	
	@Required @Column(length = 40)
	private String major;
	
	private double height;
	
	private double weight;
	
	@Required
	private boolean currentlyEnrolled;
	
	@Required
	private int currentSemester;
}

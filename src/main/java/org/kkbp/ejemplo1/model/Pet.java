package org.kkbp.ejemplo1.model;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import lombok.*;

@Entity @Getter @Setter
public class Pet extends Identifiable {
	@Required
	String name;
	
	@Column(length = 50)
	String description;
	
	@Required
	String breed;
	
	@Required
	LocalDate birthDate;
}

package com.phamtanhoang.employeeservice.command.data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
@Data
public class Employee {
  @Id
  private String employeeId;
  private String firstName;
  private String lastName;
  private String kin;
  private Boolean isDisciplined;
}

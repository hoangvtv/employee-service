package com.phamtanhoang.employeeservice.query.model;

import lombok.Data;

@Data
public class EmployeeReponseModel {

  private String employeeId;
  private String firstName;
  private String lastName;
  private String kin;
  private Boolean isDisciplined;

}

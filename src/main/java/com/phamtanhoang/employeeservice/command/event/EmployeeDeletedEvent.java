package com.phamtanhoang.employeeservice.command.event;

import lombok.Data;

@Data
public class EmployeeDeletedEvent {
  private String employeeId;
}

package com.MYname.jfsd;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("FT")
public class FullTimeEmployee extends Employee{
  private int salary;
  public int getSalary() {
    return salary;
  }
  public void setSalary(int salary) {
    this.salary = salary;
  }
  @Override
  public String toString() {
    return super.toString() + "FullTimeEmployee [salary=" + salary + "]";
  }
}
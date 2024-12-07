package com.MYname.jfsd;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("PT")
public class PartTimeEmployee extends Employee {
  @Override
  public String toString() {
    return super.toString() +"PartTimeEmployee [payment=" + payment + "]";
  }
  public int getPayment() {
    return payment;
  }
  public void setPayment(int payment) {
    this.payment = payment;
  }
  private int payment;
}
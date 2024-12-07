package com.MYname.jfsd;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy=InheritanceType.JOINED)
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type", discriminatorType=DiscriminatorType.STRING)
   public class Employee {
  @Id
  private int eno;
  private String ename;
  @Override
  public String toString() {
    return "\nEmployee [eno=" + eno + ", ename=" + ename + "]";
  }
  public int getEno() {
    return eno;
  }
  public void setEno(int eno) {
    this.eno = eno;
  }
  public String getEname() {
    return ename;
  }
  public void setEname(String ename) {
    this.ename = ename;
  }

}
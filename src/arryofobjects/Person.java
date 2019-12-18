package arryofobjects;


class Person{
private String firstname;
private String lastname;
private int birthmonth;
private int birthday;
private int birthyear;
private String ssn;
Person(String firstname,String lastname,int birthmonth,int birthday,int birthyear,String ssn){
this.firstname=firstname;
this.lastname=lastname;
this.birthmonth=birthmonth;
this.birthday=birthday;
this.birthyear=birthyear;
this.ssn=ssn;}
public void setName(String firstname){
  this.firstname=firstname;
}
public void setLastname(String lastname){
  this.lastname=lastname;
}
public void setBirthday(int birthday,int birthyear,int birthmonth){
 this.birthmonth=birthmonth;
this.birthday=birthday;
this.birthyear=birthyear;

}
public void setSSN(String ssn){
  
this.ssn=ssn;}

public String getName(){
  return firstname;
}
public String getLastname(){
  return lastname;
}
public String getBirthday(){
  return birthmonth+"/"+birthday+"/"+birthyear;
}
public String getSSN(){
  return ssn;
}
}
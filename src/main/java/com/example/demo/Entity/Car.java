package com.example.demo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="car")
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
 private int carid;
 private String companyname;
 private String carmodel;
 private String buyername;
 private String address;
 private Long phone;
 private int price;
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getCarid() {
	return carid;
}
public void setCarid(int carid) {
	this.carid = carid;
}
public String getCompanyname() {
	return companyname;
}
public void setCompanyname(String companyname) {
	this.companyname = companyname;
}
public String getCarmodel() {
	return carmodel;
}
public void setCarmodel(String carmodel) {
	this.carmodel = carmodel;
}
public String getbuyername() {
	return buyername;
}
public void setbuyername(String buyername) {
	this.buyername = buyername;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Long getPhone() {
	return phone;
}
public void setPhone(Long phone) {
	this.phone = phone;
}
public Car(int carid, String companyname, String carmodel, String buyername, String address, Long phone,int price) {
	super();
	this.carid = carid;
	this.companyname = companyname;
	this.carmodel = carmodel;
	this.buyername = buyername;
	this.address = address;
	this.phone = phone;
	this.price = price;
}
public Car() {}
@Override
public String toString() {
	return "Car [Carid=" + carid + ", Companyname=" + companyname + ", Modelname=" + carmodel + ", Customername=" + buyername + ", Address="+address+", Phonenumber="+phone+", price="+price+"]";
}
}

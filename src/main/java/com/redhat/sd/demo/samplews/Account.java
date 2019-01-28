package com.redhat.sd.demo.samplews;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Account")
public class Account {

   protected Integer id;
   protected String firstName;
   protected String lastName;
   protected String addressLine1;
   protected String addressLine2;
   protected String email;
   protected String company;
   protected Integer total;
   protected Integer charges;

    public java.lang.Integer getId() {
        return id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public String getFirstName() {
      return firstName;
  }

  /**
   * Sets the value of the firstName property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setFirstName(String value) {
      this.firstName = value;
  }

  /**
   * Gets the value of the lastName property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getLastName() {
      return lastName;
  }

  /**
   * Sets the value of the lastName property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setLastName(String value) {
      this.lastName = value;
  }

  /**
   * Gets the value of the addressLine1 property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getAddressLine1() {
      return addressLine1;
  }

  /**
   * Sets the value of the addressLine1 property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setAddressLine1(String value) {
      this.addressLine1 = value;
  }

  /**
   * Gets the value of the addressLine2 property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getAddressLine2() {
      return addressLine2;
  }

  /**
   * Sets the value of the addressLine2 property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setAddressLine2(String value) {
      this.addressLine2 = value;
  }

  /**
   * Gets the value of the email property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getEmail() {
      return email;
  }

  /**
   * Sets the value of the email property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setEmail(String value) {
      this.email = value;
  }

  /**
   * Gets the value of the company property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getCompany() {
      return company;
  }

  /**
   * Sets the value of the company property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setCompany(String value) {
      this.company = value;
  }

  /**
   * Gets the value of the total property.
   *
   */
  public Integer getTotal() {
      return total;
  }

  /**
   * Sets the value of the total property.
   *
   */
  public void setTotal(Integer value) {
      this.total = value;
  }

  /**
   * Gets the value of the charges property.
   *
   */
  public Integer getCharges() {
      return charges;
  }

  /**
   * Sets the value of the charges property.
   *
   */
  public void setCharges(Integer value) {
      this.charges = value;
  }
}

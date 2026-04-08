
import java.util.*;


/**
 * Class customer
 */
public class customer {

  //
  // Fields
  //

  private String id;
  private Address Address;
  private phone phone;
  private String email;
  private account nuevo_atributo;
  
  //
  // Constructors
  //
  public customer () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (String newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public String getId () {
    return id;
  }

  /**
   * Set the value of Address
   * @param newVar the new value of Address
   */
  public void setAddress (Address newVar) {
    Address = newVar;
  }

  /**
   * Get the value of Address
   * @return the value of Address
   */
  public Address getAddress () {
    return Address;
  }

  /**
   * Set the value of phone
   * @param newVar the new value of phone
   */
  public void setPhone (phone newVar) {
    phone = newVar;
  }

  /**
   * Get the value of phone
   * @return the value of phone
   */
  public phone getPhone () {
    return phone;
  }

  /**
   * Set the value of email
   * @param newVar the new value of email
   */
  public void setEmail (String newVar) {
    email = newVar;
  }

  /**
   * Get the value of email
   * @return the value of email
   */
  public String getEmail () {
    return email;
  }

  /**
   * Set the value of nuevo_atributo
   * @param newVar the new value of nuevo_atributo
   */
  public void setNuevo_atributo (account newVar) {
    nuevo_atributo = newVar;
  }

  /**
   * Get the value of nuevo_atributo
   * @return the value of nuevo_atributo
   */
  public account getNuevo_atributo () {
    return nuevo_atributo;
  }

  //
  // Other methods
  //

}

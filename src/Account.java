
import java.util.*;


/**
 * Class account
 */
public class account {

  //
  // Fields
  //

  private String Id;
  private Address billing_address;
  private Boolean is_closed;
  private Date open;
  private Date closed;
  private customer nuevo_atributo;
  private customer nuevo_atributo_1;
  private shopping cart nuevo_atributo_2;
  private order nuevo_atributo_3;
  
  //
  // Constructors
  //
  public account () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of Id
   * @param newVar the new value of Id
   */
  public void setId (String newVar) {
    Id = newVar;
  }

  /**
   * Get the value of Id
   * @return the value of Id
   */
  public String getId () {
    return Id;
  }

  /**
   * Set the value of billing_address
   * @param newVar the new value of billing_address
   */
  public void setBilling_address (Address newVar) {
    billing_address = newVar;
  }

  /**
   * Get the value of billing_address
   * @return the value of billing_address
   */
  public Address getBilling_address () {
    return billing_address;
  }

  /**
   * Set the value of is_closed
   * @param newVar the new value of is_closed
   */
  public void setIs_closed (Boolean newVar) {
    is_closed = newVar;
  }

  /**
   * Get the value of is_closed
   * @return the value of is_closed
   */
  public Boolean getIs_closed () {
    return is_closed;
  }

  /**
   * Set the value of open
   * @param newVar the new value of open
   */
  public void setOpen (Date newVar) {
    open = newVar;
  }

  /**
   * Get the value of open
   * @return the value of open
   */
  public Date getOpen () {
    return open;
  }

  /**
   * Set the value of closed
   * @param newVar the new value of closed
   */
  public void setClosed (Date newVar) {
    closed = newVar;
  }

  /**
   * Get the value of closed
   * @return the value of closed
   */
  public Date getClosed () {
    return closed;
  }

  /**
   * Set the value of nuevo_atributo
   * @param newVar the new value of nuevo_atributo
   */
  public void setNuevo_atributo (customer newVar) {
    nuevo_atributo = newVar;
  }

  /**
   * Get the value of nuevo_atributo
   * @return the value of nuevo_atributo
   */
  public customer getNuevo_atributo () {
    return nuevo_atributo;
  }

  /**
   * Set the value of nuevo_atributo_1
   * @param newVar the new value of nuevo_atributo_1
   */
  public void setNuevo_atributo_1 (customer newVar) {
    nuevo_atributo_1 = newVar;
  }

  /**
   * Get the value of nuevo_atributo_1
   * @return the value of nuevo_atributo_1
   */
  public customer getNuevo_atributo_1 () {
    return nuevo_atributo_1;
  }

  /**
   * Set the value of nuevo_atributo_2
   * @param newVar the new value of nuevo_atributo_2
   */
  public void setNuevo_atributo_2 (shopping cart newVar) {
    nuevo_atributo_2 = newVar;
  }

  /**
   * Get the value of nuevo_atributo_2
   * @return the value of nuevo_atributo_2
   */
  public shopping cart getNuevo_atributo_2 () {
    return nuevo_atributo_2;
  }

  /**
   * Set the value of nuevo_atributo_3
   * @param newVar the new value of nuevo_atributo_3
   */
  public void setNuevo_atributo_3 (order newVar) {
    nuevo_atributo_3 = newVar;
  }

  /**
   * Get the value of nuevo_atributo_3
   * @return the value of nuevo_atributo_3
   */
  public order getNuevo_atributo_3 () {
    return nuevo_atributo_3;
  }

  //
  // Other methods
  //

}

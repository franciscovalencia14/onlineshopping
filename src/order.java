
import java.util.*;


/**
 * Class order
 */
public class order {

  //
  // Fields
  //

  private String number;
  private Date ordered;
  private Date shipped;
  private Address ship_to;
  private orderstatus Status;
  private Real total;
  
  //
  // Constructors
  //
  public order () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of number
   * @param newVar the new value of number
   */
  public void setNumber (String newVar) {
    number = newVar;
  }

  /**
   * Get the value of number
   * @return the value of number
   */
  public String getNumber () {
    return number;
  }

  /**
   * Set the value of ordered
   * @param newVar the new value of ordered
   */
  public void setOrdered (Date newVar) {
    ordered = newVar;
  }

  /**
   * Get the value of ordered
   * @return the value of ordered
   */
  public Date getOrdered () {
    return ordered;
  }

  /**
   * Set the value of shipped
   * @param newVar the new value of shipped
   */
  public void setShipped (Date newVar) {
    shipped = newVar;
  }

  /**
   * Get the value of shipped
   * @return the value of shipped
   */
  public Date getShipped () {
    return shipped;
  }

  /**
   * Set the value of ship_to
   * @param newVar the new value of ship_to
   */
  public void setShip_to (Address newVar) {
    ship_to = newVar;
  }

  /**
   * Get the value of ship_to
   * @return the value of ship_to
   */
  public Address getShip_to () {
    return ship_to;
  }

  /**
   * Set the value of Status
   * @param newVar the new value of Status
   */
  public void setStatus (orderstatus newVar) {
    Status = newVar;
  }

  /**
   * Get the value of Status
   * @return the value of Status
   */
  public orderstatus getStatus () {
    return Status;
  }

  /**
   * Set the value of total
   * @param newVar the new value of total
   */
  public void setTotal (Real newVar) {
    total = newVar;
  }

  /**
   * Get the value of total
   * @return the value of total
   */
  public Real getTotal () {
    return total;
  }

  //
  // Other methods
  //

}

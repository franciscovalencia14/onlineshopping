
import java.util.*;


/**
 * Class payment
 */
public class payment {

  //
  // Fields
  //

  private String Id;
  private Date Paid;
  private Real total;
  private String details;
  
  //
  // Constructors
  //
  public payment () { };
  
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
   * Set the value of Paid
   * @param newVar the new value of Paid
   */
  public void setPaid (Date newVar) {
    Paid = newVar;
  }

  /**
   * Get the value of Paid
   * @return the value of Paid
   */
  public Date getPaid () {
    return Paid;
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

  /**
   * Set the value of details
   * @param newVar the new value of details
   */
  public void setDetails (String newVar) {
    details = newVar;
  }

  /**
   * Get the value of details
   * @return the value of details
   */
  public String getDetails () {
    return details;
  }

  //
  // Other methods
  //

}

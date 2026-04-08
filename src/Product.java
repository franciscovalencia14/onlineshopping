
import java.util.*;


/**
 * Class product
 */
public class product {

  //
  // Fields
  //

  private String Id;
  private String name;
  private supplier supplier;
  
  //
  // Constructors
  //
  public product () { };
  
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
   * Set the value of name
   * @param newVar the new value of name
   */
  public void setName (String newVar) {
    name = newVar;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  public String getName () {
    return name;
  }

  /**
   * Set the value of supplier
   * @param newVar the new value of supplier
   */
  public void setSupplier (supplier newVar) {
    supplier = newVar;
  }

  /**
   * Get the value of supplier
   * @return the value of supplier
   */
  public supplier getSupplier () {
    return supplier;
  }

  //
  // Other methods
  //

}

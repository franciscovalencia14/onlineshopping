
import java.util.*;


/**
 * Class lineitem
 */
public class lineitem {

  //
  // Fields
  //

  private Integer quantity;
  private Price price;
  
  //
  // Constructors
  //
  public lineitem () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of quantity
   * @param newVar the new value of quantity
   */
  public void setQuantity (Integer newVar) {
    quantity = newVar;
  }

  /**
   * Get the value of quantity
   * @return the value of quantity
   */
  public Integer getQuantity () {
    return quantity;
  }

  /**
   * Set the value of price
   * @param newVar the new value of price
   */
  public void setPrice (Price newVar) {
    price = newVar;
  }

  /**
   * Get the value of price
   * @return the value of price
   */
  public Price getPrice () {
    return price;
  }

  //
  // Other methods
  //

}

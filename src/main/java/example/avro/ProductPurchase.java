/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package example.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ProductPurchase extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ProductPurchase\",\"namespace\":\"example.avro\",\"fields\":[{\"name\":\"item\",\"type\":\"string\"},{\"name\":\"code\",\"type\":\"string\"},{\"name\":\"quantity\",\"type\":\"int\"},{\"name\":\"event_date\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence item;
  @Deprecated public java.lang.CharSequence code;
  @Deprecated public int quantity;
  @Deprecated public java.lang.CharSequence event_date;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public ProductPurchase() {}

  /**
   * All-args constructor.
   */
  public ProductPurchase(java.lang.CharSequence item, java.lang.CharSequence code, java.lang.Integer quantity, java.lang.CharSequence event_date) {
    this.item = item;
    this.code = code;
    this.quantity = quantity;
    this.event_date = event_date;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return item;
    case 1: return code;
    case 2: return quantity;
    case 3: return event_date;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: item = (java.lang.CharSequence)value$; break;
    case 1: code = (java.lang.CharSequence)value$; break;
    case 2: quantity = (java.lang.Integer)value$; break;
    case 3: event_date = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'item' field.
   */
  public java.lang.CharSequence getItem() {
    return item;
  }

  /**
   * Sets the value of the 'item' field.
   * @param value the value to set.
   */
  public void setItem(java.lang.CharSequence value) {
    this.item = value;
  }

  /**
   * Gets the value of the 'code' field.
   */
  public java.lang.CharSequence getCode() {
    return code;
  }

  /**
   * Sets the value of the 'code' field.
   * @param value the value to set.
   */
  public void setCode(java.lang.CharSequence value) {
    this.code = value;
  }

  /**
   * Gets the value of the 'quantity' field.
   */
  public java.lang.Integer getQuantity() {
    return quantity;
  }

  /**
   * Sets the value of the 'quantity' field.
   * @param value the value to set.
   */
  public void setQuantity(java.lang.Integer value) {
    this.quantity = value;
  }

  /**
   * Gets the value of the 'event_date' field.
   */
  public java.lang.CharSequence getEventDate() {
    return event_date;
  }

  /**
   * Sets the value of the 'event_date' field.
   * @param value the value to set.
   */
  public void setEventDate(java.lang.CharSequence value) {
    this.event_date = value;
  }

  /** Creates a new ProductPurchase RecordBuilder */
  public static example.avro.ProductPurchase.Builder newBuilder() {
    return new example.avro.ProductPurchase.Builder();
  }
  
  /** Creates a new ProductPurchase RecordBuilder by copying an existing Builder */
  public static example.avro.ProductPurchase.Builder newBuilder(example.avro.ProductPurchase.Builder other) {
    return new example.avro.ProductPurchase.Builder(other);
  }
  
  /** Creates a new ProductPurchase RecordBuilder by copying an existing ProductPurchase instance */
  public static example.avro.ProductPurchase.Builder newBuilder(example.avro.ProductPurchase other) {
    return new example.avro.ProductPurchase.Builder(other);
  }
  
  /**
   * RecordBuilder for ProductPurchase instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ProductPurchase>
    implements org.apache.avro.data.RecordBuilder<ProductPurchase> {

    private java.lang.CharSequence item;
    private java.lang.CharSequence code;
    private int quantity;
    private java.lang.CharSequence event_date;

    /** Creates a new Builder */
    private Builder() {
      super(example.avro.ProductPurchase.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(example.avro.ProductPurchase.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.item)) {
        this.item = data().deepCopy(fields()[0].schema(), other.item);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.code)) {
        this.code = data().deepCopy(fields()[1].schema(), other.code);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.quantity)) {
        this.quantity = data().deepCopy(fields()[2].schema(), other.quantity);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.event_date)) {
        this.event_date = data().deepCopy(fields()[3].schema(), other.event_date);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing ProductPurchase instance */
    private Builder(example.avro.ProductPurchase other) {
            super(example.avro.ProductPurchase.SCHEMA$);
      if (isValidValue(fields()[0], other.item)) {
        this.item = data().deepCopy(fields()[0].schema(), other.item);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.code)) {
        this.code = data().deepCopy(fields()[1].schema(), other.code);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.quantity)) {
        this.quantity = data().deepCopy(fields()[2].schema(), other.quantity);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.event_date)) {
        this.event_date = data().deepCopy(fields()[3].schema(), other.event_date);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'item' field */
    public java.lang.CharSequence getItem() {
      return item;
    }
    
    /** Sets the value of the 'item' field */
    public example.avro.ProductPurchase.Builder setItem(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.item = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'item' field has been set */
    public boolean hasItem() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'item' field */
    public example.avro.ProductPurchase.Builder clearItem() {
      item = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'code' field */
    public java.lang.CharSequence getCode() {
      return code;
    }
    
    /** Sets the value of the 'code' field */
    public example.avro.ProductPurchase.Builder setCode(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.code = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'code' field has been set */
    public boolean hasCode() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'code' field */
    public example.avro.ProductPurchase.Builder clearCode() {
      code = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'quantity' field */
    public java.lang.Integer getQuantity() {
      return quantity;
    }
    
    /** Sets the value of the 'quantity' field */
    public example.avro.ProductPurchase.Builder setQuantity(int value) {
      validate(fields()[2], value);
      this.quantity = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'quantity' field has been set */
    public boolean hasQuantity() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'quantity' field */
    public example.avro.ProductPurchase.Builder clearQuantity() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'event_date' field */
    public java.lang.CharSequence getEventDate() {
      return event_date;
    }
    
    /** Sets the value of the 'event_date' field */
    public example.avro.ProductPurchase.Builder setEventDate(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.event_date = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'event_date' field has been set */
    public boolean hasEventDate() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'event_date' field */
    public example.avro.ProductPurchase.Builder clearEventDate() {
      event_date = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public ProductPurchase build() {
      try {
        ProductPurchase record = new ProductPurchase();
        record.item = fieldSetFlags()[0] ? this.item : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.code = fieldSetFlags()[1] ? this.code : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.quantity = fieldSetFlags()[2] ? this.quantity : (java.lang.Integer) defaultValue(fields()[2]);
        record.event_date = fieldSetFlags()[3] ? this.event_date : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
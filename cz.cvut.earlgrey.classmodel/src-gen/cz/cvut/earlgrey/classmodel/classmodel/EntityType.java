/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.classmodel.classmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Entity Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getEntityType()
 * @model
 * @generated
 */
public enum EntityType implements Enumerator
{
  /**
   * The '<em><b>CLASS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CLASS_VALUE
   * @generated
   * @ordered
   */
  CLASS(0, "CLASS", "class"),

  /**
   * The '<em><b>INTERFACE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTERFACE_VALUE
   * @generated
   * @ordered
   */
  INTERFACE(1, "INTERFACE", "interface"),

  /**
   * The '<em><b>ABSTRACT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ABSTRACT_VALUE
   * @generated
   * @ordered
   */
  ABSTRACT(2, "ABSTRACT", "abstract"),

  /**
   * The '<em><b>ENUM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENUM_VALUE
   * @generated
   * @ordered
   */
  ENUM(3, "ENUM", "enum");

  /**
   * The '<em><b>CLASS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CLASS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CLASS
   * @model literal="class"
   * @generated
   * @ordered
   */
  public static final int CLASS_VALUE = 0;

  /**
   * The '<em><b>INTERFACE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INTERFACE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTERFACE
   * @model literal="interface"
   * @generated
   * @ordered
   */
  public static final int INTERFACE_VALUE = 1;

  /**
   * The '<em><b>ABSTRACT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ABSTRACT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ABSTRACT
   * @model literal="abstract"
   * @generated
   * @ordered
   */
  public static final int ABSTRACT_VALUE = 2;

  /**
   * The '<em><b>ENUM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ENUM</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENUM
   * @model literal="enum"
   * @generated
   * @ordered
   */
  public static final int ENUM_VALUE = 3;

  /**
   * An array of all the '<em><b>Entity Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final EntityType[] VALUES_ARRAY =
    new EntityType[]
    {
      CLASS,
      INTERFACE,
      ABSTRACT,
      ENUM,
    };

  /**
   * A public read-only list of all the '<em><b>Entity Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<EntityType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Entity Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EntityType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EntityType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Entity Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EntityType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EntityType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Entity Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EntityType get(int value)
  {
    switch (value)
    {
      case CLASS_VALUE: return CLASS;
      case INTERFACE_VALUE: return INTERFACE;
      case ABSTRACT_VALUE: return ABSTRACT;
      case ENUM_VALUE: return ENUM;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EntityType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //EntityType

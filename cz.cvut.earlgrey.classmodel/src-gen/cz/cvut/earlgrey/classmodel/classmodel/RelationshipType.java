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
 * A representation of the literals of the enumeration '<em><b>Relationship Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getRelationshipType()
 * @model
 * @generated
 */
public enum RelationshipType implements Enumerator
{
  /**
   * The '<em><b>ASSOCIATION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASSOCIATION_VALUE
   * @generated
   * @ordered
   */
  ASSOCIATION(0, "ASSOCIATION", "association"),

  /**
   * The '<em><b>DEPENCY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEPENCY_VALUE
   * @generated
   * @ordered
   */
  DEPENCY(1, "DEPENCY", "depency"),

  /**
   * The '<em><b>GENERALIZATION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GENERALIZATION_VALUE
   * @generated
   * @ordered
   */
  GENERALIZATION(2, "GENERALIZATION", "generalization"),

  /**
   * The '<em><b>REALIZATION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REALIZATION_VALUE
   * @generated
   * @ordered
   */
  REALIZATION(3, "REALIZATION", "realization"),

  /**
   * The '<em><b>AGGREGATION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AGGREGATION_VALUE
   * @generated
   * @ordered
   */
  AGGREGATION(4, "AGGREGATION", "aggregation"),

  /**
   * The '<em><b>COMPOSITION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPOSITION_VALUE
   * @generated
   * @ordered
   */
  COMPOSITION(5, "COMPOSITION", "composition");

  /**
   * The '<em><b>ASSOCIATION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ASSOCIATION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASSOCIATION
   * @model literal="association"
   * @generated
   * @ordered
   */
  public static final int ASSOCIATION_VALUE = 0;

  /**
   * The '<em><b>DEPENCY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DEPENCY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEPENCY
   * @model literal="depency"
   * @generated
   * @ordered
   */
  public static final int DEPENCY_VALUE = 1;

  /**
   * The '<em><b>GENERALIZATION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GENERALIZATION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GENERALIZATION
   * @model literal="generalization"
   * @generated
   * @ordered
   */
  public static final int GENERALIZATION_VALUE = 2;

  /**
   * The '<em><b>REALIZATION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>REALIZATION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REALIZATION
   * @model literal="realization"
   * @generated
   * @ordered
   */
  public static final int REALIZATION_VALUE = 3;

  /**
   * The '<em><b>AGGREGATION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>AGGREGATION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AGGREGATION
   * @model literal="aggregation"
   * @generated
   * @ordered
   */
  public static final int AGGREGATION_VALUE = 4;

  /**
   * The '<em><b>COMPOSITION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>COMPOSITION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMPOSITION
   * @model literal="composition"
   * @generated
   * @ordered
   */
  public static final int COMPOSITION_VALUE = 5;

  /**
   * An array of all the '<em><b>Relationship Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final RelationshipType[] VALUES_ARRAY =
    new RelationshipType[]
    {
      ASSOCIATION,
      DEPENCY,
      GENERALIZATION,
      REALIZATION,
      AGGREGATION,
      COMPOSITION,
    };

  /**
   * A public read-only list of all the '<em><b>Relationship Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<RelationshipType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Relationship Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RelationshipType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RelationshipType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Relationship Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RelationshipType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RelationshipType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Relationship Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RelationshipType get(int value)
  {
    switch (value)
    {
      case ASSOCIATION_VALUE: return ASSOCIATION;
      case DEPENCY_VALUE: return DEPENCY;
      case GENERALIZATION_VALUE: return GENERALIZATION;
      case REALIZATION_VALUE: return REALIZATION;
      case AGGREGATION_VALUE: return AGGREGATION;
      case COMPOSITION_VALUE: return COMPOSITION;
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
  private RelationshipType(int value, String name, String literal)
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
  
} //RelationshipType

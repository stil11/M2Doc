/**
 */
package org.obeonetwork.m2doc.genconf;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.obeonetwork.m2doc.genconf.RealDefinition#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.obeonetwork.m2doc.genconf.GenconfPackage#getRealDefinition()
 * @model
 * @generated
 */
public interface RealDefinition extends Definition {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(double)
     * @see org.obeonetwork.m2doc.genconf.GenconfPackage#getRealDefinition_Value()
     * @model default="0"
     * @generated
     */
    double getValue();

    /**
     * Sets the value of the '{@link org.obeonetwork.m2doc.genconf.RealDefinition#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(double value);

} // RealDefinition

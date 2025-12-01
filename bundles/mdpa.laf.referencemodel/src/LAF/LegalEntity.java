/**
 */
package LAF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legal Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LAF.LegalEntity#getRelatesTo <em>Relates To</em>}</li>
 *   <li>{@link LAF.LegalEntity#getIn <em>In</em>}</li>
 * </ul>
 *
 * @see LAF.LAFPackage#getLegalEntity()
 * @model
 * @generated
 */
public interface LegalEntity extends AssessmentFact
{
	/**
	 * Returns the value of the '<em><b>Relates To</b></em>' reference list.
	 * The list contents are of type {@link LAF.LegalEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relates To</em>' reference list.
	 * @see LAF.LAFPackage#getLegalEntity_RelatesTo()
	 * @model
	 * @generated
	 */
	EList<LegalEntity> getRelatesTo();

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link LAF.LegalContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see LAF.LAFPackage#getLegalEntity_In()
	 * @model
	 * @generated
	 */
	EList<LegalContext> getIn();

} // LegalEntity

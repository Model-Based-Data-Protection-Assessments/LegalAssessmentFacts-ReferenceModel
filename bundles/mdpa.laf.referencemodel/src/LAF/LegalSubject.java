/**
 */
package LAF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legal Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LAF.LegalSubject#getPerforms <em>Performs</em>}</li>
 * </ul>
 *
 * @see LAF.LAFPackage#getLegalSubject()
 * @model
 * @generated
 */
public interface LegalSubject extends LegalEntity
{
	/**
	 * Returns the value of the '<em><b>Performs</b></em>' reference list.
	 * The list contents are of type {@link LAF.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performs</em>' reference list.
	 * @see LAF.LAFPackage#getLegalSubject_Performs()
	 * @model
	 * @generated
	 */
	EList<Action> getPerforms();

} // LegalSubject

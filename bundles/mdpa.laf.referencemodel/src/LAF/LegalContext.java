/**
 */
package LAF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legal Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LAF.LegalContext#getRelatesTo <em>Relates To</em>}</li>
 * </ul>
 *
 * @see LAF.LAFPackage#getLegalContext()
 * @model
 * @generated
 */
public interface LegalContext extends AssessmentFact
{
	/**
	 * Returns the value of the '<em><b>Relates To</b></em>' reference list.
	 * The list contents are of type {@link LAF.LegalContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relates To</em>' reference list.
	 * @see LAF.LAFPackage#getLegalContext_RelatesTo()
	 * @model
	 * @generated
	 */
	EList<LegalContext> getRelatesTo();

} // LegalContext

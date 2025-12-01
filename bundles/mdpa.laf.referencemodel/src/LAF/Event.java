/**
 */
package LAF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LAF.Event#getOnWith <em>On With</em>}</li>
 *   <li>{@link LAF.Event#getIn <em>In</em>}</li>
 *   <li>{@link LAF.Event#getFollowing <em>Following</em>}</li>
 * </ul>
 *
 * @see LAF.LAFPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends AssessmentFact
{
	/**
	 * Returns the value of the '<em><b>On With</b></em>' reference list.
	 * The list contents are of type {@link LAF.LegalObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On With</em>' reference list.
	 * @see LAF.LAFPackage#getEvent_OnWith()
	 * @model required="true"
	 * @generated
	 */
	EList<LegalObject> getOnWith();

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link LAF.LegalContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see LAF.LAFPackage#getEvent_In()
	 * @model
	 * @generated
	 */
	EList<LegalContext> getIn();

	/**
	 * Returns the value of the '<em><b>Following</b></em>' reference list.
	 * The list contents are of type {@link LAF.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Following</em>' reference list.
	 * @see LAF.LAFPackage#getEvent_Following()
	 * @model
	 * @generated
	 */
	EList<Event> getFollowing();

} // Event

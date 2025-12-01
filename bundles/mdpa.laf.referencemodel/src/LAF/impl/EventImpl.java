/**
 */
package LAF.impl;

import LAF.Event;
import LAF.LAFPackage;
import LAF.LegalContext;
import LAF.LegalObject;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LAF.impl.EventImpl#getOnWith <em>On With</em>}</li>
 *   <li>{@link LAF.impl.EventImpl#getIn <em>In</em>}</li>
 *   <li>{@link LAF.impl.EventImpl#getFollowing <em>Following</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends AssessmentFactImpl implements Event
{
	/**
	 * The cached value of the '{@link #getOnWith() <em>On With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnWith()
	 * @generated
	 * @ordered
	 */
	protected EList<LegalObject> onWith;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<LegalContext> in;

	/**
	 * The cached value of the '{@link #getFollowing() <em>Following</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowing()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> following;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return LAFPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LegalObject> getOnWith()
	{
		if (onWith == null)
		{
			onWith = new EObjectResolvingEList<LegalObject>(LegalObject.class, this, LAFPackage.EVENT__ON_WITH);
		}
		return onWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LegalContext> getIn()
	{
		if (in == null)
		{
			in = new EObjectResolvingEList<LegalContext>(LegalContext.class, this, LAFPackage.EVENT__IN);
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getFollowing()
	{
		if (following == null)
		{
			following = new EObjectResolvingEList<Event>(Event.class, this, LAFPackage.EVENT__FOLLOWING);
		}
		return following;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case LAFPackage.EVENT__ON_WITH:
				return getOnWith();
			case LAFPackage.EVENT__IN:
				return getIn();
			case LAFPackage.EVENT__FOLLOWING:
				return getFollowing();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case LAFPackage.EVENT__ON_WITH:
				getOnWith().clear();
				getOnWith().addAll((Collection<? extends LegalObject>)newValue);
				return;
			case LAFPackage.EVENT__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends LegalContext>)newValue);
				return;
			case LAFPackage.EVENT__FOLLOWING:
				getFollowing().clear();
				getFollowing().addAll((Collection<? extends Event>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case LAFPackage.EVENT__ON_WITH:
				getOnWith().clear();
				return;
			case LAFPackage.EVENT__IN:
				getIn().clear();
				return;
			case LAFPackage.EVENT__FOLLOWING:
				getFollowing().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case LAFPackage.EVENT__ON_WITH:
				return onWith != null && !onWith.isEmpty();
			case LAFPackage.EVENT__IN:
				return in != null && !in.isEmpty();
			case LAFPackage.EVENT__FOLLOWING:
				return following != null && !following.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventImpl

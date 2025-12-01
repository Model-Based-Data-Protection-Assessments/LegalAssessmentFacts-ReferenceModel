/**
 */
package LAF.impl;

import LAF.LAFPackage;
import LAF.LegalContext;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legal Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LAF.impl.LegalContextImpl#getRelatesTo <em>Relates To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegalContextImpl extends AssessmentFactImpl implements LegalContext
{
	/**
	 * The cached value of the '{@link #getRelatesTo() <em>Relates To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<LegalContext> relatesTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegalContextImpl()
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
		return LAFPackage.Literals.LEGAL_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LegalContext> getRelatesTo()
	{
		if (relatesTo == null)
		{
			relatesTo = new EObjectResolvingEList<LegalContext>(LegalContext.class, this, LAFPackage.LEGAL_CONTEXT__RELATES_TO);
		}
		return relatesTo;
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
			case LAFPackage.LEGAL_CONTEXT__RELATES_TO:
				return getRelatesTo();
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
			case LAFPackage.LEGAL_CONTEXT__RELATES_TO:
				getRelatesTo().clear();
				getRelatesTo().addAll((Collection<? extends LegalContext>)newValue);
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
			case LAFPackage.LEGAL_CONTEXT__RELATES_TO:
				getRelatesTo().clear();
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
			case LAFPackage.LEGAL_CONTEXT__RELATES_TO:
				return relatesTo != null && !relatesTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LegalContextImpl

/**
 */
package LAF.impl;

import LAF.LAFPackage;
import LAF.LegalContext;
import LAF.LegalEntity;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legal Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LAF.impl.LegalEntityImpl#getRelatesTo <em>Relates To</em>}</li>
 *   <li>{@link LAF.impl.LegalEntityImpl#getIn <em>In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegalEntityImpl extends AssessmentFactImpl implements LegalEntity
{
	/**
	 * The cached value of the '{@link #getRelatesTo() <em>Relates To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<LegalEntity> relatesTo;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegalEntityImpl()
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
		return LAFPackage.Literals.LEGAL_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LegalEntity> getRelatesTo()
	{
		if (relatesTo == null)
		{
			relatesTo = new EObjectResolvingEList<LegalEntity>(LegalEntity.class, this, LAFPackage.LEGAL_ENTITY__RELATES_TO);
		}
		return relatesTo;
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
			in = new EObjectResolvingEList<LegalContext>(LegalContext.class, this, LAFPackage.LEGAL_ENTITY__IN);
		}
		return in;
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
			case LAFPackage.LEGAL_ENTITY__RELATES_TO:
				return getRelatesTo();
			case LAFPackage.LEGAL_ENTITY__IN:
				return getIn();
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
			case LAFPackage.LEGAL_ENTITY__RELATES_TO:
				getRelatesTo().clear();
				getRelatesTo().addAll((Collection<? extends LegalEntity>)newValue);
				return;
			case LAFPackage.LEGAL_ENTITY__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends LegalContext>)newValue);
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
			case LAFPackage.LEGAL_ENTITY__RELATES_TO:
				getRelatesTo().clear();
				return;
			case LAFPackage.LEGAL_ENTITY__IN:
				getIn().clear();
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
			case LAFPackage.LEGAL_ENTITY__RELATES_TO:
				return relatesTo != null && !relatesTo.isEmpty();
			case LAFPackage.LEGAL_ENTITY__IN:
				return in != null && !in.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LegalEntityImpl

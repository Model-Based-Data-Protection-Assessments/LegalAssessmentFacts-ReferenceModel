/**
 */
package LAF.impl;

import LAF.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LAFFactoryImpl extends EFactoryImpl implements LAFFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LAFFactory init()
	{
		try
		{
			LAFFactory theLAFFactory = (LAFFactory)EPackage.Registry.INSTANCE.getEFactory(LAFPackage.eNS_URI);
			if (theLAFFactory != null)
			{
				return theLAFFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LAFFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LAFFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case LAFPackage.LEGAL_ENTITY: return createLegalEntity();
			case LAFPackage.LEGAL_SUBJECT: return createLegalSubject();
			case LAFPackage.LEGAL_OBJECT: return createLegalObject();
			case LAFPackage.EVENT: return createEvent();
			case LAFPackage.ACTION: return createAction();
			case LAFPackage.LEGAL_CONTEXT: return createLegalContext();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LegalEntity createLegalEntity()
	{
		LegalEntityImpl legalEntity = new LegalEntityImpl();
		return legalEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LegalSubject createLegalSubject()
	{
		LegalSubjectImpl legalSubject = new LegalSubjectImpl();
		return legalSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LegalObject createLegalObject()
	{
		LegalObjectImpl legalObject = new LegalObjectImpl();
		return legalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event createEvent()
	{
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction()
	{
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LegalContext createLegalContext()
	{
		LegalContextImpl legalContext = new LegalContextImpl();
		return legalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LAFPackage getLAFPackage()
	{
		return (LAFPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LAFPackage getPackage()
	{
		return LAFPackage.eINSTANCE;
	}

} //LAFFactoryImpl

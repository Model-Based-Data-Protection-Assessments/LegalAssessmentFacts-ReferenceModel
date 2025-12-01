/**
 */
package LAF;

import identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see LAF.LAFFactory
 * @model kind="package"
 * @generated
 */
public interface LAFPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LAF";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/LAF";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "LAF";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LAFPackage eINSTANCE = LAF.impl.LAFPackageImpl.init();

	/**
	 * The meta object id for the '{@link LAF.impl.AssessmentFactImpl <em>Assessment Fact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LAF.impl.AssessmentFactImpl
	 * @see LAF.impl.LAFPackageImpl#getAssessmentFact()
	 * @generated
	 */
	int ASSESSMENT_FACT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_FACT__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_FACT__ENTITY_NAME = IdentifierPackage.ENTITY__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>Assessment Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_FACT_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assessment Fact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_FACT_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LAF.impl.LegalEntityImpl <em>Legal Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LAF.impl.LegalEntityImpl
	 * @see LAF.impl.LAFPackageImpl#getLegalEntity()
	 * @generated
	 */
	int LEGAL_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__ID = ASSESSMENT_FACT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__ENTITY_NAME = ASSESSMENT_FACT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Relates To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__RELATES_TO = ASSESSMENT_FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY__IN = ASSESSMENT_FACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Legal Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_FEATURE_COUNT = ASSESSMENT_FACT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Legal Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_ENTITY_OPERATION_COUNT = ASSESSMENT_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LAF.impl.LegalSubjectImpl <em>Legal Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LAF.impl.LegalSubjectImpl
	 * @see LAF.impl.LAFPackageImpl#getLegalSubject()
	 * @generated
	 */
	int LEGAL_SUBJECT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_SUBJECT__ID = LEGAL_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_SUBJECT__ENTITY_NAME = LEGAL_ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Relates To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_SUBJECT__RELATES_TO = LEGAL_ENTITY__RELATES_TO;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_SUBJECT__IN = LEGAL_ENTITY__IN;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_SUBJECT__PERFORMS = LEGAL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Legal Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_SUBJECT_FEATURE_COUNT = LEGAL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Legal Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_SUBJECT_OPERATION_COUNT = LEGAL_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LAF.impl.LegalObjectImpl <em>Legal Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LAF.impl.LegalObjectImpl
	 * @see LAF.impl.LAFPackageImpl#getLegalObject()
	 * @generated
	 */
	int LEGAL_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_OBJECT__ID = ASSESSMENT_FACT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_OBJECT__ENTITY_NAME = ASSESSMENT_FACT__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>Legal Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_OBJECT_FEATURE_COUNT = ASSESSMENT_FACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Legal Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_OBJECT_OPERATION_COUNT = ASSESSMENT_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LAF.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LAF.impl.EventImpl
	 * @see LAF.impl.LAFPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ID = ASSESSMENT_FACT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ENTITY_NAME = ASSESSMENT_FACT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>On With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ON_WITH = ASSESSMENT_FACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IN = ASSESSMENT_FACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Following</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__FOLLOWING = ASSESSMENT_FACT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = ASSESSMENT_FACT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = ASSESSMENT_FACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LAF.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LAF.impl.ActionImpl
	 * @see LAF.impl.LAFPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ID = EVENT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ENTITY_NAME = EVENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>On With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ON_WITH = EVENT__ON_WITH;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__IN = EVENT__IN;

	/**
	 * The feature id for the '<em><b>Following</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__FOLLOWING = EVENT__FOLLOWING;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LAF.impl.LegalContextImpl <em>Legal Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LAF.impl.LegalContextImpl
	 * @see LAF.impl.LAFPackageImpl#getLegalContext()
	 * @generated
	 */
	int LEGAL_CONTEXT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONTEXT__ID = ASSESSMENT_FACT__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONTEXT__ENTITY_NAME = ASSESSMENT_FACT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Relates To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONTEXT__RELATES_TO = ASSESSMENT_FACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Legal Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONTEXT_FEATURE_COUNT = ASSESSMENT_FACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Legal Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_CONTEXT_OPERATION_COUNT = ASSESSMENT_FACT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link LAF.AssessmentFact <em>Assessment Fact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment Fact</em>'.
	 * @see LAF.AssessmentFact
	 * @generated
	 */
	EClass getAssessmentFact();

	/**
	 * Returns the meta object for class '{@link LAF.LegalEntity <em>Legal Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Entity</em>'.
	 * @see LAF.LegalEntity
	 * @generated
	 */
	EClass getLegalEntity();

	/**
	 * Returns the meta object for the reference list '{@link LAF.LegalEntity#getRelatesTo <em>Relates To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relates To</em>'.
	 * @see LAF.LegalEntity#getRelatesTo()
	 * @see #getLegalEntity()
	 * @generated
	 */
	EReference getLegalEntity_RelatesTo();

	/**
	 * Returns the meta object for the reference list '{@link LAF.LegalEntity#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In</em>'.
	 * @see LAF.LegalEntity#getIn()
	 * @see #getLegalEntity()
	 * @generated
	 */
	EReference getLegalEntity_In();

	/**
	 * Returns the meta object for class '{@link LAF.LegalSubject <em>Legal Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Subject</em>'.
	 * @see LAF.LegalSubject
	 * @generated
	 */
	EClass getLegalSubject();

	/**
	 * Returns the meta object for the reference list '{@link LAF.LegalSubject#getPerforms <em>Performs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Performs</em>'.
	 * @see LAF.LegalSubject#getPerforms()
	 * @see #getLegalSubject()
	 * @generated
	 */
	EReference getLegalSubject_Performs();

	/**
	 * Returns the meta object for class '{@link LAF.LegalObject <em>Legal Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Object</em>'.
	 * @see LAF.LegalObject
	 * @generated
	 */
	EClass getLegalObject();

	/**
	 * Returns the meta object for class '{@link LAF.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see LAF.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the reference list '{@link LAF.Event#getOnWith <em>On With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On With</em>'.
	 * @see LAF.Event#getOnWith()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_OnWith();

	/**
	 * Returns the meta object for the reference list '{@link LAF.Event#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In</em>'.
	 * @see LAF.Event#getIn()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_In();

	/**
	 * Returns the meta object for the reference list '{@link LAF.Event#getFollowing <em>Following</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Following</em>'.
	 * @see LAF.Event#getFollowing()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Following();

	/**
	 * Returns the meta object for class '{@link LAF.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see LAF.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link LAF.LegalContext <em>Legal Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Context</em>'.
	 * @see LAF.LegalContext
	 * @generated
	 */
	EClass getLegalContext();

	/**
	 * Returns the meta object for the reference list '{@link LAF.LegalContext#getRelatesTo <em>Relates To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relates To</em>'.
	 * @see LAF.LegalContext#getRelatesTo()
	 * @see #getLegalContext()
	 * @generated
	 */
	EReference getLegalContext_RelatesTo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LAFFactory getLAFFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link LAF.impl.AssessmentFactImpl <em>Assessment Fact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LAF.impl.AssessmentFactImpl
		 * @see LAF.impl.LAFPackageImpl#getAssessmentFact()
		 * @generated
		 */
		EClass ASSESSMENT_FACT = eINSTANCE.getAssessmentFact();

		/**
		 * The meta object literal for the '{@link LAF.impl.LegalEntityImpl <em>Legal Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LAF.impl.LegalEntityImpl
		 * @see LAF.impl.LAFPackageImpl#getLegalEntity()
		 * @generated
		 */
		EClass LEGAL_ENTITY = eINSTANCE.getLegalEntity();

		/**
		 * The meta object literal for the '<em><b>Relates To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_ENTITY__RELATES_TO = eINSTANCE.getLegalEntity_RelatesTo();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_ENTITY__IN = eINSTANCE.getLegalEntity_In();

		/**
		 * The meta object literal for the '{@link LAF.impl.LegalSubjectImpl <em>Legal Subject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LAF.impl.LegalSubjectImpl
		 * @see LAF.impl.LAFPackageImpl#getLegalSubject()
		 * @generated
		 */
		EClass LEGAL_SUBJECT = eINSTANCE.getLegalSubject();

		/**
		 * The meta object literal for the '<em><b>Performs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_SUBJECT__PERFORMS = eINSTANCE.getLegalSubject_Performs();

		/**
		 * The meta object literal for the '{@link LAF.impl.LegalObjectImpl <em>Legal Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LAF.impl.LegalObjectImpl
		 * @see LAF.impl.LAFPackageImpl#getLegalObject()
		 * @generated
		 */
		EClass LEGAL_OBJECT = eINSTANCE.getLegalObject();

		/**
		 * The meta object literal for the '{@link LAF.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LAF.impl.EventImpl
		 * @see LAF.impl.LAFPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>On With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__ON_WITH = eINSTANCE.getEvent_OnWith();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__IN = eINSTANCE.getEvent_In();

		/**
		 * The meta object literal for the '<em><b>Following</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__FOLLOWING = eINSTANCE.getEvent_Following();

		/**
		 * The meta object literal for the '{@link LAF.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LAF.impl.ActionImpl
		 * @see LAF.impl.LAFPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link LAF.impl.LegalContextImpl <em>Legal Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LAF.impl.LegalContextImpl
		 * @see LAF.impl.LAFPackageImpl#getLegalContext()
		 * @generated
		 */
		EClass LEGAL_CONTEXT = eINSTANCE.getLegalContext();

		/**
		 * The meta object literal for the '<em><b>Relates To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_CONTEXT__RELATES_TO = eINSTANCE.getLegalContext_RelatesTo();

	}

} //LAFPackage

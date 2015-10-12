/**
 */
package questionnaire.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import questionnaire.Composant;
import questionnaire.Debut;
import questionnaire.Fin;
import questionnaire.LienQuestionChoix;
import questionnaire.LienSimple;
import questionnaire.LienSimpleSource;
import questionnaire.Pointable;
import questionnaire.Question;
import questionnaire.QuestionChoix;
import questionnaire.QuestionLibre;
import questionnaire.QuestionOuiNon;
import questionnaire.Questionnaire;
import questionnaire.QuestionnaireFactory;
import questionnaire.QuestionnairePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionnairePackageImpl extends EPackageImpl implements QuestionnairePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienSimpleSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass debutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionLibreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionChoixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionOuiNonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienSimpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienQuestionChoixEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see questionnaire.QuestionnairePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QuestionnairePackageImpl() {
		super(eNS_URI, QuestionnaireFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QuestionnairePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QuestionnairePackage init() {
		if (isInited) return (QuestionnairePackage)EPackage.Registry.INSTANCE.getEPackage(QuestionnairePackage.eNS_URI);

		// Obtain or create and register package
		QuestionnairePackageImpl theQuestionnairePackage = (QuestionnairePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QuestionnairePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QuestionnairePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theQuestionnairePackage.createPackageContents();

		// Initialize created meta-data
		theQuestionnairePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQuestionnairePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QuestionnairePackage.eNS_URI, theQuestionnairePackage);
		return theQuestionnairePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaire() {
		return questionnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Composants() {
		return (EReference)questionnaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_LiensQC() {
		return (EReference)questionnaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_LiensS() {
		return (EReference)questionnaireEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposant() {
		return composantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComposant_Label() {
		return (EAttribute)composantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLienSimpleSource() {
		return lienSimpleSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointable() {
		return pointableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDebut() {
		return debutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFin() {
		return finEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionLibre() {
		return questionLibreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionChoix() {
		return questionChoixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionOuiNon() {
		return questionOuiNonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionOuiNon_LienOui() {
		return (EReference)questionOuiNonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionOuiNon_LienNon() {
		return (EReference)questionOuiNonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLienSimple() {
		return lienSimpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLienSimple_LienSimpleSource() {
		return (EReference)lienSimpleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLienSimple_LienSimpleCible() {
		return (EReference)lienSimpleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLienQuestionChoix() {
		return lienQuestionChoixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLienQuestionChoix_Choix() {
		return (EAttribute)lienQuestionChoixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLienQuestionChoix_LienQuestionChoix() {
		return (EReference)lienQuestionChoixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLienQuestionChoix_Pointable() {
		return (EReference)lienQuestionChoixEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireFactory getQuestionnaireFactory() {
		return (QuestionnaireFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		questionnaireEClass = createEClass(QUESTIONNAIRE);
		createEReference(questionnaireEClass, QUESTIONNAIRE__COMPOSANTS);
		createEReference(questionnaireEClass, QUESTIONNAIRE__LIENS_QC);
		createEReference(questionnaireEClass, QUESTIONNAIRE__LIENS_S);

		composantEClass = createEClass(COMPOSANT);
		createEAttribute(composantEClass, COMPOSANT__LABEL);

		lienSimpleSourceEClass = createEClass(LIEN_SIMPLE_SOURCE);

		pointableEClass = createEClass(POINTABLE);

		questionEClass = createEClass(QUESTION);

		debutEClass = createEClass(DEBUT);

		finEClass = createEClass(FIN);

		questionLibreEClass = createEClass(QUESTION_LIBRE);

		questionChoixEClass = createEClass(QUESTION_CHOIX);

		questionOuiNonEClass = createEClass(QUESTION_OUI_NON);
		createEReference(questionOuiNonEClass, QUESTION_OUI_NON__LIEN_OUI);
		createEReference(questionOuiNonEClass, QUESTION_OUI_NON__LIEN_NON);

		lienSimpleEClass = createEClass(LIEN_SIMPLE);
		createEReference(lienSimpleEClass, LIEN_SIMPLE__LIEN_SIMPLE_SOURCE);
		createEReference(lienSimpleEClass, LIEN_SIMPLE__LIEN_SIMPLE_CIBLE);

		lienQuestionChoixEClass = createEClass(LIEN_QUESTION_CHOIX);
		createEAttribute(lienQuestionChoixEClass, LIEN_QUESTION_CHOIX__CHOIX);
		createEReference(lienQuestionChoixEClass, LIEN_QUESTION_CHOIX__LIEN_QUESTION_CHOIX);
		createEReference(lienQuestionChoixEClass, LIEN_QUESTION_CHOIX__POINTABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		questionEClass.getESuperTypes().add(this.getComposant());
		questionEClass.getESuperTypes().add(this.getPointable());
		debutEClass.getESuperTypes().add(this.getComposant());
		debutEClass.getESuperTypes().add(this.getLienSimpleSource());
		finEClass.getESuperTypes().add(this.getComposant());
		finEClass.getESuperTypes().add(this.getPointable());
		questionLibreEClass.getESuperTypes().add(this.getQuestion());
		questionLibreEClass.getESuperTypes().add(this.getLienSimpleSource());
		questionChoixEClass.getESuperTypes().add(this.getQuestion());
		questionOuiNonEClass.getESuperTypes().add(this.getQuestion());

		// Initialize classes and features; add operations and parameters
		initEClass(questionnaireEClass, Questionnaire.class, "Questionnaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestionnaire_Composants(), this.getComposant(), null, "composants", null, 0, -1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionnaire_LiensQC(), this.getLienQuestionChoix(), null, "liensQC", null, 0, -1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionnaire_LiensS(), this.getLienSimple(), null, "liensS", null, 0, -1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(composantEClass, Composant.class, "Composant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComposant_Label(), ecorePackage.getEString(), "label", null, 0, 1, Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lienSimpleSourceEClass, LienSimpleSource.class, "LienSimpleSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pointableEClass, Pointable.class, "Pointable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(debutEClass, Debut.class, "Debut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finEClass, Fin.class, "Fin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionLibreEClass, QuestionLibre.class, "QuestionLibre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionChoixEClass, QuestionChoix.class, "QuestionChoix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionOuiNonEClass, QuestionOuiNon.class, "QuestionOuiNon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestionOuiNon_LienOui(), this.getPointable(), null, "lienOui", null, 0, 1, QuestionOuiNon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionOuiNon_LienNon(), this.getPointable(), null, "lienNon", null, 0, 1, QuestionOuiNon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lienSimpleEClass, LienSimple.class, "LienSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLienSimple_LienSimpleSource(), this.getLienSimpleSource(), null, "lienSimpleSource", null, 0, 1, LienSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLienSimple_LienSimpleCible(), this.getPointable(), null, "lienSimpleCible", null, 0, 1, LienSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lienQuestionChoixEClass, LienQuestionChoix.class, "LienQuestionChoix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLienQuestionChoix_Choix(), ecorePackage.getEString(), "choix", null, 0, 1, LienQuestionChoix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLienQuestionChoix_LienQuestionChoix(), this.getQuestionChoix(), null, "lienQuestionChoix", null, 0, 1, LienQuestionChoix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLienQuestionChoix_Pointable(), this.getPointable(), null, "pointable", null, 0, 1, LienQuestionChoix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.link
		createGmf_2Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (questionnaireEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (debutEClass, 
		   source, 
		   new String[] {
			 "label", "label",
			 "color", "255,200,200"
		   });	
		addAnnotation
		  (finEClass, 
		   source, 
		   new String[] {
			 "label", "label",
			 "color", "255,120,120"
		   });	
		addAnnotation
		  (questionLibreEClass, 
		   source, 
		   new String[] {
			 "label", "label",
			 "figure", "ellipse",
			 "color", "220,220,255"
		   });	
		addAnnotation
		  (questionChoixEClass, 
		   source, 
		   new String[] {
			 "label", "label",
			 "figure", "ellipse",
			 "color", "160,160,255"
		   });	
		addAnnotation
		  (questionOuiNonEClass, 
		   source, 
		   new String[] {
			 "label", "label",
			 "figure", "ellipse",
			 "color", "130,100,255"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.link";	
		addAnnotation
		  (getQuestionOuiNon_LienOui(), 
		   source, 
		   new String[] {
			 "label.text", "lienOui",
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (getQuestionOuiNon_LienNon(), 
		   source, 
		   new String[] {
			 "label.text", "lienNon",
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (lienSimpleEClass, 
		   source, 
		   new String[] {
			 "source", "lienSimpleSource",
			 "target", "lienSimpleCible",
			 "target.decoration", "arrow"
		   });	
		addAnnotation
		  (lienQuestionChoixEClass, 
		   source, 
		   new String[] {
			 "source", "lienQuestionChoix",
			 "target", "pointable",
			 "label", "choix",
			 "target.decoration", "arrow"
		   });
	}

} //QuestionnairePackageImpl

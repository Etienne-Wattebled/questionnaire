/**
 */
package questionnaire;

import org.eclipse.emf.ecore.EAttribute;
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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see questionnaire.QuestionnaireFactory
 * @model kind="package"
 * @generated
 */
public interface QuestionnairePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "questionnaire";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "questionnaire";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "questionnaire";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuestionnairePackage eINSTANCE = questionnaire.impl.QuestionnairePackageImpl.init();

	/**
	 * The meta object id for the '{@link questionnaire.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.QuestionnaireImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionnaire()
	 * @generated
	 */
	int QUESTIONNAIRE = 0;

	/**
	 * The feature id for the '<em><b>Composants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__COMPOSANTS = 0;

	/**
	 * The feature id for the '<em><b>Liens QC</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__LIENS_QC = 1;

	/**
	 * The feature id for the '<em><b>Liens S</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE__LIENS_S = 2;

	/**
	 * The number of structural features of the '<em>Questionnaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTIONNAIRE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link questionnaire.impl.ComposantImpl <em>Composant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.ComposantImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getComposant()
	 * @generated
	 */
	int COMPOSANT = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link questionnaire.impl.LienSimpleSourceImpl <em>Lien Simple Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.LienSimpleSourceImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getLienSimpleSource()
	 * @generated
	 */
	int LIEN_SIMPLE_SOURCE = 2;

	/**
	 * The number of structural features of the '<em>Lien Simple Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_SIMPLE_SOURCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link questionnaire.impl.PointableImpl <em>Pointable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.PointableImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getPointable()
	 * @generated
	 */
	int POINTABLE = 3;

	/**
	 * The number of structural features of the '<em>Pointable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link questionnaire.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.QuestionImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__LABEL = COMPOSANT__LABEL;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link questionnaire.impl.DebutImpl <em>Debut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.DebutImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getDebut()
	 * @generated
	 */
	int DEBUT = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUT__LABEL = COMPOSANT__LABEL;

	/**
	 * The number of structural features of the '<em>Debut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUT_FEATURE_COUNT = COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link questionnaire.impl.FinImpl <em>Fin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.FinImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getFin()
	 * @generated
	 */
	int FIN = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN__LABEL = COMPOSANT__LABEL;

	/**
	 * The number of structural features of the '<em>Fin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_FEATURE_COUNT = COMPOSANT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link questionnaire.impl.QuestionLibreImpl <em>Question Libre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.QuestionLibreImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionLibre()
	 * @generated
	 */
	int QUESTION_LIBRE = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_LIBRE__LABEL = QUESTION__LABEL;

	/**
	 * The number of structural features of the '<em>Question Libre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_LIBRE_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link questionnaire.impl.QuestionChoixImpl <em>Question Choix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.QuestionChoixImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionChoix()
	 * @generated
	 */
	int QUESTION_CHOIX = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_CHOIX__LABEL = QUESTION__LABEL;

	/**
	 * The number of structural features of the '<em>Question Choix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_CHOIX_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link questionnaire.impl.QuestionOuiNonImpl <em>Question Oui Non</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.QuestionOuiNonImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionOuiNon()
	 * @generated
	 */
	int QUESTION_OUI_NON = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OUI_NON__LABEL = QUESTION__LABEL;

	/**
	 * The feature id for the '<em><b>Lien Oui</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OUI_NON__LIEN_OUI = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lien Non</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OUI_NON__LIEN_NON = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Question Oui Non</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OUI_NON_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link questionnaire.impl.LienSimpleImpl <em>Lien Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.LienSimpleImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getLienSimple()
	 * @generated
	 */
	int LIEN_SIMPLE = 10;

	/**
	 * The feature id for the '<em><b>Lien Simple Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_SIMPLE__LIEN_SIMPLE_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Lien Simple Cible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_SIMPLE__LIEN_SIMPLE_CIBLE = 1;

	/**
	 * The number of structural features of the '<em>Lien Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_SIMPLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link questionnaire.impl.LienQuestionChoixImpl <em>Lien Question Choix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see questionnaire.impl.LienQuestionChoixImpl
	 * @see questionnaire.impl.QuestionnairePackageImpl#getLienQuestionChoix()
	 * @generated
	 */
	int LIEN_QUESTION_CHOIX = 11;

	/**
	 * The feature id for the '<em><b>Choix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_QUESTION_CHOIX__CHOIX = 0;

	/**
	 * The feature id for the '<em><b>Lien Question Choix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_QUESTION_CHOIX__LIEN_QUESTION_CHOIX = 1;

	/**
	 * The feature id for the '<em><b>Pointable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_QUESTION_CHOIX__POINTABLE = 2;

	/**
	 * The number of structural features of the '<em>Lien Question Choix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_QUESTION_CHOIX_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link questionnaire.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Questionnaire</em>'.
	 * @see questionnaire.Questionnaire
	 * @generated
	 */
	EClass getQuestionnaire();

	/**
	 * Returns the meta object for the containment reference list '{@link questionnaire.Questionnaire#getComposants <em>Composants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composants</em>'.
	 * @see questionnaire.Questionnaire#getComposants()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_Composants();

	/**
	 * Returns the meta object for the containment reference list '{@link questionnaire.Questionnaire#getLiensQC <em>Liens QC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Liens QC</em>'.
	 * @see questionnaire.Questionnaire#getLiensQC()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_LiensQC();

	/**
	 * Returns the meta object for the containment reference list '{@link questionnaire.Questionnaire#getLiensS <em>Liens S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Liens S</em>'.
	 * @see questionnaire.Questionnaire#getLiensS()
	 * @see #getQuestionnaire()
	 * @generated
	 */
	EReference getQuestionnaire_LiensS();

	/**
	 * Returns the meta object for class '{@link questionnaire.Composant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composant</em>'.
	 * @see questionnaire.Composant
	 * @generated
	 */
	EClass getComposant();

	/**
	 * Returns the meta object for the attribute '{@link questionnaire.Composant#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see questionnaire.Composant#getLabel()
	 * @see #getComposant()
	 * @generated
	 */
	EAttribute getComposant_Label();

	/**
	 * Returns the meta object for class '{@link questionnaire.LienSimpleSource <em>Lien Simple Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Simple Source</em>'.
	 * @see questionnaire.LienSimpleSource
	 * @generated
	 */
	EClass getLienSimpleSource();

	/**
	 * Returns the meta object for class '{@link questionnaire.Pointable <em>Pointable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointable</em>'.
	 * @see questionnaire.Pointable
	 * @generated
	 */
	EClass getPointable();

	/**
	 * Returns the meta object for class '{@link questionnaire.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see questionnaire.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for class '{@link questionnaire.Debut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Debut</em>'.
	 * @see questionnaire.Debut
	 * @generated
	 */
	EClass getDebut();

	/**
	 * Returns the meta object for class '{@link questionnaire.Fin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin</em>'.
	 * @see questionnaire.Fin
	 * @generated
	 */
	EClass getFin();

	/**
	 * Returns the meta object for class '{@link questionnaire.QuestionLibre <em>Question Libre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Libre</em>'.
	 * @see questionnaire.QuestionLibre
	 * @generated
	 */
	EClass getQuestionLibre();

	/**
	 * Returns the meta object for class '{@link questionnaire.QuestionChoix <em>Question Choix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Choix</em>'.
	 * @see questionnaire.QuestionChoix
	 * @generated
	 */
	EClass getQuestionChoix();

	/**
	 * Returns the meta object for class '{@link questionnaire.QuestionOuiNon <em>Question Oui Non</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Oui Non</em>'.
	 * @see questionnaire.QuestionOuiNon
	 * @generated
	 */
	EClass getQuestionOuiNon();

	/**
	 * Returns the meta object for the reference '{@link questionnaire.QuestionOuiNon#getLienOui <em>Lien Oui</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lien Oui</em>'.
	 * @see questionnaire.QuestionOuiNon#getLienOui()
	 * @see #getQuestionOuiNon()
	 * @generated
	 */
	EReference getQuestionOuiNon_LienOui();

	/**
	 * Returns the meta object for the reference '{@link questionnaire.QuestionOuiNon#getLienNon <em>Lien Non</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lien Non</em>'.
	 * @see questionnaire.QuestionOuiNon#getLienNon()
	 * @see #getQuestionOuiNon()
	 * @generated
	 */
	EReference getQuestionOuiNon_LienNon();

	/**
	 * Returns the meta object for class '{@link questionnaire.LienSimple <em>Lien Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Simple</em>'.
	 * @see questionnaire.LienSimple
	 * @generated
	 */
	EClass getLienSimple();

	/**
	 * Returns the meta object for the reference '{@link questionnaire.LienSimple#getLienSimpleSource <em>Lien Simple Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lien Simple Source</em>'.
	 * @see questionnaire.LienSimple#getLienSimpleSource()
	 * @see #getLienSimple()
	 * @generated
	 */
	EReference getLienSimple_LienSimpleSource();

	/**
	 * Returns the meta object for the reference '{@link questionnaire.LienSimple#getLienSimpleCible <em>Lien Simple Cible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lien Simple Cible</em>'.
	 * @see questionnaire.LienSimple#getLienSimpleCible()
	 * @see #getLienSimple()
	 * @generated
	 */
	EReference getLienSimple_LienSimpleCible();

	/**
	 * Returns the meta object for class '{@link questionnaire.LienQuestionChoix <em>Lien Question Choix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien Question Choix</em>'.
	 * @see questionnaire.LienQuestionChoix
	 * @generated
	 */
	EClass getLienQuestionChoix();

	/**
	 * Returns the meta object for the attribute '{@link questionnaire.LienQuestionChoix#getChoix <em>Choix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Choix</em>'.
	 * @see questionnaire.LienQuestionChoix#getChoix()
	 * @see #getLienQuestionChoix()
	 * @generated
	 */
	EAttribute getLienQuestionChoix_Choix();

	/**
	 * Returns the meta object for the reference '{@link questionnaire.LienQuestionChoix#getLienQuestionChoix <em>Lien Question Choix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lien Question Choix</em>'.
	 * @see questionnaire.LienQuestionChoix#getLienQuestionChoix()
	 * @see #getLienQuestionChoix()
	 * @generated
	 */
	EReference getLienQuestionChoix_LienQuestionChoix();

	/**
	 * Returns the meta object for the reference '{@link questionnaire.LienQuestionChoix#getPointable <em>Pointable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pointable</em>'.
	 * @see questionnaire.LienQuestionChoix#getPointable()
	 * @see #getLienQuestionChoix()
	 * @generated
	 */
	EReference getLienQuestionChoix_Pointable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QuestionnaireFactory getQuestionnaireFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link questionnaire.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.QuestionnaireImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionnaire()
		 * @generated
		 */
		EClass QUESTIONNAIRE = eINSTANCE.getQuestionnaire();

		/**
		 * The meta object literal for the '<em><b>Composants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__COMPOSANTS = eINSTANCE.getQuestionnaire_Composants();

		/**
		 * The meta object literal for the '<em><b>Liens QC</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__LIENS_QC = eINSTANCE.getQuestionnaire_LiensQC();

		/**
		 * The meta object literal for the '<em><b>Liens S</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTIONNAIRE__LIENS_S = eINSTANCE.getQuestionnaire_LiensS();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.ComposantImpl <em>Composant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.ComposantImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getComposant()
		 * @generated
		 */
		EClass COMPOSANT = eINSTANCE.getComposant();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSANT__LABEL = eINSTANCE.getComposant_Label();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.LienSimpleSourceImpl <em>Lien Simple Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.LienSimpleSourceImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getLienSimpleSource()
		 * @generated
		 */
		EClass LIEN_SIMPLE_SOURCE = eINSTANCE.getLienSimpleSource();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.PointableImpl <em>Pointable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.PointableImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getPointable()
		 * @generated
		 */
		EClass POINTABLE = eINSTANCE.getPointable();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.QuestionImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.DebutImpl <em>Debut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.DebutImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getDebut()
		 * @generated
		 */
		EClass DEBUT = eINSTANCE.getDebut();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.FinImpl <em>Fin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.FinImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getFin()
		 * @generated
		 */
		EClass FIN = eINSTANCE.getFin();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.QuestionLibreImpl <em>Question Libre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.QuestionLibreImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionLibre()
		 * @generated
		 */
		EClass QUESTION_LIBRE = eINSTANCE.getQuestionLibre();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.QuestionChoixImpl <em>Question Choix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.QuestionChoixImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionChoix()
		 * @generated
		 */
		EClass QUESTION_CHOIX = eINSTANCE.getQuestionChoix();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.QuestionOuiNonImpl <em>Question Oui Non</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.QuestionOuiNonImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getQuestionOuiNon()
		 * @generated
		 */
		EClass QUESTION_OUI_NON = eINSTANCE.getQuestionOuiNon();

		/**
		 * The meta object literal for the '<em><b>Lien Oui</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_OUI_NON__LIEN_OUI = eINSTANCE.getQuestionOuiNon_LienOui();

		/**
		 * The meta object literal for the '<em><b>Lien Non</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_OUI_NON__LIEN_NON = eINSTANCE.getQuestionOuiNon_LienNon();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.LienSimpleImpl <em>Lien Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.LienSimpleImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getLienSimple()
		 * @generated
		 */
		EClass LIEN_SIMPLE = eINSTANCE.getLienSimple();

		/**
		 * The meta object literal for the '<em><b>Lien Simple Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEN_SIMPLE__LIEN_SIMPLE_SOURCE = eINSTANCE.getLienSimple_LienSimpleSource();

		/**
		 * The meta object literal for the '<em><b>Lien Simple Cible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEN_SIMPLE__LIEN_SIMPLE_CIBLE = eINSTANCE.getLienSimple_LienSimpleCible();

		/**
		 * The meta object literal for the '{@link questionnaire.impl.LienQuestionChoixImpl <em>Lien Question Choix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see questionnaire.impl.LienQuestionChoixImpl
		 * @see questionnaire.impl.QuestionnairePackageImpl#getLienQuestionChoix()
		 * @generated
		 */
		EClass LIEN_QUESTION_CHOIX = eINSTANCE.getLienQuestionChoix();

		/**
		 * The meta object literal for the '<em><b>Choix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIEN_QUESTION_CHOIX__CHOIX = eINSTANCE.getLienQuestionChoix_Choix();

		/**
		 * The meta object literal for the '<em><b>Lien Question Choix</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEN_QUESTION_CHOIX__LIEN_QUESTION_CHOIX = eINSTANCE.getLienQuestionChoix_LienQuestionChoix();

		/**
		 * The meta object literal for the '<em><b>Pointable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEN_QUESTION_CHOIX__POINTABLE = eINSTANCE.getLienQuestionChoix_Pointable();

	}

} //QuestionnairePackage

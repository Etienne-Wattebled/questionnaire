/**
 */
package questionnaire.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import questionnaire.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionnaireFactoryImpl extends EFactoryImpl implements QuestionnaireFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuestionnaireFactory init() {
		try {
			QuestionnaireFactory theQuestionnaireFactory = (QuestionnaireFactory)EPackage.Registry.INSTANCE.getEFactory(QuestionnairePackage.eNS_URI);
			if (theQuestionnaireFactory != null) {
				return theQuestionnaireFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QuestionnaireFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QuestionnairePackage.QUESTIONNAIRE: return createQuestionnaire();
			case QuestionnairePackage.COMPOSANT: return createComposant();
			case QuestionnairePackage.LIEN_SIMPLE_SOURCE: return createLienSimpleSource();
			case QuestionnairePackage.POINTABLE: return createPointable();
			case QuestionnairePackage.QUESTION: return createQuestion();
			case QuestionnairePackage.DEBUT: return createDebut();
			case QuestionnairePackage.FIN: return createFin();
			case QuestionnairePackage.QUESTION_LIBRE: return createQuestionLibre();
			case QuestionnairePackage.QUESTION_CHOIX: return createQuestionChoix();
			case QuestionnairePackage.QUESTION_OUI_NON: return createQuestionOuiNon();
			case QuestionnairePackage.LIEN_SIMPLE: return createLienSimple();
			case QuestionnairePackage.LIEN_QUESTION_CHOIX: return createLienQuestionChoix();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire createQuestionnaire() {
		QuestionnaireImpl questionnaire = new QuestionnaireImpl();
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composant createComposant() {
		ComposantImpl composant = new ComposantImpl();
		return composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienSimpleSource createLienSimpleSource() {
		LienSimpleSourceImpl lienSimpleSource = new LienSimpleSourceImpl();
		return lienSimpleSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pointable createPointable() {
		PointableImpl pointable = new PointableImpl();
		return pointable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Debut createDebut() {
		DebutImpl debut = new DebutImpl();
		return debut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fin createFin() {
		FinImpl fin = new FinImpl();
		return fin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionLibre createQuestionLibre() {
		QuestionLibreImpl questionLibre = new QuestionLibreImpl();
		return questionLibre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionChoix createQuestionChoix() {
		QuestionChoixImpl questionChoix = new QuestionChoixImpl();
		return questionChoix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionOuiNon createQuestionOuiNon() {
		QuestionOuiNonImpl questionOuiNon = new QuestionOuiNonImpl();
		return questionOuiNon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienSimple createLienSimple() {
		LienSimpleImpl lienSimple = new LienSimpleImpl();
		return lienSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienQuestionChoix createLienQuestionChoix() {
		LienQuestionChoixImpl lienQuestionChoix = new LienQuestionChoixImpl();
		return lienQuestionChoix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnairePackage getQuestionnairePackage() {
		return (QuestionnairePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QuestionnairePackage getPackage() {
		return QuestionnairePackage.eINSTANCE;
	}

} //QuestionnaireFactoryImpl

/**
 */
package questionnaire.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import questionnaire.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see questionnaire.QuestionnairePackage
 * @generated
 */
public class QuestionnaireSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QuestionnairePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireSwitch() {
		if (modelPackage == null) {
			modelPackage = QuestionnairePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case QuestionnairePackage.QUESTIONNAIRE: {
				Questionnaire questionnaire = (Questionnaire)theEObject;
				T result = caseQuestionnaire(questionnaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.COMPOSANT: {
				Composant composant = (Composant)theEObject;
				T result = caseComposant(composant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.LIEN_SIMPLE_SOURCE: {
				LienSimpleSource lienSimpleSource = (LienSimpleSource)theEObject;
				T result = caseLienSimpleSource(lienSimpleSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.POINTABLE: {
				Pointable pointable = (Pointable)theEObject;
				T result = casePointable(pointable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.QUESTION: {
				Question question = (Question)theEObject;
				T result = caseQuestion(question);
				if (result == null) result = caseComposant(question);
				if (result == null) result = casePointable(question);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.DEBUT: {
				Debut debut = (Debut)theEObject;
				T result = caseDebut(debut);
				if (result == null) result = caseComposant(debut);
				if (result == null) result = caseLienSimpleSource(debut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.FIN: {
				Fin fin = (Fin)theEObject;
				T result = caseFin(fin);
				if (result == null) result = caseComposant(fin);
				if (result == null) result = casePointable(fin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.QUESTION_LIBRE: {
				QuestionLibre questionLibre = (QuestionLibre)theEObject;
				T result = caseQuestionLibre(questionLibre);
				if (result == null) result = caseQuestion(questionLibre);
				if (result == null) result = caseLienSimpleSource(questionLibre);
				if (result == null) result = caseComposant(questionLibre);
				if (result == null) result = casePointable(questionLibre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.QUESTION_CHOIX: {
				QuestionChoix questionChoix = (QuestionChoix)theEObject;
				T result = caseQuestionChoix(questionChoix);
				if (result == null) result = caseQuestion(questionChoix);
				if (result == null) result = caseComposant(questionChoix);
				if (result == null) result = casePointable(questionChoix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.QUESTION_OUI_NON: {
				QuestionOuiNon questionOuiNon = (QuestionOuiNon)theEObject;
				T result = caseQuestionOuiNon(questionOuiNon);
				if (result == null) result = caseQuestion(questionOuiNon);
				if (result == null) result = caseComposant(questionOuiNon);
				if (result == null) result = casePointable(questionOuiNon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.LIEN_SIMPLE: {
				LienSimple lienSimple = (LienSimple)theEObject;
				T result = caseLienSimple(lienSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QuestionnairePackage.LIEN_QUESTION_CHOIX: {
				LienQuestionChoix lienQuestionChoix = (LienQuestionChoix)theEObject;
				T result = caseLienQuestionChoix(lienQuestionChoix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaire(Questionnaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposant(Composant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Simple Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Simple Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienSimpleSource(LienSimpleSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointable(Pointable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestion(Question object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Debut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Debut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDebut(Debut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFin(Fin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Libre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Libre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionLibre(QuestionLibre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Choix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Choix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionChoix(QuestionChoix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Oui Non</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Oui Non</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionOuiNon(QuestionOuiNon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienSimple(LienSimple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien Question Choix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien Question Choix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLienQuestionChoix(LienQuestionChoix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //QuestionnaireSwitch

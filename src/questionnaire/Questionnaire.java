/**
 */
package questionnaire;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionnaire.Questionnaire#getComposants <em>Composants</em>}</li>
 *   <li>{@link questionnaire.Questionnaire#getLiensQC <em>Liens QC</em>}</li>
 *   <li>{@link questionnaire.Questionnaire#getLiensS <em>Liens S</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionnaire.QuestionnairePackage#getQuestionnaire()
 * @model
 * @generated
 */
public interface Questionnaire extends EObject {
	/**
	 * Returns the value of the '<em><b>Composants</b></em>' containment reference list.
	 * The list contents are of type {@link questionnaire.Composant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composants</em>' containment reference list.
	 * @see questionnaire.QuestionnairePackage#getQuestionnaire_Composants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Composant> getComposants();

	/**
	 * Returns the value of the '<em><b>Liens QC</b></em>' containment reference list.
	 * The list contents are of type {@link questionnaire.LienQuestionChoix}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liens QC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liens QC</em>' containment reference list.
	 * @see questionnaire.QuestionnairePackage#getQuestionnaire_LiensQC()
	 * @model containment="true"
	 * @generated
	 */
	EList<LienQuestionChoix> getLiensQC();

	/**
	 * Returns the value of the '<em><b>Liens S</b></em>' containment reference list.
	 * The list contents are of type {@link questionnaire.LienSimple}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liens S</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liens S</em>' containment reference list.
	 * @see questionnaire.QuestionnairePackage#getQuestionnaire_LiensS()
	 * @model containment="true"
	 * @generated
	 */
	EList<LienSimple> getLiensS();

} // Questionnaire

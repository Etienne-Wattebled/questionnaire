/**
 */
package questionnaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien Question Choix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionnaire.LienQuestionChoix#getChoix <em>Choix</em>}</li>
 *   <li>{@link questionnaire.LienQuestionChoix#getLienQuestionChoix <em>Lien Question Choix</em>}</li>
 *   <li>{@link questionnaire.LienQuestionChoix#getPointable <em>Pointable</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionnaire.QuestionnairePackage#getLienQuestionChoix()
 * @model annotation="gmf.link source='lienQuestionChoix' target='pointable' label='choix' target.decoration='arrow'"
 * @generated
 */
public interface LienQuestionChoix extends EObject {
	/**
	 * Returns the value of the '<em><b>Choix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choix</em>' attribute.
	 * @see #setChoix(String)
	 * @see questionnaire.QuestionnairePackage#getLienQuestionChoix_Choix()
	 * @model
	 * @generated
	 */
	String getChoix();

	/**
	 * Sets the value of the '{@link questionnaire.LienQuestionChoix#getChoix <em>Choix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choix</em>' attribute.
	 * @see #getChoix()
	 * @generated
	 */
	void setChoix(String value);

	/**
	 * Returns the value of the '<em><b>Lien Question Choix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lien Question Choix</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lien Question Choix</em>' reference.
	 * @see #setLienQuestionChoix(QuestionChoix)
	 * @see questionnaire.QuestionnairePackage#getLienQuestionChoix_LienQuestionChoix()
	 * @model
	 * @generated
	 */
	QuestionChoix getLienQuestionChoix();

	/**
	 * Sets the value of the '{@link questionnaire.LienQuestionChoix#getLienQuestionChoix <em>Lien Question Choix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lien Question Choix</em>' reference.
	 * @see #getLienQuestionChoix()
	 * @generated
	 */
	void setLienQuestionChoix(QuestionChoix value);

	/**
	 * Returns the value of the '<em><b>Pointable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointable</em>' reference.
	 * @see #setPointable(Pointable)
	 * @see questionnaire.QuestionnairePackage#getLienQuestionChoix_Pointable()
	 * @model
	 * @generated
	 */
	Pointable getPointable();

	/**
	 * Sets the value of the '{@link questionnaire.LienQuestionChoix#getPointable <em>Pointable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointable</em>' reference.
	 * @see #getPointable()
	 * @generated
	 */
	void setPointable(Pointable value);

} // LienQuestionChoix

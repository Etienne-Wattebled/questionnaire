/**
 */
package questionnaire;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Oui Non</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionnaire.QuestionOuiNon#getLienOui <em>Lien Oui</em>}</li>
 *   <li>{@link questionnaire.QuestionOuiNon#getLienNon <em>Lien Non</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionnaire.QuestionnairePackage#getQuestionOuiNon()
 * @model annotation="gmf.node label='label' figure='ellipse' color='130,100,255'"
 * @generated
 */
public interface QuestionOuiNon extends Question {
	/**
	 * Returns the value of the '<em><b>Lien Oui</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lien Oui</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lien Oui</em>' reference.
	 * @see #setLienOui(Pointable)
	 * @see questionnaire.QuestionnairePackage#getQuestionOuiNon_LienOui()
	 * @model annotation="gmf.link label.text='lienOui' target.decoration='arrow'"
	 * @generated
	 */
	Pointable getLienOui();

	/**
	 * Sets the value of the '{@link questionnaire.QuestionOuiNon#getLienOui <em>Lien Oui</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lien Oui</em>' reference.
	 * @see #getLienOui()
	 * @generated
	 */
	void setLienOui(Pointable value);

	/**
	 * Returns the value of the '<em><b>Lien Non</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lien Non</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lien Non</em>' reference.
	 * @see #setLienNon(Pointable)
	 * @see questionnaire.QuestionnairePackage#getQuestionOuiNon_LienNon()
	 * @model annotation="gmf.link label.text='lienNon' target.decoration='arrow'"
	 * @generated
	 */
	Pointable getLienNon();

	/**
	 * Sets the value of the '{@link questionnaire.QuestionOuiNon#getLienNon <em>Lien Non</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lien Non</em>' reference.
	 * @see #getLienNon()
	 * @generated
	 */
	void setLienNon(Pointable value);

} // QuestionOuiNon

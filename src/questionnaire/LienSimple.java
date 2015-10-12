/**
 */
package questionnaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link questionnaire.LienSimple#getLienSimpleSource <em>Lien Simple Source</em>}</li>
 *   <li>{@link questionnaire.LienSimple#getLienSimpleCible <em>Lien Simple Cible</em>}</li>
 * </ul>
 * </p>
 *
 * @see questionnaire.QuestionnairePackage#getLienSimple()
 * @model annotation="gmf.link source='lienSimpleSource' target='lienSimpleCible' target.decoration='arrow'"
 * @generated
 */
public interface LienSimple extends EObject {
	/**
	 * Returns the value of the '<em><b>Lien Simple Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lien Simple Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lien Simple Source</em>' reference.
	 * @see #setLienSimpleSource(LienSimpleSource)
	 * @see questionnaire.QuestionnairePackage#getLienSimple_LienSimpleSource()
	 * @model
	 * @generated
	 */
	LienSimpleSource getLienSimpleSource();

	/**
	 * Sets the value of the '{@link questionnaire.LienSimple#getLienSimpleSource <em>Lien Simple Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lien Simple Source</em>' reference.
	 * @see #getLienSimpleSource()
	 * @generated
	 */
	void setLienSimpleSource(LienSimpleSource value);

	/**
	 * Returns the value of the '<em><b>Lien Simple Cible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lien Simple Cible</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lien Simple Cible</em>' reference.
	 * @see #setLienSimpleCible(Pointable)
	 * @see questionnaire.QuestionnairePackage#getLienSimple_LienSimpleCible()
	 * @model
	 * @generated
	 */
	Pointable getLienSimpleCible();

	/**
	 * Sets the value of the '{@link questionnaire.LienSimple#getLienSimpleCible <em>Lien Simple Cible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lien Simple Cible</em>' reference.
	 * @see #getLienSimpleCible()
	 * @generated
	 */
	void setLienSimpleCible(Pointable value);

} // LienSimple

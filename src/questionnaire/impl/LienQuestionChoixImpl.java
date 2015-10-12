/**
 */
package questionnaire.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import questionnaire.LienQuestionChoix;
import questionnaire.Pointable;
import questionnaire.QuestionChoix;
import questionnaire.QuestionnairePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lien Question Choix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionnaire.impl.LienQuestionChoixImpl#getChoix <em>Choix</em>}</li>
 *   <li>{@link questionnaire.impl.LienQuestionChoixImpl#getLienQuestionChoix <em>Lien Question Choix</em>}</li>
 *   <li>{@link questionnaire.impl.LienQuestionChoixImpl#getPointable <em>Pointable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LienQuestionChoixImpl extends EObjectImpl implements LienQuestionChoix {
	/**
	 * The default value of the '{@link #getChoix() <em>Choix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoix()
	 * @generated
	 * @ordered
	 */
	protected static final String CHOIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChoix() <em>Choix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoix()
	 * @generated
	 * @ordered
	 */
	protected String choix = CHOIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLienQuestionChoix() <em>Lien Question Choix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienQuestionChoix()
	 * @generated
	 * @ordered
	 */
	protected QuestionChoix lienQuestionChoix;

	/**
	 * The cached value of the '{@link #getPointable() <em>Pointable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointable()
	 * @generated
	 * @ordered
	 */
	protected Pointable pointable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LienQuestionChoixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnairePackage.Literals.LIEN_QUESTION_CHOIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChoix() {
		return choix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoix(String newChoix) {
		String oldChoix = choix;
		choix = newChoix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.LIEN_QUESTION_CHOIX__CHOIX, oldChoix, choix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionChoix getLienQuestionChoix() {
		if (lienQuestionChoix != null && lienQuestionChoix.eIsProxy()) {
			InternalEObject oldLienQuestionChoix = (InternalEObject)lienQuestionChoix;
			lienQuestionChoix = (QuestionChoix)eResolveProxy(oldLienQuestionChoix);
			if (lienQuestionChoix != oldLienQuestionChoix) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuestionnairePackage.LIEN_QUESTION_CHOIX__LIEN_QUESTION_CHOIX, oldLienQuestionChoix, lienQuestionChoix));
			}
		}
		return lienQuestionChoix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionChoix basicGetLienQuestionChoix() {
		return lienQuestionChoix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLienQuestionChoix(QuestionChoix newLienQuestionChoix) {
		QuestionChoix oldLienQuestionChoix = lienQuestionChoix;
		lienQuestionChoix = newLienQuestionChoix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.LIEN_QUESTION_CHOIX__LIEN_QUESTION_CHOIX, oldLienQuestionChoix, lienQuestionChoix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pointable getPointable() {
		if (pointable != null && pointable.eIsProxy()) {
			InternalEObject oldPointable = (InternalEObject)pointable;
			pointable = (Pointable)eResolveProxy(oldPointable);
			if (pointable != oldPointable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuestionnairePackage.LIEN_QUESTION_CHOIX__POINTABLE, oldPointable, pointable));
			}
		}
		return pointable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pointable basicGetPointable() {
		return pointable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointable(Pointable newPointable) {
		Pointable oldPointable = pointable;
		pointable = newPointable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.LIEN_QUESTION_CHOIX__POINTABLE, oldPointable, pointable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuestionnairePackage.LIEN_QUESTION_CHOIX__CHOIX:
				return getChoix();
			case QuestionnairePackage.LIEN_QUESTION_CHOIX__LIEN_QUESTION_CHOIX:
				if (resolve) return getLienQuestionChoix();
				return basicGetLienQuestionChoix();
			case QuestionnairePackage.LIEN_QUESTION_CHOIX__POINTABLE:
				if (resolve) return getPointable();
				return basicGetPointable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QuestionnairePackage.LIEN_QUESTION_CHOIX__CHOIX:
				setChoix((String)newValue);
				return;
			case QuestionnairePackage.LIEN_QUESTION_CHOIX__LIEN_QUESTION_CHOIX:
				setLienQuestionChoix((QuestionChoix)newValue);
				return;
			case QuestionnairePackage.LIEN_QUESTION_CHOIX__POINTABLE:
				setPointable((Pointable)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QuestionnairePackage.LIEN_QUESTION_CHOIX__CHOIX:
				setChoix(CHOIX_EDEFAULT);
				return;
			case QuestionnairePackage.LIEN_QUESTION_CHOIX__LIEN_QUESTION_CHOIX:
				setLienQuestionChoix((QuestionChoix)null);
				return;
			case QuestionnairePackage.LIEN_QUESTION_CHOIX__POINTABLE:
				setPointable((Pointable)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QuestionnairePackage.LIEN_QUESTION_CHOIX__CHOIX:
				return CHOIX_EDEFAULT == null ? choix != null : !CHOIX_EDEFAULT.equals(choix);
			case QuestionnairePackage.LIEN_QUESTION_CHOIX__LIEN_QUESTION_CHOIX:
				return lienQuestionChoix != null;
			case QuestionnairePackage.LIEN_QUESTION_CHOIX__POINTABLE:
				return pointable != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (choix: ");
		result.append(choix);
		result.append(')');
		return result.toString();
	}

} //LienQuestionChoixImpl

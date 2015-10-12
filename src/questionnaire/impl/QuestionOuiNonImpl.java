/**
 */
package questionnaire.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import questionnaire.Pointable;
import questionnaire.QuestionOuiNon;
import questionnaire.QuestionnairePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Oui Non</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionnaire.impl.QuestionOuiNonImpl#getLienOui <em>Lien Oui</em>}</li>
 *   <li>{@link questionnaire.impl.QuestionOuiNonImpl#getLienNon <em>Lien Non</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionOuiNonImpl extends QuestionImpl implements QuestionOuiNon {
	/**
	 * The cached value of the '{@link #getLienOui() <em>Lien Oui</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienOui()
	 * @generated
	 * @ordered
	 */
	protected Pointable lienOui;

	/**
	 * The cached value of the '{@link #getLienNon() <em>Lien Non</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienNon()
	 * @generated
	 * @ordered
	 */
	protected Pointable lienNon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionOuiNonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnairePackage.Literals.QUESTION_OUI_NON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pointable getLienOui() {
		if (lienOui != null && lienOui.eIsProxy()) {
			InternalEObject oldLienOui = (InternalEObject)lienOui;
			lienOui = (Pointable)eResolveProxy(oldLienOui);
			if (lienOui != oldLienOui) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuestionnairePackage.QUESTION_OUI_NON__LIEN_OUI, oldLienOui, lienOui));
			}
		}
		return lienOui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pointable basicGetLienOui() {
		return lienOui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLienOui(Pointable newLienOui) {
		Pointable oldLienOui = lienOui;
		lienOui = newLienOui;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTION_OUI_NON__LIEN_OUI, oldLienOui, lienOui));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pointable getLienNon() {
		if (lienNon != null && lienNon.eIsProxy()) {
			InternalEObject oldLienNon = (InternalEObject)lienNon;
			lienNon = (Pointable)eResolveProxy(oldLienNon);
			if (lienNon != oldLienNon) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuestionnairePackage.QUESTION_OUI_NON__LIEN_NON, oldLienNon, lienNon));
			}
		}
		return lienNon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pointable basicGetLienNon() {
		return lienNon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLienNon(Pointable newLienNon) {
		Pointable oldLienNon = lienNon;
		lienNon = newLienNon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTION_OUI_NON__LIEN_NON, oldLienNon, lienNon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuestionnairePackage.QUESTION_OUI_NON__LIEN_OUI:
				if (resolve) return getLienOui();
				return basicGetLienOui();
			case QuestionnairePackage.QUESTION_OUI_NON__LIEN_NON:
				if (resolve) return getLienNon();
				return basicGetLienNon();
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
			case QuestionnairePackage.QUESTION_OUI_NON__LIEN_OUI:
				setLienOui((Pointable)newValue);
				return;
			case QuestionnairePackage.QUESTION_OUI_NON__LIEN_NON:
				setLienNon((Pointable)newValue);
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
			case QuestionnairePackage.QUESTION_OUI_NON__LIEN_OUI:
				setLienOui((Pointable)null);
				return;
			case QuestionnairePackage.QUESTION_OUI_NON__LIEN_NON:
				setLienNon((Pointable)null);
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
			case QuestionnairePackage.QUESTION_OUI_NON__LIEN_OUI:
				return lienOui != null;
			case QuestionnairePackage.QUESTION_OUI_NON__LIEN_NON:
				return lienNon != null;
		}
		return super.eIsSet(featureID);
	}

} //QuestionOuiNonImpl

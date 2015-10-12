/**
 */
package questionnaire.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import questionnaire.LienSimple;
import questionnaire.LienSimpleSource;
import questionnaire.Pointable;
import questionnaire.QuestionnairePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lien Simple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionnaire.impl.LienSimpleImpl#getLienSimpleSource <em>Lien Simple Source</em>}</li>
 *   <li>{@link questionnaire.impl.LienSimpleImpl#getLienSimpleCible <em>Lien Simple Cible</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LienSimpleImpl extends EObjectImpl implements LienSimple {
	/**
	 * The cached value of the '{@link #getLienSimpleSource() <em>Lien Simple Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienSimpleSource()
	 * @generated
	 * @ordered
	 */
	protected LienSimpleSource lienSimpleSource;

	/**
	 * The cached value of the '{@link #getLienSimpleCible() <em>Lien Simple Cible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLienSimpleCible()
	 * @generated
	 * @ordered
	 */
	protected Pointable lienSimpleCible;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LienSimpleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnairePackage.Literals.LIEN_SIMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienSimpleSource getLienSimpleSource() {
		if (lienSimpleSource != null && lienSimpleSource.eIsProxy()) {
			InternalEObject oldLienSimpleSource = (InternalEObject)lienSimpleSource;
			lienSimpleSource = (LienSimpleSource)eResolveProxy(oldLienSimpleSource);
			if (lienSimpleSource != oldLienSimpleSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuestionnairePackage.LIEN_SIMPLE__LIEN_SIMPLE_SOURCE, oldLienSimpleSource, lienSimpleSource));
			}
		}
		return lienSimpleSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LienSimpleSource basicGetLienSimpleSource() {
		return lienSimpleSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLienSimpleSource(LienSimpleSource newLienSimpleSource) {
		LienSimpleSource oldLienSimpleSource = lienSimpleSource;
		lienSimpleSource = newLienSimpleSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.LIEN_SIMPLE__LIEN_SIMPLE_SOURCE, oldLienSimpleSource, lienSimpleSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pointable getLienSimpleCible() {
		if (lienSimpleCible != null && lienSimpleCible.eIsProxy()) {
			InternalEObject oldLienSimpleCible = (InternalEObject)lienSimpleCible;
			lienSimpleCible = (Pointable)eResolveProxy(oldLienSimpleCible);
			if (lienSimpleCible != oldLienSimpleCible) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuestionnairePackage.LIEN_SIMPLE__LIEN_SIMPLE_CIBLE, oldLienSimpleCible, lienSimpleCible));
			}
		}
		return lienSimpleCible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pointable basicGetLienSimpleCible() {
		return lienSimpleCible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLienSimpleCible(Pointable newLienSimpleCible) {
		Pointable oldLienSimpleCible = lienSimpleCible;
		lienSimpleCible = newLienSimpleCible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.LIEN_SIMPLE__LIEN_SIMPLE_CIBLE, oldLienSimpleCible, lienSimpleCible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuestionnairePackage.LIEN_SIMPLE__LIEN_SIMPLE_SOURCE:
				if (resolve) return getLienSimpleSource();
				return basicGetLienSimpleSource();
			case QuestionnairePackage.LIEN_SIMPLE__LIEN_SIMPLE_CIBLE:
				if (resolve) return getLienSimpleCible();
				return basicGetLienSimpleCible();
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
			case QuestionnairePackage.LIEN_SIMPLE__LIEN_SIMPLE_SOURCE:
				setLienSimpleSource((LienSimpleSource)newValue);
				return;
			case QuestionnairePackage.LIEN_SIMPLE__LIEN_SIMPLE_CIBLE:
				setLienSimpleCible((Pointable)newValue);
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
			case QuestionnairePackage.LIEN_SIMPLE__LIEN_SIMPLE_SOURCE:
				setLienSimpleSource((LienSimpleSource)null);
				return;
			case QuestionnairePackage.LIEN_SIMPLE__LIEN_SIMPLE_CIBLE:
				setLienSimpleCible((Pointable)null);
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
			case QuestionnairePackage.LIEN_SIMPLE__LIEN_SIMPLE_SOURCE:
				return lienSimpleSource != null;
			case QuestionnairePackage.LIEN_SIMPLE__LIEN_SIMPLE_CIBLE:
				return lienSimpleCible != null;
		}
		return super.eIsSet(featureID);
	}

} //LienSimpleImpl

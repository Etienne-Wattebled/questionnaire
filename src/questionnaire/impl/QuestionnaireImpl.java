/**
 */
package questionnaire.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import questionnaire.Composant;
import questionnaire.LienQuestionChoix;
import questionnaire.LienSimple;
import questionnaire.Questionnaire;
import questionnaire.QuestionnairePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link questionnaire.impl.QuestionnaireImpl#getComposants <em>Composants</em>}</li>
 *   <li>{@link questionnaire.impl.QuestionnaireImpl#getLiensQC <em>Liens QC</em>}</li>
 *   <li>{@link questionnaire.impl.QuestionnaireImpl#getLiensS <em>Liens S</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionnaireImpl extends EObjectImpl implements Questionnaire {
	/**
	 * The cached value of the '{@link #getComposants() <em>Composants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposants()
	 * @generated
	 * @ordered
	 */
	protected EList<Composant> composants;

	/**
	 * The cached value of the '{@link #getLiensQC() <em>Liens QC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiensQC()
	 * @generated
	 * @ordered
	 */
	protected EList<LienQuestionChoix> liensQC;

	/**
	 * The cached value of the '{@link #getLiensS() <em>Liens S</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiensS()
	 * @generated
	 * @ordered
	 */
	protected EList<LienSimple> liensS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuestionnairePackage.Literals.QUESTIONNAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Composant> getComposants() {
		if (composants == null) {
			composants = new EObjectContainmentEList<Composant>(Composant.class, this, QuestionnairePackage.QUESTIONNAIRE__COMPOSANTS);
		}
		return composants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LienQuestionChoix> getLiensQC() {
		if (liensQC == null) {
			liensQC = new EObjectContainmentEList<LienQuestionChoix>(LienQuestionChoix.class, this, QuestionnairePackage.QUESTIONNAIRE__LIENS_QC);
		}
		return liensQC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LienSimple> getLiensS() {
		if (liensS == null) {
			liensS = new EObjectContainmentEList<LienSimple>(LienSimple.class, this, QuestionnairePackage.QUESTIONNAIRE__LIENS_S);
		}
		return liensS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QuestionnairePackage.QUESTIONNAIRE__COMPOSANTS:
				return ((InternalEList<?>)getComposants()).basicRemove(otherEnd, msgs);
			case QuestionnairePackage.QUESTIONNAIRE__LIENS_QC:
				return ((InternalEList<?>)getLiensQC()).basicRemove(otherEnd, msgs);
			case QuestionnairePackage.QUESTIONNAIRE__LIENS_S:
				return ((InternalEList<?>)getLiensS()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuestionnairePackage.QUESTIONNAIRE__COMPOSANTS:
				return getComposants();
			case QuestionnairePackage.QUESTIONNAIRE__LIENS_QC:
				return getLiensQC();
			case QuestionnairePackage.QUESTIONNAIRE__LIENS_S:
				return getLiensS();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QuestionnairePackage.QUESTIONNAIRE__COMPOSANTS:
				getComposants().clear();
				getComposants().addAll((Collection<? extends Composant>)newValue);
				return;
			case QuestionnairePackage.QUESTIONNAIRE__LIENS_QC:
				getLiensQC().clear();
				getLiensQC().addAll((Collection<? extends LienQuestionChoix>)newValue);
				return;
			case QuestionnairePackage.QUESTIONNAIRE__LIENS_S:
				getLiensS().clear();
				getLiensS().addAll((Collection<? extends LienSimple>)newValue);
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
			case QuestionnairePackage.QUESTIONNAIRE__COMPOSANTS:
				getComposants().clear();
				return;
			case QuestionnairePackage.QUESTIONNAIRE__LIENS_QC:
				getLiensQC().clear();
				return;
			case QuestionnairePackage.QUESTIONNAIRE__LIENS_S:
				getLiensS().clear();
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
			case QuestionnairePackage.QUESTIONNAIRE__COMPOSANTS:
				return composants != null && !composants.isEmpty();
			case QuestionnairePackage.QUESTIONNAIRE__LIENS_QC:
				return liensQC != null && !liensQC.isEmpty();
			case QuestionnairePackage.QUESTIONNAIRE__LIENS_S:
				return liensS != null && !liensS.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireImpl

package com.bloc.statics.appliances;

import com.bloc.statics.PowerSupply;

public abstract class Appliance extends Object {
	
	static PowerSupply mPowerSupply;
	String mBrandName;
	String mSerialNumber;
	boolean mIsOn;

	/*
	 * performFunction
	 * The function of the appliance will be performed if it is
	 * turned on
	 *
	 * @return true if the function was performed
	 */
	public boolean performFunction() {
		if (isOn()) {
			_performFunction();
			return true;
		}
		return false;
	}

	/*
	 * _performFunction
	 * Protected abstract function to perform, subclasses must override
	 */
	protected abstract void _performFunction();

	/*
	 * flipPowerSwitch()
	 * Flips the power switch on the appliance. Off becomes
	 * on, on becomes off
	 */
	public void flipPowerSwitch() {
		mIsOn = !mIsOn;
	}

	/*
	 * isOn
	 * @return true if the power switch is flipped on and the appliance
	 * 		   is plugged in
	 */
	
	// Note that this doesn't work because this refers to an instance of the class that defines isOn.
	// Since isOn is static, it cannot use a reference this, as this is not guaranteed to be initialized. 

	public boolean isOn() {
		return mIsOn && mPowerSupply != null && mPowerSupply.hasAppliance(this);
	}

	/*
	 * plugIn
	 * Plug the appliance into the power supply
	 */
	public void plugIn() {
		if (mPowerSupply == null) {
			mPowerSupply = new PowerSupply();
		}
		if (!mPowerSupply.hasAppliance(this)) {
			mPowerSupply.plugAppliance(this);
		}
	}

	/*
	 * unplug
	 * Remove this appliance from the power supplys
	 */
	public void unplug() {
		if (mPowerSupply == null) {
			return;
		}
		mPowerSupply.unplugAppliance(this);
	}
}
package com.devesion.obd.command.diagnostic.sensors.units;

import com.devesion.obd.command.invoker.CommandResult;

/**
 * Represents Percentage Value Object.
 */
public class PercentageValue extends AbstractSensorCommandValue {

	public PercentageValue(CommandResult commandResult) {
		super(commandResult);
	}

	@Override
	protected float calculateValue() {
		int majorByte = getResultByteNumber(0);
		return (majorByte * 100.0f) / 255.0f;
	}
}
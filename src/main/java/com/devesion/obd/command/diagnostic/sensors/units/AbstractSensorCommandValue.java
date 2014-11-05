package com.devesion.obd.command.diagnostic.sensors.units;

import com.devesion.obd.command.invoker.CommandResult;

abstract class AbstractSensorCommandValue implements SensorCommandValue {

	private CommandResult commandResult;

	public AbstractSensorCommandValue(CommandResult commandResult) {
		this.commandResult = commandResult;
	}

	@Override
	public int getIntValue() {
		return (int) getFloatValue();
	}

	@Override
	public float getFloatValue() {
		return calculateValue();
	}

	protected int getResultByteNumber(int byteNumber) {
		return commandResult.getByteNumber(byteNumber);
	}

	protected abstract float calculateValue();

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("AbstractSensorCommandValue{");
		sb.append("intValue=").append(getIntValue()).append(", ");
		sb.append("floatValue=").append(getFloatValue());
		sb.append('}');
		return sb.toString();
	}
}
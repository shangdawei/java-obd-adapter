package com.devesion.obd.command.diagnostic;

import com.devesion.obd.shared.ObdNumberedEnum;
import lombok.Getter;

public enum DiagnosticCommandMode implements ObdNumberedEnum {
	SENSORS(1),
	TROUBLES(3),
	CLEAR(4),
	MONITORS(6),
	INFO(9);

	@Getter
	private int number;

	DiagnosticCommandMode(int number) {
		this.number = number;
	}
}

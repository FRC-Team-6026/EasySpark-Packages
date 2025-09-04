package com.drift.frc;

public class SparkMax {
    SparkMaxConfig config = new SparkMaxConfig();

    if (usage == Usage.kAll) {
        config.signals.primaryEncoderVelocityPeriodMs(20);
        config.signals.primaryEncoderPositionPeriodMs(20);
        config.signals.analogPositionPeriodMs(50);
    } else if (usage == Usage.kPositionOnly) {
        config.signals.primaryEncoderVelocityPeriodMs(500);
        config.signals.primaryEncoderPositionPeriodMs(20);
        config.signals.analogPositionPeriodMs(500);
    } else if (usage == Usage.kVelocityOnly) {
        config.signals.primaryEncoderVelocityPeriodMs(20);
        config.signals.primaryEncoderPositionPeriodMs(500);
        config.signals.analogPositionPeriodMs(500);
    } else if (usage == Usage.kMinimal) {
        config.signals.primaryEncoderVelocityPeriodMs(500);
        config.signals.primaryEncoderPositionPeriodMs(500);
        config.signals.analogPositionPeriodMs(500);
    }
}

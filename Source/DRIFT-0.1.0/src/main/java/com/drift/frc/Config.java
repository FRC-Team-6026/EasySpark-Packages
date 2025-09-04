package com.drift.frc;

import com.easyspark.frc.CANSparkMaxUtil.Usage;

public class Config {
    
    public Usage usage;
    public int currentLim;
    public double maxVoltage;
    public double gearRatio;
    public boolean invert;
    public IdleMode idleMode;
    public double minPosition;
    public double maxPosition;
    public double posConversion;
    public double velConversion;
    public double[] PID;
    public double voltageComp;

    public Config() {
        this.usage = Usage.kAll;
        this.currentLim = 40;
        this.maxVoltage = 1.0;
        this.voltageComp = 12.0;
        this.gearRatio = 1.0;
        this.invert = false;
        this.idleMode = IdleMode.kCoast;
        this.minPosition = 0;
        this.maxPosition = 0;
        this.posConversion = 1.0;
        this.velConversion = 1.0;
        this.PID = new double[] {0.0, 0.0, 0.0, 0.0};
    }
}

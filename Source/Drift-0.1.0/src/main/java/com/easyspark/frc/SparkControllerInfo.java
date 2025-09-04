package com.easyspark.frc;

import com.easyspark.frc.CANSparkMaxUtil.Usage;

import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

public class SparkControllerInfo {
    public Usage canbusUse;
    public int currentLim;
    public boolean invert;
    public IdleMode idleMode;
    public double posConversion;
    public double velConversion;
    public double[] pidList;
    public double voltageComp;

    public SparkControllerInfo scInfo;
    public EasySparkConstants constants;

    /**
     * Creates an object with all the info used to make an instance of a SparkMax. It uses the
     * EasySparkControllerInfo constructor to inject the EasySpark Constants into the SparkControllerInfo
     * object.
     */
    public SparkControllerInfo(EasySparkConstants constants) {
        EasySparkControllerInfo escInfo = new EasySparkControllerInfo(this, constants);

        // Redundant Code
        this.scInfo = escInfo.scInfo;
        this.constants = escInfo.constants;
    }
}

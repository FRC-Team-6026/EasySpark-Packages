package com.easyspark.frc;

import com.easyspark.frc.CANSparkMaxUtil.Usage;

import com.revrobotics.spark.SparkLowLevel;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkClosedLoopController;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkMaxConfig;
//import com.revrobotics.CANSparkBase.SoftLimitDirection;
import com.revrobotics.spark.SparkBase.ResetMode;

public class SparkController {
    public SparkMax spark;
    public RelativeEncoder sparkEncode;
    public SparkClosedLoopController sparkControl;
    public final int canbusNumber;
    private final Usage canbusUse;
    private final int currentLim;
    private final boolean invert;
    private final IdleMode idleMode;
    private final double posConversion;
    private final double velConversion;
    private final double[] pidList;
    private final double voltageComp;
    private double max = 1;
    private double min = -1;
    public double fLim = 0;
    public double bLim = 0;
    public boolean fEnable = false;
    public boolean bEnable = false;

    /* Creates and Configures the Sparkmax Controller*/
    public SparkController(int canbusNumber, SparkControllerInfo Info){
        this.canbusNumber = canbusNumber;
        this.canbusUse = Info.canbusUse;
        this.currentLim = Info.currentLim;
        this.invert = Info.invert;
        this.idleMode = Info.idleMode;
        this.posConversion = Info.posConversion;
        this.velConversion = Info.velConversion;
        this.pidList = Info.pidList;
        this.voltageComp = Info.voltageComp;
        spark = new SparkMax(canbusNumber, MotorType.kBrushless);
        sparkEncode = spark.getEncoder();
        sparkControl = spark.getClosedLoopController();
        configureSpark();
     }

    /* Creates and Configures the Sparkmax Controller Note: Pass null to N/A fields */
    public SparkController(int canbusNumber, SparkControllerInfo Info, Double min, Double max, Double fLim, Double bLim){
    this.canbusNumber = canbusNumber;
    this.canbusUse = Info.canbusUse;
    this.currentLim = Info.currentLim;
    this.invert = Info.invert;
    this.idleMode = Info.idleMode;
    this.posConversion = Info.posConversion;
    this.velConversion = Info.velConversion;
    this.pidList = Info.pidList;
    this.voltageComp = Info.voltageComp;
    
    if(max != null){
        this.max = max;
    }
    if(min != null){
        this.min = min;
    }
    if(fLim != null){
        this.fLim = fLim;
        fEnable = true;
    }
    if(bLim != null){
        this.bLim = bLim;
        bEnable = true;
    }

    spark = new SparkMax(canbusNumber, SparkLowLevel.MotorType.kBrushless);
    sparkEncode = spark.getEncoder();
    sparkControl = spark.getClosedLoopController();
    configureSpark();
    }

    /* Sets and Flashes the Sparkmax to Passed States */
    public void configureSpark() {
        SparkMaxConfig config = new SparkMaxConfig();

        CANSparkMaxUtil.setCANSparkMaxBusUsage(spark, canbusUse);
        
        config.smartCurrentLimit(currentLim)
            .inverted(invert)
            .idleMode(idleMode)
            .voltageCompensation(voltageComp);
        config.encoder.velocityConversionFactor(velConversion)
                    .positionConversionFactor(posConversion);
        config.closedLoop.pidf(pidList[0], pidList[1], pidList[2], pidList[3])
                    .outputRange(min, max);
        config.softLimit.forwardSoftLimit(fLim)
                    .reverseSoftLimit(bLim)
                    .forwardSoftLimitEnabled(fEnable)
                    .reverseSoftLimitEnabled(bEnable);
        
        spark.configure(config, ResetMode.kResetSafeParameters, null);
        spark.getEncoder().setPosition(0.0);
    }
    
}

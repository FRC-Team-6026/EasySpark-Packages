package com.easyspark.frc;

import com.ctre.phoenix6.hardware.CANcoder;
import edu.wpi.first.wpilibj.DutyCycleEncoder;

/**
 * This is a config object used to create an EasySpark instance.
 * 
 * @param id The ID used by the SparkMax on the CAN bus.
 * @param name The name given for the motor/subsystem.
 * @param escInfo This is the info used to create a SparkMax instance.
 * @param CANcoder A CANcoder object. Set to null by default.
 * @param DutyCycleEncoder An Absolute Encoder. Set to null by default.
 * 
 * @see EasySpark
 * @see EasySparkConstants
 */
public record EasySparkConfig(int id, String name, EasySparkControllerInfo escInfo, CANcoder CANcoder, DutyCycleEncoder DutyCycleEncoder) {

    /**
     * This is a config object used to create an EasySpark instance.
     * 
     * @param id The ID used by the SparkMax on the CAN bus.
     * @param name The name given for the motor/subsystem.
     * @param escInfo This is the info used to create a SparkMax instance.
     * @param CANcoder A CANcoder object. Set to null by default.
     * @param DutyCycleEncoder An Absolute Encoder. Set to null by default.
     * 
     * @see EasySpark
     * @see EasySparkConstants
     */
    public EasySparkConfig(int id, String name, EasySparkControllerInfo escInfo) {
        this(id, name, escInfo, null, null);
    }

    /**
     * This is a config object used to create an EasySpark instance.
     * 
     * @param id The ID used by the SparkMax on the CAN bus.
     * @param name The name given for the motor/subsystem.
     * @param escInfo This is the info used to create a SparkMax instance.
     * @param CANcoder A CANcoder object. Set to null by default.
     * @param DutyCycleEncoder An Absolute Encoder. Set to null by default.
     * 
     * @see EasySpark
     * @see EasySparkConstants
     */
    public EasySparkConfig(int id, String name, EasySparkControllerInfo escInfo, CANcoder CANcoder) {
        this(id, name, escInfo, CANcoder, null);
    }

    /**
     * This is a config object used to create an EasySpark instance.
     * 
     * @param id The ID used by the SparkMax on the CAN bus.
     * @param name The name given for the motor/subsystem.
     * @param escInfo This is the info used to create a SparkMax instance.
     * @param CANcoder A CANcoder object. Set to null by default.
     * @param DutyCycleEncoder An Absolute Encoder. Set to null by default.
     * 
     * @see EasySpark
     * @see EasySparkConstants
     */
    public EasySparkConfig(int id, String name, EasySparkControllerInfo escInfo, DutyCycleEncoder DutyCycleEncoder) {
        this(id, name, escInfo, null, DutyCycleEncoder);
    }

}

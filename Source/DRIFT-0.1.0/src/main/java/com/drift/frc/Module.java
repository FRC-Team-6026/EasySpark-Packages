package com.drift.frc;

import com.revrobotics.spark.SparkBase;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkClosedLoopController;

import edu.wpi.first.wpilibj.DutyCycleEncoder;
import com.ctre.phoenix6.hardware.CANcoder;
import com.drift.frc.utils.Parts.*;

public class Module {

    public int id;
    public String name;

    public Motor motor;
    public Controller controller;
    public Sensor encoder;
    
    /**
     * This creates an instance of EasySpark. It contains the SparkMax configuration mess
     * all in one neat-and-tidy package for immediate and easy use.
     * 
     * @param id Idk why you would need this but the ID is here.
     * @param name Same as above.
     * @param config Gives the constants of the motor/subsystem.
     * 
     * @param motor Is a SparkMax Object.
     * @param controller Returns the SparkController object of the SparkMax.
     * @param encoder Returns the RelativeEncoder of said SparkMax.
     * 
     * @see Config
     */
    public Module(int id, String name, Config config) {
        this.id = id;
        this.name = name;

        
    }

    public double getPos() {
        if (this.DutyCycleEncoder != null) {
            return this.DutyCycleEncoder.get();
        } else if (this.CANcoder != null) {
            return this.CANcoder.getAbsolutePosition().getValueAsDouble();
        } else {
            return this.encoder.getPosition();
        }
    }

    public double getVel() {
        if (this.CANcoder != null) {
            return this.CANcoder.getVelocity().getValueAsDouble() * 60;
        } else {
            return this.encoder.getVelocity();
        }
    }

    public void setDutyCycle(double percent) {
        percent = percent/100;
        PIDcontroller.setReference(percent, SparkBase.ControlType.kDutyCycle);
    }

    public void setVoltage(double voltage) {
        if(voltage < -constants.maxVoltage){
            voltage = -constants.maxVoltage;
        } else if (voltage > constants.maxVoltage){
            voltage = constants.maxVoltage;
        }
        PIDcontroller.setReference(voltage, SparkBase.ControlType.kVoltage);
    }

    public void setPosition(double position) {
        PIDcontroller.setReference(position, SparkMax.ControlType.kPosition);
    }
    
} 
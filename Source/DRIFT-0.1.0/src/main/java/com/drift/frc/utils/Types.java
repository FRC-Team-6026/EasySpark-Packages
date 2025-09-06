package com.drift.frc.utils;

public class Types {
    public enum Motor {
        REV_NEO,
        REV_NEO_550,
        REV_NEO_VORTEX,

        VEX_BAG,
        VEX_775PRO,
        VEX_FALCON_500,

        CTRE_KRAKEN_X60,

        ANDYMARK_REDLINE,
        ANDYMARK_CIM,
        ANDYMARK_MINICIM,

        DENSO_WINDOW_MOTOR,
        DENSO_SEAT_MOTOR,

        RS550,
        RS775
    }

    public enum Controller {
        INTEGRATED,

        REV_SPARK,
        REV_SPARK_MAX,
        REV_SPARK_FLEX,

        VEX_JAGUAR,

        CTRE_TALON_FX,
        CTRE_TALON_SRX,
        CTRE_VICTOR_SPX
    }

    public enum Sensor {
        INTEGRATED,

        REV_THROUGH_BORE,
        REV_MAGNETIC,

        VEX_OPTICAL,

        CTRE_CANCODER,

        USDIGITAL_E4T,
        USDIGITAL_E4P,
        USDIGITAL_S5,

        POTENTIOMETER
    }
}

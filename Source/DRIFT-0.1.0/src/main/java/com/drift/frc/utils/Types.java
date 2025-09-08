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
        RS775,

        GENERIC_BRUSHLESS,
        GENERIC_BRUSHED
    }

    public enum Controller {
        REV_SPARK,
        REV_SPARK_MAX,
        REV_SPARK_FLEX,
        REV_SPARK_MINI,

        VEX_JAGUAR,

        CTRE_TALON_FX,
        CTRE_TALON_SRX,
        CTRE_VICTOR_SPX,

        GENERIC_BRUSHLESS,
        GENERIC_BRUSHED
    }

    public enum Encoder {
        INTEGRATED,

        REV_THROUGH_BORE,
        REV_MAGNETIC,

        VEX_OPTICAL,

        CTRE_SRX_MAG,
        CTRE_CANCODER,

        ANDYMARK_MAG,
        ANDYMARK_CIMCODER,
        GRAYHILL_63R,
        MA3_ABSOLUTE,

        USDIGITAL_E4T,
        USDIGITAL_E4P,
        USDIGITAL_S5,

        DUTYCYCLE,
        QUADRATURE,
        ANALOG
    }
}

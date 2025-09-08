package com.drift.frc.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.drift.frc.utils.Types;

public class Compat {
    private static final Map<Types.Motor, Set<Types.Controller>> cCompat = new HashMap<>();
    private static final Map<Types.Motor, Set<Types.Encoder>> eCompat = new HashMap<>();

    public boolean checkController(Types.Motor motor, Types.Controller controller) {
        return cCompat.get(motor).contains(controller);
    }

    public boolean checkEncoder(Types.Motor motor, Types.Encoder encoder) {
        return eCompat.get(motor).contains(encoder);
    }

    static {
        // --- REV
        cCompat.put(Types.Motor.REV_NEO, Set.of(
            Types.Controller.REV_SPARK_MAX,
            Types.Controller.REV_SPARK_FLEX,
            Types.Controller.GENERIC_BRUSHLESS
        ));
        eCompat.put(Types.Motor.REV_NEO, Set.of(
            Types.Encoder.INTEGRATED,
            Types.Encoder.REV_THROUGH_BORE,
            Types.Encoder.REV_MAGNETIC,
            Types.Encoder.DUTYCYCLE,
            Types.Encoder.QUADRATURE,
            Types.Encoder.USDIGITAL_E4T,
            Types.Encoder.USDIGITAL_E4P,
            Types.Encoder.USDIGITAL_S5,
            Types.Encoder.MA3_ABSOLUTE,
            Types.Encoder.CTRE_CANCODER
        ));

        cCompat.put(Types.Motor.REV_NEO_550, Set.of(
            Types.Controller.REV_SPARK_MAX,
            Types.Controller.REV_SPARK_FLEX,
            Types.Controller.GENERIC_BRUSHLESS
        ));
        eCompat.put(Types.Motor.REV_NEO_550, Set.of(
            Types.Encoder.INTEGRATED,
            Types.Encoder.REV_THROUGH_BORE,
            Types.Encoder.REV_MAGNETIC,
            Types.Encoder.DUTYCYCLE,
            Types.Encoder.QUADRATURE,
            Types.Encoder.USDIGITAL_E4T,
            Types.Encoder.USDIGITAL_E4P,
            Types.Encoder.USDIGITAL_S5,
            Types.Encoder.MA3_ABSOLUTE,
            Types.Encoder.CTRE_CANCODER
        ));

        cCompat.put(Types.Motor.REV_NEO_VORTEX, Set.of(
            Types.Controller.REV_SPARK_MAX,
            Types.Controller.REV_SPARK_FLEX,
            Types.Controller.GENERIC_BRUSHLESS
        ));
        eCompat.put(Types.Motor.REV_NEO_VORTEX, Set.of(
            Types.Encoder.INTEGRATED,
            Types.Encoder.REV_THROUGH_BORE,
            Types.Encoder.REV_MAGNETIC,
            Types.Encoder.DUTYCYCLE,
            Types.Encoder.QUADRATURE,
            Types.Encoder.USDIGITAL_E4T,
            Types.Encoder.USDIGITAL_E4P,
            Types.Encoder.USDIGITAL_S5,
            Types.Encoder.MA3_ABSOLUTE,
            Types.Encoder.CTRE_CANCODER
        ));

        // --- VEX
        cCompat.put(Types.Motor.VEX_BAG, Set.of(
            Types.Controller.REV_SPARK,
            Types.Controller.REV_SPARK_MAX,
            Types.Controller.REV_SPARK_FLEX,
            Types.Controller.REV_SPARK_MINI,
            Types.Controller.VEX_JAGUAR,
            Types.Controller.CTRE_TALON_SRX,
            Types.Controller.CTRE_VICTOR_SPX,
            Types.Controller.GENERIC_BRUSHED
        ));
        eCompat.put(Types.Motor.VEX_BAG, Set.of(
            Types.Encoder.DUTYCYCLE,
            Types.Encoder.QUADRATURE,
            Types.Encoder.ANALOG,
            Types.Encoder.USDIGITAL_E4T,
            Types.Encoder.USDIGITAL_E4P,
            Types.Encoder.USDIGITAL_S5,
            Types.Encoder.CTRE_SRX_MAG,
            Types.Encoder.VEX_OPTICAL,
            Types.Encoder.CTRE_CANCODER
        ));

        cCompat.put(Types.Motor.VEX_775PRO, Set.of(
            Types.Controller.REV_SPARK,
            Types.Controller.REV_SPARK_MAX,
            Types.Controller.REV_SPARK_FLEX,
            Types.Controller.REV_SPARK_MINI,
            Types.Controller.VEX_JAGUAR,
            Types.Controller.CTRE_TALON_SRX,
            Types.Controller.CTRE_VICTOR_SPX,
            Types.Controller.GENERIC_BRUSHED
        ));
        eCompat.put(Types.Motor.VEX_775PRO, Set.of(
            Types.Encoder.DUTYCYCLE,
            Types.Encoder.QUADRATURE,
            Types.Encoder.ANALOG,
            Types.Encoder.USDIGITAL_E4T,
            Types.Encoder.USDIGITAL_E4P,
            Types.Encoder.USDIGITAL_S5,
            Types.Encoder.ANDYMARK_MAG,
            Types.Encoder.GRAYHILL_63R,
            Types.Encoder.CTRE_SRX_MAG,
            Types.Encoder.CTRE_CANCODER
        ));

        cCompat.put(Types.Motor.VEX_FALCON_500, Set.of(
            Types.Controller.CTRE_TALON_FX
        ));
        eCompat.put(Types.Motor.VEX_FALCON_500, Set.of(
            Types.Encoder.INTEGRATED,
            Types.Encoder.CTRE_CANCODER
        ));

        // --- CTRE
        cCompat.put(Types.Motor.CTRE_KRAKEN_X60, Set.of(
            Types.Controller.CTRE_TALON_FX
        ));
        eCompat.put(Types.Motor.CTRE_KRAKEN_X60, Set.of(
            Types.Encoder.INTEGRATED,
            Types.Encoder.CTRE_CANCODER
        ));

        // --- AndyMark
        cCompat.put(Types.Motor.ANDYMARK_REDLINE, Set.of(
            Types.Controller.REV_SPARK,
            Types.Controller.REV_SPARK_MAX,
            Types.Controller.REV_SPARK_MINI,
            Types.Controller.VEX_JAGUAR,
            Types.Controller.CTRE_TALON_SRX,
            Types.Controller.CTRE_VICTOR_SPX,
            Types.Controller.GENERIC_BRUSHED
        ));
        eCompat.put(Types.Motor.ANDYMARK_REDLINE, Set.of(
            Types.Encoder.DUTYCYCLE,
            Types.Encoder.QUADRATURE,
            Types.Encoder.ANALOG,
            Types.Encoder.USDIGITAL_E4T,
            Types.Encoder.USDIGITAL_E4P,
            Types.Encoder.USDIGITAL_S5,
            Types.Encoder.ANDYMARK_MAG,
            Types.Encoder.GRAYHILL_63R,
            Types.Encoder.CTRE_CANCODER
        ));

        cCompat.put(Types.Motor.ANDYMARK_CIM, Set.of(
            Types.Controller.REV_SPARK,
            Types.Controller.REV_SPARK_MAX,
            Types.Controller.CTRE_TALON_SRX,
            Types.Controller.CTRE_VICTOR_SPX,
            Types.Controller.GENERIC_BRUSHED
        ));
        eCompat.put(Types.Motor.ANDYMARK_CIM, Set.of(
            Types.Encoder.ANDYMARK_CIMCODER,
            Types.Encoder.ANDYMARK_MAG,
            Types.Encoder.DUTYCYCLE,
            Types.Encoder.QUADRATURE,
            Types.Encoder.ANALOG,
            Types.Encoder.GRAYHILL_63R,
            Types.Encoder.USDIGITAL_E4T,
            Types.Encoder.CTRE_SRX_MAG,
            Types.Encoder.CTRE_CANCODER
        ));

        cCompat.put(Types.Motor.ANDYMARK_MINICIM, Set.of(
            Types.Controller.REV_SPARK,
            Types.Controller.REV_SPARK_MAX,
            Types.Controller.CTRE_TALON_SRX,
            Types.Controller.CTRE_VICTOR_SPX,
            Types.Controller.GENERIC_BRUSHED
        ));
        eCompat.put(Types.Motor.ANDYMARK_MINICIM, Set.of(
            Types.Encoder.ANDYMARK_CIMCODER,
            Types.Encoder.ANDYMARK_MAG,
            Types.Encoder.DUTYCYCLE,
            Types.Encoder.QUADRATURE,
            Types.Encoder.ANALOG,
            Types.Encoder.GRAYHILL_63R,
            Types.Encoder.USDIGITAL_E4T,
            Types.Encoder.CTRE_SRX_MAG,
            Types.Encoder.CTRE_CANCODER
        ));

        // --- Denso
        cCompat.put(Types.Motor.DENSO_WINDOW_MOTOR, Set.of(
            Types.Controller.REV_SPARK,
            Types.Controller.REV_SPARK_MAX,
            Types.Controller.REV_SPARK_MINI,
            Types.Controller.CTRE_TALON_SRX,
            Types.Controller.CTRE_VICTOR_SPX,
            Types.Controller.GENERIC_BRUSHED
        ));
        eCompat.put(Types.Motor.DENSO_WINDOW_MOTOR, Set.of(
            Types.Encoder.DUTYCYCLE,
            Types.Encoder.QUADRATURE,
            Types.Encoder.ANALOG,
            Types.Encoder.USDIGITAL_E4T,
            Types.Encoder.GRAYHILL_63R,
            Types.Encoder.MA3_ABSOLUTE,
            Types.Encoder.CTRE_CANCODER
        ));

        cCompat.put(Types.Motor.DENSO_SEAT_MOTOR, Set.of(
            Types.Controller.REV_SPARK,
            Types.Controller.REV_SPARK_MAX,
            Types.Controller.REV_SPARK_MINI,
            Types.Controller.CTRE_TALON_SRX,
            Types.Controller.CTRE_VICTOR_SPX,
            Types.Controller.GENERIC_BRUSHED
        ));
        eCompat.put(Types.Motor.DENSO_SEAT_MOTOR, Set.of(
            Types.Encoder.DUTYCYCLE,
            Types.Encoder.QUADRATURE,
            Types.Encoder.ANALOG,
            Types.Encoder.USDIGITAL_E4T,
            Types.Encoder.GRAYHILL_63R,
            Types.Encoder.MA3_ABSOLUTE,
            Types.Encoder.CTRE_CANCODER
        ));

        // --- Generics
        cCompat.put(Types.Motor.RS550, Set.of(
            Types.Controller.REV_SPARK,
            Types.Controller.REV_SPARK_MAX,
            Types.Controller.REV_SPARK_MINI,
            Types.Controller.CTRE_TALON_SRX,
            Types.Controller.CTRE_VICTOR_SPX,
            Types.Controller.GENERIC_BRUSHED
        ));
        eCompat.put(Types.Motor.RS550, Set.of(
            Types.Encoder.DUTYCYCLE,
            Types.Encoder.QUADRATURE,
            Types.Encoder.ANALOG,
            Types.Encoder.USDIGITAL_E4T,
            Types.Encoder.USDIGITAL_E4P,
            Types.Encoder.USDIGITAL_S5,
            Types.Encoder.GRAYHILL_63R,
            Types.Encoder.CTRE_CANCODER
        ));

        cCompat.put(Types.Motor.RS775, Set.of(
            Types.Controller.REV_SPARK,
            Types.Controller.REV_SPARK_MAX,
            Types.Controller.REV_SPARK_MINI,
            Types.Controller.CTRE_TALON_SRX,
            Types.Controller.CTRE_VICTOR_SPX,
            Types.Controller.GENERIC_BRUSHED
        ));
        eCompat.put(Types.Motor.RS775, Set.of(
            Types.Encoder.DUTYCYCLE,
            Types.Encoder.QUADRATURE,
            Types.Encoder.ANALOG,
            Types.Encoder.USDIGITAL_E4T,
            Types.Encoder.USDIGITAL_E4P,
            Types.Encoder.USDIGITAL_S5,
            Types.Encoder.GRAYHILL_63R,
            Types.Encoder.CTRE_CANCODER
        ));

        cCompat.put(Types.Motor.GENERIC_BRUSHLESS, Set.of(
            Types.Controller.REV_SPARK,
            Types.Controller.REV_SPARK_FLEX,
            Types.Controller.GENERIC_BRUSHLESS
        ));
        eCompat.put(Types.Motor.GENERIC_BRUSHLESS, Set.of(
            Types.Encoder.INTEGRATED,
            Types.Encoder.DUTYCYCLE,
            Types.Encoder.QUADRATURE,
            Types.Encoder.ANALOG,
            Types.Encoder.USDIGITAL_E4T,
            Types.Encoder.USDIGITAL_E4P,
            Types.Encoder.USDIGITAL_S5,
            Types.Encoder.MA3_ABSOLUTE,
            Types.Encoder.CTRE_CANCODER
        ));

        cCompat.put(Types.Motor.GENERIC_BRUSHED, Set.of(
            Types.Controller.REV_SPARK,
            Types.Controller.REV_SPARK_MAX,
            Types.Controller.REV_SPARK_MINI,
            Types.Controller.CTRE_TALON_SRX,
            Types.Controller.CTRE_VICTOR_SPX,
            Types.Controller.GENERIC_BRUSHED
        ));
        eCompat.put(Types.Motor.GENERIC_BRUSHED, Set.of(
            Types.Encoder.DUTYCYCLE,
            Types.Encoder.QUADRATURE,
            Types.Encoder.ANALOG,
            Types.Encoder.USDIGITAL_E4T,
            Types.Encoder.USDIGITAL_E4P,
            Types.Encoder.USDIGITAL_S5,
            Types.Encoder.GRAYHILL_63R,
            Types.Encoder.CTRE_SRX_MAG,
            Types.Encoder.CTRE_CANCODER
        ));
    }
}
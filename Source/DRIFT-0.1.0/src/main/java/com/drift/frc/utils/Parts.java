package com.drift.frc.utils;

import java.util.*;

import com.drift.frc.utils.Types;

public class Parts {
    private Motor motor;
    private Controller controller;
    private Encoder encoder;

    public void Validate(Types.Motor motorType, Types.Controller controllerType, Types.Encoder encoderType) {
        if (!Compat.checkController(motorType, controllerType)) {
            Console.critical.add("Motor Type \"" + motorType + "\" incompatible with Controller Type \"" + controllerType + "\"");
        }
        if (!Compat.checkEncoder(motorType, encoderType)) {
            Console.critical.add("Motor Type \"" + motorType + "\" incompatible with Encoder Type \"" + encoderType + "\"");
        }
        Console.Print();
    }

    public void CreateModule(Types.Motor motorType, Types.Controller controllerType, Types.Encoder encoderType) {
        motor = new Motor();
        controller = new Controller();
        encoder = new Encoder();
    }

    public class Motor {

    }

    public class Controller {
        
    }

    public class Encoder {
        
    }
}

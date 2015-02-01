package org.usfirst.frc2557.d2015d.subsystems;

import org.usfirst.frc2557.d2015d.RobotMap;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LimitSwitch extends Subsystem {
    DigitalOutput LimitSwitch = RobotMap.limitswitch;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}


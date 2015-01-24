package org.usfirst.frc2557.d2015d.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc2557.d2015d.Robot;
import org.usfirst.frc2557.d2015d.RobotMap;
import java.lang.Math.*;
import edu.wpi.first.wpilibj.Encoder;
/**
 *
 */
public class EncoderCorrection extends Command {

    public EncoderCorrection() {
    	double speed;
    	requires(Robot.Encoding);
    	requires(Robot.drivetrain);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    // Increments repeatedly to stay straight
    protected void execute() {
    	if(Robot.oi.joystick1.getY() < .1 && RobotMap.leftFront.get() > RobotMap.rightFront.get()){
    	double speed = RobotMap.drivetrainSpeedController4.get() + .01;
    	RobotMap.drivetrainSpeedController4.set(speed);
    	}
    	if(Robot.oi.joystick1.getY() < .1 && RobotMap.rightFront.get() > RobotMap.leftFront.get()){
        double speed = RobotMap.drivetrainSpeedController1.get() + .01;
        RobotMap.drivetrainSpeedController1.set(speed);
    	}
    	if(Robot.oi.joystick1.getY() < .1 && RobotMap.leftBack.get() > RobotMap.rightBack.get()){
        double speed = RobotMap.drivetrainSpeedController3.get() + .01;
        RobotMap.drivetrainSpeedController3.set(speed);
    	}
    	if(Robot.oi.joystick1.getY() < .1 && RobotMap.rightBack.get() > RobotMap.leftBack.get()){
        double speed = RobotMap.drivetrainSpeedController2.get() + .01;
        RobotMap.drivetrainSpeedController2.set(speed);
        }
    	if(Robot.oi.joystick1.getX() < .1 && RobotMap.leftFront.get() > RobotMap.rightBack.get()){
        double speed = RobotMap.drivetrainSpeedController3.get() + .01;
        RobotMap.drivetrainSpeedController3.set(speed);
    	}
    	if(Robot.oi.joystick1.getX() < .1 && RobotMap.rightFront.get() > RobotMap.leftBack.get()){
        double speed = RobotMap.drivetrainSpeedController2.get() + .01;
        RobotMap.drivetrainSpeedController2.set(speed);
    	}
    	if(Robot.oi.joystick1.getX() < .1 && RobotMap.leftBack.get() > RobotMap.rightFront.get()){
        double speed = RobotMap.drivetrainSpeedController4.get() + .01;
        RobotMap.drivetrainSpeedController4.set(speed);
    	}
    	if(Robot.oi.joystick1.getX() < .1 && RobotMap.rightBack.get() > RobotMap.leftFront.get()){
        double speed = RobotMap.drivetrainSpeedController1.get() + .01;
        RobotMap.drivetrainSpeedController1.set(speed);
    	}
    	}
	// Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

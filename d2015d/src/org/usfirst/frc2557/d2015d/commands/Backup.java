package org.usfirst.frc2557.d2015d.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc2557.d2015d.Robot;
import org.usfirst.frc2557.d2015d.RobotMap;
import edu.wpi.first.wpilibj.Encoder;


/**
 *
 */
public class Backup extends Command {

    public Backup() {
    	requires(Robot.drivetrain);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    // Backs up until all wheels reach 30 rotations
    protected void execute() {
    		 RobotMap.time.reset();
    		 RobotMap.time.start();
    		 if(RobotMap.leftFront.get() < 30 && RobotMap.rightFront.get() < 30 && RobotMap.leftBack.get() < 30 && RobotMap.rightBack.get() < 30){
    		 //Robot.drivetrain.mecanumDrive_Cartesian123(x, y, rotation, gyroAngle);
    		 Robot.drivetrain.mecanumDrive_Cartesian123(0,-1,0,0);
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

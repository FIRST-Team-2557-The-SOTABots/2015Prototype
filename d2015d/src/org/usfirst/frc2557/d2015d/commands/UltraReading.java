package org.usfirst.frc2557.d2015d.commands;

import org.usfirst.frc2557.d2015d.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc2557.d2015d.RobotMap;

/**
 *
 */
public class UltraReading extends Command {

    public UltraReading() {
    	requires(Robot.location);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    // Both front ultrasonic sensors scan to see which side is more adequately covered
    // The robot then moves away from that side until both sides are covered equally
    protected void execute() {
     
     while(RobotMap.ultra.getRangeInches() > 30){
    	 Robot.drivetrain.mecanumDrive_Cartesian123(0,1,0,0); //Should be right
    	 
     while(RobotMap.ultra2.getRangeInches() > 30){
    	 Robot.drivetrain.mecanumDrive_Cartesian123(0,-1,0,0); //Should be left
     }
     }
    	
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

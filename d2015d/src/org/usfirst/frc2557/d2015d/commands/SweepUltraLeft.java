package org.usfirst.frc2557.d2015d.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc2557.d2015d.Robot;

import org.usfirst.frc2557.d2015d.RobotMap;

/**
 *
 */
public class SweepUltraLeft extends Command {
	private double x;


    public SweepUltraLeft() {
    	requires(Robot.Servos);
    	requires(Robot.location);

        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	x = RobotMap.leftServo.getAngle();
    }

    // Called repeatedly when this Command is scheduled to run
    // The third ultrasonic sensor(the one on the left) pans to find which side is more adequately covered;
    // The robot then moves away from that side until both sides are covered equally
    protected void execute() {
    	RobotMap.leftServo.setAngle(85);
    	while(RobotMap.ultra3.getRangeInches() > 30){
    		 Robot.drivetrain.mecanumDrive_Cartesian123(1,0,0,0);
    }
    	
    	RobotMap.leftServo.setAngle(95);
    	while(RobotMap.ultra3.getRangeInches() > 30){
    		Robot.drivetrain.mecanumDrive_Cartesian123(-1,0,0,0);
    	
    	RobotMap.leftServo.setAngle(x);

    		
    	
    		}
    	RobotMap.leftServo.setAngle(x);

    	
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

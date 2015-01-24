package org.usfirst.frc2557.d2015d.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2557.d2015d.Robot;
import org.usfirst.frc2557.d2015d.RobotMap;

/**
 *
 */
public class SetBins extends Command {

    public SetBins() {
    	requires(Robot.elevator);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    // Sets down ALL bins carried by the robot
    protected void execute() {
    	RobotMap.time.reset();
    	RobotMap.time.start();
    	if(RobotMap.time.get() < 2){
    		RobotMap.liftBinsController.set(-1);
    		
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

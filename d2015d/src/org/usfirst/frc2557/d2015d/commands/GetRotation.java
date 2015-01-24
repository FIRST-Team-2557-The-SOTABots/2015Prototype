package org.usfirst.frc2557.d2015d.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2557.d2015d.RobotMap;
import org.usfirst.frc2557.d2015d.Robot;


/**
 *
 */
public class GetRotation extends Command {

    public GetRotation() {
    	requires(Robot.location);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    // Gets the current angle of the gyro (and therefore of the robot)
    protected void execute() {
    	System.out.println(RobotMap.locationGyro.getAngle());
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

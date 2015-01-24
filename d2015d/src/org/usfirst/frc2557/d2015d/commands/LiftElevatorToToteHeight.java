package org.usfirst.frc2557.d2015d.commands;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc2557.d2015d.Robot;
import org.usfirst.frc2557.d2015d.RobotMap;

/**
 *
 */
public class LiftElevatorToToteHeight extends Command {

    public LiftElevatorToToteHeight() {
    	requires(Robot.elevator);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    // Brings elevator to the height of the bins
    protected void execute() {
    	while(RobotMap.liftEncoder.get() < 312){
    		RobotMap.elevatorElevatorController.set(1);
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

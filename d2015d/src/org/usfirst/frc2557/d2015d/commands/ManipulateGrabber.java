package org.usfirst.frc2557.d2015d.commands;

import org.usfirst.frc2557.d2015d.Robot;
import org.usfirst.frc2557.d2015d.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ManipulateGrabber extends Command {

    public ManipulateGrabber() {
    	//requires(pneumatics);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    // Opens the grabber solenoid
    protected void execute(Value on) {
    /*	if(RobotMap.grasper.get()) = on;
    		RobotMap.grasper.set(off);
    	if(RobotMap.grasper.get()) = off;
    		RobotMap.grasper.set(on);
    */}

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

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}
}

       package org.usfirst.frc2557.d2015d.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;


import org.usfirst.frc2557.d2015d.Robot;

import org.usfirst.frc2557.d2015d.commands.ChangeServoAngle;
/**
 *
 */
public class Autonomous extends CommandGroup {
    
    public  Autonomous() {
    	requires(Robot.location);
    	requires(Robot.drivetrain);
    	requires(Robot.Servos);
    	
    	// Close the grabber on the middle tote
    	//addSequential(new CloseGrabber());
    	// Lift the first tote (lift1)
    	addParallel(new LiftElevator());
    	// Backup until the robot hits the right bin
    	addSequential(new DriveTo(0,-1,0,0));
    	// Find the position of the bins
    	addSequential(new UltraReadingBack());
    	// Lift the right bin (lift2) (ADD HEIGHT ARGUMENT!!!!!!!!!!!!!!!!!!!)
    	addSequential(new LiftBins());
    	// Rotate left sensor to face left
    	addParallel(new ChangeServoAngle());
    	// Rotate 180 degrees so that robot is facing right side
    	addSequential(new DriveTo(0,0,.5,0));
    	// Moves forward toward right side into right tote
    	addSequential(new DriveTo(0,1,0,0));
    	// Open grabber
    	addSequential(new ManipulateGrabber());
    	// Pick up bottom tote
    	addSequential(new SetElevator());
    	// Lift both totes
    	//addSequential(new CloseGrabber());
    	addParallel(new LiftElevator());
    	// Turn 90 degrees left
    	addSequential(new DriveTo(0,0,-.25,0));
    	// Move left to middle bin
    	addSequential(new DriveTo(-1,0,0,0));
    	// Find the bin's position with ultrasonic sensors
    	addSequential(new SweepUltraLeft());
    	// Pick up middle bin with lift 2
    	addSequential(new LiftBins());
    	// Turn 90 degrees right
    	addSequential(new DriveTo(0,0,.25,0));
    	// Go forward to hit the left tote (same as first tote)
    	addSequential(new DriveTo(0,1,0,0));
    	//Lift tote
    	addSequential(new LiftElevator());
    	// Turn 90 degrees left
    	addSequential(new DriveTo(0,0,-.25,0));
    	// Find the bin's position with ultrasonic sensors
    	addParallel(new SweepUltraRight());
    	// Pick up last bin
    	addSequential(new LiftBins());
    	// Back up into scoring zone
    	addSequential(new Backup());
    	// Drop totes (not bins)
    	addSequential(new ManipulateGrabber());
    	// Back up at least 3 inches
    	addSequential(new Backup());
    	
    	
    	
    	
   
    	
    
    	
    	
    	
    	
    	
    	
    	
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}

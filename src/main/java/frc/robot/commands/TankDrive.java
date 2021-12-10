// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class TankDrive extends CommandBase {
  /* (INFO 2G) Like we want to state all the hardware, when we have a command (an action we want the robot to do),
  we want to start by creating all the fields. For this case we want to list all the things we need for this command
  to run. To drive the robot, we need the mechanism that drives the robot aka the drivetrain. We also need the leftpower
  and rightpower that we are giving to the motors to make it move. Declare your fields by typing private <type of object> <name of object>;
  For drivetrain, the type is Drivetrain and for power its DoubleSupplier. */
  private Drivetrain drivetrain;

  private DoubleSupplier leftPower;

  /* (TASK 2H) Create the field for right power below */
  
  

  /* (TASK 2I) Now that we have our fields, we have to ask for all the information we don't have. This file doesn't
  know where the drivetrain is or what the values of leftpower or rightpower so we ask for these things in the parathesis (parameters),
  we already are asking for drivetrain and leftpower. Please also ask for rightpower.*/
  public TankDrive(Drivetrain drivetrain, DoubleSupplier leftPower) {

    /* (INFO 2J) We want to store all the information we just obtained, we do this by typing 
    this.<field name> = <parameter name>; */
    this.drivetrain = drivetrain;
    this.leftPower = leftPower;
    
    /* (TASK 2K) Store right power */
    

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    /* (TASK 2L) This is code that runs at the start.
    Set motors to start by not moving at the start */
    drivetrain.tankDrive(0);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    /* (TASK 2M) This is code that runs repeadily so 
    lets give tankDrive leftPower and rightPower we are getting as input here */
    drivetrain.tankDrive(leftPower.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    /* (TASK 2N) This is code that runs at the end. So lets tell the robot to stop running.
    Make the right wheel stop running as well */
    drivetrain.tankDrive(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    /* (INFO 2O) This is what figures out when to stop the command, this command is to drive the robot so we never
    want it to stop hence why we return false */
    return false;
  }
}

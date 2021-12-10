// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  /* (INFO 2A) This is creating the left motor for romi. This is important because
  we want to express our hardware in code. The first step to doing that is by writing this
  line of code which defines all the hardware we are using and in Java we called these fields. */

  /* (INFO 2B) To create a motor, type private static final <motor type> <name of motor> = new <motor type>(<port number>); 
  The port number is where you plugged your motor to. For this robot, the left motor is plugged in at zero. */
  private static final Spark leftMotor = new Spark(0);

  /* !!! (TASK 2C) Please Create the Right Motor which is plugged in at port 1 below !!! */


  /** Creates a new RomiDrivetrain. */
  public Drivetrain() {
  }

  /* (TASK 2D) This is a method (a function) that helps drive the robot. There are many ways to drive a robot and this is
  tank drive. This is where the left joystick controls the left motor and the right joystick controls the right motor.
  We give the method the leftWheelSpeed and rightWheelSpeed and it uses that to move the robot. 
  Add rightWheelSpeed as a parameter.  */
  public void tankDrive(double leftWheelSpeed) {
    /* (INFO 2E) Moves the left wheel by using <name of motor>.set(<speed of motor>). The speed can be between -1 and 1.
    -1 is moving backwards at max speed and 1 is moving forward at max speed. */
    leftMotor.set(leftWheelSpeed);

    /* (TASK 2F) Move the right wheel using rightWheelSpeed below*/

  }

  /* (TASK 3A) Create a method for arcadeDrive here. Arcade drive is the other type of way you drive your robot and
  it is how you normally see it in racing games where one joystick controls driving. The y axis would be for driving
  forward and backwards and the x axis would be for turning. Follow how we did tank drive as a guide for formatting arcade drive. */


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}

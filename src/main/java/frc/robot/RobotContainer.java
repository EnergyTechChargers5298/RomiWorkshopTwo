// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import frc.robot.commands.TankDrive;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */

public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private static final Drivetrain drivetrain = new Drivetrain();

  // This defines a controller
  private static final XboxController controller = new XboxController(0);

  /* (TASK 2P) This initializes the tank drive command, to create a command you want to type 
  private static final <Command File Name> <Name of Command> = new <Name of Command>(<Everything that you ask for>); 
  Get the Y axis from the right joystick as input for the right wheel. */
  private static final TankDrive tankDrive = new TankDrive(drivetrain, () -> controller.getY(Hand.kLeft));

  /* (TASK 3C) Initialize your arcade drive here with the correct inputs you would need for arcade drive.
  It is x axis for turning and y axis for linear movement */

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
    configureAxesBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */

  /* Digital input goes here */
  private void configureButtonBindings() {

  }

  /* Analog input goes here */
  private void configureAxesBindings() {
    /* (TASK 3D) We are making tank drive the default command for drivetrain at the moment.
    But now we want to use arcadeDrive for driving so that should be the default command. 
    Change the default command here from tankDrive to your arcadeDrive. 
    There can only be one default command for each subsystem / mechanism */
    drivetrain.setDefaultCommand(tankDrive);
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }
}

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the
 * name of this class or
 * the package after creating this project, you must also update the
 * build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

 Joystick testJoystick;

 
 
  /**
   * This function is run when the robot is first started up and should be used
   * for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    testJoystick = new Joystick(0);
  }

  /**
   * This function is called every 20 ms, no matter the mode. Use this for items
   * like diagnostics
   * that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>
   * This runs after the mode specific periodic functions, but before LiveWindow
   * and
   * SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
     boolean Button = testJoystick.getRawButton(1);
    SmartDashboard.putBoolean("Jordan 5", Button);
  
    boolean pressed = testJoystick.getRawButtonPressed(1);
    SmartDashboard.putBoolean("Yurrrr", pressed);

    boolean released = testJoystick.getRawButtonReleased(1);
    SmartDashboard.putBoolean("Frrrrr", released);

    boolean otherButton = testJoystick.getRawButton(2);
    boolean otherPressed = testJoystick.getRawButtonPressed(2);
    boolean otherReleased = testJoystick.getRawButtonReleased(2);
    SmartDashboard.putBoolean("other Jordan 5", otherButton);
    SmartDashboard.putBoolean("other Yurrrr", otherPressed);
    SmartDashboard.putBoolean("other Frrrrr", otherReleased);


    double axis0 = testJoystick.getRawAxis(0);
    SmartDashboard.putNumber("Axis 0", axis0);

    int pov = testJoystick.getPOV();
    SmartDashboard.putNumber("POV", pov);
    
  }

  /** This function is called once when autonomous is enabled. */
  @Override
  public void autonomousInit() {}

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {}

  /** This function is called once when teleop is enabled. */
  @Override
  public void teleopInit() {}

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {}

  /** This function is called once when the robot is disabled. */
  @Override
  public void disabledInit() {}

  /** This function is called periodically when disabled. */
  @Override
  public void disabledPeriodic() {}

  /** This function is called once when test mode is enabled. */
  @Override
  public void testInit() {}

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {}

  /** This function is called once when the robot is first started up. */
  @Override
  public void simulationInit() {}

  /** This function is called periodically whilst in simulation. */
  @Override
  public void simulationPeriodic() {}
}

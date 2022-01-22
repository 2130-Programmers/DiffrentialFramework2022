// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.Drive;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  public DriveTrain() {}

  Victor l_motor1 = new Victor(0),  l_motor2 = new Victor(1), r_motor1 = new Victor(2), r_motor2 = new Victor(3);

  MotorControllerGroup leftMotors = new MotorControllerGroup(l_motor1, l_motor2);
  MotorControllerGroup rightMotors = new MotorControllerGroup(r_motor1, r_motor2);

  DifferentialDrive driveController = new DifferentialDrive(leftMotors, rightMotors);

  public void drive(double x, double y) {
    driveController.arcadeDrive(x, y);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

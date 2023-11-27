// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.slicelibs;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkMaxPIDController;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PositionalSubsystem extends SubsystemBase {

  protected CANSparkMax[] motors;
  protected RelativeEncoder[] encoders;
  protected SparkMaxPIDController[] controllers;

  /** Creates a new PositionalSubsystem. */
  public PositionalSubsystem(int[] ids, double P, double I, double D, double positionalFactor, double velocityFactor) {
    motors = new CANSparkMax[ids.length];
    encoders = new RelativeEncoder[ids.length];
    controllers = new SparkMaxPIDController[ids.length];
    for(int i=0; i<ids.length; i++){
      motors[i] = new CANSparkMax(ids[i], MotorType.kBrushless);
      encoders[i] = motors[i].getEncoder();
      controllers[i] = motors[i].getPIDController();
      controllers[i].setP(P);
      controllers[i].setI(I);
      controllers[i].setD(D);
      encoders[i].setPositionConversionFactor(positionalFactor);
      encoders[i].setVelocityConversionFactor(velocityFactor);
    }
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

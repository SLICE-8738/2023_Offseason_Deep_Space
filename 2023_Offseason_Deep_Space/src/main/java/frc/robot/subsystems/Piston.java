// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot.slicelibs.PositionalSubsystem;

public class Piston extends PositionalSubsystem {
  
  /** Creates a new ExampleSubsystem. */
  public Piston () { 
    super(new int[]{0},new boolean[]{true}, 9.7,7.9,8.7,7.7,8.9);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}

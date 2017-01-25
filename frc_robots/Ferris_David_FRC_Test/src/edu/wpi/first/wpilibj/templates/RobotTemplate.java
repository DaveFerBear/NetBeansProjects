/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.can.CANTimeoutException;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends IterativeRobot {

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     *
     *
     */
    Victor LeftRear;
    Victor RightRear;
    Victor LeftFront;
    Victor RightFront;
    Joystick driverStick = new Joystick(1);
    Victor Function1;
    //CANJaguar Function2;

    public void robotInit() {

        LeftFront = new Victor(1);
        LeftRear = new Victor(2);
        RightFront = new Victor(3);
        RightRear = new Victor(4);
        Function1 = new Victor(5);
      //  try {
           // Function2 = new CANJaguar(2);
     //   } catch (CANTimeoutException ex) {
    //        ex.printStackTrace();
      //  }

    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        
/*        if (driverStick.getRawButton(5)) { try {
                //Run intake in
Function2.setX(0.5);
            } catch (CANTimeoutException ex) {
                ex.printStackTrace();
            }

        } else if (driverStick.getRawButton(6)) //Run intake out
        {
            try {
                Function2.setX(-0.5);
            } catch (CANTimeoutException ex) {
                ex.printStackTrace();
            }

        } else {
            try {
                Function2.setX(0);
            } catch (CANTimeoutException ex) {
                ex.printStackTrace();
            }

        }
*/
        if (driverStick.getRawButton(7)) { //Run intake in
            Function1.set(0.5);

        } else if (driverStick.getRawButton(8)) //Run intake out
        {
            Function1.set(-0.5);

        } else {
            Function1.set(0);

        }

        double leftSpeed; //Variable for left side motor speed
        double rightSpeed; //Variable for right side motor speed

        leftSpeed = (driverStick.getRawAxis(3) - driverStick.getRawAxis(2)); //Left speed is the difference in the left and right sticks
        rightSpeed = (driverStick.getRawAxis(3) + driverStick.getRawAxis(2)); //Right Speed is the sum of the left and right sticks

        //Sets the drive to the according double
        LeftFront.set(leftSpeed * leftSpeed * leftSpeed); //Sets front left motor for double leftspeed
        LeftRear.set(leftSpeed * leftSpeed * leftSpeed); //Sets rear left motor for double leftspeed

        RightFront.set(rightSpeed * rightSpeed * rightSpeed); //Sets front right motor for double rightspeed
        RightRear.set(rightSpeed * rightSpeed * rightSpeed); //Sets rear right motor for double rightspeed

    }

    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    }
}

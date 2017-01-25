/*******************************************************************************
 * Copyright (c) 2001-2012 Mathew A. Nelson and Robocode contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://robocode.sourceforge.net/license/epl-v10.html
 *
 * Contributors:
 *     Mathew A. Nelson
 *     - Initial implementation
 *     Flemming N. Larsen
 *     - Maintainance
 *******************************************************************************/
package Ferris_David;


import robocode.HitRobotEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;
import java.awt.Color;
import robocode.WinEvent;

import java.awt.*;


/**
 * Walls - a sample robot by Mathew Nelson, and maintained by Flemming N. Larsen David Ferris Modification
 * <p/>
 * Moves around the outer edge with the gun facing in.
 */
public class Ferris_David_V3 extends Robot {

	boolean peek; // Don't turn if there's a robot there
	double moveAmount; // How much to move

	/**
	 * run: Move around the walls
	 */
	public void run() {
		// Sets robot colors
		setColors(null, Color.RED, new Color(150, 0, 150));

		// Initialize moveAmount to the maximum possible for this battlefield.
		moveAmount = Math.max(getBattleFieldWidth(), getBattleFieldHeight());
		// Initialize peek to false
		peek = false;

		turnLeft(getHeading() % 90 + 45); //Aligns the robot to 45 degrees
		ahead(moveAmount);
		// Turn the gun to turn right 90 degrees.
		peek = true;
		turnGunRight(90);
		turnLeft(90);

		while (true) {
			// Look before we turn when ahead() completes.
			peek = true;
			// Bounce off the wall
			ahead(moveAmount);
			// Don't look now
			peek = false;
			// Turn left off the next wall
			turnLeft(90);
			
		}
	}

	/**
	 * onHitRobot:  Move away a bit.
	 */
	public void onHitRobot(HitRobotEvent e) {
		// If he's in front of us, set back up a bit.
		if (e.getBearing() > -90 && e.getBearing() < 90) {
			back(100);
		} // else he's in back of us, so set ahead a bit.
		else {
			ahead(100);
		}
	}

	/**
	 * onScannedRobot:  Fire! (bullets of varying power)
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		
		turnGunRight(0); //Turns gun to the right to accomodate for enemy (clockwise) motion
		
		if (getEnergy() > 20){ //If energy is greater than 20 fire a bullet of power 3
		fire(3);
		}
		
		else if (getEnergy() > 10) { //If energy is greater than 10 fire a bullet of power 2
		fire(2); 
		}		

		else if (getEnergy() > 5) { //If energy is greater than 5 fire a bullet of power 1
		fire(1);
		}		

		else { //if my energy does not satisfy any of the above conditions, fire a bullet of power .5
		fire(.5);
		}
		
		// Note that scan is called automatically when the robot is moving.
		// By calling it manually here, we make sure we generate another scan event if there's a robot on the next
		// wall, so that we do not start moving up it until it's gone.
		if (peek) {
			scan();
		}
	}
	/**
	 * onWin:  Celebrate.
	 */
	 public void onWin(WinEvent e) { //if the robot wins, perfom a victory dance!
		
	 while (true){
		turnRight(5);
		ahead(5);
		
		}
		}
	}
							
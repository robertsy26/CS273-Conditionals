import java.awt.*;

/**
 * class Lab4Area - draws a robot whose appearance is customized based
 * on which boxes are checked.
 */
public class Lab4Area extends Lab4BaseArea {

    ////////////////////////////////////////////////////////////
    // paint - draws the frame's "art" on the screen
    //
    // calling sequence:
    //   paint(g); // called automatically when needed
    //
    // parameters:
    //   g - the graphics object on which to draw
    //
    // side-effects:
    //   causes the visible screen to be modified
    //
    // bugs/anomalies:
    //   (none known)
    ////////////////////////////////////////////////////////////
    
    /*
     * Keep in mind that when a box is checked or
     * uncheck in the main program, it calls the paint method every
     * time. This means that every print method call
     * in the added if-statements for this lab
     * will be called every time a box is checked/unchecked
     * in the main program.
     */
    
    /*
     * Importance:
     * 
     * It's important for students to know this so they
     * understand that the paint method is called
     * multiple times during the program if the user
     * checks/unchecks many boxes.
     */
    
    /*
     * Justification:
     * 
     * By placing this piece of the information, the student will
     * learn about the when the paint method is called as soon
     * as they open this file for the first time. By elaborating on
     * specifically the print method calls in the if-statements, the
     * students will know exactly when to recall the above comments.
     */

    public void paint(Graphics g) {
        // draw the robot's body (silver, for now)
        Color silver = new Color(192,192,192);
        g.setColor(silver);
        g.fillPolygon(body);

        // draw the robot's ears (pink, for now)
        Polygon myLeftEar = leftEar;
        Polygon myRightEar = rightEar;
        g.setColor(Color.PINK);
        g.fillPolygon(myLeftEar);
        g.fillPolygon(myRightEar);

        // draw the mouth (red, for now)
        Polygon myMouth = smileMouth;
        g.setColor(Color.RED);
        g.fillPolygon(myMouth);

        // draw the eyes (blue)
        Polygon myLeftEye = leftEye;
        Polygon myRightEye = rightEye;
        g.setColor(Color.BLUE);
        g.fillPolygon(myLeftEye);
        g.fillPolygon(myRightEye);

        // draw the robot's legs (green)
        Polygon myLeftLeg = leftLeg;
        Polygon myRightLeg = rightLeg;
        g.setColor(Color.GREEN);
        g.fillPolygon(myLeftLeg);
        g.fillPolygon(myRightLeg);

        // draw the robot's arms (black)
        Polygon myLeftArm = leftArm;
        Polygon myRightArm = rightArm;
        g.setColor(Color.BLACK);
        g.fillPolygon(myLeftArm);
        g.fillPolygon(myRightArm);
    }
}
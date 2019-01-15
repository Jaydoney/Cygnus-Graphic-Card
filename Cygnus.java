// The "Cygnus" class.
import java.awt.*;
import hsa.Console;

public class Cygnus
{
    static Console c;           // The output console

    Color star = new Color (247, 243, 195);
    static char character;

    public Cygnus ()
    {
	c = new Console (30, 50);
    }


    public void frontPage ()
    {
	for (int i = 0 ; i < 99 ; i++)
	{
	    c.setColor (new Color (110 - i, 99 - i, 178 - i));
	    c.fillRoundRect (0, 100 - i, 400, 498 - i, 30, 30);
	}
	c.setColor (Color.white);
	c.setFont (new Font ("Arial", 1, 18));
	c.drawString ("Created by Jason Reid", 110, 20);
	c.drawString ("April 5th, 2018", 150, 40);
	c.setColor (star);
	c.setFont (new Font ("Arial", 2, 35));
	c.drawString ("Cygnus - The Swan", 55, 200);
	c.fillStar (145, 250, 30, 30);
	c.fillStar (170, 225, 30, 30);
	c.fillStar (195, 250, 30, 30);
	c.fillStar (220, 225, 30, 30);
	c.fillStar (245, 250, 30, 30);
	character = c.getChar ();
	c.clear ();



    }


    public void backPage ()
    {

	for (int i = 0 ; i < 99 ; i++)
	{
	    c.setColor (new Color (110 - i, 99 - i, 178 - i));
	    c.fillRoundRect (0, 100 - i, 400, 498 - i, 30, 30);
	}

	c.setColor (Color.darkGray);
	c.fillRoundRect (20, 10, 360, 40, 30, 30);
	c.setColor (star);
	c.fillStar (25, 10, 20, 20);
	c.fillStar (360, 10, 20, 20);
	c.setFont (new Font ("Arial", 2, 35));
	c.drawString ("Cygnus - The Swan", 50, 40);
	c.fillOval (275, 70, 10, 10);
	c.fillStar (255, 130, 15, 15);
	c.fillStar (165, 110, 15, 15);
	c.fillStar (190, 175, 15, 15);
	c.fillStar (140, 225, 15, 15);
	c.fillOval (70, 250, 10, 10);
	c.fillOval (240, 235, 10, 10);
	c.fillOval (285, 305, 10, 10);
	c.fillStar (310, 325, 15, 15);

	c.fillOval (315, 177, 5, 5);
	c.fillOval (23, 65, 5, 5);
	c.fillOval (543, 75, 5, 5);
	c.fillOval (132, 85, 5, 5);
	c.fillOval (254, 95, 5, 5);
	c.fillOval (365, 105, 5, 5);
	c.fillOval (215, 115, 5, 5);
	c.fillOval (45, 125, 5, 5);
	c.fillOval (180, 135, 5, 5);
	c.fillOval (220, 145, 5, 5);
	c.fillOval (98, 155, 5, 5);
	c.fillOval (136, 165, 5, 5);
	c.fillOval (77, 175, 5, 5);
	c.fillOval (32, 185, 5, 5);
	c.fillOval (4, 195, 5, 5);
	c.fillOval (123, 205, 5, 5);
	c.fillOval (228, 215, 5, 5);
	c.fillOval (333, 225, 5, 5);
	c.fillOval (177, 235, 5, 5);
	c.fillOval (315, 245, 5, 5);
	c.fillOval (23, 255, 5, 5);
	c.fillOval (543, 265, 5, 5);
	c.fillOval (132, 275, 5, 5);
	c.fillOval (254, 285, 5, 5);
	c.fillOval (365, 295, 5, 5);
	c.fillOval (215, 305, 5, 5);
	c.fillOval (45, 315, 5, 5);
	c.fillOval (180, 70, 5, 5);
	c.fillOval (220, 100, 5, 5);
	c.fillOval (98, 130, 5, 5);
	c.fillOval (136, 160, 5, 5);
	c.fillOval (77, 190, 5, 5);
	c.fillOval (32, 220, 5, 5);
	c.fillOval (4, 250, 5, 5);
	c.fillOval (123, 280, 5, 5);
	c.fillOval (228, 310, 5, 5);
	c.fillOval (333, 99, 5, 5);
	c.fillOval (177, 77, 5, 5);


	c.setColor (Color.white);
	c.setFont (new Font ("Arial", 1, 18));

	c.drawLine (280, 75, 262, 137);
	c.drawLine (262, 137, 197, 182);
	c.drawLine (197, 182, 172, 117);
	c.drawLine (197, 182, 147, 232);
	c.drawLine (147, 232, 75, 255);
	c.drawLine (197, 182, 245, 240);
	c.drawLine (245, 240, 290, 310);
	c.drawLine (290, 310, 317, 332);

	c.drawString ("Deneb", 165, 110);
	c.drawString ("Albireo", 320, 325);
	c.setFont (new Font ("Arial", 1, 13));
	c.drawString ("Cygnus is a prominent constellation in the northern sky.", 17, 375);
	c.drawString ("It's name means 'the swan' in Latin", 80, 400);
	c.drawString ("and it is also known as the Swan constellation.", 40, 425);
	c.drawString ("Cygnus is associated with the myth of Zeus and Leda", 25, 475);
	c.drawString ("in Greek mythology. The constellation is easy to find in", 18, 500);
	c.drawString ("the sky as it features a well-known asterism known as the", 17, 525);
	c.drawString ("Northern Cross. Cygnus was first catalogued the by", 40, 550);
	c.drawString ("Greek astronomer Ptolemy in the 2nd century.", 65, 575);
	character = c.getChar ();
	c.clear ();



    }



    public static void main (String[] args)
    {
	Cygnus cy;
	cy = new Cygnus ();
	while (true)
	{
	    cy.frontPage ();
	    if (character == 'x')
		break;
	    cy.backPage ();
	    if (character == 'x')
		break;
	}

	// Place your program here.  'c' is the output console
    } // main method
} // Cygnus class



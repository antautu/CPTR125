package Labs;
//*****************************************************************
//Die.java       Author: Lewis/Loftus
//
//Represents one die with faces showing values between 1 and 6.
//*****************************************************************

public class Die 
{

private final int MAX = 6;
private int faceValue;

public Die() 
{
	faceValue = 1;	
}

public int roll()
{
	faceValue = (int)(Math.random()*MAX+1);
	return faceValue;
}

public void setFaceValue(int value)
{
	faceValue = value;
}

public int getFaceValue()
{
	return faceValue;
}

public String toString()
{
	String result = Integer.toString(faceValue);
	return result;
}	
}


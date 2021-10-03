class Switch{

public static void main(String[] values)
{
    String switchState="true";
	boolean convertedSwitchState=Boolean.parseBoolean(switchState);
	System.out.println(convertedSwitchState);
	
	String ignitionState="true";
	boolean convertedIgnitionState=Boolean.parseBoolean(ignitionState);
	System.out.println(convertedIgnitionState);
	
	String remoteState="false";
	boolean convertedRemoteState=Boolean.parseBoolean(remoteState);
	System.out.println(convertedRemoteState);
	
	String motorState="false";
	boolean convertedMotorState=Boolean.parseBoolean(motorState);
	System.out.println(convertedMotorState);
	
	String doorState="true";
	boolean convertedDoorState=Boolean.parseBoolean(doorState);
	System.out.println(convertedDoorState);
	

	
	
}
}
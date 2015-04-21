package nl.q42.jue;

/**
 * Detailed light information.
 */
public class FullLight extends Light {
	private State state;
	private String type;
	private String modelid;
	private String swversion;
	private String uniqueid;
	
	FullLight() {}
	
	/**
	 * Returns the current state of the light.
	 * @return current state
	 */
	public State getState() {
		return state;
	}
	
	/**
	 * Returns the type of the light.
	 * @return type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Returns the model ID of the light.
	 * @return model id
	 */
	public String getModelID() {
		return modelid;
	}
	
	/**
	 * Returns the software version of the light.
	 * @return software version
	 */
	public String getSoftwareVersion() {
		return swversion;
	}
	
    /**
     * Returns the unique id of the light. The unique is the MAC address of the device with a unique endpoint id in the
     * form: AA:BB:CC:DD:EE:FF:00:11-XX
     * 
     * @return the unique id
     */
    public String getUniqueID() {
        return uniqueid;
    }
}
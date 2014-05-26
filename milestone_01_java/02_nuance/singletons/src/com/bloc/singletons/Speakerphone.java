package com.bloc.singletons;

import java.util.*;

/*
 * This is a singleton class which maintains communication
 * between classes and Listeners
 */
public class Speakerphone extends Object {

	//private instance
	private static Speakerphone instance = new Speakerphone(); // can also declare here 
	private List<Listener> listeners = new ArrayList<Listener>();
	
	// private constructor, only visible to this class
	private Speakerphone(){ 
	}
	
	//public method to get instance so others can use it
//	public static Speakerphone getInstance(){
//		if(instance == null){ //verify instance if created
//			instance = new Speakerphone();
//		}
//		return instance;
//	}
	
	/*
	 * get
	 * @return the singleton instance of Speakerphone
	 */
	public static Speakerphone getInstance(){
        return instance;
     }

	/*
	 * addListener
	 * Add a listener to Speakerphone's list
	 * @param listener an instance of the Listener interface
	 */
	public void addListener(Listener listener){
		listeners.add(listener);
	}

	/*
	 * removeListener
	 * Remove a Listener from the Speakerphone's list
	 * @param listener the Listener to remove
	 */
    public void removeListener(Listener listener){
        listeners.remove(listener);
    }

	/*
	 * shoutMessage
	 * Sends the message to all of the Listeners tracked by Speakerphone
	 * @param talker a Talker whose message will be sent
	 */
	public void shoutMessage(Talker talker) {
		String message = talker.getMessage();
		for(Listener listener : listeners) {
			listener.onMessageReceived(message);
		}
	}
	/*
	 * shoutMessage
	 * Sends the message to all of the Listeners which are instances of
	 * the class parameter
	 * @param talker a Talker whose message will be sent
	 * @param cls a Class object representing the type which the Listener
	 *			  should extend from in order to receive the message
	 *
	 * HINT: see Class.isAssignableFrom()
	 *		 http://docs.oracle.com/javase/7/docs/api/java/lang/Class.html#isAssignableFrom(java.lang.Class)
	 */

	/*
	 * removeAll
	 * Removes all Listeners from Speakerphone
	 */
    public void removeAll(){
        listeners.clear();
    }
}
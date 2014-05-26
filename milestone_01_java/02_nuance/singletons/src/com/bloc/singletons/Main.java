package com.bloc.singletons;

import com.bloc.singletons.listeners.*;
import com.bloc.singletons.talkers.*;

public class Main extends Object {

	public static void main(String [] args) {
		// Instantiate some talkers and some listeners
		// Register listeners
		// Send messages!
		//Speakerphone instance = Speakerphone.getInstance();
		
		Listener audienceMember = new AudienceMember();
		Listener child = new Child();
		Listener pet = new Pet();
		Talker parent = new Parent();
		Talker petOwner = new PetOwner();
		Talker singer = new Singer();
		
		Speakerphone.getInstance().addListener(audienceMember);
		Speakerphone.getInstance().addListener(child);
		Speakerphone.getInstance().addListener(pet);
		
		Speakerphone.getInstance().shoutMessage(parent);
		Speakerphone.getInstance().shoutMessage(petOwner);
		Speakerphone.getInstance().shoutMessage(singer);
	}
}

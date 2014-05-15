package com.bloc.inherit;

// CLASS DEFINITION GOES HERE
// Extend the Dog class. Chihuahuas have a high metabolism, they only grow to a new size after being fed 5 times

class Chihuahua extends Dog {
	
    @Override
    final void feed() {
        //super.feed(); Note to self: Need to comment this out to do my own modification
    	
		mWeight += WEIGHT_GAINED_FROM_FEEDING;
		// Pre-increment feed counter
		if (++mFeedCounter == 5) {
			changeSize(true);
			mFeedCounter = 0;
		}
    }
}
package com.bloc.classes;

public class Dog { //Clarify: When to declare public/private
    // The length of hair which
    final float HAIR_CUT_LENGTH = 0.15f;
    // Minimum weight that any Dog can be
    final float MIN_WEIGHT = 1.25f;
	// Amount of weight to gain after eating
	final float WEIGHT_GAIN = 0.25f;
	// Amount of weight to lose after playing
	final float WEIGHT_LOSS = 0.2f;
	// Hair length
	float mHairLength;
	// Gender, either "male" or "female"
	String mGender;
	// Size, either "tiny", "small", "average", or "large"
	String mSize;
	// Its age
	int mAge;
	// Its weight in pounds
	float mWeight;
	// The color of its coat
	String mColor;
	// The number of times the dog eats;
	int mMeals = 0;
	// ADD MEMBER VARIABLES HERE IF NECESSARY
	int mPlays = 0;
	// ADD MEMBER VARIABLES HERE IF NECESSARY

	/*
	 * getHairLength
	 * @return this Dog's hair length
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public float getHairLength(int mHairLength){
		return mHairLength;
	}

	/*
	 * setHairLength
	 * Sets the length of the Dog's hair
	 * @param hairLength the new length of the hair, a float
	 * @return nothing
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public void setHairLength(int mHairlength){
	 	float hairLength;
	 	hairLength = mHairLength;
	}
	//Clarify: private float haiLength does not work

	/*
	 * getGender
	 * @return this Dog's gender
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
	public String getGender(String mGender){
		return mGender;
	}
	/*
	 * setGender
	 * Sets this Dog's gender
	 * @param gender the new gender of the Dog, a String
	 * @return nothing
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
	public void setGender(String mGender){
		String gender;
		gender = mGender;
	}

	/*
	 * getSize
	 * @return the size of the dog
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public String getSize(String mSize){
		return mSize;
	}
	/*
	 * setSize
	 * Sets the size of the Dog
	 * @param size the new size of the Dog, a String
	 * @return nothing
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
	public void setSize(String mSize){
		String size;
		size = mSize;
	}
	/*
	 * getAge
	 * @return this Dog's age
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public int getAge(int mAge){
		return mAge;
	}

	/*
	 * setAge
	 * Sets the age of the Dog
	 * @param age the new age of the Dog, an int
	 * @return nothing
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public void setAge(int mAge){
		int age;
		age = mAge;
	}

	/*
	 * getWeight
	 * @return this Dog's weight
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public float getWeight(float mWeight){
		return mWeight;
	}

	/*
	 * setWeight
	 * Sets the weight of the Dog
	 * @param weight the new weight of the Dog, a float
	 * @return nothing
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public void setWeight(float mWeight){
		float weight;
		weight = mWeight;
	}
	/*
	 * getColor
	 * @return this Dog's color
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public String getColor(String mColor){
		return mColor;
	}
	/*
	 * setColor
	 * Sets the color of the Dog
	 * @param color the new color of the Dog's coat, a String
	 * @return nothing
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION

	public void setColor(String mColor){
		String color;
		color = mColor;
	}

	/*
	 * feed
	 * Side-effect: 1. The Dog gains weight, specifically WEIGHT_GAIN
	 *              2. Every 3 meals, the Dog grows to a larger size, if *                 possible
	 *              i.e. "tiny" (3 meals later ->) "small" (3 meals later ->)
	 *                   "average" (3 meals later ->) "large"
	 * @return nothing
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
	public void feed(String mSize, int mMeals){

		if(mMeals<0)
			"tiny".equals(mSize);
		else if(mMeals<3)
			"small".equals(mSize);
		else if(mMeals<6)
			"medium".equals(mSize);
		else
			"large".equals(mSize);
		mMeals++;
		mWeight = mWeight + WEIGHT_GAIN;
	}
	//Check: Is it necessary to pass MIN_WEIGHT

	/*
	 * play
	 * Side-effect: 1. The Dog loses weight, specifically WEIGHT_LOSS
	 *				2. Every 6 play invocations, the Dog shrinks to a smaller *                 size, if possible
	 *				i.e. "large" (6 plays later->) "average" (6 plays later->) *                   "small" -> "tiny"
     *              3. The Dog cannot shrink to a weight smaller than *                 MIN_WEIGHT
	 * @return nothing
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
	public void play(String mSize, int mPlays){

		if(mPlays<0)
			"large".equals(mSize);
		else if(mPlays<6)
			"average".equals(mSize);
		else if(mPlays<12)
			"small".equals(mSize);
		else
			"tiny".equals(mSize);
		mPlays++;
		mWeight = mWeight - WEIGHT_LOSS;
	}
	/*
	 * cutHair
	 * Side-effect: the Dog's hair length is reduced by HAIR_CUT_LENGTH
     * The Dog's hair cannot be shorter than 0f
	 * @return nothing
	 */
	// ADD YOUR METHOD HERE, NAME MUST MATCH DESCRIPTION
	public void cutHair(float mHairLength){

		if(mHairLength-HAIR_CUT_LENGTH>0f)
			mHairLength -= HAIR_CUT_LENGTH;
	}
}
/**
 * Represents one person receiving deferred action for childhood arrivals (DACA).
 * 
 * <TODO add @author info here for all group-mates!>
 *
 *	@version 1.1
 **/

//TODO: Complete UML class diagram
/* UML CLASS DIAGRAM:
-----------------------------------------
					DACArecipient
-----------------------------------------
- surname : String
- givenName : String
- uscisNumber : String
- countryOfOrigin : String
- birthday : int
- validFromDate : int
- expirationDate : int
- sex : char
-----------------------------------------
+ getSurname() : String
+ getGivenName() : String
+ getUscisNumber() : String
+ getCountyOfOrigin() : String
+ getBirthDay() : int
+ getValidFromDate() : int
+ getExpirationDate() : int
+ getSex() : char
+ setSurname(surname : String) : void
+ setGivenName(givenName : String) : void
+ setUscisNumber(uscisNumber : String) : void
+ setCountryOfOrigin(countryOfOrigin : String) : void
+ setBirthday(birthday : int) : void
+ setValidFromDate(validFromDate : int) : void
+ setExpirationDate(expirationDate : int) : void
+ setSex(sex : char) : void
+ setAll(surname:String, givenName:String, uscisNumber:String, countryOfOrigin:String, birthday:int, validFromDate:int, expirationDate:int,sex:char) : void
-----------------------------------------
*/

public class DACArecipient
{
	/****** CONSTANTS ******/
  private static final String ASCII_ART_0 ="    .----.    .----.  ",
        ASCII_ART_1 = "   (  --  \\  /  --  )",
        ASCII_ART_2 = "          |  |        ",
        ASCII_ART_3 = "         _/  \\_      ",
        ASCII_ART_4 = "        (_    _)      ",
        ASCII_ART_5 = "     ,    `--`    ,   ",
        ASCII_ART_6 = "     \\'-.______.-'/  ",
        ASCII_ART_7 = "      \\          /   ",
        ASCII_ART_8 = "       '.--..--.'     ",
        ASCII_ART_9 = "         `\"\"\"\"\"` ",
        ASCII_CREDIT ="   ascii art by: jgs    ";
	private static final String TITLE_USA = "UNITED STATES OF AMERICA",
				TITLE_EAC = "EMPLOYMENT AUTHORIZATION CARD";
	private static final String LABEL_SURNAME = "Surname", 
				LABEL_GIVEN_NAME = "Given Name", LABEL_USCIS_NUM = "USCIS#",
				LABEL_BIRTH_COUNTRY = "Country of Birth",
				LABEL_BIRTH_DATE = "Date of Birth",
				LABEL_SEX = "Sex", LABEL_VALID_DATE = "Valid From:", LABEL_EXPIRE_DATE = "Card Expires:",
				LABEL_REENTRY_DISCLAIMER = "NOT VALID FOR REENTRY TO U.S.";

	/***** INSTANCE VARIABLES *****/
	//DONE: Declare the instance variables. 
  private String surname;
  private String givenName;
  private String uscisNumber;
  private String countryOfOrigin;
  private int birthday, validFromDate, expirationDate;
  private char sex;

	/***** ACCESSORS *****/

	public String getSurname(){
		return this.surname;
	}
	public String getGivenName(){
		return this.givenName;
	}
	public String getUscisNumber(){
		return this.uscisNumber;
	}
	public String getCountryOfOrigin(){
		return this.countryOfOrigin;
	}
	public int getBirthday(){
		return this.birthday;
	}
	public int getValidFromDate(){
		return this.validFromDate;
	}
	public int getExpirationDate(){
		return this.expirationDate;
	}
	public char getSex(){
		return this.sex;
	}

	/***** MUTATORS *****/
	
	/*
	 * sets surname to parameter value of calling object
	 * 
	 * @param surname String representhing last name, assume it exists and is valid
	 */

	 public void setSurname(String surname){
		this.surname = surname;
	}
	/*
	 * sets given name to parameter value of calling object
	 * 
	 * @param givenName String representhing first name, assume it exists and is valid
	 */
	public void setGivenName(String givenName){
		this.givenName = givenName;
	}
	/*
	 * sets uscis # to parameter value of calling object
	 * 
	 * @param uscisNumber String representhing uscis #, assume it exists and is valid
	 */
	public void setUscisNumber(String uscisNumber){
		this.uscisNumber = uscisNumber;
	}
	/*
	 * sets country of origin to parameter value of calling object
	 * 
	 * @param countryOfOrigin String representhing country of origin, assume it exists and is valid
	 */
	public void setCountryOfOrigin(String countryOfOrigin){
		this.countryOfOrigin = countryOfOrigin;
	}
	/*
	 * sets birthday to parameter value of calling object
	 * 
	 * @param birthday int representhing birthday, assume it exists and is valid
	 */
	public void setBirthday(int birthday){
		this.birthday = birthday;
	}
	/*
	 * sets valid date to parameter value of calling object
	 * 
	 * @param validFromDate int representhing valid date, assume it exists and is valid
	 */
	public void setValidFromDate(int validFromDate){
		this.validFromDate = validFromDate;
	}
	/*
	 * sets expiration date to parameter value of calling object
	 * 
	 * @param expirationDate int representhing expiration date, assume it exists and is valid
	 */
	public void setExpirationDate(int expirationDate){
		this.expirationDate = expirationDate;
	}
	/*
	 * sets sex to parameter value of calling object
	 * 
	 * @param sex char representhing sex, assume it exists and is valid
	 */
	public void setSex(char sex){
		this.sex = sex;
	}


  /**DESCRIPTION: Assigns parameters to corresponding instance variables of calling DACArecipient. */
	public void setAll(String surname, String givenName, String uscisNumber, String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex)
	{
		this.surname = surname;
		this.givenName = givenName;
		this.uscisNumber = uscisNumber;
		this.countryOfOrigin = countryOfOrigin;
		this.birthday = birthday;
		this.validFromDate = validFromDate;
		this.expirationDate = expirationDate;
		this.sex = sex;
	}

	/***** OTHER REQUIRED METHODS *****/
	/** Description: Creates a string of all the calling
	 * DACArecipient's instance variables seperated by a comma and a single space.
	 */
	public String toString()
	{
		return String.format("%s, %s, %s, %s, %d, %d, %d, %c", 
		surname, givenName, uscisNumber, countryOfOrigin, birthday, validFromDate, expirationDate, sex);
	}


	/**Description: compares the instance variables of the calling 
	 * DACArecipient with those of the parameter.
	 * If all are equal then returns true, otherwise false.
	 */
	public boolean equals(DACArecipient other)
	{
		return this.surname.equals(other.surname) &&
			this.givenName.equals(other.givenName) &&
			this.uscisNumber.equals(other.uscisNumber) &&
			this.countryOfOrigin.equals(other.countryOfOrigin) &&
			this.birthday == other.birthday &&
			this.validFromDate == other.validFromDate &&
			this.expirationDate == other.expirationDate &&
			this.sex == other.sex;

	}
  
  /** DESCRIPTION: Prints to the console the Employment Authorization Card using the calling DACArecipient's instance variables.*/
  public String printCard()
  {
		String card;
		
    card = String.format("╔══════════════════════════════════════════════════════════════════════╗%n");
		card += String.format("║%35s%35s║%n", TITLE_USA, "");
		card += String.format("║%60s%10s║%n", TITLE_EAC, "");
		card += String.format("║%-25s%-45S║%n", "", LABEL_SURNAME);
		card += String.format("║%-25s%-45s║%n", ASCII_ART_0, surname);
		card += String.format("║%-25s%-45S║%n", ASCII_ART_1, LABEL_GIVEN_NAME);
		card += String.format("║%-25s%-45s║%n", ASCII_ART_2, givenName);
		
		card += String.format("║%-25s%-45S║%n", ASCII_ART_3, LABEL_USCIS_NUM);
		card += String.format("║%-25s%-45s║%n", ASCII_ART_4, uscisNumber);
		
		card += String.format("║%-25s%-45S║%n", ASCII_ART_5, LABEL_BIRTH_COUNTRY);
		card += String.format("║%-25s%-45s║%n", ASCII_ART_6, countryOfOrigin);
		card += String.format("║%-25s%-15S%-30S║%n", ASCII_ART_7, LABEL_BIRTH_DATE, LABEL_SEX);
		card += String.format("║%-25s%-15s%-30s║%n", ASCII_ART_8, jdnToDate(birthday), sex);
		card += String.format("║%-25s%-15S%-30s║%n", ASCII_ART_9, LABEL_VALID_DATE, jdnToDate(validFromDate));
		card += String.format("║%-25s%-15S%-30s║%n", "", LABEL_EXPIRE_DATE, jdnToDate(expirationDate));
		card += String.format("║%-25s%-45s║%n", ASCII_CREDIT, LABEL_REENTRY_DISCLAIMER);
		card += String.format("╚══════════════════════════════════════════════════════════════════════╝%n");
		return card;
  }

	/**DESCRIPTION: Converts a Julian Day Number to Julian calendar date formatted as MM/DD/YYYY using algorithm adapted from https://en.wikipedia.org/wiki/Julian_day.*/
  public static String jdnToDate(int J)
	{
		int B, C, e, f, g, h, D, M, Y;
		
		B=274277;
		C=-38;
		f=J + 1401 + (((4*J+B)/146097)*3)/4+C;
		e=4*f+3;
		g=(e%1461)/4;
		h=5*g+2;
		D=((h%153)/5)+1;
		M=((h/153)+2)%12+1;
		Y=(e/1461)-4716+(12+2-M)/12;

		return String.format("%02d/%02d/%04d",M,D,Y);
	}
	

}
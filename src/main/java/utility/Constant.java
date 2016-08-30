package utility;

public class Constant {
	    public static final String URL = "http://spree.paxotech.com/";
	    public static final String Username = "testuser_1";
	    public static final String Password ="Test@123";
		public static final String Path_TestData = "/Users/wasey/IdeaProjects/PerFactHybrid/src/main/java/testData/";
		public static final String File_TestData = "TestData.xlsx";
		//Test Data Sheet Columns
		public static final int Col_TestCaseName = 0;	
		public static final int Col_UserName =1 ;
		public static final int Col_Password = 2;
		public static final int Col_Browser = 3;
		public static final int Col_ProductType = 4;
		public static final int Col_ProductNumber = 5;
		public static final int Col_FirstName = 6;
		public static final int Col_LastName = 7;
		public static final int Col_Address = 8;
		public static final int Col_City = 9;
		public static final int Col_Country = 10;
		public static final int Col_Phone = 11;
		public static final int Col_Email = 12;
		public static final int Col_Result = 13;
		public static final String Path_ScreenShot = "/Users/wasey/IdeaProjects/PerFactHybrid/src/main/java/Screenshots/a";
	public static final String SpreeURL = "http://spree.paxotech.com";
	public static final int SpreePort= Integer.parseInt("80");
	public static final String SpreeBase= "/api";
	public static final String SpreeToken= "X-Spree-Token";
	public static final String SpreeKey= "52a997116f906d2587dd9d8508e27d9167bdc90348bbdc9b";

	public static final String USERNAME = "aamwasey1";
	public static final String AUTOMATE_KEY = "hSRqEJw7xmCdMu4omyRZ";
	public static final String REMOTEURL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	public static final StringBuffer verificationErrors = new StringBuffer();
	public static final String dataFile = System.getProperty("user.dir") + "/src/main/resources/KeyWord.txt";

	public static final String ConnecTionMsg = "******Connecting To Api******";
	public static final String EndMsg = "******Closeing Connection To Api******";

	//HTTP STATUS CODE
	public static final int OK= Integer.parseInt("200");
	public static final int  Created= Integer.parseInt("201");
	public static final int Accepted= Integer.parseInt("202");
	public static final int NonAuthoritative= Integer.parseInt("203");
	public static final int NoContent= Integer.parseInt("204");
	public static final int ResetContent= Integer.parseInt("205");
	public static final int PartialContent= Integer.parseInt("206");
	public static final int MultiStatus= Integer.parseInt("207");
	public static final int AlreadyReported= Integer.parseInt("208");
	public static final int  IMUsed= Integer.parseInt("209");

	public static final int BadRequest= Integer.parseInt("400");
	public static final int Unauthorized= Integer.parseInt("401");
	public static final int PaymentRequired= Integer.parseInt("402");
	public static final int Forbidden= Integer.parseInt("403");
	public static final int  NotFound= Integer.parseInt("404");
	}

import java.util.ArrayList;
import java.util.List;

public class TestData implements Outputable {
	
	private static String sPath="default/path/TestData.txt";
	private String mPath;
	private List<String> mTestMSG;
	
	public TestData() {
		mTestMSG = new ArrayList<String> ();
		mTestMSG.add("hello");
		mTestMSG.add("world");
		mTestMSG.add("test");
		mPath = sPath;
	}
	
	public List <String> toOutput() {
		return mTestMSG;
	}


	public String getPath() {
		return mPath;
	}
}

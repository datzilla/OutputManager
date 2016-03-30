import java.io.IOException;
import java.net.URISyntaxException;

public class TestClass {
	public static void main(String[] args) throws IOException, URISyntaxException {
		try {
			HadoopHandler.setConfiguration("dfs.client.block.write.replace-datanode-on-failure.policy", "ALWAYS");
			HadoopHandler.setConfiguration("dfs.replication", "1");
			HadoopHandler hh = HadoopHandler.getHandler("hdfs://localhost:9000", "hduser");
			TestData test = new TestData();
			hh.writeOutput(test);
			hh.close();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

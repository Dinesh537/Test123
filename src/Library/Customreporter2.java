package Library;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import com.aventstack.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Customreporter2 implements IReporter {   
    File fd = new File("");
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss");
    String folderNameWithTimeStamp = df.format(new Date());
    String currentDir = System.getProperty("user.dir") + "//Reports//";
    String finalPath = currentDir + folderNameWithTimeStamp;
    private ExtentReports extent;
    @SuppressWarnings("deprecation")
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) 
    {
    	
      /*  TestNG.getDefault().setOutputDirectory(finalPath);
        TestNG.getDefault().setXmlSuites(xmlSuites);
        */
    	 for (ISuite suite : suites) {
             
             //Following code gets the suite name
             String suiteName = suite.getName();
             TestNG.getDefault().setOutputDirectory(finalPath+suite.getName());
             TestNG.getDefault().setXmlSuites(xmlSuites);
             //Getting the results for the said suite
             Map<String, ISuiteResult> suiteResults = suite.getResults();
             for (ISuiteResult sr : suiteResults.values()) {
                ITestContext tc = sr.getTestContext();
                System.out.println("Passed tests for suite '" + suiteName +
                   "' is:" + tc.getPassedTests().getAllResults().size());
                System.out.println("Failed tests for suite '" + suiteName +
                   "' is:" + tc.getFailedTests().getAllResults().size());
                System.out.println("Skipped tests for suite '" + suiteName +
                   "' is:" + tc.getSkippedTests().getAllResults().size());
             }
         					
    	 }
    	
    }
}

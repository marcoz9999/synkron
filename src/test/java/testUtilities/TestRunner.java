package testUtilities;

import static testUtilities.Constants.testSuiteName;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import com.aventstack.extentreports.ExtentReports;

public class TestRunner {

	public static ExtentReports report;

	public static void main(String[] args) {
		initializeExtentReports();
		createTestngXml();
		closeExtentReport();
	}

	public static void initializeExtentReports() {
		report = Drex.initializeReport();
	}

	public static void closeExtentReport() {
		report.flush();
	}

	public static void createTestngXml() {
		TestNG testng = new TestNG();
		List<XmlSuite> suites = new ArrayList<>();

		XmlSuite suite = new XmlSuite();
		suite.setName(testSuiteName);

		XmlTest test = new XmlTest(suite);
		test.setName("Test");

		ArrayList<XmlClass> classes = new ArrayList<>();
		ArrayList<String> strClasses = ReadDatasheet.getTestCasesWithFillo();

		try {
			for (String classIterator : strClasses) {
				classes.add(new XmlClass("testScripts." + classIterator));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		test.setXmlClasses(classes);
		suites.add(suite);
		testng.setXmlSuites(suites);
		testng.run();
	}
}

package com.qa.testcases;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.qa.excelreader.ExcelReader;
import com.qa.pages.AncillaryCharges;
import com.qa.util.TestBase;
import com.qa.util.TestUtil;

public class AncillaryChargeCreation extends TestBase {
	TestUtil testUtil;
	AncillaryCharges charges;
	ExcelReader reader;
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;

	@BeforeTest
	public void setExtent() {
		// specify location of the report
		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output-ancill/myReport.html");
		htmlReporter.config().setDocumentTitle("Automation Report"); // Tile of report
		htmlReporter.config().setReportName("Ancillary Charges Application Testing"); // Name of the report
		htmlReporter.config().setTheme(Theme.STANDARD);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		// Passing General information
		extent.setSystemInfo("Environemnt", "QA");
		extent.setSystemInfo("user", "Sindhuja");
	}

	@AfterTest
	public void endReport() {
		extent.flush();
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			//test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getName()); // to add name in extent report
			test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable()); // to add error/exception in extent
																					// report
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Test Case SKIPPED IS " + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			//test.log(Status.PASS, "Test Case PASSED IS " + result.getName());
		}
		driver.quit();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException {
		testUtil = new TestUtil();
		testUtil.setUp();
	}
	
	
	@DataProvider
	public Object[][] charge_creation() throws IOException {
		reader = new ExcelReader();
		return reader.readExcelData("C:\\Users\\Sindhuja\\Desktop\\Ancillary_charge_creation.xlsx", 0);
	}

	@Test(dataProvider = "charge_creation", priority = 4)
	public void chargeCreation(String charge_name, String debit_account,String credit_account,String testcase) throws Exception
	{		
		test = extent.createTest("The testcase is" + " " + testcase);
		charges=new AncillaryCharges();
		charges.charge_Screen();
	charges.charge_Creation(charge_name, debit_account, credit_account, testcase,test);
	}
	@DataProvider
	public Object[][] customer_payment() throws IOException {
		reader = new ExcelReader();
		return reader.readExcelData("C:\\Users\\Sindhuja\\Desktop\\Ancillary_charge_creation.xlsx", 1);
	}

	@Test(dataProvider = "customer_payment", priority = 1)
	public void customer_payment_charge_selection(String charge_amount,String charge_name,String testcase,String no_of_invoices) throws Exception
	{		
		test = extent.createTest("The testcase is" + " " + testcase);
		charges=new AncillaryCharges();
		charges.charge_selection(charge_amount, charge_name, testcase, no_of_invoices,test);
	}
	@DataProvider
	public Object[][] multiple_charges() throws IOException {
		reader = new ExcelReader();
		return reader.readExcelData("C:\\Users\\Sindhuja\\Desktop\\Ancillary_charge_creation.xlsx", 2);
	}

	@Test(dataProvider = "multiple_charges", priority = 1)
	public void multiple_charges(String charge_amount,String charge_name,String testcase) throws Exception
	{		
		test = extent.createTest("The testcase is" + " " + testcase);
		charges=new AncillaryCharges();
		charges.single_payment_multiple_same_charges(charge_amount, charge_name, testcase,test);
	}
	@DataProvider
	public Object[][] total_write_off() throws IOException {
		reader = new ExcelReader();
		return reader.readExcelData("C:\\Users\\Sindhuja\\Desktop\\Ancillary_charge_creation.xlsx", 3);
	}

	@Test(dataProvider = "total_write_off", priority = 2)
	public void total_write_off(String charge_amount,String charge_name,String testcase,String new_amount,String new_charge,String no_of_invoices) throws Exception
	{	
		test = extent.createTest("The testcase is" + " " + testcase);
		charges=new AncillaryCharges();
		charges.total_write_off(charge_amount, charge_name, testcase,new_amount,new_charge,no_of_invoices,test);
	}
	@DataProvider
	public Object[][] deleting() throws IOException {
		reader = new ExcelReader();
		return reader.readExcelData("C:\\Users\\Sindhuja\\Desktop\\Ancillary_charge_creation.xlsx", 4);
	}

	@Test(dataProvider = "deleting", priority = 3)
	public void deleting(String charge_amount,String charge_name,String testcase,String no_of_invoices) throws Exception
	{	
		test = extent.createTest("The testcase is" + " " + testcase);
		charges=new AncillaryCharges();
		charges.deleting_payment_journal_ancillary(charge_amount, charge_name, testcase, no_of_invoices,test);
	}
}
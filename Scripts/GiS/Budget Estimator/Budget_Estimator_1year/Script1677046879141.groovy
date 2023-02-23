import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.io.File
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

CustomKeywords.'gis_url.test.URL.redirectURL'()

WebUI.delay(15)

WebUI.click(findTestObject('EBP_Object/Page_Streetlogix/Menubar-icon'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/div_Budget Estimator'))

String Scenarioname = 'EST 1'

WebUI.sendKeys(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Scenario Name_scenarioName'), Keys.chord(
        Keys.COMMAND, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Scenario Name_scenarioName'), Keys.chord(
        Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Scenario Name_scenarioName'), Scenarioname)

WebUI.sendKeys(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Program duration_programDuration'), Keys.chord(
        Keys.COMMAND, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Program duration_programDuration'), Keys.chord(
        Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Program duration_programDuration'), '1')

String AvgCI = WebUI.getText(findTestObject('EBP_Object/Page_Streetlogix/Average_condition_index'))

//def TargetCI = AvgCI.toFloat() + 1.00

//WebUI.setText(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Target Condition Index_target_rating'), "$TargetCI")

WebUI.setText(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Target Condition Index_target_rating'), '29')

WebUI.sendKeys(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Annual Inflation_annualInflation'), Keys.chord(
        Keys.COMMAND, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Annual Inflation_annualInflation'), Keys.chord(
        Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Annual Inflation_annualInflation'), '5')

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/span_Calculate'))

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/span_Load'))

WebUI.click(findTestObject('EBP_Object/Page_Streetlogix/Load_Scenarioname'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/h6_default scenario'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/Estimator_summary'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/Estimator_summary'))

WebUI.click(findTestObject('EBP_Object/Page_Streetlogix/Asset_name'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/Program_duration_1year'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/Total cost estimated'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/Inflation_5'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/h6_pci  0'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/h6_DT with PCI ranges'))

WebUI.click(findTestObject('EBP_Object/Page_Streetlogix/View_Graph_dropdown'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/li_Table'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/Final_Rating'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/span_Report'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/span_Export'))

WebUI.delay(50)

//WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/div_Report downloaded successfully'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/span_Report'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/span_Word'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/span_Export'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/span_Close'))

//WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/span_Load'))

//WebUI.click(findTestObject('EBP_Object/Page_Streetlogix/Delete_Scenario_1'))

//WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/span_Yes'))



public boolean isFileDownloaded(String fileName) {
	String downloadPath = "/Users/kashif/Downloads";
	File dir = new File(downloadPath);
	File[] files = dir.listFiles();
	for (File file : files) {
	if (file.getName().equals(fileName)) {
	KeywordUtil.markPassed("File " + fileName + " exists in " + downloadPath);
	return true;
	}
	}
	KeywordUtil.markFailed("File " + fileName + " does not exist in " + downloadPath);
	return false;
	
	}
	
	// Usage:
	isFileDownloaded("Streetlogix-EST-1.pdf");
	


WebUI.closeBrowser()

//WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/span_Cancel'))
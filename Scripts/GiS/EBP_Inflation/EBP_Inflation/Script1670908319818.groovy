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

CustomKeywords.'gis_url.test.URL.redirectURL'()

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/Menubar-icon'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/Budgeting-icon'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/EBP_Pavemnet dropdown'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/li_Pavement Maintenance'))

WebUI.sendKeys(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Scenario Name_scenarioName'), Keys.chord(
        Keys.COMMAND, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Scenario Name_scenarioName'), Keys.chord(
        Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Scenario Name_scenarioName'), 'EBP_Inflation 7.5')

//WebUI.setText(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Scenario Name_scenarioName'), 'EBP_Inflation 7.5')
WebUI.sendKeys(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Annual Budget_budgets'), Keys.chord(Keys.COMMAND, 
        'a'))

WebUI.sendKeys(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Annual Budget_budgets'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Annual Budget_budgets'), '100,000')

//WebUI.setText(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Annual Budget_budgets'), '100,000')
WebUI.sendKeys(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Program duration_programDuration'), Keys.chord(
        Keys.COMMAND, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Program duration_programDuration'), Keys.chord(
        Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Program duration_programDuration'), '5')

//WebUI.setText(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Program duration_programDuration'), '5')
WebUI.sendKeys(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Annual Inflation_annualInflation'), Keys.chord(
        Keys.COMMAND, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Annual Inflation_annualInflation'), Keys.chord(
        Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Annual Inflation_annualInflation'), '7.5')

//WebUI.setText(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/input_Annual Inflation_annualInflation'), '7.5')
WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/Apply_Button'))

WebUI.delay(50)

//WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/div_We have received the configuration for _cadd43'))
WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/span_Load'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/EBP_Inflation_7.5'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/EBP_Inflation_7.5'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/h6_5 Year(s)'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/h6_500,000'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/h6_7.5'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/h6_pci  0'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/h6_DT for testing'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/Total_Repairs'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/Asset_name'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/Budget_Criteria_Summary'))

WebUI.click(findTestObject('EBP_Object/Page_Streetlogix/View_Graph_dropdown'))

WebUI.click(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/li_Table'))

WebUI.delay(5)

String year1 = WebUI.getText(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/5_year_budget_year1_total_budget'))

String yr1 = year1.replaceAll(',', '')

def y1 = yr1.toInteger()

WebUI.verifyGreaterThan(y1, 98000)

String year2 = WebUI.getText(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/5_year_budget_year2_total_budget'))

String yr2 = year2.replaceAll(',', '')

def y2 = yr2.toInteger()

WebUI.verifyGreaterThan(y2.toInteger(), 98000)

String year3 = WebUI.getText(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/5_year_budget_year3_total_budget'))

String yr3 = year3.replaceAll(',', '')

def y3 = yr3.toInteger()

WebUI.verifyGreaterThan(y3.toInteger(), 98000)

String year4 = WebUI.getText(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/5_year_budget_year4_total_budget'))

String yr4 = year4.replaceAll(',', '')

def y4 = yr4.toInteger()

WebUI.verifyGreaterThan(y4.toInteger(), 98000)

String year5 = WebUI.getText(findTestObject('Object Repository/EBP_Object/Page_Streetlogix/5_year_budget_year5_total_budget'))

String yr5 = year5.replaceAll(',', '')

def y5 = yr5.toInteger()

WebUI.verifyGreaterThan(y5.toInteger(), 98000)

def Totalyears = (((y1 + y2) + y3) + y4) + y5

WebUI.verifyLessThanOrEqual(Totalyears, 500000)

WebUI.verifyGreaterThan(Totalyears, 495000)

WebUI.click(findTestObject('EBP_Object/Page_Streetlogix/Close_button'))

WebUI.click(findTestObject('EBP_Object/Page_Streetlogix/span_Load'))

WebUI.click(findTestObject('EBP_Object/Page_Streetlogix/Delete_Scenario_1'))

WebUI.click(findTestObject('EBP_Object/Page_Streetlogix/span_Yes'))

WebUI.delay(3)

CustomKeywords.'database_keywords.test.Database_Keywords.deletebudgets'()

WebUI.closeBrowser()


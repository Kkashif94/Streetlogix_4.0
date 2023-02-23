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

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/Compare Scenarios/Menubar-icon'))

WebUI.click(findTestObject('Object Repository/Compare Scenarios/img_Compare_Scenario_rail-icon'))

WebUI.sendKeys(findTestObject('Compare Scenarios/input_Program duration_duration'), Keys.chord(Keys.COMMAND, 'a'))

WebUI.sendKeys(findTestObject('Compare Scenarios/input_Program duration_duration'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Compare Scenarios/input_Program duration_duration'), '3')

WebUI.sendKeys(findTestObject('Object Repository/Compare Scenarios/input_Scenario Name_scenario_name'), Keys.chord(Keys.COMMAND, 
        'a'))

WebUI.sendKeys(findTestObject('Object Repository/Compare Scenarios/input_Scenario Name_scenario_name'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/Compare Scenarios/input_Scenario Name_scenario_name'), 'Compare Scenario 1')

//WebUI.click(findTestObject('Object Repository/Compare Scenarios/input_Scenario Name_scenario_name'))
WebUI.click(findTestObject('Object Repository/Compare Scenarios/span_Add Scenario'))

WebUI.click(findTestObject('Object Repository/Compare Scenarios/span_Add Scenario'))

WebUI.sendKeys(findTestObject('Object Repository/Compare Scenarios/input_Scenario Name_scenario_name_2'), Keys.chord(Keys.COMMAND, 
        'a'))

WebUI.sendKeys(findTestObject('Object Repository/Compare Scenarios/input_Scenario Name_scenario_name_2'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/Compare Scenarios/input_Scenario Name_scenario_name_2'), 'Compare Scenario 2')

//WebUI.click(findTestObject('Object Repository/Compare Scenarios/span_Add Scenario'))
WebUI.sendKeys(findTestObject('Object Repository/Compare Scenarios/input_Scenario Name_scenario_name_3'), Keys.chord(Keys.COMMAND, 
        'a'))

WebUI.sendKeys(findTestObject('Object Repository/Compare Scenarios/input_Scenario Name_scenario_name_3'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/Compare Scenarios/input_Scenario Name_scenario_name_3'), 'Compare Scenario 3')

WebUI.setText(findTestObject('Object Repository/Compare Scenarios/input_Annual Budget_budget'), '30,000')

WebUI.setText(findTestObject('Compare Scenarios/input_Annual Budget_budget_2'), '20000')

WebUI.setText(findTestObject('Compare Scenarios/input_Annual Budget_budget_3'), '10000')

WebUI.sendKeys(findTestObject('Object Repository/Compare Scenarios/Input_Inflation'), Keys.chord(Keys.COMMAND, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Compare Scenarios/Input_Inflation'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/Compare Scenarios/Input_Inflation'), '5')

WebUI.sendKeys(findTestObject('Object Repository/Compare Scenarios/Input_Inflation_2'), Keys.chord(Keys.COMMAND, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Compare Scenarios/Input_Inflation_2'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/Compare Scenarios/Input_Inflation_2'), '7')

WebUI.sendKeys(findTestObject('Object Repository/Compare Scenarios/Input_Inflation_3'), Keys.chord(Keys.COMMAND, 'a'))

WebUI.sendKeys(findTestObject('Object Repository/Compare Scenarios/Input_Inflation_3'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Object Repository/Compare Scenarios/Input_Inflation_3'), '0')

WebUI.click(findTestObject('Object Repository/Compare Scenarios/div_Select layerPavement MaintenanceFilter _a98a8c'))

WebUI.click(findTestObject('Object Repository/Compare Scenarios/Apply_button'))

WebUI.delay(50)

WebUI.click(findTestObject('Object Repository/Compare Scenarios/span_Compare'))

WebUI.click(findTestObject('Compare Scenarios/div_Compare Scenario 1'))

WebUI.click(findTestObject('Compare Scenarios/div_Compare Scenario 2'))

WebUI.click(findTestObject('Compare Scenarios/div_Compare Scenario 3'))

WebUI.click(findTestObject('Compare Scenarios/span_Compare_loadscreen'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Compare Scenarios/button'))

WebUI.click(findTestObject('Object Repository/Compare Scenarios/div_Save as JPEG'))

WebUI.click(findTestObject('Compare Scenarios/span_Close'))

WebUI.click(findTestObject('Object Repository/Compare Scenarios/span_Compare'))

WebUI.click(findTestObject('Compare Scenarios/Delete_Scenario_1'))

WebUI.click(findTestObject('Compare Scenarios/span_Yes'))

WebUI.delay(3)

WebUI.click(findTestObject('Compare Scenarios/Delete_Scenario_1'))

WebUI.click(findTestObject('Compare Scenarios/span_Yes'))

WebUI.delay(3)

WebUI.click(findTestObject('Compare Scenarios/Delete_Scenario_1'))

WebUI.click(findTestObject('Compare Scenarios/span_Yes'))

CustomKeywords.'database_keywords.test.Database_Keywords.deletebudgets'()

WebUI.closeBrowser()


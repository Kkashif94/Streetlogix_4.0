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

CustomKeywords.'gis_url.test.URL.redirectURLWO'()

def countBefore = CustomKeywords.'database_keywords.test.Database_Keywords.getWorkOrdersCount'()

println(countBefore)

WebUI.click(findTestObject('Object Repository/WO_Dashboard/Page_Streetlogix  Dashboard/span_Create'))

WebUI.click(findTestObject('Object Repository/WO_Dashboard/Page_Streetlogix  Dashboard/input_Select Group_mui-33912'))

WebUI.click(findTestObject('Object Repository/WO_Dashboard/Page_Streetlogix  Dashboard/li_Bridge Inspection'))

WebUI.click(findTestObject('Object Repository/WO_Dashboard/Page_Streetlogix  Dashboard/input_Select Form_mui-83086'))

WebUI.click(findTestObject('Object Repository/WO_Dashboard/Page_Streetlogix  Dashboard/span_Bridge Maintenance'))

WebUI.click(findTestObject('Object Repository/WO_Dashboard/Page_Streetlogix  Dashboard/span_Next'))

WebUI.click(findTestObject('Object Repository/WO_Dashboard/Page_Streetlogix  Dashboard/input_Select Assignee_combo-box-demo'))

WebUI.click(findTestObject('Object Repository/WO_Dashboard/Page_Streetlogix  Dashboard/span_Dev Admin'))

WebUI.click(findTestObject('Object Repository/WO_Dashboard/Page_Streetlogix  Dashboard/input_Collaborators_checkboxes-tags-demo'))

WebUI.click(findTestObject('Object Repository/WO_Dashboard/Page_Streetlogix  Dashboard/div_Aami  admin'))

WebUI.setText(findTestObject('Object Repository/WO_Dashboard/Page_Streetlogix  Dashboard/input_Due Date_due_date'), '22/01/2024')

WebUI.click(findTestObject('Object Repository/WO_Dashboard/Page_Streetlogix  Dashboard/Priority_field'))

WebUI.click(findTestObject('Object Repository/WO_Dashboard/Page_Streetlogix  Dashboard/span_Medium'))

WebUI.click(findTestObject('WO_Dashboard/Page_Streetlogix  Dashboard/input_Search by Asset ID_mui-40471'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('WO_Dashboard/Page_Streetlogix  Dashboard/asse_field'), '12')

WebUI.focus(findTestObject('WO_Dashboard/Page_Streetlogix  Dashboard/asse_field'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('WO_Dashboard/Page_Streetlogix  Dashboard/asse_field'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('WO_Dashboard/Page_Streetlogix  Dashboard/asse_field'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('WO_Dashboard/Page_Streetlogix  Dashboard/li_12'))

address = WebUI.getAttribute(findTestObject('WO_Dashboard/Page_Streetlogix  Dashboard/address_field2'), 'value')

String Searchedtext = 'TYLER AVE From 31ST ST To 32ND ST - 12'

println(address)

WebUI.verifyMatch(address, Searchedtext, false)

WebUI.setText(findTestObject('Object Repository/WO_Dashboard/Page_Streetlogix  Dashboard/textarea_New'), 'New')


WebUI.click(findTestObject('WO_Dashboard/Page_Streetlogix  Dashboard/btn_workorder_create'))

def countAfter = CustomKeywords.'database_keywords.test.Database_Keywords.getWorkOrdersCount'()

println(countAfter)

if (countAfter == (countBefore + 1)) {
    println('Work Order Created')
} else {
    throw new Exception('All Work Orders are not Created')
}

WebUI.closeBrowser()


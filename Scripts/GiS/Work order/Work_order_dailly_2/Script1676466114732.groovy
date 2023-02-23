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

def countBefore = CustomKeywords.'database_keywords.test.Database_Keywords.getWorkOrdersCount'()

println(countBefore)

WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/WO icon'))

// WebUI.click(findTestObject('null'))
WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/Group Dropdown'))

WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/li_Bridge Inspection'))

WebUI.setText(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/input_Filter by form name_standard-full-width'), 
    'Bridge maintenance')

WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/span_Bridge Maintenance'))

WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/input_Select Assignee_assignee-autocomplete'))

WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/span_ami  admin'))

WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/input_Collaborators_collaborators-autocomplete'))

WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/span_ami  admin'))

WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/h6_Bridge Maintenance'))

WebUI.setText(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/Page_Streetlogix/Page_Streetlogix/input_Address_asset-id-address'), 
    '12')

WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/li_12TH STREET CONNECTOR From CHESTNUT ST To MAGAZINE ST - 20476'))

WebUI.setText(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/textarea_Test'), 'Test')

WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/Page_Streetlogix/Page_Streetlogix/div_Urgent'))

WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/li_High'))

WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/input_Upload_repeatingWorkOrder'))

//WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/div_1'))
//WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/li_2'))
//WebUI.setText(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/Page_Streetlogix/Page_Streetlogix/input_test_custom-form-field-text-0'), 'Testing automation')
// WebUI.click(findTestObject('null'))
WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/input_Statement Field Test_equipment'))

WebUI.delay(3)

WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/Page_Streetlogix/Page_Streetlogix/Page_Streetlogix/div_equip'))

WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/li_Snow Plow - 15'))

// WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/input_Quantity_MuiInputBase-input-2592 MuiI_2bc7ad'))
// WebUI.setText(findTestObject('Create_Charts/Work_Order/Number_Of_Work_Order_Stats/Page_Streetlogix/Page_Streetlogix/input_Quantity_MuiInputBase-input MuiInput-input'), '0')
WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/input_Add Item_material'))

WebUI.delay(3)

WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/Page_Streetlogix/Page_Streetlogix/Page_Streetlogix/div_material'))

WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/li_Asphalt - 22'))

// WebUI.setText(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/input_Quantity_MuiInputBase-input-2592 MuiI_2bc7ad'), '2')
WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/input_Add Item_labor'))

WebUI.delay(3)

WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/Page_Streetlogix/Page_Streetlogix/Page_Streetlogix/div_labor'))

WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/li_Supervisor - 30'))

// WebUI.setText(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/input_Quantity_MuiInputBase-input-2592 MuiI_2bc7ad'),'2')
//WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/span_Add Item'))
//WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/span_Add Item2'))
//WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/span_Add Item3'))
WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/span_Save'))

//WebUI.verifyElementPresent(findTestObject('Page_Streetlogix/div_Work order has been created successfully'), 1)
//WebUI.verifyElementPresent(findTestObject('Page_Streetlogix/div_Work order creation email has been sent sucessfully'), 1)
//WebUI.click(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/img'))
//WebUI.verifyElementText(findTestObject('Work order 4.0/Page_Streetlogix/Workorder page objects/Page_Streetlogix/p_Dev Admin added a work order'), 'Sohaib Nehal added a work order.')
def countAfter = CustomKeywords.'database_keywords.test.Database_Keywords.getWorkOrdersCount'()

println(countAfter)

if (countAfter == (countBefore + 6)) {
    println('Work Order Created')
} else {
    throw new Exception('All Work Orders are not Created')
}

WebUI.closeBrowser()


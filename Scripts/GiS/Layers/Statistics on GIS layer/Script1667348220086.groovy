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

WebUI.click(findTestObject('Page_Streetlogix/img_Search_rail-icon'))

WebUI.delay(5)

//Verify PCI value with DB
String pci = WebUI.getText(findTestObject('Object Repository/Page_Streetlogix/h6_Pavement Average Condition 58'))

String pciAvg = pci.replaceAll('[^0-9]', '')

String avgPCI = CustomKeywords.'database_keywords.test.Database_Keywords.getAveragePCI'()

println(avgPCI)

WebUI.verifyMatch(pciAvg, avgPCI, false)

//Verify Miles PCI value with DB
String milespci = WebUI.getText(findTestObject('Object Repository/Page_Streetlogix/p_Total Length 2,148 miles'))

String pciMiles = milespci.replaceAll('[^0-9]', '')

String totalMilesPCI = CustomKeywords.'database_keywords.test.Database_Keywords.getPavementMiles'()

WebUI.verifyMatch(pciMiles, totalMilesPCI, false)

//Verify Total Backlog value with DB
String backlogPCI = WebUI.getText(findTestObject('Object Repository/Page_Streetlogix/p_Total Backlog  1,189,007,890'))

String pciBacklog = backlogPCI.replaceAll('[^0-9]', '')

String totalBacklogPCI = CustomKeywords.'database_keywords.test.Database_Keywords.getPavementBacklog'()

WebUI.verifyMatch(pciBacklog, totalBacklogPCI, false)

//Verify SCI Average
WebUI.click(findTestObject('Object Repository/Page_Streetlogix/circle'))

WebUI.delay(5)

String sci = WebUI.getText(findTestObject('Object Repository/Page_Streetlogix/h6_Sidewalk Average Condition 54'))

String sciAvg = sci.replaceAll('[^0-9]', '')

String avgSCI = CustomKeywords.'database_keywords.test.Database_Keywords.getAverageSCI'()

WebUI.verifyMatch(sciAvg, avgSCI, false)

//Verify SCI Miles
String milesSCI = WebUI.getText(findTestObject('Object Repository/Page_Streetlogix/p_Total Length 1,868 miles'))

String sciMiles = milesSCI.replaceAll('[^0-9]', '')

String totalMilesSCI = CustomKeywords.'database_keywords.test.Database_Keywords.getSidewalkMiles'()

WebUI.verifyMatch(sciMiles, totalMilesSCI, false)

//Verify SCI Backlog
String backlogSCI = WebUI.getText(findTestObject('Object Repository/Page_Streetlogix/p_Total Backlog  222,017,072'))

String sciBacklog = backlogSCI.replaceAll('[^0-9]', '')

String totalBacklogSCI = CustomKeywords.'database_keywords.test.Database_Keywords.getSidewalkBacklog'()

WebUI.verifyMatch(sciBacklog, totalBacklogSCI, false)

WebUI.closeBrowser()


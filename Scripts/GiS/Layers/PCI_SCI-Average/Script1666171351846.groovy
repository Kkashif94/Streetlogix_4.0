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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://streetlogix-gis-slx4-develop.vercel.app/?config=64077fc938af4bcc9a46a81d8f4e5576&token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6OTc2LCJuYW1lIjoiU29oYWliIE5laGFsIiwiZXhwIjoxNjc4NzI5ODk0LCJpYXQiOjE2NzYxMzc4OTR9.UHfOiNtJ_le0VZsenXiPbH0qUWaL-Iey0ptbA6Kalco')

WebUI.click(findTestObject('Object Repository/Layers/PCI_SCI_Obj/img_Search_rail-icon'))

String pci = WebUI.getText(findTestObject('Object Repository/Layers/PCI_SCI_Obj/h6_Pavement Average Condition 66'))

String pciAvg = pci.replaceAll('[^0-9]', '')

String avgPCI = CustomKeywords.'database_keywords.test.Database_Keywords.getAveragePCI'()

println(avgPCI)

WebUI.verifyMatch(pciAvg, avgPCI, false)

WebUI.click(findTestObject('Object Repository/Layers/PCI_SCI_Obj/p_Total Length 2,148 miles'))

WebUI.click(findTestObject('Object Repository/Layers/PCI_SCI_Obj/p_Total Backlog  369,246,021'))

WebUI.click(findTestObject('Object Repository/Layers/PCI_SCI_Obj/svg_Pavement Average Condition 66_MuiSvgIco_68ffe8'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Layers/PCI_SCI_Obj/h6_Sidewalk Average Condition 54'))

WebUI.click(findTestObject('Object Repository/Layers/PCI_SCI_Obj/p_Total Length 1,868 miles'))

WebUI.click(findTestObject('Object Repository/Layers/PCI_SCI_Obj/p_Total Backlog  577,330'))

//WebUI.click(findTestObject('Object Repository/Layers/PCI_SCI_Obj/circle'))
WebUI.closeBrowser()


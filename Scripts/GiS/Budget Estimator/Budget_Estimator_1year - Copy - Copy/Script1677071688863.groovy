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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.apache.pdfbox.pdmodel.PDDocument as PDDocument
import org.apache.pdfbox.text.PDFTextStripper as PDFTextStripper
import java.io.File;


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
isFileDownloaded("123.pdf");
deleteFile("123.pdf");




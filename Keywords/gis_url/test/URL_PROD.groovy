package gis_url.test

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

// import internal.GlobalVariable

public class URL_PROD {

	@Keyword
	public void redirectURL() {
		WebUI.openBrowser("https://app.streetlogix.com/?config=64077fc938af4bcc9a46a81d8f4e5576&token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTQyOCwibmFtZSI6IlNvaGFpYiBOZWhhbCIsImV4cCI6MTY3OTE5NjcyNywiaWF0IjoxNjc2NjA0NzI3fQ.Kz-gvOd5J-fT1WMLkVzR-YliVElHaxM9yScW9Ngflfs")
		//		WebUI.openBrowser("http://localhost:8081/?config=6477e9530cb64cafb07cc153da28ac98&url=https://streetlogix-dev-server.herokuapp.com&token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTAyNiwibmFtZSI6IlNocnV0aWthIFNhd2FudCIsImV4cCI6MTYzMjk0MzI4NCwiaWF0IjoxNjMwMzUxMjg0fQ.yJvnYvVKQSVJHgQu0nPHmggvb1PFXMjkQyxNBJEaBew")
		//		WebUI.openBrowser("http://slx4-dev-gis-app.herokuapp.com/?config=d400dc6a3750429893266a80d148a93e&url=https://slx4-dev-server.herokuapp.com&token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTAzOSwibmFtZSI6IlRlc3QgQWRtaW4iLCJleHAiOjE2MzQxNTE5NjAsImlhdCI6MTYzMTU1OTk2MH0.zgZC99ZGk2xbCvqTcHT2AJtmGHZozlP4Vlhe7gzaZe4")
	}
}

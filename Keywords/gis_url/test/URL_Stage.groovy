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

public class URL_Stage {

	@Keyword
	public void redirectURL() {
		WebUI.openBrowser("https://streetlogix-gis-slx4-staging.vercel.app/?config=d1357280059b4237a24c085fa10bd88f&token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6OTc2LCJuYW1lIjoiU29oYWliIE93bmVyIiwiZXhwIjoxNjc3NzQwMjQ2LCJpYXQiOjE2NzUxNDgyNDZ9.7Jk0OqbeOMcz02Qicc8VqxMPcl4Mc8oJDpBcu1ri16o")
		//		WebUI.openBrowser("http://localhost:8081/?config=6477e9530cb64cafb07cc153da28ac98&url=https://streetlogix-dev-server.herokuapp.com&token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTAyNiwibmFtZSI6IlNocnV0aWthIFNhd2FudCIsImV4cCI6MTYzMjk0MzI4NCwiaWF0IjoxNjMwMzUxMjg0fQ.yJvnYvVKQSVJHgQu0nPHmggvb1PFXMjkQyxNBJEaBew")
		//		WebUI.openBrowser("http://slx4-dev-gis-app.herokuapp.com/?config=d400dc6a3750429893266a80d148a93e&url=https://slx4-dev-server.herokuapp.com&token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTAzOSwibmFtZSI6IlRlc3QgQWRtaW4iLCJleHAiOjE2MzQxNTE5NjAsImlhdCI6MTYzMTU1OTk2MH0.zgZC99ZGk2xbCvqTcHT2AJtmGHZozlP4Vlhe7gzaZe4")
	}
}

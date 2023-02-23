package signtypeslayer_code.test

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

import internal.GlobalVariable

public class code_sign_type_layer {

	@Keyword
	public void code() {
		WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/span_Pavement Evaluation'))

		WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/span_Sign Types'))

		WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/span_Decrease opacity_esri-layer-list__chil_0d6485'))

		WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/span_Street Sign'))

		WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/span_Street Sign'))

		String signTypes = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/h3_Sign Types'))

		WebUI.verifyMatch(signTypes, "Sign Types", false)

		String streetSign = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Street Sign'))

		WebUI.verifyMatch(streetSign, "Street Sign", false)

		WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

		String objectid = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_objectid'))

		WebUI.verifyMatch(objectid, "objectid", false)

		String signlegend = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_signlegend'))

		WebUI.verifyMatch(signlegend, "signlegend", false)

		String mutcd = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_mutcd'))

		WebUI.verifyMatch(mutcd, "mutcd", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_mutcd'), 0)

		String signcondition = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_signcondition'))

		WebUI.verifyMatch(signcondition, "signcondition", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_positiononpost'), 0)

		String positiononpost = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_positiononpost'))

		WebUI.verifyMatch(positiononpost, "positiononpost", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_postmaterial'), 0)

		String postmaterial = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_postmaterial'))

		WebUI.verifyMatch(postmaterial, "postmaterial", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_signcategory'), 0)

		String signcategory = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_signcategory'))

		WebUI.verifyMatch(signcategory, "signcategory", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_positioninrow'), 0)

		String positioninrow = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_positioninrow'))

		WebUI.verifyMatch(positioninrow, "positioninrow", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_signorientation'), 0)

		String signorientation = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_signorientation'))

		WebUI.verifyMatch(signorientation, "signorientation", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_signtype'), 0)

		String signtype = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_signtype'))

		WebUI.verifyMatch(signtype, "signtype", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_signposttype'), 0)

		String signposttype = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_signposttype'))

		WebUI.verifyMatch(signposttype, "signposttype", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_symbol'), 0)

		String symbol = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_symbol'))

		WebUI.verifyMatch(symbol, "symbol", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_sign_id'), 0)

		String sign_id = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_sign_id'))

		WebUI.verifyMatch(sign_id, "sign_id", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_x_point'), 0)

		String x_point = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_x_point'))

		WebUI.verifyMatch(x_point, "x_point", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_y_point'), 0)

		String y_point = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_y_point'))

		WebUI.verifyMatch(y_point, "y_point", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_date'), 0)

		String date = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_date'))

		WebUI.verifyMatch(date, "date", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_Image Path'), 0)

		String imagePath = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_Image Path'))

		WebUI.verifyMatch(imagePath, "Image Path", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_uid'), 0)

		String uid = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/vaadin-grid-sorter_uid'))

		WebUI.verifyMatch(uid, "uid", false)

		String buttonStreetSign = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/button_Street Sign'))

		WebUI.verifyMatch(buttonStreetSign, "STREET SIGN", false)

		WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Street Sign (Features 21,847, Selected 0)'))

		WebUI.click(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Esri_sc-gKAaRy bVZRMQ'))

		String rightTopArrow = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Right Top Arrow'))

		WebUI.verifyMatch(rightTopArrow, "Right Top Arrow", false)

		String rightDownArrow = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_RightDownArrow'))

		WebUI.verifyMatch(rightDownArrow, "RightDownArrow", false)

		String speed55 = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 55'))

		WebUI.verifyMatch(speed55, "SPEED LIMIT 55", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 45'), 0)

		String speed45 = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 45'))

		WebUI.verifyMatch(speed45, "SPEED LIMIT 45", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 10'), 0)

		String speed10 = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 10'))

		WebUI.verifyMatch(speed10, "SPEED LIMIT 10", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_RightTurnWarning'), 0)

		String rightTurnWarning = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_RightTurnWarning'))

		WebUI.verifyMatch(rightTurnWarning, "RightTurnWarning", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_DoubleArrow'), 0)

		String doubleArrow = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_DoubleArrow'))

		WebUI.verifyMatch(doubleArrow, "DoubleArrow", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_TruckWeight'), 0)

		String truckWeight = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_TruckWeight'))

		WebUI.verifyMatch(truckWeight, "TruckWeight", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_split'), 0)

		String split = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Split'))

		WebUI.verifyMatch(split, "Split", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_RightTurn'), 0)

		String rightTurn = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_RightTurn'))

		WebUI.verifyMatch(rightTurn, "RightTurn", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_CenterTurn'), 0)

		String centerTurn = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_CenterTurn'))

		WebUI.verifyMatch(centerTurn, "CenterTurn", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_RightCurve'), 0)

		String rightCurve = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_RightCurve'))

		WebUI.verifyMatch(rightCurve, "RightCurve", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_T Intersection'), 0)

		String TIntersection = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_T Intersection'))

		WebUI.verifyMatch(TIntersection, "T Intersection", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Stop Ahead'), 0)

		String stopAhead = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Stop Ahead'))

		WebUI.verifyMatch(stopAhead, "Stop Ahead", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Left Turn Signal'), 0)

		String leftTurnSignal = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Left Turn Signal'))

		WebUI.verifyMatch(leftTurnSignal, "Left Turn Signal", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Right Turn Only'), 0)

		String rightTurnOnly = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Right Turn Only'))

		WebUI.verifyMatch(rightTurnOnly, "Right Turn Only", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_South'), 0)

		String south = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_South'))

		WebUI.verifyMatch(south, "South", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_TopLeftArrow'), 0)

		String topLeftArrow = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_TopLeftArrow'))

		WebUI.verifyMatch(topLeftArrow, "TopLeftArrow", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_West'), 0)

		String west = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_West'))

		WebUI.verifyMatch(west, "West", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_No Stopping'), 0)

		String noStopping = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_No Stopping'))

		WebUI.verifyMatch(noStopping, "No Stopping", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_HorseCrossing'), 0)

		String horseCrossing = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_HorseCrossing'))

		WebUI.verifyMatch(horseCrossing, "HorseCrossing", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_AddressMarker'), 0)

		String addressMaker = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_AddressMarker'))

		WebUI.verifyMatch(addressMaker, "AddressMarker", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_RailroadCrossing'), 0)

		String railroadCrossing = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_RailroadCrossing'))

		WebUI.verifyMatch(railroadCrossing, "RailroadCrossing", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_YieldAhead'), 0)

		String yeildAhead = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_YieldAhead'))

		WebUI.verifyMatch(yeildAhead, "YieldAhead", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_RoadEntersCurve'), 0)

		String roadEntersCurve = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_RoadEntersCurve'))

		WebUI.verifyMatch(roadEntersCurve, "RoadEntersCurve", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_TruckCrossing'), 0)

		String truckCrossing = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_TruckCrossing'))

		WebUI.verifyMatch(truckCrossing, "TruckCrossing", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Handicap Crossing'), 0)

		String handicapCrossing = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Handicap Crossing'))

		WebUI.verifyMatch(handicapCrossing, "Handicap Crossing", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Bear'), 0)

		String bear = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Bear'))

		WebUI.verifyMatch(bear, "Bear", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 90'), 0)

		String speed90 = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 90'))

		WebUI.verifyMatch(speed90, "SPEED LIMIT 90", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 70'), 0)

		String speed70 = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 70'))

		WebUI.verifyMatch(speed70, "SPEED LIMIT 70", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 60'), 0)

		String speed60 = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 60'))

		WebUI.verifyMatch(speed60, "SPEED LIMIT 60", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 50'), 0)

		String speed50 = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 50'))

		WebUI.verifyMatch(speed50, "SPEED LIMIT 50", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_NoThruTraffic'), 0)

		String noThruTraffic = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_NoThruTraffic'))

		WebUI.verifyMatch(noThruTraffic, "NoThruTraffic", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_StraightRight'), 0)

		String straightRight = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_StraightRight'))

		WebUI.verifyMatch(straightRight, "StraightRight", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_GeneralWarning'), 0)

		String generalWarning = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_GeneralWarning'))

		WebUI.verifyMatch(generalWarning, "GeneralWarning", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Windy'), 0)

		String windy = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Windy'))

		WebUI.verifyMatch(windy, "Windy", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_AdditionalInformation'), 0)

		String additionalInfo = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_AdditionalInformation'))

		WebUI.verifyMatch(additionalInfo, "AdditionalInformation", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_LeftTurnOnly'), 0)

		String leftTurnOnly = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_LeftTurnOnly'))

		WebUI.verifyMatch(leftTurnOnly, "LeftTurnOnly", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_LeftDownArrow'), 0)

		String leftDownArrow = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_LeftDownArrow'))

		WebUI.verifyMatch(leftDownArrow, "LeftDownArrow", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Signal Ahead'), 0)

		String signalAhead = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Signal Ahead'))

		WebUI.verifyMatch(signalAhead, "Signal Ahead", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_PedestriansBicycles'), 0)

		String pedestrianBicycles = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_PedestriansBicycles'))

		WebUI.verifyMatch(pedestrianBicycles, "Pedestrians/Bicycles", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Begin Divided'), 0)

		String beginDivided = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Begin Divided'))

		WebUI.verifyMatch(beginDivided, "Begin Divided", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_EndSchoolZone'), 0)

		String endSchoolZone = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_EndSchoolZone'))

		WebUI.verifyMatch(endSchoolZone, "EndSchoolZone", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SchoolBusStopAhead'), 0)

		String schoolBusStopAhead = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SchoolBusStopAhead'))

		WebUI.verifyMatch(schoolBusStopAhead, "SchoolBusStopAhead", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_EmergencyRoute'), 0)

		String emergencyRoute = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_EmergencyRoute'))

		WebUI.verifyMatch(emergencyRoute, "EmergencyRoute", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_RightTurnOnly'), 0)

		String rightturnOnly = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_RightTurnOnly'))

		WebUI.verifyMatch(rightturnOnly, "RightTurnOnly", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_StraightLeft'), 0)

		String straightleft = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_StraightLeft'))

		WebUI.verifyMatch(straightleft, "StraightLeft", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_GolfCart'), 0)

		String golfCart = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_GolfCart'))

		WebUI.verifyMatch(golfCart, "GolfCart", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SpeedWarning'), 0)

		String speedWarning = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SpeedWarning'))

		WebUI.verifyMatch(speedWarning, "SpeedWarning", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_LaneEndsMerge'), 0)

		String laneEndsMerge = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_LaneEndsMerge'))

		WebUI.verifyMatch(laneEndsMerge, "LaneEndsMerge", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_StraightOnly'), 0)

		String straightOnly = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_StraightOnly'))

		WebUI.verifyMatch(straightOnly, "StraightOnly", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_DistanceWarning'), 0)

		String distanceWarning = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_DistanceWarning'))

		WebUI.verifyMatch(distanceWarning, "DistanceWarning", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_No Pedestrians'), 0)

		String noPedestrians = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_No Pedestrians'))

		WebUI.verifyMatch(noPedestrians, "No Pedestrians", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_NoLeftorUTurn'), 0)

		String noLeftUTurn = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_NoLeftorUTurn'))

		WebUI.verifyMatch(noLeftUTurn, "NoLeftorUTurn", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Right Arrow'), 0)

		String rightarrow = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Right Arrow'))

		WebUI.verifyMatch(rightarrow, "Right Arrow", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Roundabout'), 0)

		String Roundabout = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Roundabout'))

		WebUI.verifyMatch(Roundabout, "Roundabout", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_NoOutlet'), 0)

		String noOutlet = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_NoOutlet'))

		WebUI.verifyMatch(noOutlet, "NoOutlet", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Curve'), 0)

		String curve =WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Curve'))

		WebUI.verifyMatch(curve, "Curve", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Unknown'), 0)

		String unknown = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Unknown'))

		WebUI.verifyMatch(unknown, "Unknown", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_One Way'), 0)

		String oneWay = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_One Way'))

		WebUI.verifyMatch(oneWay, "One Way", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Bicycle Warning'), 0)

		String bicycleWarning = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Bicycle Warning'))

		WebUI.verifyMatch(bicycleWarning, "Bicycle Warning", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_General Guide'), 0)

		String generalGuide = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_General Guide'))

		WebUI.verifyMatch(generalGuide, "General Guide", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Tow-Away Zone'), 0)

		String towAwayZOne = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Tow-Away Zone'))

		WebUI.verifyMatch(towAwayZOne, "Tow-Away Zone", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_All Way Stop'), 0)

		String allWayStop = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_All Way Stop'))

		WebUI.verifyMatch(allWayStop, "All Way Stop", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_No Left Turn'), 0)

		String noLeftTurn = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_No Left Turn'))

		WebUI.verifyMatch(noLeftTurn, "No Left Turn", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Stop'), 0)

		String stop = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Stop'))

		WebUI.verifyMatch(stop, "Stop", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_R R Crossing X'), 0)

		String rrCrossing = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_R R Crossing X'))

		WebUI.verifyMatch(rrCrossing, "R R Crossing X", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Left Turn Yield On Green'), 0)

		String leftTurnYeildGreen = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Left Turn Yield On Green'))

		WebUI.verifyMatch(leftTurnYeildGreen, "Left Turn Yield On Green", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_General Warning'), 0)

		String gWarning = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_General Warning'))

		WebUI.verifyMatch(gWarning, "General Warning", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Hospital'), 0)

		String hospital = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Hospital'))

		WebUI.verifyMatch(hospital, "Hospital", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_General Regulatory'), 0)

		String gRegulatory = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_General Regulatory'))

		WebUI.verifyMatch(gRegulatory, "General Regulatory", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Recreation'), 0)

		String recreation = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Recreation'))

		WebUI.verifyMatch(recreation, "Recreation", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_General School'), 0)

		String gSchool = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_General School'))

		WebUI.verifyMatch(gSchool, "General School", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_15 MPH - Warning'), 0)

		String warning = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_15 MPH - Warning'))

		WebUI.verifyMatch(warning, "15 MPH - Warning", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_3-WAY'), 0)

		String threeWay = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_3-WAY'))

		WebUI.verifyMatch(threeWay, "3-WAY", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_AddLanes'), 0)

		String AddLanes = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_AddLanes'))

		WebUI.verifyMatch(AddLanes, "AddLanes", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Bidirectional Arrow'), 0)

		String bidirectionalArrow = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Bidirectional Arrow'))

		WebUI.verifyMatch(bidirectionalArrow, "Bidirectional Arrow", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Bike Info'), 0)

		String bikeInfo = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Bike Info'))

		WebUI.verifyMatch(bikeInfo, "Bike Info", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_BikeLane'), 0)

		String bikeLane = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_BikeLane'))

		WebUI.verifyMatch(bikeLane, "BikeLane", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Bike Route'), 0)

		String bikeRoute = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Bike Route'))

		WebUI.verifyMatch(bikeRoute, "Bike Route", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_BusStop'), 0)

		String busStop = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_BusStop'))

		WebUI.verifyMatch(busStop, "BusStop", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Bump'), 0)

		String bump = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Bump'))

		WebUI.verifyMatch(bump, "Bump", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_CenterLaneRestrictions'), 0)

		String centerLaneRestrictions = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_CenterLaneRestrictions'))

		WebUI.verifyMatch(centerLaneRestrictions, "CenterLaneRestrictions", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Chevron'), 0)

		String chevron = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Chevron'))

		WebUI.verifyMatch(chevron, "Chevron", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_DeadEnd'), 0)

		String deadEnd = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_DeadEnd'))

		WebUI.verifyMatch(deadEnd, "DeadEnd", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_DeerCrossing'), 0)

		String deerCrossing = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_DeerCrossing'))

		WebUI.verifyMatch(deerCrossing, "DeerCrossing", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_DiagonalArrow'), 0)

		String diagonalArrow = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_DiagonalArrow'))

		WebUI.verifyMatch(diagonalArrow, "DiagonalArrow", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_DoNotBlock'), 0)

		String doNotBlock = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_DoNotBlock'))

		WebUI.verifyMatch(doNotBlock, "DoNotBlock", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_DoNotPass'), 0)

		String doNotPass = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_DoNotPass'))

		WebUI.verifyMatch(doNotPass, "DoNotPass", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_DoNotStopOnTracks'), 0)

		String doNotStopOnTracks = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_DoNotStopOnTracks'))

		WebUI.verifyMatch(doNotStopOnTracks, "DoNotStopOnTracks", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Double Arrow'), 0)

		String DoubleArrow = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Double Arrow'))

		WebUI.verifyMatch(DoubleArrow, "Double Arrow", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_DoubleSideArrow'), 0)

		String doubleSideArrow = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_DoubleSideArrow'))

		WebUI.verifyMatch(doubleSideArrow, "DoubleSideArrow", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_DoNotEnter'), 0)

		String doNotEnter = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_DoNotEnter'))

		WebUI.verifyMatch(doNotEnter, "DoNotEnter", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Dog'), 0)

		String dog =WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Dog'))

		WebUI.verifyMatch(dog, "Dog", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_East'), 0)

		String east = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_East'))

		WebUI.verifyMatch(east, "East", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_END'), 0)

		String end = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_END'))

		WebUI.verifyMatch(end, "END", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_ForwardStraightRightArrow'), 0)

		String forwardStraightRightArrow = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_ForwardStraightRightArrow'))

		WebUI.verifyMatch(forwardStraightRightArrow, "ForwardStraightRightArrow", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_General'), 0)

		String general = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_General'))

		WebUI.verifyMatch(general, "General", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Information'), 0)

		String information = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Information'))

		WebUI.verifyMatch(information, "Information", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Interstate'), 0)

		String interstate = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Interstate'))

		WebUI.verifyMatch(interstate, "Interstate", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_JCT'), 0)

		String jct = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_JCT'))

		WebUI.verifyMatch(jct, "JCT", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_KeepRight'), 0)

		String keepRight = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_KeepRight'))

		WebUI.verifyMatch(keepRight, "KeepRight", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Left Arrow'), 0)

		String leftarrow = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Left Arrow'))

		WebUI.verifyMatch(leftarrow, "Left Arrow", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Left Arrow Ahead'), 0)

		String leftArrowAhead = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Left Arrow Ahead'))

		WebUI.verifyMatch(leftArrowAhead, "Left Arrow Ahead", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_LeftTopArrowAhead'), 0)

		String leftTopArrowAhead = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_LeftTopArrowAhead'))

		WebUI.verifyMatch(leftTopArrowAhead, "LeftTopArrowAhead", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_LeftCurveWarning'), 0)

		String leftCurveWarning = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_LeftCurveWarning'))

		WebUI.verifyMatch(leftCurveWarning, "LeftCurveWarning", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_LeftLaneEnds'), 0)

		String leftLaneEnds = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_LeftLaneEnds'))

		WebUI.verifyMatch(leftLaneEnds, "LeftLaneEnds", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_LeftTurnWarning'), 0)

		String leftTurnWarning = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_LeftTurnWarning'))

		WebUI.verifyMatch(leftTurnWarning, "LeftTurnWarning", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_LowClearance'), 0)

		String lowClearance = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_LowClearance'))

		WebUI.verifyMatch(lowClearance, "LowClearance", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_MandatoryLeft'), 0)

		String mandatoryLeft = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_MandatoryLeft'))

		WebUI.verifyMatch(mandatoryLeft, "MandatoryLeft", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_MandatoryRight'), 0)

		String mandatoryRight = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_MandatoryRight'))

		WebUI.verifyMatch(mandatoryRight, "MandatoryRight", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Merge'), 0)

		String merge = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Merge'))

		WebUI.verifyMatch(merge, "Merge", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_NO TRAIN HORN'), 0)

		String noTrainHorn = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_NO TRAIN HORN'))

		WebUI.verifyMatch(noTrainHorn, "NO TRAIN HORN", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_NO TURN ON RED'), 0)

		String noTurnOnRed = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_NO TURN ON RED'))

		WebUI.verifyMatch(noTurnOnRed, "NO TURN ON RED", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_No Parking'), 0)

		String noParking = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_No Parking'))

		WebUI.verifyMatch(noParking, "No Parking", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_No Parking Bus Stop'), 0)

		String noParkingBusStop = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_No Parking Bus Stop'))

		WebUI.verifyMatch(noParkingBusStop, "No Parking Bus Stop", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_NoDumping'), 0)

		String noDumping = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_NoDumping'))

		WebUI.verifyMatch(noDumping, "NoDumping", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_No Right Turn'), 0)

		String noRightTurn = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_No Right Turn'))

		WebUI.verifyMatch(noRightTurn, "No Right Turn", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_NoUTurn'), 0)

		String noUTurn = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_NoUTurn'))

		WebUI.verifyMatch(noUTurn, "NoUTurn", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_NoTrucks'), 0)

		String noTruck = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_NoTrucks'))

		WebUI.verifyMatch(noTruck, "NoTrucks", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_No Motor Vehicles'), 0)

		String noMotorVehicles = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_No Motor Vehicles'))

		WebUI.verifyMatch(noMotorVehicles, "No Motor Vehicles", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_NotAThruStreet'), 0)

		String notAThruStreet = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_NotAThruStreet'))

		WebUI.verifyMatch(notAThruStreet, "NotAThruStreet", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_North'), 0)

		String north = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_North'))

		WebUI.verifyMatch(north, "North", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_ObjectMarker'), 0)

		String objectMaker = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_ObjectMarker'))

		WebUI.verifyMatch(objectMaker, "ObjectMarker", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Other'), 0)

		String other = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Other'))

		WebUI.verifyMatch(other, "Other", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_OtherGuide'), 0)

		String otherGuide = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_OtherGuide'))

		WebUI.verifyMatch(otherGuide, "OtherGuide", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_P'), 0)

		String P = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_P'))

		WebUI.verifyMatch(P, "P", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Parking'), 0)

		String parking = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Parking'))

		WebUI.verifyMatch(parking, "Parking", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_PavementWidth'), 0)

		String pavementWidth = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_PavementWidth'))

		WebUI.verifyMatch(pavementWidth, "PavementWidth", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Pedestrian'), 0)

		String pedestrian = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Pedestrian'))

		WebUI.verifyMatch(pedestrian, "Pedestrian", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Playground Warning'), 0)

		String playgorundWarning = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Playground Warning'))

		WebUI.verifyMatch(playgorundWarning, "Playground Warning", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_R R Crossing'), 0)

		String RRCrossing = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_R R Crossing'))

		WebUI.verifyMatch(RRCrossing, "R R Crossing", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Reserved Parking'), 0)

		String reservedParking = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Reserved Parking'))

		WebUI.verifyMatch(reservedParking, "Reserved Parking", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_RightLaneEnds'), 0)

		String rightLaneEnds = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_RightLaneEnds'))

		WebUI.verifyMatch(rightLaneEnds, "RightLaneEnds", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_RoadNarrows'), 0)

		String roadNarrows = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_RoadNarrows'))

		WebUI.verifyMatch(roadNarrows, "RoadNarrows", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_RouteGuide'), 0)

		String routeGuide = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_RouteGuide'))

		WebUI.verifyMatch(routeGuide, "RouteGuide", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SideArrow'), 0)

		String sideArrow = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SideArrow'))

		WebUI.verifyMatch(sideArrow, "SideArrow", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SideRoad'), 0)

		String sideRoad = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SideRoad'))

		WebUI.verifyMatch(sideRoad, "SideRoad", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SlipperyWhenWet'), 0)

		String slipperyWhenwet = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SlipperyWhenWet'))

		WebUI.verifyMatch(slipperyWhenwet, "SlipperyWhenWet", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SOUTH (1)'), 0)

		String south1 = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SOUTH (1)'))

		WebUI.verifyMatch(south1, "SOUTH", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 15'), 0)

		String speed15 = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 15'))

		WebUI.verifyMatch(speed15, "SPEED LIMIT 15", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 20'), 0)

		String speed20 = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 20'))

		WebUI.verifyMatch(speed20, "SPEED LIMIT 20", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 25'), 0)

		String speed25 = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 25'))

		WebUI.verifyMatch(speed25, "SPEED LIMIT 25", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 30'), 0)

		String speed30 = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 30'))

		WebUI.verifyMatch(speed30, "SPEED LIMIT 30", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 35'), 0)

		String speed35 = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 35'))

		WebUI.verifyMatch(speed35, "SPEED LIMIT 35", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 40'), 0)

		String speed40 = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 40'))

		WebUI.verifyMatch(speed40, "SPEED LIMIT 40", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 5'), 0)

		String speed5 = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SPEED LIMIT 5'))

		WebUI.verifyMatch(speed5, "SPEED LIMIT 5", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_School'), 0)

		String School = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_School'))

		WebUI.verifyMatch(School, "School", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SlowChildren'), 0)

		String slowChildren = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SlowChildren'))

		WebUI.verifyMatch(slowChildren, "SlowChildren", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Snow Restrictions'), 0)

		String snowRestrictions = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Snow Restrictions'))

		WebUI.verifyMatch(snowRestrictions, "Snow Restrictions", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SpeedBump'), 0)

		String speedBump = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_SpeedBump'))

		WebUI.verifyMatch(speedBump, "SpeedBump", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_StraightTopRightArrow'), 0)

		String straightTopRightArrow = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_StraightTopRightArrow'))

		WebUI.verifyMatch(straightTopRightArrow, "StraightTopRightArrow", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_State Route'), 0)

		String stateRoute = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_State Route'))

		WebUI.verifyMatch(stateRoute, "State Route", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_StopAhead'), 0)

		String StopAhead = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_StopAhead'))

		WebUI.verifyMatch(StopAhead, "StopAhead", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_StopHereOnRed'), 0)

		String StopHereOnRed = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_StopHereOnRed'))

		WebUI.verifyMatch(StopHereOnRed, "StopHereOnRed", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Straight Arrow'), 0)

		String Straightarrow = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Straight Arrow'))

		WebUI.verifyMatch(Straightarrow, "Straight Arrow", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_StreetName'), 0)

		String streetName = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_StreetName'))

		WebUI.verifyMatch(streetName, "StreetName", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_TO'), 0)

		String TO = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_TO'))

		WebUI.verifyMatch(TO, "TO", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Turn Regulation'), 0)

		String turnRegulation = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Turn Regulation'))

		WebUI.verifyMatch(turnRegulation, "Turn Regulation", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_TwoWayTraffic'), 0)

		String twoWayTraffic = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_TwoWayTraffic'))

		WebUI.verifyMatch(twoWayTraffic, "TwoWayTraffic", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_US Route'), 0)

		String usRoute = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_US Route'))

		WebUI.verifyMatch(usRoute, "US Route", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Yield'), 0)

		String yield = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Yield'))

		WebUI.verifyMatch(yield, "Yield", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Yield Ahead'), 0)

		String YieldAhead = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Yield Ahead'))

		WebUI.verifyMatch(YieldAhead, "Yield Ahead", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Yield to Pedestrians'), 0)

		String yieldToPedestrians = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_Yield to Pedestrians'))

		WebUI.verifyMatch(yieldToPedestrians, "Yield to Pedestrians", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_WRONG WAY'), 0)

		String wrongWay = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_WRONG WAY'))

		WebUI.verifyMatch(wrongWay, "WRONG WAY", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_WEST (1)'), 0)

		String west1 = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_WEST (1)'))

		WebUI.verifyMatch(west1, "WEST", false)

		WebUI.scrollToElement(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_all other values'), 0)

		String allOtherValues = WebUI.getText(findTestObject('Object Repository/DashBoard_Layers/Sign_Types/Page_Streetlogix/div_all other values'))

		WebUI.verifyMatch(allOtherValues, "<all other values>", false)
	}
}

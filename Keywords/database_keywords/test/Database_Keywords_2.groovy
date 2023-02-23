package database_keywords.test

import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import groovy.json.JsonSlurper
import com.kms.katalon.core.annotation.Keyword

import com.kms.katalon.core.util.KeywordUtil

import org.testng.Assert


public class Database_Keywords_2 {

	Connection c = null;
	Statement stmt = null;

	@Keyword
	public void openConnection() {

		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/development4_louisville", "sde", "V0ters!23");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
	}

	@Keyword
	public void closeConnection(){
		c.close()
	}

	@Keyword
	public int getAveragePCI() {
		openConnection()
		def queryString = "SELECT * from sde.pavement_evaluation_loc"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		double PCI = 0;
		double totalLength = 0;
		double pciLength = 0;
		double length = 0;
		double product = 0;
		while(result.next()) {
			PCI = result.getInt('pci')
			length = result.getInt('length_ft')
			pciLength = pciLength + PCI * length
			totalLength = totalLength + length
		}
		double avgPCI = pciLength / totalLength
		return avgPCI.round()
		closeConnection()
	}

	@Keyword
	public int getAveragePCIByFilter(def filter, def category) {
		openConnection()
		def queryString = "SELECT * from sde.pavement_evaluation_loc where " + filter + " = '" + category + "'"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		double PCI = 0;
		double totalLength = 0;
		double pciLength = 0;
		double length = 0;
		double product = 0;
		while(result.next()) {
			PCI = result.getInt('pci')
			length = result.getInt('length_ft')
			pciLength = pciLength + PCI * length
			totalLength = totalLength + length
		}
		double avgPCI = pciLength / totalLength
		return avgPCI.round()
		closeConnection()
	}

	@Keyword
	public int deletebudgets() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/_common_db_slx4", "sde", "V0ters!23");
		def queryString = "delete from sde.enhanced_budget_planner where database_name = 'development4_louisville'"
		def deletebudgets = 0
		Statement stm = c.createStatement()
		deletebudgets = stm.executeUpdate(queryString)
		return deletebudgets

		closeConnection()
	}


	@Keyword
	public int getAveragePCIByFilterForNullWard() {
		openConnection()
		def queryString = "SELECT * from sde.pavement_evaluation_loc where ward is null"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		double PCI = 0;
		double totalLength = 0;
		double pciLength = 0;
		double length = 0;
		double product = 0;
		while(result.next()) {
			PCI = result.getInt('pci')
			length = result.getInt('length_ft')
			pciLength = pciLength + PCI * length
			totalLength = totalLength + length
		}
		double avgPCI = pciLength / totalLength
		return avgPCI.round()
		closeConnection()
	}

	@Keyword
	public int getMinimumPCI() {
		openConnection()
		def queryString = "SELECT * from sde.pavement_evaluation_loc order by pci ASC LIMIT 1"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		double PCI = 0;
		while(result.next()) {
			PCI = result.getInt('pci')
		}
		return PCI
		closeConnection()
	}

	@Keyword
	public int getMaximumPCI() {
		openConnection()
		def queryString = "SELECT * from sde.pavement_evaluation_loc order by pci DESC LIMIT 1"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		double PCI = 0;
		while(result.next()) {
			PCI = result.getInt('pci')
		}
		return PCI
		closeConnection()
	}

	@Keyword
	public int getMinimumFunctionalCLassID() {
		openConnection()
		def queryString = "SELECT * from sde.pavement_evaluation_loc order by functional_class_id ASC LIMIT 1"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		def id = 0;
		while(result.next()) {
			id = result.getInt('functional_class_id')
		}
		return id
		closeConnection()
	}

	@Keyword
	public int getMaximumFunctionalCLassID() {
		openConnection()
		def queryString = "SELECT * from sde.pavement_evaluation_loc order by functional_class_id DESC LIMIT 1"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		def id = 0;
		while(result.next()) {
			id = result.getInt('functional_class_id')
		}
		return id
		closeConnection()
	}

	@Keyword
	public int getPavementMiles() {
		openConnection()
		def queryString = "SELECT length_ft from sde.pavement_evaluation_loc"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		double miles = 0;
		while(result.next()) {
			miles = miles + result.getInt('length_ft')
		}
		double totalMiles = miles/5280
		return totalMiles.round()
		closeConnection()
	}

	@Keyword
	public int getPavementBacklog() {
		openConnection()
		def queryString = "SELECT estimated_cost from sde.pavement_evaluation_loc"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		double backlog = 0;
		while(result.next()) {
			backlog = backlog + result.getInt('estimated_cost')
		}
		double totalBacklog = backlog
		return totalBacklog.round()
		closeConnection()
	}

	@Keyword
	public int getAverageSCI() {
		openConnection()
		def queryString = "SELECT * from sde.sidewalk_evaluation_loc"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		double SCI = 0;
		double totalLength = 0;
		double sciLength = 0;
		double length = 0;
		double product = 0;
		while(result.next()) {
			SCI = result.getInt('sci')
			length = result.getInt('length_ft')
			sciLength = sciLength + SCI * length
			totalLength = totalLength + length
		}
		double avgSCI = sciLength / totalLength
		return avgSCI.round()
		closeConnection()
	}

	@Keyword
	public int getAverageSCIByFilter(def filter, def category) {
		openConnection()
		def queryString = "SELECT * from sde.sidewalk_evaluation_loc where " + filter + " = '" + category + "'"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		double SCI = 0;
		double totalLength = 0;
		double sciLength = 0;
		double length = 0;
		double product = 0;
		while(result.next()) {
			SCI = result.getInt('sci')
			length = result.getInt('length_ft')
			sciLength = sciLength + SCI * length
			totalLength = totalLength + length
		}
		double avgSCI = sciLength / totalLength
		return avgSCI.round()
		closeConnection()
	}

	@Keyword
	public int getAverageSCIByFilterForNullWard() {
		openConnection()
		def queryString = "SELECT * from sde.sidewalk_evaluation_loc where ward is null"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		double SCI = 0;
		double totalLength = 0;
		double sciLength = 0;
		double length = 0;
		double product = 0;
		while(result.next()) {
			SCI = result.getInt('sci')
			length = result.getInt('length_ft')
			sciLength = sciLength + SCI * length
			totalLength = totalLength + length
		}
		double avgSCI = sciLength / totalLength
		return avgSCI.round()
		closeConnection()
	}

	@Keyword
	public int getSidewalkMiles() {
		openConnection()
		def queryString = "SELECT length_ft from sde.sidewalk_evaluation_loc"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		double miles = 0;
		while(result.next()) {
			miles = miles + result.getInt('length_ft')
		}
		double totalMiles = miles/5280
		return totalMiles.round()
		closeConnection()
	}

	@Keyword
	public int getSidewalkBacklog() {
		openConnection()
		def queryString = "SELECT estimated_cost from sde.sidewalk_evaluation_loc"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		double backlog = 0;
		while(result.next()) {
			backlog = backlog + result.getInt('estimated_cost')
		}
		double totalBacklog = backlog
		return totalBacklog.round()
		closeConnection()
	}

	@Keyword
	def array() {
		openConnection()
		def queryString = "SELECT * from sde.pavement_evaluation_loc WHERE objectid = 12"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		def attributes = []

		while(result.next()) {
			for(int i=1; i <= 40 ; i++) {
				attributes.add(result.getString(i))
			}
		}
		return attributes
		closeConnection()
	}

	@Keyword
	def getLastEditTime() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/development_portal", "sde", "V0ters!23");
		def queryString = "SELECT * from sde.pavement_evaluation_loc WHERE objectid = 12"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		def date = 0

		while(result.next()) {
			date = result.getString('last_edit')
		}
		return date
		closeConnection()
	}

	@Keyword
	def autoUpdate(def PCI) {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/_common_db", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.decision_tree ORDER BY id DESC LIMIT 1"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)

		def decisionTree = null
		def list = null
		while(result.next()){
			decisionTree = result.getString('decision_tree')
			list = new JsonSlurper().parseText(decisionTree )
		}
		def maintenanceSuggestion = []
		def costs = []
		def pciBoundary = []
		def boundary = null
		list.each{
			def res = it.getAt('query')
			boundary = res.findAll(/\d{1,3}(?:\.\d{1,2})?/)
			pciBoundary.add(boundary)
			maintenanceSuggestion.add(it.getAt('ms'))
			costs.add(it.getAt('uc'))
		}

		def map = [
			maintenanceSuggestion,
			pciBoundary,
			costs
		].transpose()
		def pci = PCI
		def val = null
		int min = 0
		int max = 0
		def item = null
		def cost = 0
		def array = []
		for(int i = 0; i < map.size(); i++) {
			item = map[i]
			val = item[1]
			min = Integer.parseInt(val[0])
			max = Integer.parseInt(val[1])
			if(pci > min && pci < max) {
				array.add(item[0])
				array.add(item[2])
			}
		}
		return array
		closeConnection()
	}

	@Keyword
	def decisionTreeMinMaxPCI() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/_common_db", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.decision_tree WHERE id = 144"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)

		def decisionTree = null
		def list = null
		while(result.next()){
			decisionTree = result.getString('decision_tree')
			list = new JsonSlurper().parseText(decisionTree )
		}
		def pciBoundary = []
		def boundary = null
		list.each{
			def res = it.getAt('query')
			boundary = res.findAll(/\d{1,3}(?:\.\d{1,2})?/)
			pciBoundary.add(boundary)
		}
		return pciBoundary
		closeConnection()
	}

	@Keyword
	def decisionTreeMaintenanceSuggestion() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/_common_db", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.decision_tree WHERE id = 144"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)

		def decisionTree = null
		def list = null
		while(result.next()){
			decisionTree = result.getString('decision_tree')
			list = new JsonSlurper().parseText(decisionTree )
		}
		def maintenanceSuggestion = []
		list.each{
			maintenanceSuggestion.add(it.getAt('ms'))
		}
		return maintenanceSuggestion
		closeConnection()
	}

	@Keyword
	def decisionTreeCost() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/_common_db", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.decision_tree WHERE id = 144"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)

		def decisionTree = null
		def list = null
		while(result.next()){
			decisionTree = result.getString('decision_tree')
			list = new JsonSlurper().parseText(decisionTree )
		}
		def cost = []
		list.each{
			cost.add(it.getAt('uc'))
		}
		return cost
		closeConnection()
	}

	@Keyword
	def decisionTreeMinMaxPCILoadNew() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/_common_db", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.decision_tree WHERE id = 76"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)

		def decisionTree = null
		def list = null
		while(result.next()){
			decisionTree = result.getString('decision_tree')
			list = new JsonSlurper().parseText(decisionTree )
		}
		def pciBoundary = []
		def boundary = null
		list.each{
			def res = it.getAt('query')
			boundary = res.findAll(/\d{1,3}(?:\.\d{1,2})?/)
			pciBoundary.add(boundary)
		}
		return pciBoundary
		closeConnection()
	}

	@Keyword
	def decisionTreeMaintenanceSuggestionLoadNew() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/_common_db", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.decision_tree WHERE id = 76"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)

		def decisionTree = null
		def list = null
		while(result.next()){
			decisionTree = result.getString('decision_tree')
			list = new JsonSlurper().parseText(decisionTree )
		}
		def maintenanceSuggestion = []
		list.each{
			maintenanceSuggestion.add(it.getAt('ms'))
		}
		return maintenanceSuggestion
		closeConnection()
	}

	@Keyword
	def decisionTreeCostLoadNew() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/_common_db", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.decision_tree WHERE id = 76"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)

		def decisionTree = null
		def list = null
		while(result.next()){
			decisionTree = result.getString('decision_tree')
			list = new JsonSlurper().parseText(decisionTree )
		}
		def cost = []
		list.each{
			cost.add(it.getAt('uc'))
		}
		return cost
		closeConnection()
	}

	@Keyword
	def repairImpactMaintenanceSuggestion() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/_common_db", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.repair_impact WHERE id = 82"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)

		def decisionTree = null
		def list = null
		while(result.next()){
			decisionTree = result.getString('impact')
			list = new JsonSlurper().parseText(decisionTree )
		}
		def maintenanceSuggestion = []
		list.each{
			maintenanceSuggestion.add(it.getKey())
		}
		return maintenanceSuggestion
		closeConnection()
	}

	@Keyword
	def repairImpactValues() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/_common_db", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.repair_impact WHERE id = 82"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)

		def decisionTree = null
		def list = null
		while(result.next()){
			decisionTree = result.getString('impact')
			list = new JsonSlurper().parseText(decisionTree )
		}
		def impact = []
		def impactValues =[]
		def x =[]
		list.each{
			x = it.getValue()
			for(int i=0; i< x.size(); i++) {
				impact.add(x[i].getAt('impact'))
			}
			impactValues.add(impact)
			impact = []
		}
		return impactValues
		closeConnection()
	}

	@Keyword
	def repairImpactBoundaries() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/_common_db", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.repair_impact WHERE id = 82"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)

		def decisionTree = null
		def list = null
		while(result.next()){
			decisionTree = result.getString('impact')
			list = new JsonSlurper().parseText(decisionTree )
		}
		def pci = []
		def pciBoundary =[]
		def x =[]
		list.each{
			x = it.getValue()
			for(int i=0; i< x.size(); i++) {
				pci.add(x[i].getAt('boundary'))
			}
			pciBoundary.add(pci)
			pci = []
		}
		return pciBoundary
		closeConnection()
	}

	@Keyword
	def repairImpactAttributeEditorValidation(def pci) {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/_common_db", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.decision_tree WHERE id = 144"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)

		def decisionTree = null
		def list = null
		while(result.next()){
			decisionTree = result.getString('decision_tree')
			list = new JsonSlurper().parseText(decisionTree )
		}
		def maintenanceSuggestion = []
		def costs = []
		def pciBoundary = []
		def boundary = null
		list.each{
			def res = it.getAt('query')
			boundary = res.findAll(/\d{1,3}(?:\.\d{1,2})?/)
			pciBoundary.add(boundary)
			maintenanceSuggestion.add(it.getAt('ms'))
			costs.add(it.getAt('uc'))
		}

		def map = [
			maintenanceSuggestion,
			pciBoundary,
			costs
		].transpose()
		def val = null
		int min = 0
		int max = 0
		def item = null
		def cost = 0
		def array = []
		for(int i = 0; i < map.size(); i++) {
			item = map[i]
			val = item[1]
			min = Integer.parseInt(val[0])
			max = Integer.parseInt(val[1])
			if(pci > min && pci <= max) {
				array.add(item[0])
				array.add(item[1])
				array.add(item[2])
			}
		}
		return array
		closeConnection()
	}

	@Keyword
	def getGroups() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.work_order_groups WHERE url_id = 96"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		def forms = []
		while(result.next()) {
			forms.add(result.getString('group_name'))
		}
		return forms
		closeConnection()
	}

	@Keyword
	def getForms(def formName) {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def queryString2 = "SELECT * FROM sde.work_order_groups WHERE url_id = 96 and group_name = '" + formName + "'"
		Statement stm2 = c.createStatement()
		ResultSet result2 = stm2.executeQuery(queryString2)
		def groupid = 0
		while(result2.next()) {
			groupid = result2.getString('id')
		}

		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.group_forms WHERE group_id =" + groupid
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		def formid = []
		while(result.next()) {
			formid.add(result.getString('form_id'))
		}

		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def formname = []
		for(int i = 0; i < formid.size(); i++) {
			def queryString1 = ("SELECT * FROM sde.work_order_form_library WHERE id =" + formid[i])
			Statement stm1 = c.createStatement()
			ResultSet result1 = stm1.executeQuery(queryString1)

			while(result1.next()) {
				formname.add(result1.getString('form_name'))
			}
		}
		return formname
		closeConnection()
	}

	@Keyword
	def getAllForms() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.work_order_form_library WHERE url_id = 96"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		def forms = []
		while(result.next()) {
			forms.add(result.getString('form_name'))
		}
		return forms
		closeConnection()
	}

	@Keyword
	def uploadFile (TestObject to, String filePath) {
		WebUI.click(to)
		StringSelection ss = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(2000)
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000)
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(2000)
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(2000)
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(2000)
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(2000)
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(2000)
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000)
	}

	@Keyword
	def getWorkOrdersCount() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder_slx4", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.work_order_loc"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)

		def count = 0
		while(result.next()) {
			count += 1
		}
		return count
		closeConnection()
	}

	@Keyword
	def verifyAttachmentsUploaded() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.work_order_loc ORDER BY objectid DESC LIMIT 1"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		def items = []
		while(result.next()) {
			items.add(result.getString('image'))
		}
		def status = ""
		if(items[0].toString() == "[]" || items[0].toString() == "null") {
			status = 'Not Uploaded'
		} else if(items[0].toString() != "[]" || items[0].toString() != "null") {
			status = 'Uploaded'
		}
		return status
		closeConnection()
	}

	@Keyword
	def verifyVideosUploaded() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.work_order_loc ORDER BY objectid DESC LIMIT 1"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		def items = []
		while(result.next()) {
			items.add(result.getString('videos'))
		}
		def status = ""
		if(items[0].toString() == "[]" || items[0].toString() == "null") {
			status = 'Not Uploaded'
		} else if(items[0].toString() != "[]" || items[0].toString() != "null") {
			status = 'Uploaded'
		}
		return status
		closeConnection()
	}

	@Keyword
	def verifyDocumentUploaded() {
		openConnection()
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.work_order_loc ORDER BY objectid DESC LIMIT 1"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		def items = []
		while(result.next()) {
			items.add(result.getString('documents'))
		}
		def status = ""
		if(items[0].toString() == "[]" || items[0].toString() == "null") {
			status = 'Not Uploaded'
		} else if(items[0].toString() != "[]" || items[0].toString() != "null") {
			status = 'Uploaded'
		}
		return status
		closeConnection()
	}

	@Keyword
	def workOrderResources() {
		openConnection()
		Connection c = null;
		Statement stmt = null;
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.work_order_loc ORDER BY objectid DESC LIMIT 1"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		def objectid = ''
		while(result.next()) {
			objectid = result.getString('objectid')
		}

		Connection c1 = null;
		Statement stmt1 = null;
		c1 = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def queryString1 = "SELECT * FROM sde.work_order_costs WHERE work_order_loc_id = " + objectid
		Statement stm1 = c1.createStatement()
		ResultSet result1 = stm1.executeQuery(queryString1)
		def item_id = []
		def quantity = []
		while(result1.next()) {
			item_id.add(result1.getString('item_id'))
			quantity.add(result1.getString('quantity'))
		}

		Connection c2 = null;
		Statement stmt2 = null;
		c2 = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def item_name = []
		def rate = []
		for(int i = 0; i < item_id.size(); i++) {
			def queryString2 = "SELECT * FROM sde.wo_cost_items WHERE id = " + item_id[i]
			Statement stm2 = c2.createStatement()
			ResultSet result2 = stm2.executeQuery(queryString2)
			while(result2.next()) {
				item_name.add(result2.getString('name'))
				rate.add(result2.getString('rate'))
			}
		}
		return item_name
		closeConnection()
		//		def total_cost = ''
		//		def individual_costs = []
		//		def product_value = ''
		//		for(int i=0; i < rate.size(); i++) {
		//			product_value = quantity[i] * rate[i]
		//			individual_costs.add(product_value)
		//			total_cost = total_cost + product_value
		//		}
	}

	@Keyword
	def verifyResourcesInRepeatingWorkOrders(){
		openConnection()
		Connection c = null;
		Statement stmt = null;
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.work_order_loc ORDER BY objectid DESC LIMIT 3"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		def objectid = []
		while(result.next()) {
			objectid.add(result.getString('objectid'))
		}

		Connection c1 = null;
		Statement stmt1 = null;
		c1 = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def item_id = []
		def all_item_ids = []
		for(int i=0; i< objectid.size(); i++) {
			def queryString1 = "SELECT * FROM sde.work_order_costs WHERE work_order_loc_id = " + objectid[i]
			Statement stm1 = c1.createStatement()
			ResultSet result1 = stm1.executeQuery(queryString1)

			while(result1.next()) {
				item_id.add(result1.getString('item_id'))
			}
			all_item_ids.add(item_id)
			item_id = []
		}
		def status = ''
		for(int i=0; i< all_item_ids.size(); i++) {
			if(all_item_ids[i] == [
				'34',
				'2',
				'5',
				'1',
				'32',
				'4'
			]) {
				status = "True"
			} else {
				status = "False"
			}
		}
		return status
		closeConnection()
	}

	@Keyword
	def verifyAttachmentForRepeatingWorkorders() {
		openConnection()
		Connection c = null;
		Statement stmt = null;
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def queryString = "SELECT * FROM sde.work_order_loc ORDER BY objectid DESC LIMIT 3"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)
		def objectid = []
		while(result.next()) {
			objectid.add(result.getString('objectid'))
		}

		Connection c1 = null;
		Statement stmt1 = null;
		c1 = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/client_workorder", "sde", "V0ters!23");
		def images = []
		for(int i=0; i< objectid.size(); i++) {
			def queryString1 = "SELECT * FROM sde.work_order_loc WHERE objectid = " + objectid[i]
			Statement stm1 = c1.createStatement()
			ResultSet result1 = stm1.executeQuery(queryString1)

			while(result1.next()) {
				images.add(result1.getString('image'))
			}
		}
		def status = ""
		for(int i=0; i< images.size(); i++) {
			if(images[i].toString() == "[]" || images[i].toString() == "null") {
				status = "Not Uploaded"
			} else if(images[i].toString() != "[]" || images[i].toString() != "null") {
				status = "Uploaded"
			}
		}
		return status
		closeConnection()
	}
	
	@Keyword
	
	public boolean isFileDownloadedRegex(fileName) {
	
		String userHome = System.getenv( 'userprofile' );
		String downloadPath = userHome + File.separator + "Downloads"
		System.out.println("userHome=" + userHome);
		System.out.println("downloadPath=" + downloadPath);
	
		File dir = new File(downloadPath);
	
		File[] dirContents = dir.listFiles();
	
		String lastAttempt = "";
	
		if (dirContents.length > 0) {
	
			for (int i = 0; i < dirContents.length; i++) {
	
				if (dirContents[i].getName().matches(fileName)) {
	
					// File has been found, it can now be deleted:
	
					dirContents[i].delete();
	
					KeywordUtil.markPassed('File exist in ' + downloadPath + ' and was deleted')
	
					return true;
	
				}
	
				lastAttempt = dirContents[i].getName().matches(fileName);
			}
	
			if (lastAttempt != fileName) {
	
				KeywordUtil.markFailed('File does not exist in ' + downloadPath)
	
				return false;
			}
		}
	
		return false;
	}

	@Keyword
	def getRepairPriority() {
		openConnection()
		Connection c = null;
		Statement stmt = null;
		c = DriverManager.getConnection("jdbc:postgresql://castreetlogix.ckjgcig5seif.ca-central-1.rds.amazonaws.com/_common_db", "sde", "V0ters!23");

		def queryString = "SELECT * FROM sde.priority_factors WHERE id = 20"
		Statement stm = c.createStatement()
		ResultSet result = stm.executeQuery(queryString)

		def repair_priority = null
		while(result.next()){
			repair_priority = result.getString('weights')
		}
		return repair_priority
	}
}

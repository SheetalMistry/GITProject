import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://uat.txqweb.rrd.com/TxQWeb_LeiSS_Test')

WebUI.closeBrowser()

WebUI.openBrowser('https://uat.txqweb.rrd.com/TxQUCWeb_LeiSS_Test/connect')

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/a_TxQ Demo'))

WebUI.delay(1)

WebUI.click(findTestObject('TxQDemoTest/TxQ Admin/Page_TxQ UC Web - Job Summary/a_Administration'))

WebUI.click(findTestObject('TxQDemoTest/TxQ Admin/Page_TxQ UC Web - Job Summary/a_Unlock sessions'))

WebUI.check(findTestObject('TxQDemoTest/TxQ Admin/Page_TxQ UC Web - Unlock Sessions/input_ng-pristine ng-untouched'))

WebUI.click(findTestObject('TxQDemoTest/TxQ Admin/Page_TxQ UC Web - Unlock Sessions/button_Unlock Selected Session'))

WebUI.click(findTestObject('TxQDemoTest/TxQ Admin/Page_TxQ UC Web - Unlock Sessions/button_OK'))

WebUI.closeBrowser()

WebUI.openBrowser('https://uat.txqweb.rrd.com/TxQWeb_LeiSS_Test')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Image manipulation/Page_Connect - TxQ Web/a_TxQ Demo'))

WebUI.click(findTestObject('Object Repository/Image manipulation/Page_Connect - TxQ Web/a_Indexing (38)'))

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/a_Task'))

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/a_Search for tasks Alts'))

WebUI.acceptAlert()

WebUI.setText(findTestObject('TxQDemoTest/tasknametextbox'), 'DEMO_2018071900030022')

WebUI.delay(2)

WebUI.click(findTestObject('TxQDemoTest/SEARCHButton'))

WebUI.click(findTestObject('TxQDemoTest/task'))

not_run: WebUI.click(findTestObject('TxQDemoTest/demotiff1'))

WebUI.click(findTestObject('Image manipulation/Page_Task - TxQ Web/span_glyphicon glyphicon-plus'))

WebUI.click(findTestObject('Image manipulation/Page_Task - TxQ Web/span_glyphicon glyphicon-plus'))

WebUI.click(findTestObject('Image manipulation/Page_Task - TxQ Web/span_glyphicon glyphicon-plus'))

WebUI.click(findTestObject('Image manipulation/Page_Task - TxQ Web/span_glyphicon glyphicon-plus'))


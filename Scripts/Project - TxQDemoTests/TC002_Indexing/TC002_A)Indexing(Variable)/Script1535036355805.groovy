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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType

//WebUI.click(findTestObject('TxQ New/Page_Connect - TxQ Web/a_Indexing (65)'))
WebUI.delay(4)

WebUI.selectOptionByValue(findTestObject('TxQDemoTest/TxQDemo/select_--Please Select--Busine'), Categry, true)

WebUI.selectOptionByValue(findTestObject('TxQDemoTest/TxQDemo/subcategory'), SubCategory, true)

WebUI.setText(findTestObject('TxQDemoTest/TxQDemo/div_Post Code_1'), PostCode)

WebUI.setText(findTestObject('TxQDemoTest/TxQDemo/div_Account No'), Acc)

WebUI.setText(findTestObject('TxQDemoTest/TxQDemo/div_Sort Code'), Sort)

WebUI.setText(findTestObject('TxQDemoTest/TxQDemo/div_CIS No'), CIS)

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.selectOptionByLabel(findTestObject('TxQDemoTest/TxQDemo/destination'), Destination, false)

WebUI.click(findTestObject('TxQDemoTest/TxQDemo/Complete Button'))


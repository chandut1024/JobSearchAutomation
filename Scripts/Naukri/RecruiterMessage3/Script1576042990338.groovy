import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser(findTestData('LoginDetailsNJS').getValue(1, 3))

WebUI.closeWindowIndex(1)

WebUI.closeWindowIndex(1)

not_run: WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Naukri/LoginButton'))

WebUI.click(findTestObject('Naukri/GoogleButton'))

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Naukri/UserName'), findTestData('LoginDetailsNJS').getValue(2, 3))

WebUI.click(findTestObject('Naukri/NextButton'))

WebUI.delay(5)

WebUI.setText(findTestObject('Naukri/Password'), findTestData('LoginDetailsNJS').getValue(3, 3))

WebUI.click(findTestObject('Naukri/NextButton'))

WebUI.switchToWindowIndex(0)

WebUI.mouseOver(findTestObject('Naukri/NotificationButton'))

WebUI.delay(5)

WebUI.click(findTestObject('Naukri/RecruiterMessagesButton'))


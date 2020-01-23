import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser(findTestData('LoginDetailsNJS').getValue(1, 2))

WebUI.closeWindowIndex(1)

WebUI.closeWindowIndex(1)

not_run: WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Naukri/LoginButton'))

WebUI.click(findTestObject('Naukri/GoogleButton'))

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Naukri/UserName'), findTestData('LoginDetailsNJS').getValue(2, 2))

WebUI.click(findTestObject('Naukri/NextButton'))

WebUI.delay(5)

WebUI.setText(findTestObject('Naukri/Password'), findTestData('LoginDetailsNJS').getValue(3, 2))

WebUI.click(findTestObject('Naukri/NextButton'))

WebUI.switchToWindowIndex(0)

WebUI.delay(10)

WebUI.click(findTestObject('Naukri/ProfileName'))

WebUI.click(findTestObject('Naukri/DeleteResumeButton'))

WebUI.click(findTestObject('Naukri/DeleteResumeConfirm'))

WebUI.delay(15)

WebUI.takeScreenshot()

WebUI.uploadFile(findTestObject('Naukri/UploadResumeButton'), findTestData('LoginDetailsNJS').getValue(5, 2))

WebUI.delay(10)

not_run: WebUI.click(findTestObject('Naukri/EditResumeHeadline'))

not_run: WebUI.setText(findTestObject('Naukri/ResumeHeadLineText'), '.')

not_run: WebUI.click(findTestObject('Naukri/SaveResumeHeadLineButton'))

WebUI.takeScreenshot()

WebUI.refresh()

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.closeBrowser()


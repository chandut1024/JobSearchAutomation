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
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

WebUI.openBrowser('www.gmail.com')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Naukri/UserName'), findTestData('LoginDetailsNJS').getValue(2, 2))

WebUI.click(findTestObject('Naukri/NextButton'))

not_run: WebUI.delay(5)

WebUI.setText(findTestObject('Naukri/Password'), findTestData('LoginDetailsNJS').getValue(3, 2))

WebUI.click(findTestObject('Naukri/NextButton'))

WebUI.delay(10)

WebUI.click(findTestObject('Gmail2_Page/NoButton'))

WebUI.click(findTestObject('Gmail2_Page/ComposeEmailButton2'))

WebUI.click(findTestObject('Gmail2_Page/Maximize2'))

WebUI.delay(10)

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Gmail2_Page/ToList2'), 30)

WebUI.executeJavaScript('arguments[0].value=‘chandut’;', Arrays.asList(element))

not_run: WebUI.click(findTestObject('Gmail2_Page/ToList2'))

WebUI.setText(findTestObject('Gmail2_Page/ToList2'), findTestData('LoginDetailsNJS').getValue(6, 2))

WebUI.setText(findTestObject('Gmail2_Page/Subject2'), findTestData('LoginDetailsNJS').getValue(7, 2))

WebUI.setText(findTestObject('Gmail2_Page/Body2'), findTestData('LoginDetailsNJS').getValue(8, 2))

not_run: WebUI.uploadFile(findTestObject('Gmail_Page/AttachFileGmail'), 'D:\\chanduR\\Resume11.docx')

not_run: WebUI.click(findTestObject('Gmail_Page/SendEmailButton'))


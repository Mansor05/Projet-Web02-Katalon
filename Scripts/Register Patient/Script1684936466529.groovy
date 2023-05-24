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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.openmrs.org/openmrs/login.htm')

WebUI.setText(findTestObject('Object Repository/Resgister Patient/Page_Login/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Resgister Patient/Page_Login/input_Password_password'), '/5S6MFFLcE4mlsixtc6/Tg==')

WebUI.click(findTestObject('Object Repository/Resgister Patient/Page_Login/li_Inpatient Ward'))

WebUI.click(findTestObject('Object Repository/Resgister Patient/Page_Login/input_Registration Desk_loginButton'))

WebUI.click(findTestObject('Object Repository/Resgister Patient/Page_Home/a_Register a patient'))

WebUI.setText(findTestObject('Object Repository/Resgister Patient/Page_OpenMRS Electronic Medical Record/input_(required)_givenName'), 
    'Taf')

WebUI.setText(findTestObject('Object Repository/Resgister Patient/Page_OpenMRS Electronic Medical Record/input_(required)_familyName'), 
    'Mb')

WebUI.click(findTestObject('Object Repository/Resgister Patient/Page_OpenMRS Electronic Medical Record/button_Confirm submission_next-button'))

WebUI.click(findTestObject('Resgister Patient/Page_OpenMRS Electronic Medical Record/option_Male'))

WebUI.click(findTestObject('Object Repository/Resgister Patient/Page_OpenMRS Electronic Medical Record/button_Confirm submission_next-button'))

WebUI.setText(findTestObject('Object Repository/Resgister Patient/Page_OpenMRS Electronic Medical Record/input_(required)_birthdateDay'), 
    '12')

WebUI.selectOptionByValue(findTestObject('Object Repository/Resgister Patient/Page_OpenMRS Electronic Medical Record/select_Select                            Ja_a574ad'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Resgister Patient/Page_OpenMRS Electronic Medical Record/input_(required)_birthdateYear'), 
    '1985')

WebUI.click(findTestObject('Object Repository/Resgister Patient/Page_OpenMRS Electronic Medical Record/button_Confirm submission_next-button'))

WebUI.setText(findTestObject('Object Repository/Resgister Patient/Page_OpenMRS Electronic Medical Record/input_Address_address1'), 
    'Rio')

WebUI.click(findTestObject('Object Repository/Resgister Patient/Page_OpenMRS Electronic Medical Record/button_Confirm submission_next-button'))

WebUI.setText(findTestObject('Object Repository/Resgister Patient/Page_OpenMRS Electronic Medical Record/input_concat(What, , s the patient phone nu_867169'), 
    '773005654')

WebUI.click(findTestObject('Object Repository/Resgister Patient/Page_OpenMRS Electronic Medical Record/button_Confirm submission_next-button'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Resgister Patient/Page_OpenMRS Electronic Medical Record/select_Select Relationship Type            _961917'), 
    '8d919b58-c2cc-11de-8d13-0010c6dffd0f-A', true)

WebUI.setText(findTestObject('Object Repository/Resgister Patient/Page_OpenMRS Electronic Medical Record/input_Who is the patient related to_person-_c8514e'), 
    'smit')

WebUI.click(findTestObject('Object Repository/Resgister Patient/Page_OpenMRS Electronic Medical Record/a_Jane Smith'))

WebUI.click(findTestObject('Object Repository/Resgister Patient/Page_OpenMRS Electronic Medical Record/button_Confirm submission_next-button'))

WebUI.click(findTestObject('Object Repository/Resgister Patient/Page_OpenMRS Electronic Medical Record/input_Confirm submission_submit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Resgister Patient/Page_OpenMRS Electronic Medical Record/h1_Taf                                     _5c5bf0'))

WebUI.closeBrowser()


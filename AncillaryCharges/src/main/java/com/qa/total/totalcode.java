//package com.qa.pages;
//
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.NoAlertPresentException;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Factory;
//
//import com.qa.util.TestBase;
//
//import junit.framework.Assert;
//
//public class AncillaryCharges extends TestBase {
//	@FindBy(xpath = "//td[@id='tdbody_edit']")
//	WebElement ancillary_edit;
//	@FindBy(xpath = "//td[contains(text(),'That record does not exist.')]")
//	WebElement journal_notexist;
//	@FindBy(xpath = "//a[contains(text(),'Actions')]")
//	WebElement Actions_payment;
//	@FindBy(xpath = "//span[contains(text(),'Delete')]")
//	WebElement delete_payment;
//	@FindBy(xpath = "//td[@id='tdbody_edit']")
//	WebElement payment_edit_secondary;
//	@FindBy(xpath = "//li[@data-title='Transactions']")
//	WebElement Transactions;
//	@FindBy(xpath = "//a[@class='ns-scroll-button ns-scroll-button-bottom']")
//	WebElement expand;
//	@FindBy(xpath = "//li[@data-title='Financial']")
//	WebElement financial;
//	@FindBy(xpath = "//li[@data-title='Make Journal Entries']")
//	WebElement make_journal_entries;
//	@FindBy(xpath = "//li[@data-title='List']")
//	WebElement jelist;
//	@FindBy(xpath = "//td[@id='uir_totalcount' and @class='smalltextnolink']")
//	WebElement jecount;
//	@FindBy(xpath = "//td[@id='spn_multibutton_submitter']")
//	WebElement journal_save;
//	@FindBy(xpath = "//input[@id='memo']")
//	WebElement memo;
//	@FindBy(xpath = "//td[@id='tdbody_edit']")
//	WebElement journal_edit;
//	@FindBy(xpath = "//tr[@id='custpage_chargebacklist_row_1']//td[count(//td[@data-label='Charges'])+2]")
//	WebElement charge_name_change_click;
//	@FindBy(xpath = "//input[@id='inpt_custpage_glaccount38']")
//	WebElement charge_name_change;
//	@FindBy(xpath = "//tr[@id='custpage_chargebacklist_row_1']//td[count(//td[@data-label='Amount'])]")
//	WebElement charge_amount_change_click;
//	@FindBy(xpath = "//input[@id='custpage_amount_formattedValue']")
//	WebElement  charge_amount_change;
//	@FindBy(xpath = "//td[@id='tdbody_edit']")
//	WebElement payment_edit;
//	@FindBy(xpath = "//table[@id='apply_splits']//tbody//tr[@id='applyheader']//following-sibling::tr//td[count(//td[@data-label='Apply'])+2]")
//	List<WebElement> refno;
//	@FindBy(xpath = "//img[@id='inpt_customform1_arrow']")
//	WebElement form_arrow;
//	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
//	List<WebElement> forms;
//	@FindBy(xpath = "//table[@id='apply_splits']//tbody//tr[@id='applyheader']//following-sibling::tr//td[count(//td[@data-label='Apply'])-2]")
//	List<WebElement> invoice_links;
//	@FindBy(xpath = "//table[@id='div__bodytab']//tr//td//a[contains(text(), 'View')]")
//	List<WebElement> ancillary_charges_list;
//	static String parentWindow;
//	@FindBy(xpath = "//table[@id='custpage_chargebacklist_splits']//tr[@id='custpage_chargebacklistheader']//following-sibling::tr//td[count(//td[@data-label='Journal']//preceding-sibling::td)+1]//a")
//	List<WebElement> journallists;
//	@FindBy(xpath = "//span[@id='aracct_fs_lbl_uir_label']//following-sibling::span")
//	WebElement Ar_account;
//	@FindBy(xpath = "//table[@id='apply_splits']//tr[@class='uir-list-row-tr uir-list-row-odd']//td[count(//td[@data-label='Apply']//preceding-sibling::td)+1]")
//	List<WebElement> invoicelink;
//	@FindBy(xpath = "//table[@id='apply_splits']//tr[@class='uir-list-row-tr uir-list-row-odd']//td[count(//td[@data-label='Amt. Due']//preceding-sibling::td)+1]")
//	List<WebElement> due_amount;
//	@FindBy(xpath = "//li[@id='ns-header-menu-main-item3']")
//	WebElement Lists;
//	@FindBy(xpath = "//li[@data-title='Ancillary Charges']")
//	WebElement Ancillary_Charges;
//	@FindBy(xpath = "//a[@class='ns-scroll-button ns-scroll-button-bottom']")
//	WebElement Arrow;
//	@FindBy(xpath = "//li[@data-title='Charges Setup']")
//	WebElement Charges_Setup;
//	@FindBy(xpath = "//li[@data-title='New']")
//	WebElement New;
//	@FindBy(xpath = "//li[@data-title='Applied Charges']")
//	WebElement Applied_charges;
//	@FindBy(xpath = "//input[@id='name']")
//	WebElement Charge_name;
//	@FindBy(xpath = "//input[@id='inpt_custrecord_tss_accounts1']")
//	WebElement Debit_account;
//	@FindBy(xpath = "//input[@id='inpt_custrecord_tss_payment_credit2']")
//	WebElement Credit_account;
//	@FindBy(xpath = "//td[@id='spn_multibutton_submitter']")
//	WebElement Save;
//	@FindBy(xpath = "//img[@id='inpt_custrecord_tss_accounts1_arrow']")
//	WebElement Debit_arrow;
//	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
//	List<WebElement> Debit_dropdown;
//	@FindBy(xpath = "//img[@id='inpt_custrecord_tss_payment_credit2_arrow']")
//	WebElement Credit_arrow;
//	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
//	List<WebElement> Credit_dropdown;
//	@FindBy(xpath = "//span[@id='segment_fs']//li")
//	List<WebElement> Customer_list;
//	@FindBy(xpath = "//span[@class='uir-pagination-label']")
//	WebElement Customer_list_click;
//	@FindBy(xpath = "//li[@data-title='Relationships']")
//	WebElement Relationships;
//	@FindBy(xpath = "//li[@data-title='Customers']")
//	WebElement Customers;
//	@FindBy(xpath = "//*[@href='/app/common/entity/custjob.nl?id=1173']")
//	WebElement view_customer;
//	@FindBy(xpath = "//td[@id='tdbody_acceptpayment']")
//	WebElement accept_payment;
//	@FindBy(xpath = "//*[@id=\"apply1_fs\"]/img")
//	WebElement invoice_click;
//	@FindBy(xpath = "//a[@id='custpage_chargebacktxt']")
//	WebElement charge_tab;
//	@FindBy(xpath = "//img[@id='inpt_custpage_appliedinvoice24_arrow']")
//	WebElement tran_arrow;
//	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
//	List<WebElement> tran_dropdown;
//	@FindBy(xpath = "//input[@id='custpage_amount_formattedValue']")
//	WebElement charge_value;
//	@FindBy(xpath = "//img[@id='inpt_custpage_glaccount25_arrow']")
//	WebElement charge_arrow;
//	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
//	List<WebElement> charge_dropdown;
//	@FindBy(xpath = "//input[@id='inpt_custpage_glaccount25']")
//	WebElement charge_namesss;
//	@FindBy(xpath = "//*[@id=\"undepfunds_fs_inp\"]")
//	List<WebElement> account_checkbox;
//	@FindBy(xpath = "//img[@id='inpt_account4_arrow']")
//	WebElement account_arrow;
//	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
//	List<WebElement> account_dropdown;
//	@FindBy(xpath = "//td[@id='spn_secondarymultibutton_submitter']")
//	WebElement save_payment;
//	@FindBy(xpath = "//table[@id='custpage_chargebacklist_splits']//tbody//tr[@class='uir-machine-row uir-machine-row-odd listtextnonedit uir-machine-row-focused']//td[count(//tr[@id='custpage_chargebacklist_headerrow']//td[@data-label='Amount']//preceding-sibling::td)+1]")
//	WebElement charge_amount_click;
//	@FindBy(xpath = "//table[@id='custpage_chargebacklist_splits']//tbody//tr[@class='uir-machine-row uir-machine-row-odd listtextnonedit uir-machine-row-focused']//td[count(//tr[@id='custpage_chargebacklist_headerrow']//td[@data-label='Charges']//preceding-sibling::td)+1]")
//	WebElement charges_click;
//	@FindBy(xpath = "//a[@id='custpage_chargebacktxt']")
//	WebElement charge_tab_after_payment;
//	@FindBy(xpath = "//table[@id='custpage_chargebacklist_splits']//tbody//tr[@class='uir-list-row-tr uir-list-row-odd']//td[count(//td[@data-label='Journal']//preceding-sibling::td)+1]//a")
//	WebElement journal_link;
//	@FindBy(xpath = "//table[@id='line_splits']//tbody//tr[@class='uir-machine-row uir-machine-row-odd']//td[count(//td[@data-label='Debit']//preceding-sibling::td)]//a")
//	WebElement credit_account1;
//	@FindBy(xpath = "//table[@id='line_splits']//tbody//tr[@class='uir-machine-row uir-machine-row-even']//td[count(//td[@data-label='Debit']//preceding-sibling::td)]//a")
//	WebElement debit_account1;
//	@FindBy(xpath = "//table[@id='line_splits']//tbody//tr[@class='uir-machine-row uir-machine-row-odd']//td[count(//td[@data-label='Memo']//preceding-sibling::td)]")
//	WebElement credit_amount;
//	@FindBy(xpath = "//table[@id='line_splits']//tbody//tr[@class='uir-machine-row uir-machine-row-even']//td[count(//td[@data-label='Credit']//preceding-sibling::td)]")
//	WebElement debit_amount;
//	@FindBy(xpath = "//span[@id='custbody_tss_invoice_link_lbl_uir_label']//following-sibling::span//a")
//	WebElement invoice_transcation_link;
//	@FindBy(xpath = "//div[@class='uir-record-status']")
//	WebElement invoice_status;
//	@FindBy(xpath = "//span[@id='account_fs_lbl_uir_label']//following-sibling::span")
//	WebElement bank_account;
//	@FindBy(xpath = "//input[@id='inpt_custpage_glaccount24']")
//	WebElement charge_selection;
//	@FindBy(xpath = "//table[@id='div__bodytab']//tbody//tr[@id='row0']//a[@class='dottedlink viewitem']")
//	WebElement created_ancillary_charge;
//	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
//	List<WebElement> created_recently_charge;
//	@FindBy(xpath = "//span[@id='custrecord_tss_journalid_record_lbl_uir_label']//following-sibling::span")
//	WebElement journal_from_ancillary_charge;
//	@FindBy(xpath = "//img[@id='inpt_quicksort3_arrow']")
//	WebElement arrow_ancillary_charge;
//	@FindBy(xpath = "//span[@id='custrecord_tss_applied_invoice_lbl_uir_label']//following-sibling::span")
//	WebElement ancillary_charge_invoice_nr;
//	@FindBy(xpath = "//span[@id='custrecord_tss_payment_lbl_uir_label']//following-sibling::span")
//	WebElement ancillary_charge_payment_nr;
//	@FindBy(xpath = "//span[@id='aracct_fs_lbl_uir_label']//following-sibling::span")
//	WebElement ar_account_writeoff;
//	@FindBy(xpath = "//span[@id='apply_amount1_fs']")
//	WebElement payment_amount_click;
//	@FindBy(xpath = "//input[@id='amount1_formattedValue']")
//	WebElement payment_amount_enter;
//	@FindBy(xpath = "//input[@id='custpage_chargebacklist_addedit']")
//	WebElement add_button;
//	@FindBy(xpath = "//tr[@class='uir-list-row-tr uir-list-row-even']//td[count(//td[@data-label='Journal']//preceding-sibling::td)+1]")
//	List<WebElement> even_journal;
//	@FindBy(xpath = "//tr[@class='uir-list-row-tr uir-list-row-odd']//td[count(//td[@data-label='Journal']//preceding-sibling::td)+1]")
//	List<WebElement> odd_journal;
//
//	public AncillaryCharges() {
//		PageFactory.initElements(driver, this);
//	}
//
//	public void charge_Screen() throws InterruptedException {
//		Actions action = new Actions(driver);
//		action.moveToElement(Lists).build().perform();
//		Thread.sleep(2000);
//		action.moveToElement(Arrow).build().perform();
//		Thread.sleep(1000);
//		action.moveToElement(Ancillary_Charges).build().perform();
//		Thread.sleep(2000);
//		action.moveToElement(Charges_Setup).build().perform();
//		New.click();
//
//	}
//	public void Ancillary_charges_screen() throws InterruptedException
//	{
//		Actions action=new Actions(driver);
//		action.moveToElement(Lists).build().perform();
//		Thread.sleep(1000);
//		action.moveToElement(Arrow).build().perform();
//		Thread.sleep(1000);
//		action.moveToElement(Ancillary_Charges).build().perform();
//		Thread.sleep(1000);
//		action.moveToElement(Applied_charges).click().build().perform();
//		Thread.sleep(1000);
//	}
//	public void Customer_Navigation_Accepting_Payment() throws InterruptedException
//	{
//		Actions action=new Actions(driver);
//		action.moveToElement(Lists).build().perform();
//		Thread.sleep(2000);
//		action.moveToElement(Relationships).build().perform();
//		Thread.sleep(2000);
//		Customers.click();
//		Thread.sleep(2000);
//		Customer_list_click.click();
//		Thread.sleep(2000);
//		for(int i=0;i<Customer_list.size();i++)
//		{
//			WebElement customer_list=Customer_list.get(i);
//			String customer_options=customer_list.getText();
//			if(customer_options.trim().equals("*anonymous — Bezak"))
//			{
//				customer_list.click();
//			}
//		}
//		view_customer.click();
//		accept_payment.click();
//		form_arrow.click();
//		Thread.sleep(1000);
//		for(int i=0;i<forms.size();i++)
//		{
//			WebElement form=forms.get(i);
//			String standard_form=form.getText();
//			if(standard_form.trim().equals("Standard Customer Payment"))
//			{
//				form.click();
//			}
//		}
//		account_checkbox.get(1).click();
//		account_arrow.click();
//		account_dropdown.get(2).click();
//	}
//
//	public boolean isAlertPresent(){ 
//	    try{ 
//	        Alert a = new WebDriverWait(driver, 10).until(ExpectedConditions.alertIsPresent());
//	        if(a!=null){
//	            System.out.println("Alert is present");
//	            return true;
//	        }else{
//	            throw new Throwable();
//	        }
//	    } 
//	    catch (Throwable e) {
//	        System.err.println("Alert isn't present!!");
//	        return false; 
//	    } 
//
//	} 
//
//
//	public void charge_Creation(String charge_name, String debit_account, String credit_account, String testcase)
//			throws InterruptedException {
//		Save.click();
//		if (isAlertPresent()) {
//			Alert alert = driver.switchTo().alert();
//			System.out.println(alert.getText());
//			alert.accept();
//		}
//		Thread.sleep(2000);
//		Charge_name.sendKeys(charge_name);
//		Save.click();
//		if (isAlertPresent()) {
//			Alert alert = driver.switchTo().alert();
//			System.out.println(alert.getText());
//			alert.accept();
//		}
//		Charge_name.clear();
//		Thread.sleep(2000);
//		Debit_account.sendKeys(debit_account);
//		Save.click();
//		if (isAlertPresent()) {
//			Alert alert = driver.switchTo().alert();
//			System.out.println(alert.getText());
//			alert.accept();
//		}
//		Debit_arrow.click();
//		Debit_dropdown.get(0).click();
//		Thread.sleep(2000);
//		Credit_account.sendKeys(credit_account);
//		Save.click();
//		if (isAlertPresent()) {
//			Alert alert = driver.switchTo().alert();
//			System.out.println(alert.getText());
//			alert.accept();
//		}
//		Credit_arrow.click();
//		Credit_dropdown.get(0).click();
//		Thread.sleep(2000);
//		Charge_name.sendKeys(charge_name);
//		Debit_account.sendKeys(debit_account);
//		Credit_account.sendKeys(credit_account);
//		Save.click();
//
//	}
////
////	public void goto_customers(String charge_name, String debit_account, String credit_account, String charge_amount,
////			String testcase) throws Exception {
////		Charge_name.sendKeys(charge_name);
////		Debit_account.sendKeys(debit_account);
////		Credit_account.sendKeys(credit_account);
////		Save.click();
////		Actions action = new Actions(driver);
////		action.moveToElement(Lists).build().perform();
////		Thread.sleep(2000);
////		action.moveToElement(Relationships).build().perform();
////		Thread.sleep(2000);
////		Customers.click();
////		Thread.sleep(2000);
////		Customer_list_click.click();
////
////		for (int i = 0; i < Customer_list.size(); i++) {
////			WebElement customer_list = Customer_list.get(i);
////			String customer_options = customer_list.getText();
////			// System.out.println(customer_options);
////			if (customer_options.equals("*anonymous — Big")) {
////				view_customer.click();
////			}
////
////		}
////		accept_payment.click();
////		form_arrow.click();
////		forms.get(2).click();
////		account_checkbox.get(1).click();
////		account_arrow.click();
////		account_dropdown.get(2).click();
////		charge_tab.click();
////		tran_arrow.click();
////		tran_dropdown.get(1).click();
////		charge_amount_click.click();
////		charge_value.sendKeys(charge_amount);
////		action.sendKeys(Keys.TAB).build().perform();
////		charge_selection.sendKeys(charge_name);
////		// charge_arrow.click();
////		// charge_dropdown.get(2).click();
////		save_payment.click();
////		String bankaccount = bank_account.getText();
////		String araccount = ar_account_writeoff.getText();
////		System.out.println("Bank account is" + " " + bankaccount);
////		charge_tab_after_payment.click();
////		journal_link.click();
////		String text = journal_link.getText();
////		System.out.println("The journal is created with" + " " + text + " " + "number");
////		windowHandle();
////		String invoice_is_created = invoice_transcation_link.getText();
////		System.out.println("Invoice is created with " + " " + invoice_is_created + " " + "number");
////		String banknumber = "6040";
////		String debita = debit_account1.getText();
////		String debita1 = banknumber.concat(" ").concat(debit_account);
////		String credita = credit_account1.getText();
////
////		System.out.println("debita1" + debita1);
////		System.out.println("The debit account is" + " " + debita);
////		if (testcase.equals("Ancillary charge creation Test case")) {
////			if (debita1.trim().equals(debita)) {
////				System.out.println("Success");
////				System.out.println("The" + " " + debit_account + " " + "is debited");
////			}
////			String debitamount = debit_amount.getText();
////			// System.out.println("The debit amount is" +" " +debitamount);
////			if (charge_amount.equals(debitamount)) {
////				System.out.println("success");
////				System.out.println("The debit amount is" + " " + debitamount);
////			}
////			// System.out.println("The credit account is" +" " +credita);
////			if (araccount.equals(credita)) {
////				System.out.println("success");
////				System.out.println("The" + " " + credita + " " + " is credited");
////
////			}
////			String creditamount = credit_amount.getText();
////			// System.out.println("The credit amount is" + " " +creditamount);
////			if (charge_amount.equals(creditamount)) {
////				System.out.println("success");
////				System.out.println("The credit amount is" + " " + creditamount);
////			}
////		}
////
////		if (testcase.trim().equals("Write Off Charge creation Test case")) {
////			if (araccount.equals(credita)) {
////				System.out.println("success");
////				System.out.println("The credit account is" + " " + araccount);
////			}
////			String debitacc = "6252 Taxes & Licenses-Other : Business";
////			if (debitacc.equals(debita)) {
////				System.out.println("Success");
////				System.out.println("The debit account is" + debita);
////			}
////		}
////		invoice_transcation_link.click();
////		windowHandle();
////		String invoicestatus = invoice_status.getText();
////		System.out.println("The invoice is now in" + invoicestatus + " " + "status");
////		action.moveToElement(Lists).build().perform();
////		Thread.sleep(2000);
////		action.moveToElement(Arrow).build().perform();
////		Thread.sleep(1000);
////		action.moveToElement(Ancillary_Charges).build().perform();
////		Thread.sleep(2000);
////		action.moveToElement(Applied_charges).click().build().perform();
////		arrow_ancillary_charge.click();
////		created_recently_charge.get(1).click();
////		created_ancillary_charge.click();
////		String journaltext = journal_from_ancillary_charge.getText();
////		System.out.println("journal is created with" + " " + journaltext + " " + "number");
////		String paymenttext = ancillary_charge_payment_nr.getText();
////		System.out.println("Payment is created with" + " " + paymenttext + " " + "number");
////		String invoicetext = ancillary_charge_invoice_nr.getText();
////		System.out.println("invoice is created with" + " " + invoicetext);
////		String journaltextfixed = "Journal #";
////		String journalfinal = journaltextfixed.concat(text);
////		if (journalfinal.equals(journaltext)) {
////			System.out.println("Ancillary charge is created");
////		}
////	}
//
////	public void partial_payment(String charge_name,String charge_amount,String testcase,String charge_name2,String charge_amount2) throws Exception
////	{
////		Actions action=new Actions(driver);
////		action.moveToElement(Lists).build().perform();
////		Thread.sleep(2000);
////		action.moveToElement(Relationships).build().perform();
////		Thread.sleep(2000);
////		Customers.click();
////		Thread.sleep(2000);
////		Customer_list_click.click();
////		for(int i=0;i<Customer_list.size();i++)
////		{
////			WebElement customer_list=Customer_list.get(i);
////			String customer_options=customer_list.getText();
////			//System.out.println(customer_options);
////			if(customer_options.equals("*anonymous — Big"))
////			{
////				view_customer.click();
////			}
////
////		}
////		accept_payment.click();
////		account_checkbox.get(1).click();
////		account_arrow.click();
////		account_dropdown.get(2).click();
////		//invoice_click.click();
////		if(testcase.trim().equals("Partial payment"))
////		{
////			for(int i=0;i<due_amount.size();i++)
////			{
////				if(i==1)
////					break;
////				invoicelink.get(i).click();
////				WebElement due_amount_list=due_amount.get(i);
////				String due_amount1=due_amount_list.getText();
////				System.out.println(due_amount1);	
////				double j=Double.parseDouble(due_amount1); 
////				if(j>101.00)
////				{
////					j=j-100.00;
////				}
////				if(j<=100&&j>10)
////				{
////					j=j-10.00;
////				}
////				if(j<=10&&j>2)
////				{
////					j=j-1;
////				}
////				System.out.println("double"+j);
////				String s=Double.toString(j);
////				System.out.println("String" +s);
////				payment_amount_click.click();
////				payment_amount_enter.clear();
////				payment_amount_enter.sendKeys(s);
////			}
////		}
////		else
////		{
////			for(int i=0;i<due_amount.size();i++)
////			{
////				if(i==1)
////					break;
////				invoicelink.get(i).click();
////			}
////
////		}
////
////
////
////		if(testcase.trim().equals("Multiple charge selection for single payment"))
////		{
////			add_button.click();
////			tran_arrow.click();
////			tran_dropdown.get(1).click();
////			//charge_amount_click.click();
////			action.sendKeys(Keys.TAB).build().perform();
////			charge_value.sendKeys(charge_amount2);
////			action.sendKeys(Keys.TAB).build().perform();
////			charge_selection.sendKeys(charge_name2);
////
////		}
////		save_payment.click();
////		String credit_account_for_bad_dept="6030 Bad Debt Expense";
////		String credit_account_for_bank_type_charge="6040 Bank Service Charges";
////		String araccount=Ar_account.getText();
////		String bankaccount=bank_account.getText();
////		System.out.println("Bank account is"+" "+bankaccount);
////		System.out.println("Ar account is" +" "+araccount);
////		charge_tab_after_payment.click();
////		for(int i=0;i<even_journal.size();i++)
////		{
////			System.out.println(even_journal.size());
////			WebElement even=even_journal.get(i);
////			String eventext=even.getText();
////			WebElement odd=odd_journal.get(i);
////			String oddtext=odd.getText();
////			System.out.println("The journal created is" +" " +oddtext);
////			System.out.println("The journal created is" +" "+eventext);
////			even_journal.get(i).click();
////			windowHandle();
////			String debita=debit_account1.getText();
////			System.out.println(debita);
////			String credita=credit_account1.getText();
////			System.out.println(credita);
////			if(araccount.equals(credita))
////			{
////				System.out.println("The customer AR account is debited ");
////			}
////			if(charge_name.equals("Bank Charges"))
////			{
////				if(credit_account_for_bank_type_charge.equals(debita))
////				{
////					System.out.println("Bank service charges account is credited");
////				}
////			}
////			if(charge_name2.equals("Bad Debt"))
////			{
////				if(credit_account_for_bad_dept.equals(debita))
////				{
////					System.out.println("Bad Dept is credited");
////				}
////			}
////			String invoice_is_created=invoice_transcation_link.getText();
////			System.out.println("Invoice is created with " +" " +invoice_is_created+" " +"number");
////			invoice_transcation_link.click();
////			String invoicestatus=invoice_status.getText();
////			if(invoicestatus.equalsIgnoreCase("Open"))
////			{
////				System.out.println("The invoice is still open because we paid partial amount");
////			}
////			driver.switchTo().defaultContent();
////			odd_journal.get(i).click();
////			windowHandle();
////			String debita1=debit_account1.getText();
////			System.out.println(debita);
////			String credita1=credit_account1.getText();
////			System.out.println(credita1);
////			if(araccount.equals(credita1))
////			{
////				System.out.println("The customer AR account is debited ");
////			}
////			if(charge_name.equals("Bank Charges"))
////			{
////				if(credit_account_for_bank_type_charge.equals(debita1))
////				{
////					System.out.println("Bank service charges account is credited");
////				}
////			}
////			if(charge_name2.equals("Bad Debt"))
////			{
////				if(credit_account_for_bad_dept.equals(debita1))
////				{
////					System.out.println("Bad Dept is credited");
////				}
////			}
////			String invoice_is_created1=invoice_transcation_link.getText();
////			System.out.println("Invoice is created with " +" " +invoice_is_created1+" " +"number");
////			invoice_transcation_link.click();
////			String invoicestatus1=invoice_status.getText();
////			if(invoicestatus1.equalsIgnoreCase("Open"))
////			{
////				System.out.println("The invoice is still open because we paid partial amount");
////			}
////
////		}
////	}
//
//		public static void windowHandle() throws Exception {
//
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			String currentwindow = driver.getWindowHandle();
//			parentWindow = currentwindow;
//			Set<String> allWindows = driver.getWindowHandles();
//			Iterator<String> i = allWindows.iterator();
//			while (i.hasNext()) {
//				String childwindow = i.next();
//				if (!childwindow.equalsIgnoreCase(currentwindow)) {
//					driver.switchTo().window(childwindow);
//				}
//			}
//		}
//		public void charge_selection(String charge_amount,String charge_name,String testcase,String no_of_invoices) throws Exception
//		{
//			Customer_Navigation_Accepting_Payment();
//			Actions action=new Actions(driver);
//			int invoice_size=Integer.parseInt(no_of_invoices);
//			String[] refnrs = new String[invoice_size];
//			int noofinvoices=Integer.parseInt(no_of_invoices);
//			for(int i=0;i<invoicelink.size();i++)
//			{
//				if(noofinvoices==i)
//				break;
//				invoicelink.get(i).click();
//				if(testcase.trim().equals("Partial payment"))
//				{
//					WebElement due_amount_list=due_amount.get(i);
//					String due_amount1=due_amount_list.getText();
//					System.out.println(due_amount1);	
//					double j=Double.parseDouble(due_amount1); 
//					if(j>101.00)
//					{
//						j=j-100.00;
//					}
//					if(j<=100&&j>10)
//					{
//						j=j-10.00;
//					}
//					if(j<=10&&j>2)
//					{
//						j=j-1;
//					}
//					System.out.println("double"+j);
//					String s=Double.toString(j);
//					System.out.println("String" +s);
//					payment_amount_click.click();
//					payment_amount_enter.clear();
//					payment_amount_enter.sendKeys(s);
//					
//				}
//				WebElement ref=refno.get(i);
//				refnrs[i]=ref.getText();
//				System.out.println("Invoices are"+"--------"+refnrs[i]);
//				
//			}
//			charge_tab.click();
//			for(int k=0;k<refnrs.length;k++)
//			{
//				if(k==refnrs.length)
//				break;
//			System.out.println(refnrs.length);
//			System.out.println("Reference no is"+"-----"+refnrs[k]);
//			Thread.sleep(2000);
//			tran_arrow.click();	
//			for(int i=0;i<tran_dropdown.size();i++)
//			{
//				
//				System.out.println(tran_dropdown.size());
//				WebElement textsel=tran_dropdown.get(i);
//				if(refnrs[k].equals(textsel.getText()))
//				{
//				tran_dropdown.get(i).click();
//				break;
//				}
//				
//			}
//			action.sendKeys(Keys.TAB).build().perform();
//			charge_value.sendKeys(charge_amount);
//			action.sendKeys(Keys.TAB).build().perform();
//			charge_arrow.click();
//			for(int j=0;j<charge_dropdown.size();j++)
//			{
//			WebElement charges=charge_dropdown.get(j);
//			String chargetext=charges.getText();
//			if(chargetext.equals(charge_name.trim()))
//			{
//				charges.click();
//				Thread.sleep(5000);
//					
//			}
//			}
//			}
//			save_payment.click();
//			charge_tab_after_payment.click();
//			int size=journallists.size();
//			for(int i=0;i<journallists.size();i++)
//			{
//				
//					System.out.println("Journal size is" +" " +journallists.size());
//					WebElement journal1=journallists.get(i);
//					journal1.click();
//					windowHandle();
//					String debita=debit_account1.getText();
//					System.out.println("debit acct value:: "+debita);
//					String credita=credit_account1.getText();
//					System.out.println(credita);
//					invoice_transcation_link.click();
//					driver.close();
//					windowHandle();
//					String invoicestatus = invoice_status.getText();
//					System.out.println("The invoice is now in" + invoicestatus + " " + "status");
//					driver.close();
//					Thread.sleep(2000);
//					driver.switchTo().window(parentWindow);
//					Thread.sleep(1000);
//			}
//			Ancillary_charges_screen();
//			System.out.println("aa size is" +size);
//			for(int i=0;i<size;i++)
//			{
//				System.out.println("Ancillary charge count is" +" "+size);
//				WebElement view_link_final=ancillary_charges_list.get(i);
//				action.moveToElement(view_link_final).build().perform();
//				String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER); 
//				view_link_final.sendKeys(selectLinkOpeninNewTab);
//				windowHandle();
//				System.out.println("Applied to transcation " +" "+i+" "+ancillary_charge_invoice_nr.getText());
//				driver.switchTo().window(parentWindow);
//			}
//		
//			
//			
//		}
//		public void single_payment_multiple_same_charges(String charge_amount,String charge_name,String testcase,String charge_name2,String total_charges) throws Exception
//		{
//			Actions action=new Actions(driver);
////			action.moveToElement(Lists).build().perform();
////			Thread.sleep(2000);
////			action.moveToElement(Relationships).build().perform();
////			Thread.sleep(2000);
////			Customers.click();
////			Thread.sleep(2000);
////			Customer_list_click.click();
////			for(int i=0;i<Customer_list.size();i++)
////			{
////				WebElement customer_list=Customer_list.get(i);
////				String customer_options=customer_list.getText();
////				if(customer_options.equals("*anonymous — Big"))
////				{
////					view_customer.click();
////				}
////			}
////			accept_payment.click();
////			form_arrow.click();
////			forms.get(2).click();
////			account_checkbox.get(1).click();
////			account_arrow.click();
////			account_dropdown.get(2).click();
//			Customer_Navigation_Accepting_Payment();
//			int refsize=Integer.parseInt(total_charges);
//			String[] refnrs = new String[refsize];
//			if(testcase.trim().equals("Multiple  invoices and multiple charges"))
//			{
//				
//				for(int i=0;i<invoice_links.size();i++)
//				{
//					if(i==2)
//					break;
//					WebElement ref=refno.get(i);
//					refnrs[i]=ref.getText();
//					System.out.println("Invoices are"+"--------"+refnrs[i]);
//					invoice_links.get(i).click();
//					Thread.sleep(2000);
//					
//
//				}
//			}
//			else
//			{
//			invoice_click.click();
//			}
//			charge_tab.click();
//			if(testcase.trim().equals("Same Charge Multiple times"))
//			{
//				tran_arrow.click();	
//				for(int i=0;i<tran_dropdown.size();i++)
//				{
//					if(i==refsize)
//						break;
//					System.out.println(tran_dropdown.size());
//					WebElement textsel=tran_dropdown.get(i);
//					{
//					tran_dropdown.get(i+1).click();
//					}
//				action.sendKeys(Keys.TAB).build().perform();
//				charge_value.sendKeys(charge_amount);
//				action.sendKeys(Keys.TAB).build().perform();
//				charge_arrow.click();
//				for(int j=0;j<charge_dropdown.size();j++)
//				{
//				WebElement charges=charge_dropdown.get(j);
//				String chargetext=charges.getText();
//				if(chargetext.equals(charge_name.trim()))
//				{
//					charges.click();
//					Thread.sleep(5000);
//						
//				}
//				}
//				add_button.click();
//				tran_arrow.click();	
//				}
//				
//				
//				}
//				
//				
//				
//
//			if(testcase.trim().equals("Multiple charge selection for single payment"))
//			{
//				tran_arrow.click();	
//				for(int i=0;i<tran_dropdown.size();i++)
//				{
//					if(i==refsize)
//						break;
//					System.out.println(tran_dropdown.size());
//					WebElement textsel=tran_dropdown.get(i);
//					{
//					tran_dropdown.get(i+1).click();
//					}
//				action.sendKeys(Keys.TAB).build().perform();
//				if(i==0)
//				{
//				charge_value.sendKeys(charge_amount);
//				action.sendKeys(Keys.TAB).build().perform();
//				charge_arrow.click();
//				for(int j=0;j<charge_dropdown.size();j++)
//				{
//				WebElement charges=charge_dropdown.get(j);
//				String chargetext=charges.getText();
//				if(chargetext.equals(charge_name.trim()))
//				{
//					charges.click();
//					Thread.sleep(5000);
//						
//				}
//				}
//				}
//				if(i==1)
//				{
//				charge_value.sendKeys(charge_amount);
//				action.sendKeys(Keys.TAB).build().perform();
//				charge_arrow.click();
//				for(int j=0;j<charge_dropdown.size();j++)
//				{
//				WebElement charges=charge_dropdown.get(j);
//				String chargetext=charges.getText();
//				if(chargetext.equals(charge_name2.trim()))
//				{
//					charges.click();
//					Thread.sleep(5000);
//						
//				}
//				}
//				}
//				add_button.click();
//				tran_arrow.click();	
//				}
//				}
//				
//			
//			if(testcase.trim().equals("Multiple  invoices and multiple charges"))
//			{
//				
//				for(int k=0;k<refnrs.length;k++)
//				{
//				System.out.println("Reference no is"+"-----"+refnrs[k]);
//				Thread.sleep(2000);
//				tran_arrow.click();	
//				for(int i=1;i<=tran_dropdown.size();i++)
//				{
//					
//					System.out.println(tran_dropdown.size());
//					WebElement textsel=tran_dropdown.get(i);
//					if(refnrs[k].equals(textsel.getText()))
//					{
//					tran_dropdown.get(i).click();
//					break;
//					}
//					if(i==3)
//					{
//					break;
//					}
//				}
//				action.sendKeys(Keys.TAB).build().perform();
//				charge_value.sendKeys(charge_amount);
//				action.sendKeys(Keys.TAB).build().perform();
//				charge_arrow.click();
//				for(int j=0;j<charge_dropdown.size();j++)
//				{
//				WebElement charges=charge_dropdown.get(j);
//				String chargetext=charges.getText();
//				if(k==0)
//				{
//				if(chargetext.equals("Bank Charges"))
//				{
//					charges.click();
//					Thread.sleep(5000);
//				}
//				}
//				if(k==1)
//				{
//					if(chargetext.equals("Bad Debt"))
//					{
//						charges.click();
//						Thread.sleep(5000);
//
//					}
//				}
//				}
//				add_button.click();
//			}
//			}
//			save_payment.click();
//			charge_tab_after_payment.click();
//			int size=journallists.size();
//			for(int i=0;i<journallists.size();i++)
//			{
//				
//					System.out.println("Journal size is" +" " +journallists.size());
//					WebElement journal1=journallists.get(i);
//					journal1.click();
//					windowHandle();
//					String debita=debit_account1.getText();
//					System.out.println("debit acct value:: "+debita);
//					String credita=credit_account1.getText();
//					System.out.println(credita);
//					driver.close();
//					Thread.sleep(2000);
//					driver.switchTo().window(parentWindow);
//					Thread.sleep(1000);
//			}
//			int total_charges_final=Integer.parseInt(total_charges);
//			if(total_charges_final==size)
//			{
//				System.out.println("The charges selected and journals created are equal");
//			}
//			action.moveToElement(Lists).build().perform();
//			Thread.sleep(1000);
//			action.moveToElement(Arrow).build().perform();
//			Thread.sleep(1000);
//			action.moveToElement(Ancillary_Charges).build().perform();
//			Thread.sleep(1000);
//			action.moveToElement(Applied_charges).click().build().perform();
//			Thread.sleep(1000);
//			System.out.println("aa size is" +size);
//			for(int i=0;i<size;i++)
//			{
//				System.out.println("Ancillary charge count is" +" "+size);
//				WebElement view_link_final=ancillary_charges_list.get(i);
//				action.moveToElement(view_link_final).build().perform();
//				String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER); 
//				view_link_final.sendKeys(selectLinkOpeninNewTab);
//				windowHandle();
//				System.out.println("Applied to transcation " +" "+i+" "+ancillary_charge_invoice_nr.getText());
//				driver.switchTo().window(parentWindow);
//			}
//			
//		}
//		public void total_write_off(String charge_amount,String charge_name,String testcase,String new_amount,String new_charge) throws Exception
//		{
//			Actions action=new Actions(driver);
//			action.moveToElement(Lists).build().perform();
//			Thread.sleep(2000);
//			action.moveToElement(Relationships).build().perform();
//			Thread.sleep(2000);
//			Customers.click();
//			Thread.sleep(2000);
//			Customer_list_click.click();
//			for(int i=0;i<Customer_list.size();i++)
//			{
//				WebElement customer_list=Customer_list.get(i);
//				String customer_options=customer_list.getText();
//				if(customer_options.equals("*anonymous — Big"))
//				{
//					view_customer.click();
//				}
//			}
//			accept_payment.click();
//			form_arrow.click();
//			forms.get(2).click();
//			account_checkbox.get(1).click();
//			account_arrow.click();
//			account_dropdown.get(2).click();
//			String chargeamounts=due_amount.get(0).getText();
//			invoice_click.click();
//			charge_tab.click();
//			tran_arrow.click();
//			tran_dropdown.get(1).click();
//			action.sendKeys(Keys.TAB).build().perform();
//			if(testcase.trim().equals("Editing journal entry testcase"))
//			{
//				charge_value.sendKeys(chargeamounts);
//				action.sendKeys(Keys.TAB).build().perform();
//				charge_selection.sendKeys(charge_name);
//				save_payment.click();
//				charge_tab_after_payment.click();
//				int size=journallists.size();
//				for(int i=0;i<journallists.size();i++)
//				{
//						System.out.println("Journal size is" +" " +journallists.size());
//						WebElement journal1=journallists.get(i);
//						journal1.click();
//						windowHandle();
//						String debita=debit_account1.getText();
//						System.out.println("debit acct value:: "+debita);
//						String credita=credit_account1.getText();
//						System.out.println(credita);
//						journal_edit.click();
//						memo.sendKeys("test");
//						System.out.println("Failed Testcase");
//						boolean alertt=isAlertPresent();
//						if(alertt==false)
//						{
//							throw new NoAlertPresentException("journal should not be edited");
//						}
////						System.out.println(alertt);
////						org.junit.Assert.assertEquals(true,alertt);
//						journal_save.click();
//						Thread.sleep(2000);
//						driver.switchTo().window(parentWindow);
//						Thread.sleep(1000);
//						}
//						
//				
//				
//			}
//			if(testcase.trim().equals("Total amount as WriteOff testcase"))
//			{
//			System.out.println(chargeamounts);
//			charge_value.sendKeys(chargeamounts);
//			action.sendKeys(Keys.TAB).build().perform();
//			charge_selection.sendKeys(charge_name);
//			save_payment.click();
//			driver.switchTo().alert();
//			}
//			if(testcase.trim().equals("Percentage as Charge Amount  testcase"))
//			{
//				String value=charge_amount+"%";
//				System.out.println(value);
//				charge_value.sendKeys(value);
//				action.sendKeys(Keys.TAB).build().perform();
//				charge_selection.sendKeys(charge_name);
//				save_payment.click();
//				payment_edit.click();
//				charge_tab_after_payment.click();
//				charge_amount_change_click.click();
////				int value1=Integer.parseInt(charge_amount)+2;
////				System.out.println("The second value is"+" "+value1);
////				String value2=String.valueOf(value1);
//				charge_amount_change.sendKeys(new_amount);
//				save_payment.click();
//				boolean alerttt=isAlertPresent();
//				System.out.println(alerttt);
//				Assert.assertEquals(false, alerttt);
////				Alert alert=driver.switchTo().alert();
////				String text=alert.getText();
////				System.out.println("message is"+" "+text);
//				
//				
//
//
//			}
//			if(testcase.trim().equals("Changing Charge testcase"))
//			{
//				charge_value.sendKeys(charge_amount);
//				action.sendKeys(Keys.TAB).build().perform();
//				charge_selection.sendKeys(charge_name);
//				save_payment.click();
//				payment_edit.click();
//				charge_tab_after_payment.click();
//				charge_name_change_click.click();
//				charge_name_change.sendKeys(new_charge);
//				save_payment.click();
//				boolean alerttt=isAlertPresent();
//				System.out.println(alerttt);
//			//	Assert.assertTrue(true);
//				org.junit.Assert.assertEquals(false, alerttt);
////				Alert alert=driver.switchTo().alert();
////				String text=alert.getText();
////				System.out.println("message is"+" "+text);
//			}
//	
//		}
//
//		public void customer_link() throws InterruptedException {
//			Actions action = new Actions(driver);
//			action.moveToElement(Lists).build().perform();
//			Thread.sleep(2000);
//			action.moveToElement(Relationships).build().perform();
//			Thread.sleep(2000);
//			Customers.click();
//			Thread.sleep(2000);
//			view_customer.click();
//			String oldurl = driver.getCurrentUrl();
//			String id = "373";
//			String fixed_url = "https://tstdrv939179-rp.app.netsuite.com/app/common/entity/custjob.nl?id=";
//			String new_url = fixed_url.concat(id);
//			driver.navigate().to(new_url);
//
//		}
//		@SuppressWarnings("deprecation")
//		public void deleting_payment_journal_ancillary(String charge_amount,String charge_name,String testcase,String no_of_invoices) throws Exception
//		{
//			int invoice_size=Integer.parseInt(no_of_invoices);
//			String[] refnrs = new String[invoice_size];
//			Actions action=new Actions(driver);
//			String[] journal_count_before=new String[2];
//			String[] journal_count_after=new String[2];
//			action.moveToElement(Lists).build().perform();
//			Thread.sleep(2000);
//			action.moveToElement(Relationships).build().perform();
//			Thread.sleep(2000);
//			Customers.click();
//			Thread.sleep(2000);
//			Customer_list_click.click();
//			Thread.sleep(2000);
//			for(int i=0;i<Customer_list.size();i++)
//			{
//				WebElement customer_list=Customer_list.get(i);
//				String customer_options=customer_list.getText();
//				if(customer_options.trim().equals("*anonymous — Bezak"))
//				{
//					customer_list.click();
//				}
//			}
//			view_customer.click();
//			accept_payment.click();
//			form_arrow.click();
//			Thread.sleep(1000);
//			for(int i=0;i<forms.size();i++)
//			{
//				WebElement form=forms.get(i);
//				String standard_form=form.getText();
//				if(standard_form.trim().equals("Standard Customer Payment"))
//				{
//					form.click();
//				}
//			}
//			account_checkbox.get(1).click();
//			account_arrow.click();
//			account_dropdown.get(2).click();
//			int noofinvoices=Integer.parseInt(no_of_invoices);
//			for(int i=0;i<invoicelink.size();i++)
//			{
//				if(noofinvoices==i)
//				break;
//				invoice_click.click();
//				WebElement ref=refno.get(i);
//				refnrs[i]=ref.getText();
//				System.out.println("Invoices are"+"--------"+refnrs[i]);
//				
//			}
//			charge_tab.click();
//			for(int k=0;k<refnrs.length;k++)
//			{
//				if(k==refnrs.length)
//				break;
//			System.out.println(refnrs.length);
//			System.out.println("Reference no is"+"-----"+refnrs[k]);
//			Thread.sleep(2000);
//			tran_arrow.click();	
//			for(int i=0;i<tran_dropdown.size();i++)
//			{
//				
//				System.out.println(tran_dropdown.size());
//				WebElement textsel=tran_dropdown.get(i);
//				if(refnrs[k].equals(textsel.getText()))
//				{
//				tran_dropdown.get(i).click();
//				break;
//				}
//				
//			}
//			action.sendKeys(Keys.TAB).build().perform();
//			charge_value.sendKeys(charge_amount);
//			action.sendKeys(Keys.TAB).build().perform();
//			charge_arrow.click();
//			for(int j=0;j<charge_dropdown.size();j++)
//			{
//			WebElement charges=charge_dropdown.get(j);
//			String chargetext=charges.getText();
//			if(chargetext.equals(charge_name.trim()))
//			{
//				charges.click();
//				Thread.sleep(5000);
//					
//			}
//			}
//			}
//			save_payment.click();
//			String payment_url=driver.getCurrentUrl();
//			charge_tab_after_payment.click();
//			int size=journallists.size();
//			String [] ancillary_urls=new String[size] ;
//			String[]journal_urls=new String[size];
//			for(int i=0;i<journallists.size();i++)
//			{
//				
//					System.out.println("Journal size is" +" " +journallists.size());
//					WebElement journal1=journallists.get(i);
//					journal1.click();
//					windowHandle();
//					journal_urls[i]=driver.getCurrentUrl();
//					String debita=debit_account1.getText();
//					System.out.println("debit acct value:: "+debita);
//					String credita=credit_account1.getText();
//					System.out.println(credita);
//					if(testcase.trim().equals("deleting journal"))
//					{
//						journal_edit.click();
//						action.moveToElement(Actions_payment).build().perform();
//						delete_payment.click();
//						Alert alert=driver.switchTo().alert();
//						String alert_text=alert.getText();
//						System.out.println("Alert value is: "+ alert_text);
//						if(alert_text.contains("Are you sure you want to delete this transaction?"))
//						{
//							Assert.assertEquals("don't delete", alert_text);
//						}
//					}
//					driver.switchTo().window(parentWindow);
//					Thread.sleep(1000);
//			}
//			Thread.sleep(10000);
//			action.moveToElement(Lists).build().perform();
//			Thread.sleep(1000);
//			action.moveToElement(Arrow).build().perform();
//			Thread.sleep(1000);
//			action.moveToElement(Ancillary_Charges).build().perform();
//			Thread.sleep(1000);
//			action.moveToElement(Applied_charges).click().build().perform();
//			System.out.println("aa size is" +size);
//			for(int i=0;i<size;i++)
//			{
//				System.out.println("Ancillary charge count is" +" "+size);
//				WebElement view_link_final=ancillary_charges_list.get(i);
//				action.moveToElement(view_link_final).build().perform();
//				String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER); 
//				view_link_final.sendKeys(selectLinkOpeninNewTab);
//				windowHandle();
//				ancillary_urls[i]=driver.getCurrentUrl();
//				System.out.println("Applied to transcation " +" "+i+" "+ancillary_charge_invoice_nr.getText());
//				if(testcase.trim().equals("deleting ancillary"))
//				{
//					ancillary_edit.click();
//					action.moveToElement(Actions_payment).build().perform();
//					delete_payment.click();
//					Alert alert=driver.switchTo().alert();
//					String alert_text=alert.getText();
//					System.out.println("Alert value is: "+ alert_text);
//					if(alert_text.contains("Are you sure you want to delete this record?"))
//					{
//						Assert.assertEquals("don't delete", alert_text);
//					}
//					
//				}
//				driver.close();
//				driver.switchTo().window(parentWindow);
//			}
//			driver.navigate().to(payment_url);
////			 JavascriptExecutor js = (JavascriptExecutor) driver;
////	            js.executeScript("window.scrollBy(0,-350)", "");
//				payment_edit_secondary.click();
//				action.moveToElement(Actions_payment).build().perform();
//				delete_payment.click();
//				Alert alert=driver.switchTo().alert();
//				alert.accept();
//				Thread.sleep(5000);
//			
//			if(testcase.trim().equals("deleting testcase"))
//			{
//				System.out.println("Navigating to  journal entry");
//				for(int i=0;i<size;i++)
//				driver.navigate().to(journal_urls[i]);
//				journal_notexist.click();
//				if(journal_notexist.getText().equals("That record does not exist."))
//				{
//					System.out.println("The journal doesn't exist ----- journal got deleted succesfully");
//				}
//				
//				
//			}
//			if(testcase.trim().equals("deleting testcase"))
//			{
//				
//				System.out.println("Navigating to ancillary charge");
//				for(int i=0;i<size;i++)
//				driver.navigate().to(ancillary_urls[i]);
//				journal_notexist.click();
//				if(journal_notexist.getText().equals("That record does not exist."))
//				{
//					System.out.println("The ancillary charge doesn't exist ----- ancillary charge got deleted succesfully");
//				}
//				
//			
//			}
//			
////			if(testcase.trim().equals("deleting ancillary charges testcase"))
////			{
////			action.moveToElement(Lists).build().perform();
////			Thread.sleep(1000);
////			action.moveToElement(Arrow).build().perform();
////			Thread.sleep(1000);
////			action.moveToElement(Ancillary_Charges).build().perform();
////			Thread.sleep(1000);
////			action.moveToElement(Applied_charges).build().perform();
////			action.keyDown(Keys.CONTROL).click(Applied_charges).keyUp(Keys.CONTROL).build().perform();
////			System.out.println("aa size is" +size);
////			for(int i=0;i<size;i++)
////			{
////				System.out.println("Ancillary charge count is" +" "+size);
////				WebElement view_link_final=ancillary_charges_list.get(i);
////				action.moveToElement(view_link_final).build().perform();
////				String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER); 
////				view_link_final.sendKeys(selectLinkOpeninNewTab);
////				windowHandle();
////				ancillary_urls[i]=driver.getCurrentUrl();
////				System.out.println("Applied to transcation " +" "+i+" "+ancillary_charge_invoice_nr.getText());
////				driver.close();
////				driver.switchTo().window(parentWindow);
////				Thread.sleep(2000);
////			    JavascriptExecutor js = (JavascriptExecutor) driver;
////	            js.executeScript("window.scrollBy(0,-350)", "");
////				payment_edit_secondary.click();
////				action.moveToElement(Actions_payment).build().perform();
////				delete_payment.click();
////				Alert alert=driver.switchTo().alert();
////				alert.accept();
////			}
////			if(testcase.trim().equals("deleting ancillary charges testcase"))
////			{
////				
////				for(int i=0;i<size;i++)
////				driver.navigate().to(ancillary_urls[i]);
////				journal_notexist.click();
////				if(journal_notexist.getText().equals("That record does not exist."))
////				{
////					System.out.println("The ancillary charge doesn't exist ----- ancillary charge got deleted succesfully");
////				}
////				
////			
////			}
////			String[] urls=new String[size];
////			if(testcase.trim().equals("deleting payment testcase"))
////			{
////				for(int i=0;i<journallists.size();i++)
////				{
////					WebElement journal_open=journallists.get(i);
////					String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER); 
////					journal_open.sendKeys(selectLinkOpeninNewTab);
////					windowHandle();
////					urls[i]=driver.getCurrentUrl();
////					System.out.println("before url is"+" "+urls[i]);
////					driver.switchTo().window(parentWindow);
////					Thread.sleep(2000);
////				    JavascriptExecutor js = (JavascriptExecutor) driver;
////		            js.executeScript("window.scrollBy(0,-350)", "");
////					payment_edit_secondary.click();
////					action.moveToElement(Actions_payment).build().perform();
////					delete_payment.click();
////					Alert alert=driver.switchTo().alert();
////					alert.accept();
////				}
////				if(testcase.trim().equals("deleting payment testcase"))
////				{
////					
////					for(int i=0;i<size;i++)
////					driver.navigate().to(urls[i]);
////					journal_notexist.click();
////					if(journal_notexist.getText().equals("That record does not exist."))
////					{
////						System.out.println("The journal doesn't exist ----- journal got deleted succesfully");
////					}
////					
////					
////				}
//		
//			
////			if(testcase.trim().equals("deleting payment testcase"))
////			{
////				
////				Thread.sleep(2000);
////				action.moveToElement(Transactions).build().perform();
////				Thread.sleep(3000);
////				action.moveToElement(expand).build().perform();
////				Thread.sleep(2000);
////				action.moveToElement(financial).build().perform();
////				Thread.sleep(2000);
////				action.moveToElement(make_journal_entries).build().perform();
////				Thread.sleep(2000);
////				action.moveToElement(jelist).build().perform();
//////				String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
//////				jelist.sendKeys(selectLinkOpeninNewTab);
////				action.keyDown(Keys.CONTROL).click(jelist).keyUp(Keys.CONTROL).build().perform();
////				windowHandle();
////				jecount.click();
////				String journal_count_before_=jecount.getText();
////				journal_count_before= journal_count_before_.split(" ");
////				System.out.println("Before deleting journal transaction"+" "+journal_count_before[2]);
////				driver.switchTo().window(parentWindow);
////			}
////			if(testcase.trim().equals("deleting payment testcase"))
////			{
////				payment_edit_secondary.click();
////				action.moveToElement(Actions_payment).build().perform();
////				delete_payment.click();
////				Alert alert=driver.switchTo().alert();
////				alert.accept();
//////				WebDriverWait wait = new WebDriverWait(driver, 15);
//////				wait.until(ExpectedConditions.visibilityOf(Transactions));	
////				Thread.sleep(15000);
////				action.moveToElement(Transactions).build().perform();
////				Thread.sleep(3000);
////				action.moveToElement(expand).build().perform();
////				Thread.sleep(2000);
////				action.moveToElement(financial).build().perform();
////				Thread.sleep(2000);
////				action.moveToElement(make_journal_entries).build().perform();
////				Thread.sleep(2000);
////				action.moveToElement(jelist).build().perform();
////				jelist.click();
////				jecount.click();
////				String journal_count_after_=jecount.getText();
////				journal_count_after= journal_count_after_.split(" ");
////				System.out.println("After deleting journal transaction"+" "+journal_count_after[2]);
////				int before_length=Integer.parseInt(journal_count_before[2]);
////				System.out.println("before journal in integer" +" "+before_length);
////				int after_length=Integer.parseInt(journal_count_after[2]);
////				System.out.println("after journal in integer"+" "+after_length);
////				System.out.println("the no of journals are"+" "+size);
////				if((before_length-size)==(after_length))
////						{
////							System.out.println("The journal is deleted successfully");
////						}
////				
////				
////			}
//			
//			
//			
//			
//	
//			
//			
//			
//		}
//		
//		}
//
//	

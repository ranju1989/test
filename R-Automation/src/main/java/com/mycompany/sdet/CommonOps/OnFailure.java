package com.mycompany.sdet.CommonOps;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

public class OnFailure extends TestListenerAdapter {
	int c =1;
	
    @Step("Hi, I'm step in your testng listener")
    @Override
    public void onTestFailure(ITestResult tr) {
        createAttachment();
    }

    @Attachment
    public byte[] createAttachment(){
    	WebDriverOperations webDriOps = new WebDriverOperations();
    	return webDriOps.createAttachment();
    }
}
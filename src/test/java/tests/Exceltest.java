package tests;

import actions.ActionHelper;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.ExcelUtils;
import utils.JsonUtils;

import java.io.IOException;

public class Exceltest extends BaseTest {
    @Test
    public void testExceldata() throws IOException {
        ActionHelper action = new ActionHelper(driver);

        ExcelUtils.setExcelFile(System.getProperty("user.dir")+ "\\src\\test\\java\\data\\TestData.xlsx", "Sheet1");
        action.type(By.id("idtextbox1"), ExcelUtils.getCellData(0, 1));

        ExcelUtils.closeWorkbook();
    }
}

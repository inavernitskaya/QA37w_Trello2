package tests;

import manage.MyDataProvider;
import models.Board;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreation extends TestBase{

    @BeforeMethod
    public void preCondition(){
        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillINLoginForm("inavernitskaya@gmail.com", "aA54321!");
        app.getUser().submitLogin();
        app.getUser().pause(2000);
    }

    @Test(dataProvider = "boardDataModel", dataProviderClass = MyDataProvider.class)
    public void boardCreation1(Board board){
        app.getBoard().initBoardCreationFromHeader();
        app.getBoard().fillInBoardCreationForm(board);
        //app.getBoard().scrollDownTheForm();
        app.getBoard().pause(2000);
        app.getBoard().submitBoardCreation();
        app.getBoard().pause(2000);
        Assert.assertTrue(app.getBoard().isCreated());
        //app.getBoard().isCreated();
        app.getBoard().pause(2000);
        app.getBoard().returnToHomePage();
        app.getUser().logOut();

    }

}



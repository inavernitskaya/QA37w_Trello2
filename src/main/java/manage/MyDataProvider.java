package manage;

import models.Board;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyDataProvider {

    @DataProvider
    public static Iterator<Object[]> boardDataModel(){
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{new Board().setTitle("test37modnew1")});
        list.add(new Object[]{new Board().setTitle("test37modnew2")});

        return  list.iterator();
    }
}
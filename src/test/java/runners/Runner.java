package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml"},// rapor olusturmak icin
        features = "src/test/resources/features", // features klasorunun adresi
        glue = "stepdefinitions",//testlerin icerisinde oldugu paketin ismi
        tags = "@walmart", // seçtiğiniz tag'a ait testler çalıştırılır.
        dryRun = false //senaryoda olusturdugumuz ancak henuz test methodu yazilmamis olan stepslerin
                       // methodlarini console da gormek icin "dryRun = true" seklinde kullaniyoruz

        //dryRun = false olursa testleri calistirir
        //dryRun = true olursa eksik olan methodlari bulur ve size oneride bulunur.
)

public class Runner {

}


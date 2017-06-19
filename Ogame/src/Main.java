import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        //With this you login and a session is created
        Connection.Response res = Jsoup.connect("https://pl.ogame.gameforge.com/main/login")
                .data("kid", "", "login", "rogal", "pass", "adidas", "uni", "s147-pl.ogame.gameforge.com")
                .method(Connection.Method.POST)
                .execute();

        //This will get you cookies
        Map<String, String> loginCookies = res.cookies();

        Thread.sleep(1000);
        //Here you parse the page that you want. Put the url that you see when you have logged in
        Document doc = Jsoup.connect("https://s147-pl.ogame.gameforge.com/game/index.php?page=eventList&ajax=1")
                .cookies(loginCookies)
                .get();


        if (!doc.toString().contains("data-mission-type=\"1\""))
            System.out.println("Jesteś bezpieczny");
        else
            System.out.println("coś się dzieje");
    }
}

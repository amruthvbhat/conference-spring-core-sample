import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;

import java.awt.*;

public class Application {
    public static void main(String[] args)
    {
        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());
    }
}

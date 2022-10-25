package pl.com.przepiora.ToDoPlus.vaadin;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Route("")
@Slf4j
public class MainView extends HorizontalLayout {
    public MainView() {
        Button button = new Button("test2");
        Notification notification = Notification
                .show("Financial report generated");
        button.addClickListener(buttonClickEvent -> System.out.println("uhho"));
        add(button);
    }
}

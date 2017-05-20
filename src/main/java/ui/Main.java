package ui;

import java.io.File;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.FileResource;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@Theme("valo")
@SpringUI
@SpringView(name = Main.VIEW_NAME)
public class Main extends VerticalLayout implements View {
	private static final long serialVersionUID = -3354589822948433173L;
	public static final String VIEW_NAME = "";
	FormWindow formWindow;

	@Override
	public void enter(ViewChangeEvent event) {
		setSizeFull();
		createUpperPanel();
		createContent();
		createBottomPanel();
	}

	private void createUpperPanel() {
		Label nameLabel = new Label("METRO Agile Information Radiators");
		nameLabel.setStyleName(ValoTheme.LABEL_HUGE);
		nameLabel.addStyleName(ValoTheme.LABEL_COLORED);
		HorizontalLayout upperLayout = new HorizontalLayout();
		upperLayout.addComponent(nameLabel);
		upperLayout.setSpacing(false);
		upperLayout.setStyleName(ValoTheme.WINDOW_TOP_TOOLBAR);
		addComponent(upperLayout);
	}

	private void createContent() {
		VerticalLayout content = new VerticalLayout();
		
		GridLayout gridLayout = createPhotosPanel();
		
		content.addComponent(gridLayout);
		content.setSizeFull();
		addComponent(content);
		setExpandRatio(content, 1);
	}

	private GridLayout createPhotosPanel() {
		Image leftPhoto = new Image("", new FileResource(new File("photo1.jpg")));
		Image rightPhoto = new Image("", new FileResource(new File("photo1.jpg")));

		leftPhoto.addClickListener(clickEvent -> {
		formWindow = new FormWindow();
		getUI().getNavigator().navigateTo("FormView");
		});
		rightPhoto.addClickListener(clickEvent ->
        Notification.show("Do not press this button again"));
		
		GridLayout gridLayout = new GridLayout();
		gridLayout.setColumns(3);
		gridLayout.setRows(1);
		gridLayout.setSizeFull();
		
		//TODO: put it in the middle
		HorizontalLayout horizontalLayout = new HorizontalLayout();
		HorizontalLayout leftPadding = new HorizontalLayout();
		HorizontalLayout rightPadding = new HorizontalLayout();

		leftPadding.setHeight(90.0f, Unit.PERCENTAGE);
		horizontalLayout.setHeight(90.0f, Unit.PERCENTAGE);
		rightPadding.setHeight(90.0f, Unit.PERCENTAGE);
		
		horizontalLayout.addComponents(leftPhoto, rightPhoto);
		gridLayout.addComponent(leftPadding, 0, 0);
		gridLayout.addComponent(horizontalLayout, 1, 0);
		gridLayout.addComponent(rightPadding, 2, 0);
		return gridLayout;
	}

	private void createBottomPanel() {
		HorizontalLayout bottomLayout = new HorizontalLayout();
		Label quoteLabel = new Label("\"You can’t manage what you don’t measure.\" - PETER DRUCKER");
		quoteLabel.setStyleName(ValoTheme.LABEL_LIGHT);
		bottomLayout.addComponent(quoteLabel);
		bottomLayout.setStyleName(ValoTheme.WINDOW_BOTTOM_TOOLBAR);
		bottomLayout.setWidth("100%");
		addComponent(bottomLayout);
	}
}

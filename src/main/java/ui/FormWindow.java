package ui;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.themes.ValoTheme;

import util.RadioButtonsQA;

@SpringUI
@SpringView(name = "FormView")
public class FormWindow extends Panel implements View{
	private static final long serialVersionUID = 2584682752994096657L;
	
	@Override
	public void enter(ViewChangeEvent event) {
		buildForm();
	}

	private void buildForm() {
		setResponsive(true);
		GridLayout gridLayout = new GridLayout();
		gridLayout.setColumns(3);
		gridLayout.setWidth("1200px");
		gridLayout.setRows(10);
		
		Label deploymentLabel = new Label("Deployment");
		deploymentLabel.addStyleName(ValoTheme.LABEL_LARGE);
		gridLayout.addComponent(deploymentLabel, 0, 0);
		
		Label l = null;
		FormLayout leftFormLayout = new FormLayout();
		l = new Label("We put all changes as code in version control");
		leftFormLayout.addComponents(l);
		l = new Label("We have an integrated tool for automated storage of release artifacts in repository");
		leftFormLayout.addComponents(l);
		l = new Label("We have automated nightly code integration and deployment in DEV environment");
		leftFormLayout.addComponents(l);
		l = new Label("We can automatically deploy in UAT environment");
		leftFormLayout.addComponents(l);
		l = new Label("If something fails, is fixed permanently (code in version control and restart the entire process)");
		leftFormLayout.addComponents(l);
		l = new Label("We have an integrated tool for automated static code analysis");
		leftFormLayout.addComponents(l);
		l = new Label("Automated tests are part of the build");
		leftFormLayout.addComponents(l);
		l = new Label("We can automatically deploy in (integration) QA environment");
		leftFormLayout.addComponents(l);
		l = new Label("We can create automatically DEV environments as needed (by scripts)");
		leftFormLayout.addComponents(l);
		l = new Label("Our deployments do not impact our services");
		leftFormLayout.addComponents(l);	

		FormLayout rightFormLayout = new FormLayout();
		RadioButtonsQA rbQ1 = new RadioButtonsQA();
		rightFormLayout.addComponents(rbQ1.buttonGroup);
		RadioButtonsQA rbQ2 = new RadioButtonsQA();
		rightFormLayout.addComponents(rbQ2.buttonGroup);
		RadioButtonsQA rbQ3 = new RadioButtonsQA();
		rightFormLayout.addComponents(rbQ3.buttonGroup);
		RadioButtonsQA rbQ4 = new RadioButtonsQA();
		rightFormLayout.addComponents(rbQ4.buttonGroup);
		RadioButtonsQA rbQ5 = new RadioButtonsQA();
		rightFormLayout.addComponents(rbQ5.buttonGroup);
		RadioButtonsQA rbQ6 = new RadioButtonsQA();
		rightFormLayout.addComponents(rbQ6.buttonGroup);
		RadioButtonsQA rbQ7 = new RadioButtonsQA();
		rightFormLayout.addComponents(rbQ7.buttonGroup);
		RadioButtonsQA rbQ8 = new RadioButtonsQA();
		rightFormLayout.addComponents(rbQ8.buttonGroup);
		RadioButtonsQA rbQ9 = new RadioButtonsQA();
		rightFormLayout.addComponents(rbQ9.buttonGroup);
		RadioButtonsQA rbQ10 = new RadioButtonsQA();
		rightFormLayout.addComponents(rbQ10.buttonGroup);
		leftFormLayout.setSizeFull();
		gridLayout.addComponent(leftFormLayout, 0, 1);
		gridLayout.addComponent(rightFormLayout, 2, 1);
		gridLayout.setMargin(true);
		gridLayout.setSpacing(true);
		
		Label testingLabel = new Label("Testing");
		testingLabel.addStyleName(ValoTheme.LABEL_LARGE);
		gridLayout.addComponent(testingLabel, 0, 2);

		leftFormLayout = new FormLayout();
		rightFormLayout = new FormLayout();
		l = new Label("We have a test automation framework where time consuming, high risk features can be tested");
		leftFormLayout.addComponent(l);
		l = new Label("All of the code we are currently writing has a minimum of 70% good quality unit test coverage");
		leftFormLayout.addComponent(l);
		l = new Label("Unit tests run automatically in every Jenkins build and we fix them when they fail");
		leftFormLayout.addComponent(l);
		l = new Label("We have insight into the quality (test coverage, complexity)");
		leftFormLayout.addComponent(l);
		l = new Label("When tests fail, the responsible is automatically alerted");
		leftFormLayout.addComponent(l);
		l = new Label("When manual test are involved, we apply for eyes principle");
		leftFormLayout.addComponent(l);
		l = new Label("We have fully automated functional regression test of all key features on every release");
		leftFormLayout.addComponent(l);
		l = new Label("We have datasets for all automated tests that requires input, including data transfer from other apps");
		leftFormLayout.addComponent(l);
		l = new Label("We have load and performance automated tests");
		leftFormLayout.addComponent(l);
		l = new Label("We can auto-generate test-cases along with the required test data");
		leftFormLayout.addComponent(l);
		
		rightFormLayout = new FormLayout();
		RadioButtonsQA rbT1 = new RadioButtonsQA();
		rightFormLayout.addComponents(rbT1.buttonGroup);
		RadioButtonsQA rbT2 = new RadioButtonsQA();
		rightFormLayout.addComponents(rbT2.buttonGroup);
		RadioButtonsQA rbT3 = new RadioButtonsQA();
		rightFormLayout.addComponents(rbT3.buttonGroup);
		RadioButtonsQA rbT4 = new RadioButtonsQA();
		rightFormLayout.addComponents(rbT4.buttonGroup);
		RadioButtonsQA rbT5 = new RadioButtonsQA();
		rightFormLayout.addComponents(rbT5.buttonGroup);
		RadioButtonsQA rbT6 = new RadioButtonsQA();
		rightFormLayout.addComponents(rbT6.buttonGroup);
		RadioButtonsQA rbT7 = new RadioButtonsQA();
		rightFormLayout.addComponents(rbT7.buttonGroup);
		RadioButtonsQA rbT8 = new RadioButtonsQA();
		rightFormLayout.addComponents(rbT8.buttonGroup);
		RadioButtonsQA rbT9 = new RadioButtonsQA();
		rightFormLayout.addComponents(rbT9.buttonGroup);
		RadioButtonsQA rbT10 = new RadioButtonsQA();
		rightFormLayout.addComponents(rbT10.buttonGroup);

		gridLayout.addComponent(leftFormLayout, 0, 3);
		gridLayout.addComponent(rightFormLayout, 2, 3);
		setContent(gridLayout);
		this.setSizeFull();
		setHeight("100%");
		setStyleName(ValoTheme.PANEL_WELL);
		setContent(gridLayout);
	}
}

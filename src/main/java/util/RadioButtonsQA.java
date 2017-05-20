package util;


import java.awt.Component;

import com.vaadin.ui.RadioButtonGroup;
import com.vaadin.ui.themes.ValoTheme;

public class RadioButtonsQA extends Component {
	private static final long serialVersionUID = -3736403781978016635L;
	
	public RadioButtonGroup<Integer> buttonGroup;

	public RadioButtonsQA() {
		buttonGroup = new RadioButtonGroup<Integer>("");
		buttonGroup.setItems(1, 2, 3, 4, 5);
		buttonGroup.addStyleName(ValoTheme.OPTIONGROUP_HORIZONTAL);
	}
}

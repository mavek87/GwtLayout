package com.matteoveroni.gwtlayout.client.layout.types;

import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.matteoveroni.gwtlayout.client.layout.Layout;

public class LayoutHeaderFooter implements Layout {

//	private Header header;
//	private NavigationPanel navigationPanel;
//	private Footer footer;

	@Override
	public void apply() {
		final DockLayoutPanel dockPanel = new DockLayoutPanel(Style.Unit.PX);

//		dockPanel.addNorth(header, header.getHeight());
//		dockPanel.addSouth(footer, footer.getHeight());
//		dockPanel.add(createScrollContentPanel());

		RootLayoutPanel.get().add(dockPanel);
	}

//	private ScrollPanel createScrollContentPanel() {
//		final ScrollPanel scrollCenterPanel = new ScrollPanel(navigationPanel);
//		final Element htmlScrollCenterPanel = scrollCenterPanel.getElement();
//		htmlScrollCenterPanel.getStyle().setProperty("marginLeft", 5, Style.Unit.PX);
//		htmlScrollCenterPanel.getStyle().setProperty("marginRight", 5, Style.Unit.PX);
//		htmlScrollCenterPanel.getStyle().setProperty("padding", Constants.PAGE_PADDING, Style.Unit.PX);
//		return scrollCenterPanel;
//	}

}

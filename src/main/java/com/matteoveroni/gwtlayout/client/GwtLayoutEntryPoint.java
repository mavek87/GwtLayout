package com.matteoveroni.gwtlayout.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class GwtLayoutEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		FlowPanel div = new FlowPanel();
		div.getElement().setInnerText("Hello world");
		RootPanel.get().add(div);

		Window.alert(RootPanel.getBodyElement().getInnerHTML());
	}
}

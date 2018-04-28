package com.matteoveroni.gwtlayout.client.layout.widgets.content;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.FlowPanel;
import elemental2.dom.HTMLElement;

public class GwtLayoutContent extends FlowPanel {

	private final Element contentElement = getElement();

	public GwtLayoutContent() {
		contentElement.setId("gwt-layout-content");
	}

	public GwtLayoutContent(String tag) {
		super(tag);
		contentElement.setId("gwt-layout-content");
	}

	public void setHTMLContent(HTMLElement html) {
		contentElement.setInnerHTML(html.textContent);
	}

	public void setHTMLContent(String html) {
		contentElement.setInnerHTML(html);
	}
}
